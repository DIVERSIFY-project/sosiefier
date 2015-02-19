package org.apache.commons.collections4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class TestUtils {
    private TestUtils() {
    }

    /** 
     * Asserts that deserialization of the object returns the same object as the
     * one that was serialized. Object is first serialized, then deserialized
     * and finally check is performed to see if original and deserialized
     * object references are the same.
     * <p/>
     * This method is especially good for testing singleton pattern on classes
     * that support serialization.
     * 
     * @param msg the identifying message for the <code>AssertionError</code>.
     * @param o   object that will be tested.
     * @see #assertSameAfterSerialization(Object)
     */
public static void assertSameAfterSerialization(final String msg, final Object o) {
        try {
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            final ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(o);
            oos.close();
            final InputStream is = new ByteArrayInputStream(baos.toByteArray());
            final ObjectInputStream ois = new ObjectInputStream(is);
            final Object object = ois.readObject();
            ois.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8248,msg);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8249,o);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8250,object);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        } catch (final ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /** 
     * Asserts that deserialization of the object returns the same object as the
     * one that was serialized.
     * <p/>
     * Effect of method call is the same as:
     * <code>assertSameAfterSerialization(null, o)</code>.
     * 
     * @param o object that will be tested.
     * @see #assertSameAfterSerialization(String, Object)
     */
public static void assertSameAfterSerialization(final Object o) {
        TestUtils.assertSameAfterSerialization(null, o);
    }
}

