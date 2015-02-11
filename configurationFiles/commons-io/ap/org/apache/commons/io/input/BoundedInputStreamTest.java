package org.apache.commons.io.input;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests for {@link BoundedInputStream}.
 * 
 * @version $Id$
 */
public class BoundedInputStreamTest extends TestCase {
    public BoundedInputStreamTest(String name) {
        super(name);
    }

    /** 
     * Test {@link BoundedInputStream#read()}.
     */
public void testReadSingle() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSingle");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "foo".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,(("limit = length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),447,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,bounded,448,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),452,bounded,451,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,(("limit > length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),454,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),456,bounded,455,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,bounded,458,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , hello.length);
        for (int i = 0 ; i < (hello.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),460,(("limit < length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,hello[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,bounded,462,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),464,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),466,bounded,465,bounded.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read()}.
     */
public void testReadSingle_literalMutation362() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSingle_literalMutation362");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "foo".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,(("limit = length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),447,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,bounded,448,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),452,bounded,451,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,(("limit > length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),454,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),456,bounded,455,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,bounded,458,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , hello.length);
        for (int i = 0 ; i < (hello.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),460,(("limit < length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,hello[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,bounded,462,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),464,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),466,bounded,465,bounded.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read()}.
     */
public void testReadSingle_literalMutation363() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSingle_literalMutation363");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        for (int i = 1 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,(("limit = length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),447,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,bounded,448,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),452,bounded,451,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,(("limit > length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),454,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),456,bounded,455,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,bounded,458,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , hello.length);
        for (int i = 0 ; i < (hello.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),460,(("limit < length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,hello[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,bounded,462,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),464,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),466,bounded,465,bounded.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read()}.
     */
public void testReadSingle_literalMutation364() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSingle_literalMutation364");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,(("limit = length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),447,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,bounded,448,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),452,bounded,451,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 2));
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,(("limit > length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),454,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),456,bounded,455,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,bounded,458,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , hello.length);
        for (int i = 0 ; i < (hello.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),460,(("limit < length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,hello[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,bounded,462,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),464,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),466,bounded,465,bounded.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read()}.
     */
public void testReadSingle_literalMutation365() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSingle_literalMutation365");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,(("limit = length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),447,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,bounded,448,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),452,bounded,451,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        for (int i = -1 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,(("limit > length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),454,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),456,bounded,455,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,bounded,458,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , hello.length);
        for (int i = 0 ; i < (hello.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),460,(("limit < length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,hello[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,bounded,462,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),464,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),466,bounded,465,bounded.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read()}.
     */
public void testReadSingle_literalMutation366() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSingle_literalMutation366");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,(("limit = length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),447,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,bounded,448,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),452,bounded,451,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        for (int i = 0 ; i < (helloWorld.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,(("limit > length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),454,helloWorld[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),456,bounded,455,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,bounded,458,bounded.read());
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , hello.length);
        for (int i = -1 ; i < (hello.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),460,(("limit < length byte[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,hello[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,bounded,462,bounded.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),464,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),466,bounded,465,bounded.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_add147() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_add147");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_add148() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_add148");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_add149() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_add149");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_add150() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_add150");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_add151() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_add151");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "foo".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation350() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation350");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "foo".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation351() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation351");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("foo", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation352() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation352");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , -1);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation353() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation353");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("foo", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation354() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation354");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[1], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation355() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation355");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("foo", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation356() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation356");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 0));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation357() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation357");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("foo", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation358() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation358");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 5));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
public void testReadArray_literalMutation359() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_literalMutation359");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        compare("limit = -1", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("foo", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_remove42() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_remove42");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_remove43() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_remove43");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_remove44() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_remove44");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_remove45() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_remove45");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link BoundedInputStream#read(byte[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadArray_remove46() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadArray_remove46");
        BoundedInputStream bounded = null;
        byte[] helloWorld = "Hello World".getBytes();
        byte[] hello = "Hello".getBytes();
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , 0);
        compare("limit = 0", new byte[0], org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , helloWorld.length);
        compare("limit = length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) + 1));
        compare("limit > length", helloWorld, org.apache.commons.io.IOUtils.toByteArray(bounded));
        bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld) , ((helloWorld.length) - 6));
        compare("limit < length", hello, org.apache.commons.io.IOUtils.toByteArray(bounded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare byte arrays.
     */
private void compare(String msg, byte[] expected, byte[] actual) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),440,(msg + " length"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),441,expected.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),442,actual.length);
        for (int i = 0 ; i < (expected.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),443,(((msg + " byte[") + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),444,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),445,actual[i]);
        }
    }
}

