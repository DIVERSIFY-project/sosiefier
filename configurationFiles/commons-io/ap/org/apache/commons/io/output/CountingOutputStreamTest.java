package org.apache.commons.io.output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.commons.io.input.NullInputStream;
import java.io.OutputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * @version $Id$
 */
public class CountingOutputStreamTest extends TestCase {
    public CountingOutputStreamTest(String name) {
        super(name);
    }

    public void testCounting() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_add960() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add960");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_add961() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add961");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_add962() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add962");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_add963() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add963");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_add964() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add964");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_add965() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add965");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_add966() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add966");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_add967() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_add967");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2294() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2294");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 1 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2295() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2295");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 21 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2296() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2296");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("foo", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2297() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2297");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), -1, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2298() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2298");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 19);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2299() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2299");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[11];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2300() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2300");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 19 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2301() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2301");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 29 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2302() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2302");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 21)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2303() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2303");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("foo", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2304() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2304");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), -1, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2305() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2305");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 29);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2306() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2306");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 26 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2307() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2307");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 36 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2308() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2308");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 26)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2309() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2309");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 6, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2310() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2310");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 6);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2311() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2311");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("foo", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2312() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2312");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), -1, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2313() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2313");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 36);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2314() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2314");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = -1 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2315() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2315");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 11 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2316() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2316");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("foo", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2317() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2317");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 34, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation2318() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation2318");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 46);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove789() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove789");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove790() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove790");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove791() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove791");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove792() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove792");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove793() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove793");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove794() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove794");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove795() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove795");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCounting_remove796() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_remove796");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 20)] = ((byte)(i));
        }
        cos.write(array);
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,cos,1382,cos.getCount());
        for (int i = 25 ; i < 35 ; i++) {
            array[(i - 25)] = ((byte)(i));
        }
        cos.write(array, 5, 5);
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,cos,1384,cos.getCount());
        int count = cos.resetCount();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,count);
        for (int i = 0 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
public void testLargeFiles_IO84() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add968() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add968");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add969() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add969");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        try {
            cos.getCount();
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add970() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add970");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add971() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add971");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_add972() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_add972");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
public void testLargeFiles_IO84_literalMutation2319() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_literalMutation2319");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(0));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_remove797() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_remove797");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_remove798() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_remove798");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for files > 2GB in size - see issue IO-84
     */
@Test(timeout = 1000)
    public void testLargeFiles_IO84_remove799() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_remove799");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(1));
        NullInputStream mock = new NullInputStream(size);
        OutputStream nos = new NullOutputStream();
        CountingOutputStream cos = new CountingOutputStream(nos);
        try {
            cos.getCount();
        } catch (ArithmeticException ae) {
        }
        try {
            cos.resetCount();
        } catch (ArithmeticException ae) {
        }
        mock.close();
        org.apache.commons.io.IOUtils.copyLarge(mock, cos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1391,cos,1390,cos.getByteCount());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,cos,1393,cos.resetByteCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertByteArrayEquals(String msg, byte[] array, int start, int end) {
        for (int i = start ; i < end ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1377,(((msg + ": array[") + i) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1378,array[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,(i - start));
        }
    }
}

