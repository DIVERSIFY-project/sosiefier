package org.apache.commons.io.input;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests the CountingInputStream.
 * 
 * @version $Id$
 */
public class ClassLoaderObjectInputStreamTest extends TestCase {
    public ClassLoaderObjectInputStreamTest(String name) {
        super(name);
    }

    @Test(timeout = 1000)
    public void testExpected() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpected");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(Boolean.FALSE);
        oos.writeObject(Boolean.FALSE);
        InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader() , bais);
        Boolean result = ((Boolean)(clois.readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),577,!(result.booleanValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExpected_remove80() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpected_remove80");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader() , bais);
        Boolean result = ((Boolean)(clois.readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),577,!(result.booleanValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testResolveProxyClass() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResolveProxyClass");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(Boolean.FALSE);
        oos.writeObject(Boolean.FALSE);
        InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader() , bais);
        String[] interfaces = new String[]{ Comparable.class.getName() };
        Class<?> result = clois.resolveProxyClass(interfaces);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),579,java.lang.Comparable.class,578,java.lang.Comparable.class.isAssignableFrom(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testResolveProxyClass_remove81() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResolveProxyClass_remove81");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader() , bais);
        String[] interfaces = new String[]{ Comparable.class.getName() };
        Class<?> result = clois.resolveProxyClass(interfaces);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),579,java.lang.Comparable.class,578,java.lang.Comparable.class.isAssignableFrom(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

