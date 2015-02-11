package org.apache.commons.io.input;

import java.nio.CharBuffer;
import java.io.IOException;
import java.io.Reader;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Test {@link ProxyReader}.
 * 
 * @version $Id$
 */
public class ProxyReaderTest extends TestCase {
    public ProxyReaderTest(String name) {
        super(name);
    }

    /** 
     * Test writing Null Char Array
     */
@Test(timeout = 1000)
    public void testNullCharArray_add221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray_add221");
        ProxyReader proxy = new ProxyReaderImpl(new CustomNullReader(0));
        try {
            proxy.read(((char[])(null)));
            proxy.read(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),805,("Writing null String threw " + e));
        }
        try {
            proxy.read(((char[])(null)), 0, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),806,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char Array
     */
@Test(timeout = 1000)
    public void testNullCharArray_add222() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray_add222");
        ProxyReader proxy = new ProxyReaderImpl(new CustomNullReader(0));
        try {
            proxy.read(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),805,("Writing null String threw " + e));
        }
        try {
            proxy.read(((char[])(null)), 0, 0);
            proxy.read(((char[])(null)), 0, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),806,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char Array
     */
public void testNullCharArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray");
        ProxyReader proxy = new ProxyReaderImpl(new CustomNullReader(1));
        try {
            proxy.read(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),805,("Writing null String threw " + e));
        }
        try {
            proxy.read(((char[])(null)), 0, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),806,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char Array
     */
public void testNullCharArray_literalMutation538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray_literalMutation538");
        ProxyReader proxy = new ProxyReaderImpl(new CustomNullReader(0));
        try {
            proxy.read(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),805,("Writing null String threw " + e));
        }
        try {
            proxy.read(((char[])(null)), 1, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),806,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char Array
     */
public void testNullCharArray_literalMutation539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray_literalMutation539");
        ProxyReader proxy = new ProxyReaderImpl(new CustomNullReader(0));
        try {
            proxy.read(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),805,("Writing null String threw " + e));
        }
        try {
            proxy.read(((char[])(null)), 0, -1);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),806,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null CharBuffer
     */
@Test(timeout = 1000)
    public void testNullCharBuffer_add223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharBuffer_add223");
        ProxyReader proxy = new ProxyReaderImpl(new CustomNullReader(0));
        try {
            proxy.read(((CharBuffer)(null)));
            proxy.read(((CharBuffer)(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),807,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null CharBuffer
     */
public void testNullCharBuffer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharBuffer");
        ProxyReader proxy = new ProxyReaderImpl(new CustomNullReader(-1));
        try {
            proxy.read(((CharBuffer)(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),807,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * ProxyReader implementation
     */
private static class ProxyReaderImpl extends ProxyReader {
        ProxyReaderImpl(Reader proxy) {
            super(proxy);
        }
    }

    /** 
     * Custom NullReader implementation
     */
private static class CustomNullReader extends NullReader {
        CustomNullReader(int len) {
            super(len);
        }

        @Override
        public int read(char[] chars) throws IOException {
            return chars == null ? 0 : super.read(chars);
        }

        @Override
        public int read(CharBuffer target) throws IOException {
            return target == null ? 0 : super.read(target);
        }
    }
}

