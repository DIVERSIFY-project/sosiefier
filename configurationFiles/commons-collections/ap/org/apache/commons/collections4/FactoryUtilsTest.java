package org.apache.commons.collections4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import org.apache.commons.collections4.functors.ExceptionFactory;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests the org.apache.commons.collections.FactoryUtils class.
 * 
 * @version $Id$
 * @since 3.0
 */
public class FactoryUtilsTest extends TestCase {
    /** 
     * Set up instance variables required by this test case.
     */
@Override
    public void setUp() {
    }

    /** 
     * Tear down instance variables required by this test case.
     */
@Override
    public void tearDown() {
    }

    public void testExceptionFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionFactory");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,null,7384,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,null,7386,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,null,7386,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        try {
            org.apache.commons.collections4.FactoryUtils.exceptionFactory().create();
        } catch (final FunctorException ex) {
            try {
                org.apache.commons.collections4.FactoryUtils.exceptionFactory().create();
            } catch (final FunctorException ex2) {
                return ;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullFactory");
        final Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.nullFactory();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7388,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstantFactoryNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstantFactoryNull");
        final Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.constantFactory(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7382,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstantFactoryConstant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstantFactoryConstant");
        final Integer constant = Integer.valueOf(10);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.constantFactory(constant);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,constant);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,org.apache.commons.collections4.functors.ConstantFactory.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,null,7391,org.apache.commons.collections4.FactoryUtils.prototypeFactory(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryPublicCloneMethod() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7393,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7395,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryPublicCopyConstructor() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor");
        final Mock1 proto = new Mock1(7);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7397,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7399,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,created);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        try {
            out.writeObject(factory);
        } catch (final NotSerializableException ex) {
            out.close();
        }
        factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(new Mock2("S"));
        buffer = new ByteArrayOutputStream();
        out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryPublicCopyConstructor_literalMutation2398() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_literalMutation2398");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7397,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7399,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,created);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        try {
            out.writeObject(factory);
        } catch (final NotSerializableException ex) {
            out.close();
        }
        factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(new Mock2("foo"));
        buffer = new ByteArrayOutputStream();
        out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryPublicSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization");
        final Integer proto = Integer.valueOf(8);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryPublicSerializationError() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerializationError");
        final Mock2 proto = new Mock2(new Object());
        final Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,factory);
        try {
            factory.create();
        } catch (final FunctorException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7402,((ex.getCause()) instanceof java.io.IOException));
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryPublicBad() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicBad");
        final Object proto = new Object();
        try {
            org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public static class Mock1 {
        private final int iVal;

        public Mock1(final int val) {
            iVal = val;
        }

        public Mock1(final Mock1 mock) {
            iVal = mock.iVal;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj instanceof Mock1) {
                if ((iVal) == (((Mock1)(obj)).iVal)) {
                    return true;
                } 
            } 
            return false;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    public static class Mock2 implements Serializable {
        /** 
         * Generated serial version ID.
         */
private static final long serialVersionUID = 4899282162482588924L;

        private final Object iVal;

        public Mock2(final Object val) {
            iVal = val;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj instanceof Mock2) {
                if ((iVal) == (((Mock2)(obj)).iVal)) {
                    return true;
                } 
            } 
            return false;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    public static class Mock3 {
        private static int cCounter = 0;

        private final int iVal;

        public Mock3() {
            iVal = (Mock3.cCounter)++;
        }

        public int getValue() {
            return iVal;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void instantiateFactoryNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryNull");
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactorySimple() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactorySimple");
        final Factory<Mock3> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Mock3.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,factory);
        Mock3 created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7376,created,7375,created.getValue());
        created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,created,7377,created.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void instantiateFactoryMismatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryMismatch");
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, null, new Object[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void instantiateFactoryNoConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryNoConstructor");
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ java.lang.Long.class }, new Object[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactoryComplex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("foo"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(70) , Integer.valueOf(0) , Integer.valueOf(2) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactoryComplex_literalMutation2388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex_literalMutation2388");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(69) , Integer.valueOf(0) , Integer.valueOf(2) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactoryComplex_literalMutation2389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex_literalMutation2389");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(70) , Integer.valueOf(1) , Integer.valueOf(2) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactoryComplex_literalMutation2390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex_literalMutation2390");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(70) , Integer.valueOf(0) , Integer.valueOf(1) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Factory singletones hold singleton pattern in
     * serialization/deserialization process.
     */
public void testSingletonPatternInSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization");
        final Object[] singletones = new Object[]{ ExceptionFactory.INSTANCE };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("Singletone patern broken for " + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Factory singletones hold singleton pattern in
     * serialization/deserialization process.
     */
public void testSingletonPatternInSerialization_literalMutation2400() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_literalMutation2400");
        final Object[] singletones = new Object[]{ ExceptionFactory.INSTANCE };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("foo" + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

