package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.functors.ExceptionClosure;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.functors.NOPClosure;
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

    public void testExceptionClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionClosure");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6511,null,6510,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,null,6512,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6513,null,6512,org.apache.commons.collections4.ClosureUtils.exceptionClosure());
        try {
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

    public void testNopClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopClosure");
        final StringBuilder buf = new StringBuilder("foo");
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6541,buf,6540,buf.toString());
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6543,buf,6542,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNopClosure_literalMutation2005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopClosure_literalMutation2005");
        final StringBuilder buf = new StringBuilder("Hello");
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6541,buf,6540,buf.toString());
        org.apache.commons.collections4.ClosureUtils.nopClosure().execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6543,buf,6542,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure");
        StringBuffer buf = new StringBuffer("foo");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,buf,6536,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,buf,6538,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure_literalMutation1999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_literalMutation1999");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("foo").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,buf,6536,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,buf,6538,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure_literalMutation2000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_literalMutation2000");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,buf,6536,buf.toString());
        buf = new StringBuffer("foo");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,buf,6538,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure_literalMutation2001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_literalMutation2001");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,buf,6536,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("foo", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(2) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,buf,6538,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokeClosure_literalMutation2002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokeClosure_literalMutation2002");
        StringBuffer buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("reverse").execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6537,buf,6536,buf.toString());
        buf = new StringBuffer("Hello");
        org.apache.commons.collections4.ClosureUtils.invokerClosure("setLength", new java.lang.Class[]{ java.lang.Integer.TYPE }, new Object[]{ java.lang.Integer.valueOf(1) }).execute(buf);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6539,buf,6538,buf.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForClosure");
        final MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.forClosure(4, cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6514,cmd.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6515,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6517,null,6516,org.apache.commons.collections4.ClosureUtils.forClosure(0, new org.apache.commons.collections4.ClosureUtilsTest.MockClosure<java.lang.Object>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6518,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6520,null,6519,org.apache.commons.collections4.ClosureUtils.forClosure(-1, new org.apache.commons.collections4.ClosureUtilsTest.MockClosure<java.lang.Object>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6521,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6523,null,6522,org.apache.commons.collections4.ClosureUtils.forClosure(1, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6524,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6526,null,6525,org.apache.commons.collections4.ClosureUtils.forClosure(3, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6527,cmd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6529,null,6528,org.apache.commons.collections4.ClosureUtils.forClosure(1, cmd));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWhileClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhileClosure");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6583,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.PredicateUtils.uniquePredicate(), cmd).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6584,cmd.count);
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

    public void testDoWhileClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoWhileClosure");
        MockClosure<java.lang.Object> cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6508,cmd.count);
        cmd = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.doWhileClosure(cmd, org.apache.commons.collections4.PredicateUtils.uniquePredicate()).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6509,cmd.count);
        try {
            org.apache.commons.collections4.ClosureUtils.doWhileClosure(null, null);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6496,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6497,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(new Closure[]{ a , b , a }).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6498,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6499,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        Collection<org.apache.commons.collections4.Closure<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Closure<java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(b);
        org.apache.commons.collections4.ClosureUtils.<Object>chainedClosure(coll).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6500,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6501,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6502,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6504,null,6503,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6505,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6507,null,6506,org.apache.commons.collections4.ClosureUtils.<java.lang.Object>chainedClosure(java.util.Collections.<org.apache.commons.collections4.Closure<java.lang.Object>>emptyList()));
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

    public void testIfClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIfClosure");
        MockClosure<java.lang.Object> a = new MockClosure<java.lang.Object>();
        MockClosure<java.lang.Object> b = null;
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6530,a.count);
        a = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6531,a.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6532,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6533,b.count);
        a = new MockClosure<java.lang.Object>();
        b = new MockClosure<java.lang.Object>();
        org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.functors.FalsePredicate.<Object>falsePredicate(), a, b).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6534,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6535,b.count);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchClosure");
        final MockClosure<java.lang.String> a = new MockClosure<java.lang.String>();
        final MockClosure<java.lang.String> b = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[3], new Closure[2]);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6544,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6545,b.count);
        a.reset();
        b.reset();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }).execute("HELLO");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6546,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6547,b.count);
        a.reset();
        b.reset();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new Closure[]{ a , b }, c).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6548,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6549,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6550,c.count);
        a.reset();
        b.reset();
        final Map<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Closure<java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.<String>switchClosure(map).execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6551,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6552,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6553,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6554,b.count);
        a.reset();
        b.reset();
        c.reset();
        map.clear();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6555,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6556,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6557,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6558,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6560,null,6559,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Closure[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6561,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6563,null,6562,org.apache.commons.collections4.ClosureUtils.<java.lang.String>switchClosure(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, org.apache.commons.collections4.Closure<java.lang.String>>()));
        map.clear();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6564,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6566,null,6565,org.apache.commons.collections4.ClosureUtils.switchClosure(map));
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
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[2], new Closure[1]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ClosureUtils.<String>switchClosure(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.<String>truePredicate() }, new Closure[]{ a , b });
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6567,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6568,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6569,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6570,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6571,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6572,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6573,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6574,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6576,null,6575,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6567,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6568,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6569,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6570,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6571,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6572,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6573,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6574,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6576,null,6575,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6567,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6568,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("foo", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6569,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6570,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6571,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6572,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6573,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6574,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6576,null,6575,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6567,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6568,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("foo", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6569,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6570,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6571,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6572,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6573,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6574,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6576,null,6575,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6567,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6568,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6569,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6570,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6571,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6572,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6573,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6574,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6576,null,6575,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6567,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6568,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6569,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6570,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("foo", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6571,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6572,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6573,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6574,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6576,null,6575,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6567,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6568,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6569,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6570,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("foo", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("WELL");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6571,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6572,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6573,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6574,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6576,null,6575,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6567,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6568,b.count);
        a.reset();
        b.reset();
        map.clear();
        map.put("HELLO", a);
        map.put("THERE", b);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("THERE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6569,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6570,b.count);
        a.reset();
        b.reset();
        map.clear();
        final MockClosure<java.lang.String> c = new MockClosure<java.lang.String>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put(null, c);
        org.apache.commons.collections4.ClosureUtils.switchMapClosure(map).execute("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6571,a.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6572,b.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6573,c.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6574,org.apache.commons.collections4.functors.NOPClosure.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6576,null,6575,org.apache.commons.collections4.ClosureUtils.switchMapClosure(new java.util.HashMap<java.lang.String, org.apache.commons.collections4.Closure<java.lang.String>>()));
        try {
            org.apache.commons.collections4.ClosureUtils.switchMapClosure(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformerClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformerClosure");
        final MockTransformer<java.lang.Object> mock = new MockTransformer<java.lang.Object>();
        final Closure<java.lang.Object> closure = org.apache.commons.collections4.ClosureUtils.asClosure(mock);
        closure.execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6577,mock.count);
        closure.execute(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6578,mock.count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6580,null,6579,org.apache.commons.collections4.ClosureUtils.nopClosure());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6582,null,6581,org.apache.commons.collections4.ClosureUtils.asClosure(null));
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
}

