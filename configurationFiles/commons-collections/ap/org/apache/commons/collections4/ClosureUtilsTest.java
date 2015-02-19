package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.functors.ExceptionClosure;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.functors.NOPClosure;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests the ClosureUtils class.
 * 
 * @version $Id$
 * @since 3.0
 */
public class ClosureUtilsTest extends TestCase {
    private static final Object cString = "Hello";

    static class MockClosure<T> implements Closure<T> {
        int count = 0;

        public void execute(final T object) {
            (count)++;
        }

        public void reset() {
            count = 0;
        }
    }

    static class MockTransformer<T> implements Transformer<T, T> {
        int count = 0;

        public T transform(final T object) {
            (count)++;
            return object;
        }
    }

    @Test(timeout = 1000)
    public void testExceptionClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionClosure");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6472,null,6471,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6474,null,6473,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6474,null,6473,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        try {
            org.apache.commons.collections4.ClosureUtils.exceptionClosure().execute(null);
            org.apache.commons.collections4.ClosureUtils.exceptionClosure().execute(null);
        } catch (final FunctorException ex) {
            try {
                org.apache.commons.collections4.ClosureUtils.exceptionClosure().execute(cString);
            } catch (final FunctorException ex2) {
                return ;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExceptionClosure_add2077() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionClosure_add2077");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6472,null,6471,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6474,null,6473,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6474,null,6473,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        try {
            org.apache.commons.collections4.ClosureUtils.exceptionClosure().execute(null);
        } catch (final FunctorException ex) {
            try {
                org.apache.commons.collections4.ClosureUtils.exceptionClosure().execute(cString);
                org.apache.commons.collections4.ClosureUtils.exceptionClosure().execute(cString);
            } catch (final FunctorException ex2) {
                return ;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNopClosure_add2085() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopClosure_add2085");
        final StringBuilder buf = new StringBuilder("Hello");
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute(null);
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6502,buf,6501,buf.toString());
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6504,buf,6503,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNopClosure_add2086() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopClosure_add2086");
        final StringBuilder buf = new StringBuilder("Hello");
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6502,buf,6501,buf.toString());
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("Hello");
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6504,buf,6503,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNopClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopClosure");
        final StringBuilder buf = new StringBuilder("foo");
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6502,buf,6501,buf.toString());
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6504,buf,6503,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNopClosure_literalMutation2005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopClosure_literalMutation2005");
        final StringBuilder buf = new StringBuilder("Hello");
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6502,buf,6501,buf.toString());
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6504,buf,6503,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNopClosure_remove1615() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopClosure_remove1615");
        final StringBuilder buf = new StringBuilder("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6502,buf,6501,buf.toString());
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6504,buf,6503,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNopClosure_remove1616() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopClosure_remove1616");
        final StringBuilder buf = new StringBuilder("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6502,buf,6501,buf.toString());
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6504,buf,6503,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokeClosure_add2083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_add2083");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokeClosure_add2084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_add2084");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure");
        StringBuffer buf = new StringBuffer("foo");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure_literalMutation1999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_literalMutation1999");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("foo").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure_literalMutation2000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_literalMutation2000");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("foo");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure_literalMutation2001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_literalMutation2001");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("foo", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure_literalMutation2002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_literalMutation2002");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(3) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokeClosure_remove1613() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_remove1613");
        StringBuffer buf = new StringBuffer("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokeClosure_remove1614() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_remove1614");
        StringBuffer buf = new StringBuffer("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,buf,6497,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,buf,6499,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testForClosure_add2078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForClosure_add2078");
        final MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.forClosure(5, cmd).execute(null);
        org.apache.commons.collections4.ClosureUtils.forClosure(5, cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6475,cmd.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6476,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6478,null,6477,org.apache.commons.collections4.ClosureUtils.forClosure(0, new org.apache.commons.collections4.ClosureUtilsTest.MockClosure<java.lang.Object>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6479,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6481,null,6480,org.apache.commons.collections4.ClosureUtils.forClosure(-1, new org.apache.commons.collections4.ClosureUtilsTest.MockClosure<java.lang.Object>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6482,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6484,null,6483,org.apache.commons.collections4.ClosureUtils.forClosure(1, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6485,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6487,null,6486,org.apache.commons.collections4.ClosureUtils.forClosure(3, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6488,cmd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6490,null,6489,org.apache.commons.collections4.ClosureUtils.forClosure(1, cmd));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForClosure");
        final MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.forClosure(4, cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6475,cmd.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6476,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6478,null,6477,org.apache.commons.collections4.ClosureUtils.forClosure(0, new org.apache.commons.collections4.ClosureUtilsTest.MockClosure<java.lang.Object>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6479,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6481,null,6480,org.apache.commons.collections4.ClosureUtils.forClosure(-1, new org.apache.commons.collections4.ClosureUtilsTest.MockClosure<java.lang.Object>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6482,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6484,null,6483,org.apache.commons.collections4.ClosureUtils.forClosure(1, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6485,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6487,null,6486,org.apache.commons.collections4.ClosureUtils.forClosure(3, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6488,cmd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6490,null,6489,org.apache.commons.collections4.ClosureUtils.forClosure(1, cmd));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testForClosure_remove1608() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForClosure_remove1608");
        final MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6475,cmd.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6476,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6478,null,6477,org.apache.commons.collections4.ClosureUtils.forClosure(0, new org.apache.commons.collections4.ClosureUtilsTest.MockClosure<java.lang.Object>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6479,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6481,null,6480,org.apache.commons.collections4.ClosureUtils.forClosure(-1, new org.apache.commons.collections4.ClosureUtilsTest.MockClosure<java.lang.Object>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6482,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6484,null,6483,org.apache.commons.collections4.ClosureUtils.forClosure(1, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6485,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6487,null,6486,org.apache.commons.collections4.ClosureUtils.forClosure(3, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6488,cmd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6490,null,6489,org.apache.commons.collections4.ClosureUtils.forClosure(1, cmd));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWhileClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhileClosure");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), cmd).execute(null);
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, org.apache.commons.collections4.ClosureUtils.nopClosure());
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWhileClosure_add2141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhileClosure_add2141");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, org.apache.commons.collections4.ClosureUtils.nopClosure());
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWhileClosure_add2142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhileClosure_add2142");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, org.apache.commons.collections4.ClosureUtils.nopClosure());
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, org.apache.commons.collections4.ClosureUtils.nopClosure());
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWhileClosure_add2143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhileClosure_add2143");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, org.apache.commons.collections4.ClosureUtils.nopClosure());
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), null);
            org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWhileClosure_add2144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhileClosure_add2144");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, org.apache.commons.collections4.ClosureUtils.nopClosure());
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, null);
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWhileClosure_remove1664() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhileClosure_remove1664");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, org.apache.commons.collections4.ClosureUtils.nopClosure());
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWhileClosure_remove1665() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhileClosure_remove1665");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, org.apache.commons.collections4.ClosureUtils.nopClosure());
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.whileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoWhileClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoWhileClosure");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).execute(null);
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6469,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.PredicateUtils.uniquePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6470,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.doWhileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoWhileClosure_add2074() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoWhileClosure_add2074");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6469,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.PredicateUtils.uniquePredicate()).execute(null);
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.PredicateUtils.uniquePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6470,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.doWhileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoWhileClosure_add2075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoWhileClosure_add2075");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6469,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.PredicateUtils.uniquePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6470,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.doWhileClosure(null, null);
            org.apache.commons.collections4.ClosureUtils.doWhileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoWhileClosure_remove1606() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoWhileClosure_remove1606");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6469,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.PredicateUtils.uniquePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6470,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.doWhileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoWhileClosure_remove1607() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoWhileClosure_remove1607");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6469,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.PredicateUtils.uniquePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6470,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.doWhileClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2060");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2061");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2062");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2063");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2064");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2065");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2066");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2067() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2067");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2068");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2069() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2069");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2070");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2071");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_add2072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_add2072");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testChainedClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_remove1600() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_remove1600");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_remove1601() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_remove1601");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_remove1602() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_remove1602");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_remove1603() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_remove1603");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_remove1604() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_remove1604");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.chainedClosure(a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedClosure_remove1605() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedClosure_remove1605");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = new MockClosure<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6457,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6459,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6461,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6463,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6465,null,6464,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,null,6467,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.ClosureUtils.chainedClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Closure[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(((Collection<org.apache.commons.collections4.Closure<java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.ClosureUtils.chainedClosure(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIfClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a).execute(null);
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6494,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIfClosure_add2080() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure_add2080");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6494,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIfClosure_add2081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure_add2081");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6494,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIfClosure_add2082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure_add2082");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6494,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIfClosure_remove1609() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure_remove1609");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6494,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIfClosure_remove1610() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure_remove1610");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6494,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIfClosure_remove1611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure_remove1611");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6494,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIfClosure_remove1612() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure_remove1612");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6494,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2088() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2088");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2089() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2089");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2090() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2090");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2091");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2092() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2092");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2093() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2093");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2094() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2094");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2095() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2095");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2096() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2096");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2097() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2097");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2098");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2099");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2100");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2101");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2102");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2103");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2104");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2105");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2106");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2107");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2108");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2109");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2110");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2111");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2112");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2113");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2114");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2115");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2116");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2117");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2118");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2119");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_add2120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_add2120");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2008");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2009");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2010() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2010");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2011");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2012() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2012");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2013");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2014");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2015");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2016");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2017");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2018");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2020");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2021");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2022");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2023");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2024() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2024");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2026");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2034");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[1], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure_literalMutation2035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_literalMutation2035");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[3]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1618() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1618");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1619() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1619");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1620() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1620");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1621() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1621");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1622() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1622");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1623() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1623");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1624() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1624");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1625() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1625");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1626() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1626");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1627() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1627");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1628() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1628");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1629() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1629");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1630() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1630");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1631() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1631");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1632() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1632");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1633() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1633");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1634() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1634");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1635() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1635");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1636() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1636");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1637() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1637");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1638() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1638");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1639() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1639");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1640");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1641() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1641");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1642() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1642");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1643() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1643");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1644() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1644");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchClosure_remove1645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure_remove1645");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6506,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6510,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6512,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6516,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6519,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,null,6520,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6522,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,null,6523,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6525,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,null,6526,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
        try {
            org.apache.commons.collections4.ClosureUtils.switchClosure(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Predicate<java.lang.String>[])(null)), ((Closure<java.lang.String>[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(((Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2121");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2122");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2123");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2124");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2125");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2126");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2127");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2128");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2129");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2130");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2131");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2132");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2133");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2134");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2135");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2136");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_add2137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_add2137");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("foo", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapClosure_literalMutation2037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_literalMutation2037");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("foo", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapClosure_literalMutation2039() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_literalMutation2039");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("foo", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapClosure_literalMutation2040() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_literalMutation2040");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("foo", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapClosure_literalMutation2041() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_literalMutation2041");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapClosure_literalMutation2042() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_literalMutation2042");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("foo", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapClosure_literalMutation2043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_literalMutation2043");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("foo", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapClosure_literalMutation2045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_literalMutation2045");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1646() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1646");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1647() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1647");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1648() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1648");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1649() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1649");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1650() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1650");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1651() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1651");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1652() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1652");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1653() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1653");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1654() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1654");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1655() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1655");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1656() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1656");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1657() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1657");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1658() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1658");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1659() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1659");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1660() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1660");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapClosure_remove1661() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapClosure_remove1661");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        final Map<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6528,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,null,6536,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformerClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformerClosure");
        final MockTransformer<java.lang.Object> mock = new MockTransformer<java.lang.Object>();
        final Closure<java.lang.Object> closure = org.apache.commons.collections4.ClosureUtils.asClosure(mock);
        closure.execute(null);
        closure.execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6538,mock.count);
        closure.execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,mock.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6541,null,6540,org.apache.commons.collections4.ClosureUtils.nopClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6543,null,6542,org.apache.commons.collections4.ClosureUtils.asClosure(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformerClosure_add2139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformerClosure_add2139");
        final MockTransformer<java.lang.Object> mock = new MockTransformer<java.lang.Object>();
        final Closure<java.lang.Object> closure = org.apache.commons.collections4.ClosureUtils.asClosure(mock);
        closure.execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6538,mock.count);
        closure.execute(null);
        closure.execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,mock.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6541,null,6540,org.apache.commons.collections4.ClosureUtils.nopClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6543,null,6542,org.apache.commons.collections4.ClosureUtils.asClosure(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformerClosure_remove1662() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformerClosure_remove1662");
        final MockTransformer<java.lang.Object> mock = new MockTransformer<java.lang.Object>();
        final Closure<java.lang.Object> closure = org.apache.commons.collections4.ClosureUtils.asClosure(mock);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6538,mock.count);
        closure.execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,mock.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6541,null,6540,org.apache.commons.collections4.ClosureUtils.nopClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6543,null,6542,org.apache.commons.collections4.ClosureUtils.asClosure(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformerClosure_remove1663() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformerClosure_remove1663");
        final MockTransformer<java.lang.Object> mock = new MockTransformer<java.lang.Object>();
        final Closure<java.lang.Object> closure = org.apache.commons.collections4.ClosureUtils.asClosure(mock);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6538,mock.count);
        closure.execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,mock.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6541,null,6540,org.apache.commons.collections4.ClosureUtils.nopClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6543,null,6542,org.apache.commons.collections4.ClosureUtils.asClosure(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Closure singletones hold singleton pattern in
     * serialization/deserialization process.
     */
@Test(timeout = 1000)
    public void testSingletonPatternInSerialization_add2087() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_add2087");
        final Object[] singletones = new Object[]{ ExceptionClosure.INSTANCE , NOPClosure.INSTANCE };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("Singletone patern broken for " + (original.getClass())), original);
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("Singletone patern broken for " + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Closure singletones hold singleton pattern in
     * serialization/deserialization process.
     */
public void testSingletonPatternInSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization");
        final Object[] singletones = new Object[]{ ExceptionClosure.INSTANCE , NOPClosure.INSTANCE };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("foo" + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Closure singletones hold singleton pattern in
     * serialization/deserialization process.
     */
@Test(timeout = 1000)
    public void testSingletonPatternInSerialization_remove1617() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_remove1617");
        final Object[] singletones = new Object[]{ ExceptionClosure.INSTANCE , NOPClosure.INSTANCE };
        for (final Object original : singletones) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

