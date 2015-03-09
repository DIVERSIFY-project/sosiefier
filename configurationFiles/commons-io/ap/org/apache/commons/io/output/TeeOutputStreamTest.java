package org.apache.commons.io.output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * @version $Id$
 */
public class TeeOutputStreamTest extends TestCase {
    private static class ExceptionOnCloseByteArrayOutputStream extends ByteArrayOutputStream {
        @Override
        public void close() throws IOException {
            throw new IOException();
        }
    }

    private static class RecordCloseByteArrayOutputStream extends ByteArrayOutputStream {
        boolean closed;

        @Override
        public void close() throws IOException {
            super.close();
            closed = true;
        }
    }

    public TeeOutputStreamTest(String name) {
        super(name);
    }

    /** 
     * Tests that the branch {@code OutputStream} is closed when closing the main {@code OutputStream} throws an
     * exception on {@link TeeOutputStream#close()}.
     */
@Test(timeout = 1000)
    public void testCloseBranchIOException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseBranchIOException");
        ByteArrayOutputStream badOs = new ExceptionOnCloseByteArrayOutputStream();
        RecordCloseByteArrayOutputStream goodOs = new RecordCloseByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(goodOs , badOs);
        try {
            tos.close();
            tos.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,("Expected " + (java.io.IOException.class.getName())));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,goodOs.closed);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the main {@code OutputStream} is closed when closing the branch {@code OutputStream} throws an
     * exception on {@link TeeOutputStream#close()}.
     */
@Test(timeout = 1000)
    public void testCloseMainIOException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseMainIOException");
        ByteArrayOutputStream badOs = new ExceptionOnCloseByteArrayOutputStream();
        RecordCloseByteArrayOutputStream goodOs = new RecordCloseByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(badOs , goodOs);
        try {
            tos.close();
            tos.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1680,("Expected " + (java.io.IOException.class.getName())));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,goodOs.closed);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_add1111() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_add1111");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_add1112() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_add1112");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_add1113() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_add1113");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_add1114() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_add1114");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_add1115() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_add1115");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_add1116() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_add1116");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_add1117() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_add1117");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_add1118() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_add1118");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 1 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3673() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3673");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = -1 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3674() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3674");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3675() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3675");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 19 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3676() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3676");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 10 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3677() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3677");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 40 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3678() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3678");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 21 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3679() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3679");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("bar", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3680() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3680");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[9];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3681() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3681");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[5];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3682() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3682");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[20];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3683() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3683");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[11];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3684() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3684");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 19 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3685() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3685");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 10 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3686() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3686");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 40 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3687() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3687");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 21 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3688() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3688");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 29 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3689() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3689");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 15 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3690() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3690");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 60 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3691() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3691");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 31 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3692() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3692");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 19)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3693() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3693");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 10)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3694() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3694");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 40)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3695() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3695");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 21)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3696() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3696");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("foo", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3697() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3697");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 24 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3698() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3698");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 12 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3699() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3699");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 50 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3700() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3700");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 26 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3701() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3701");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 34 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3702() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3702");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 17 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3703() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3703");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 70 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3704() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3704");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 36 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3705() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3705");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 24)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3706() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3706");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 12)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3707() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3707");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 50)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3708() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3708");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 26)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3709() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3709");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 4, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3710() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3710");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 2, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3711() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3711");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 10, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3712() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3712");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 6, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3713() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3713");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 4);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3714() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3714");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 2);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3715() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3715");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 10);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3716() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3716");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 6);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTee_literalMutation3717() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_literalMutation3717");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("foo", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_remove850() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_remove850");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_remove851() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_remove851");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_remove852() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_remove852");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_remove853() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_remove853");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_remove854() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_remove854");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_remove855() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_remove855");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_remove856() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_remove856");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTee_remove857() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTee_remove857");
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TeeOutputStream tos = new TeeOutputStream(baos1 , baos2);
        for (int i = 0 ; i < 20 ; i++) {
            tos.write(i);
        }
        assertByteArrayEquals("TeeOutputStream.write(int)", baos1.toByteArray(), baos2.toByteArray());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        tos.write(array);
        assertByteArrayEquals("TeeOutputStream.write(byte[])", baos1.toByteArray(), baos2.toByteArray());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        tos.write(array, 5, 5);
        assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", baos1.toByteArray(), baos2.toByteArray());
        tos.flush();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertByteArrayEquals(String msg, byte[] array1, byte[] array2) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,(msg + ": array size mismatch"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,array1.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,array2.length);
        for (int i = 0 ; i < (array1.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,(((msg + ": array[ ") + i) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1676,array1[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,array2[i]);
        }
    }
}

