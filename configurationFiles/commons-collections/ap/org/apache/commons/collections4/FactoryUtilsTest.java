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

    @Test(timeout = 1000)
    public void testExceptionFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionFactory");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,null,7359,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,null,7361,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,null,7361,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        try {
            org.apache.commons.collections4.FactoryUtils.exceptionFactory().create();
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

    @Test(timeout = 1000)
    public void testExceptionFactory_add2403() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionFactory_add2403");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,null,7359,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,null,7361,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,null,7361,org.apache.commons.collections4.FactoryUtils.exceptionFactory());
        try {
            org.apache.commons.collections4.FactoryUtils.exceptionFactory().create();
        } catch (final FunctorException ex) {
            try {
                org.apache.commons.collections4.FactoryUtils.exceptionFactory().create();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7363,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstantFactoryNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstantFactoryNull");
        final Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.constantFactory(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7357,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstantFactoryConstant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstantFactoryConstant");
        final Integer constant = Integer.valueOf(10);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.constantFactory(constant);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7355,constant);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7365,org.apache.commons.collections4.functors.ConstantFactory.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7367,null,7366,org.apache.commons.collections4.FactoryUtils.prototypeFactory(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCloneMethod() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCloneMethod_add2406() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod_add2406");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCloneMethod_add2407() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod_add2407");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCloneMethod_add2408() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod_add2408");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCloneMethod_remove1903() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod_remove1903");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCloneMethod_remove1904() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod_remove1904");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCloneMethod_remove1905() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod_remove1905");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCloneMethod_remove1906() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCloneMethod_remove1906");
        final Date proto = new Date();
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7371,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_add2409() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_add2409");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        try {
            out.writeObject(factory);
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

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_add2410() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_add2410");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        try {
            out.writeObject(factory);
        } catch (final NotSerializableException ex) {
            out.close();
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

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_add2411() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_add2411");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_add2412() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_add2412");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_add2413() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_add2413");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_add2414() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_add2414");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryPublicCopyConstructor() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor");
        final Mock1 proto = new Mock1(7);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_remove1907() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_remove1907");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_remove1908() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_remove1908");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_remove1909() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_remove1909");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicCopyConstructor_remove1910() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicCopyConstructor_remove1910");
        final Mock1 proto = new Mock1(6);
        Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7372,factory);
        final Object created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7373,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7374,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7375,created);
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
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerialization_add2415() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization_add2415");
        final Integer proto = Integer.valueOf(9);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerialization_add2416() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization_add2416");
        final Integer proto = Integer.valueOf(9);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerialization_add2417() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization_add2417");
        final Integer proto = Integer.valueOf(9);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerialization_add2418() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization_add2418");
        final Integer proto = Integer.valueOf(9);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrototypeFactoryPublicSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization");
        final Integer proto = Integer.valueOf(8);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerialization_remove1911() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization_remove1911");
        final Integer proto = Integer.valueOf(9);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerialization_remove1912() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization_remove1912");
        final Integer proto = Integer.valueOf(9);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerialization_remove1913() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization_remove1913");
        final Integer proto = Integer.valueOf(9);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerialization_remove1914() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerialization_remove1914");
        final Integer proto = Integer.valueOf(9);
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7378,factory);
        final Integer created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7379,(proto != created));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7380,proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7381,created);
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(factory);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        in.readObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicSerializationError() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicSerializationError");
        final Mock2 proto = new Mock2(new Object());
        final Factory<java.lang.Object> factory = org.apache.commons.collections4.FactoryUtils.<Object>prototypeFactory(proto);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7376,factory);
        try {
            factory.create();
            factory.create();
        } catch (final FunctorException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7377,((ex.getCause()) instanceof java.io.IOException));
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrototypeFactoryPublicBad() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrototypeFactoryPublicBad");
        final Object proto = new Object();
        try {
            org.apache.commons.collections4.FactoryUtils.prototypeFactory(proto);
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

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void instantiateFactoryNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryNull");
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(null);
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void instantiateFactoryNull_remove1902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryNull_remove1902");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactorySimple() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactorySimple");
        final Factory<Mock3> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Mock3.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7349,factory);
        Mock3 created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7351,created,7350,created.getValue());
        created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7353,created,7352,created.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void instantiateFactoryMismatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryMismatch");
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, null, new Object[]{ null });
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, null, new Object[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void instantiateFactoryMismatch_remove1900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryMismatch_remove1900");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void instantiateFactoryNoConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryNoConstructor");
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ java.lang.Long.class }, new Object[]{ null });
        org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ java.lang.Long.class }, new Object[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void instantiateFactoryNoConstructor_remove1901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryNoConstructor_remove1901");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void instantiateFactoryComplex_add2398() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex_add2398");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT"));
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(70) , Integer.valueOf(0) , Integer.valueOf(2) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7347,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactoryComplex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("foo"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(70) , Integer.valueOf(0) , Integer.valueOf(2) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7347,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactoryComplex_literalMutation2388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex_literalMutation2388");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(69) , Integer.valueOf(0) , Integer.valueOf(2) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7347,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactoryComplex_literalMutation2389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex_literalMutation2389");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(70) , Integer.valueOf(-1) , Integer.valueOf(2) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7347,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void instantiateFactoryComplex_literalMutation2390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex_literalMutation2390");
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT"));
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(70) , Integer.valueOf(0) , Integer.valueOf(3) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7347,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,created);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void instantiateFactoryComplex_remove1899() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "instantiateFactoryComplex_remove1899");
        final Factory<java.util.Date> factory = org.apache.commons.collections4.FactoryUtils.instantiateFactory(Date.class, new java.lang.Class[]{ Integer.TYPE , Integer.TYPE , Integer.TYPE }, new Object[]{ Integer.valueOf(70) , Integer.valueOf(0) , Integer.valueOf(2) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,factory);
        final Date created = factory.create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7347,new java.util.Date((((1000 * 60) * 60) * 24)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,created);
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
@Test(timeout = 1000)
    public void testSingletonPatternInSerialization_add2420() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_add2420");
        final Object[] singletones = new Object[]{ ExceptionFactory.INSTANCE };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("Singletone patern broken for " + (original.getClass())), original);
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

    /** 
     * Test that all Factory singletones hold singleton pattern in
     * serialization/deserialization process.
     */
@Test(timeout = 1000)
    public void testSingletonPatternInSerialization_remove1915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_remove1915");
        final Object[] singletones = new Object[]{ ExceptionFactory.INSTANCE };
        for (final Object original : singletones) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

