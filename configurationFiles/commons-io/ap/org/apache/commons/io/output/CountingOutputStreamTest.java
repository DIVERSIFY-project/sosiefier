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

    public void testCounting_literalMutation3301() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3301");
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

    public void testCounting_literalMutation3302() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3302");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = -1 ; i < 20 ; i++) {
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

    public void testCounting_literalMutation3303() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3303");
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

    public void testCounting_literalMutation3304() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3304");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 19 ; i++) {
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

    public void testCounting_literalMutation3305() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3305");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 10 ; i++) {
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

    public void testCounting_literalMutation3306() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3306");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 40 ; i++) {
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

    public void testCounting_literalMutation3307() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3307");
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

    public void testCounting_literalMutation3308() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3308");
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

    public void testCounting_literalMutation3309() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3309");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 1, 20);
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

    public void testCounting_literalMutation3310() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3310");
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

    public void testCounting_literalMutation3311() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3311");
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

    public void testCounting_literalMutation3312() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3312");
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

    public void testCounting_literalMutation3313() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3313");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 10);
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

    public void testCounting_literalMutation3314() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3314");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 40);
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

    public void testCounting_literalMutation3315() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3315");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 21);
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

    public void testCounting_literalMutation3316() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3316");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[9];
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

    public void testCounting_literalMutation3317() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3317");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[5];
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

    public void testCounting_literalMutation3318() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3318");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[20];
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

    public void testCounting_literalMutation3319() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3319");
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

    public void testCounting_literalMutation3320() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3320");
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

    public void testCounting_literalMutation3321() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3321");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 10 ; i < 30 ; i++) {
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

    public void testCounting_literalMutation3322() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3322");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 40 ; i < 30 ; i++) {
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

    public void testCounting_literalMutation3323() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3323");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 21 ; i < 30 ; i++) {
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

    public void testCounting_literalMutation3324() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3324");
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

    public void testCounting_literalMutation3325() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3325");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 15 ; i++) {
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

    public void testCounting_literalMutation3326() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3326");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 60 ; i++) {
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

    public void testCounting_literalMutation3327() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3327");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 31 ; i++) {
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

    public void testCounting_literalMutation3328() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3328");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 19)] = ((byte)(i));
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

    public void testCounting_literalMutation3329() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3329");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 10)] = ((byte)(i));
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

    public void testCounting_literalMutation3330() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3330");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream cos = new CountingOutputStream(baos);
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,cos,1380,cos.getCount());
        byte[] array = new byte[10];
        for (int i = 20 ; i < 30 ; i++) {
            array[(i - 40)] = ((byte)(i));
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

    public void testCounting_literalMutation3331() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3331");
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

    public void testCounting_literalMutation3332() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3332");
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

    public void testCounting_literalMutation3333() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3333");
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
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 1, 30);
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

    public void testCounting_literalMutation3334() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3334");
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

    public void testCounting_literalMutation3335() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3335");
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

    public void testCounting_literalMutation3336() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3336");
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

    public void testCounting_literalMutation3337() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3337");
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
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 15);
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

    public void testCounting_literalMutation3338() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3338");
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
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 60);
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

    public void testCounting_literalMutation3339() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3339");
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
        assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 31);
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

    public void testCounting_literalMutation3340() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3340");
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
        for (int i = 24 ; i < 35 ; i++) {
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

    public void testCounting_literalMutation3341() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3341");
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
        for (int i = 12 ; i < 35 ; i++) {
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

    public void testCounting_literalMutation3342() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3342");
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
        for (int i = 50 ; i < 35 ; i++) {
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

    public void testCounting_literalMutation3343() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3343");
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

    public void testCounting_literalMutation3344() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3344");
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
        for (int i = 25 ; i < 34 ; i++) {
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

    public void testCounting_literalMutation3345() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3345");
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
        for (int i = 25 ; i < 17 ; i++) {
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

    public void testCounting_literalMutation3346() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3346");
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
        for (int i = 25 ; i < 70 ; i++) {
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

    public void testCounting_literalMutation3347() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3347");
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

    public void testCounting_literalMutation3348() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3348");
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
            array[(i - 24)] = ((byte)(i));
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

    public void testCounting_literalMutation3349() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3349");
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
            array[(i - 12)] = ((byte)(i));
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

    public void testCounting_literalMutation3350() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3350");
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
            array[(i - 50)] = ((byte)(i));
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

    public void testCounting_literalMutation3351() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3351");
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

    public void testCounting_literalMutation3352() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3352");
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
        cos.write(array, 4, 5);
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

    public void testCounting_literalMutation3353() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3353");
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
        cos.write(array, 2, 5);
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

    public void testCounting_literalMutation3354() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3354");
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
        cos.write(array, 10, 5);
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

    public void testCounting_literalMutation3355() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3355");
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

    public void testCounting_literalMutation3356() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3356");
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
        cos.write(array, 5, 4);
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

    public void testCounting_literalMutation3357() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3357");
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
        cos.write(array, 5, 2);
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

    public void testCounting_literalMutation3358() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3358");
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
        cos.write(array, 5, 10);
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

    public void testCounting_literalMutation3359() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3359");
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

    public void testCounting_literalMutation3360() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3360");
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

    public void testCounting_literalMutation3361() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3361");
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
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 1, 35);
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

    public void testCounting_literalMutation3362() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3362");
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

    public void testCounting_literalMutation3363() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3363");
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

    public void testCounting_literalMutation3364() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3364");
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
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 34);
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

    public void testCounting_literalMutation3365() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3365");
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
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 17);
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

    public void testCounting_literalMutation3366() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3366");
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
        assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 70);
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

    public void testCounting_literalMutation3367() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3367");
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

    public void testCounting_literalMutation3368() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3368");
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
        for (int i = 1 ; i < 10 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3369() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3369");
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

    public void testCounting_literalMutation3370() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3370");
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

    public void testCounting_literalMutation3371() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3371");
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
        for (int i = 0 ; i < 9 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3372() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3372");
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
        for (int i = 0 ; i < 5 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3373() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3373");
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
        for (int i = 0 ; i < 20 ; i++) {
            cos.write(i);
        }
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3374() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3374");
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

    public void testCounting_literalMutation3375() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3375");
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

    public void testCounting_literalMutation3376() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3376");
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

    public void testCounting_literalMutation3377() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3377");
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
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 17, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3378() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3378");
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
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 70, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3379() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3379");
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
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 36, 45);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3380() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3380");
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
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 44);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3381() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3381");
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
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 22);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3382() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3382");
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
        assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 90);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,cos,1387,cos.getCount());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCounting_literalMutation3383() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCounting_literalMutation3383");
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
public void testLargeFiles_IO84_literalMutation3384() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_literalMutation3384");
        long size = ((long)(Integer.MAX_VALUE)) + ((long)(2));
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
public void testLargeFiles_IO84_literalMutation3385() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_literalMutation3385");
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
public void testLargeFiles_IO84_literalMutation3386() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeFiles_IO84_literalMutation3386");
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

