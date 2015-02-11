package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link NullInputStream}.
 * 
 * @version $Id$
 */
public class NullInputStreamTest extends TestCase {
    /** 
     * Constructor
     */
public NullInputStreamTest(String name) {
        super(name);
    }

    /** 
     * Set up
     */
@Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /** 
     * Tear Down
     */
@Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /** 
     * Test <code>available()</code> method.
     */
public void testRead() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead");
        int size = 5;
        InputStream input = new TestNullInputStream(size);
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),680,(("Check Size [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),681,(size - i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),683,input,682,input.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),684,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,input,686,input.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),689,input,688,input.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),690,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),692,input,691,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),694,input,693,input.available());
        try {
            int result = input.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),695,(("Should have thrown an IOException, byte=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),697,e,696,e.getMessage());
        }
        input.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),698,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),700,input,699,input.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>available()</code> method.
     */
@Test(timeout = 1000)
    public void testRead_add209() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_add209");
        int size = 5;
        InputStream input = new TestNullInputStream(size);
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),680,(("Check Size [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),681,(size - i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),683,input,682,input.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),684,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,input,686,input.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),689,input,688,input.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),690,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),692,input,691,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),694,input,693,input.available());
        try {
            int result = input.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),695,(("Should have thrown an IOException, byte=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),697,e,696,e.getMessage());
        }
        input.close();
        input.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),698,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),700,input,699,input.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>available()</code> method.
     */
public void testRead_literalMutation494() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation494");
        int size = 6;
        InputStream input = new TestNullInputStream(size);
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),680,(("Check Size [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),681,(size - i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),683,input,682,input.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),684,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,input,686,input.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),689,input,688,input.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),690,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),692,input,691,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),694,input,693,input.available());
        try {
            int result = input.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),695,(("Should have thrown an IOException, byte=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),697,e,696,e.getMessage());
        }
        input.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),698,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),700,input,699,input.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>available()</code> method.
     */
public void testRead_literalMutation495() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation495");
        int size = 5;
        InputStream input = new TestNullInputStream(size);
        for (int i = -1 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),680,(("Check Size [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),681,(size - i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),683,input,682,input.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),684,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,input,686,input.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),689,input,688,input.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),690,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),692,input,691,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),694,input,693,input.available());
        try {
            int result = input.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),695,(("Should have thrown an IOException, byte=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),697,e,696,e.getMessage());
        }
        input.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),698,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),700,input,699,input.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>available()</code> method.
     */
@Test(timeout = 1000)
    public void testRead_remove90() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_remove90");
        int size = 5;
        InputStream input = new TestNullInputStream(size);
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),680,(("Check Size [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),681,(size - i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),683,input,682,input.available());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),684,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,input,686,input.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),689,input,688,input.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),690,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),692,input,691,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),694,input,693,input.available());
        try {
            int result = input.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),695,(("Should have thrown an IOException, byte=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),697,e,696,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),698,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),700,input,699,input.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(byte[])</code> method.
     */
@Test(timeout = 1000)
    public void testReadByteArray_add210() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_add210");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(15);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),704,bytes[i]);
        }
        int count2 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),706,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
        }
        int count3 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),708,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,count3);
        try {
            int count4 = input.read(bytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),710,(("Should have thrown an IOException, byte=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,e,711,e.getMessage());
        }
        input.close();
        input.close();
        int offset = 2;
        int lth = 4;
        int count5 = input.read(bytes, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,bytes[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(byte[])</code> method.
     */
public void testReadByteArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray");
        byte[] bytes = new byte[11];
        InputStream input = new TestNullInputStream(15);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),704,bytes[i]);
        }
        int count2 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),706,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
        }
        int count3 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),708,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,count3);
        try {
            int count4 = input.read(bytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),710,(("Should have thrown an IOException, byte=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,e,711,e.getMessage());
        }
        input.close();
        int offset = 2;
        int lth = 4;
        int count5 = input.read(bytes, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,bytes[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(byte[])</code> method.
     */
public void testReadByteArray_literalMutation497() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation497");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(16);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),704,bytes[i]);
        }
        int count2 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),706,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
        }
        int count3 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),708,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,count3);
        try {
            int count4 = input.read(bytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),710,(("Should have thrown an IOException, byte=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,e,711,e.getMessage());
        }
        input.close();
        int offset = 2;
        int lth = 4;
        int count5 = input.read(bytes, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,bytes[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(byte[])</code> method.
     */
public void testReadByteArray_literalMutation498() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation498");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(15);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = 1 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),704,bytes[i]);
        }
        int count2 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),706,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
        }
        int count3 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),708,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,count3);
        try {
            int count4 = input.read(bytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),710,(("Should have thrown an IOException, byte=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,e,711,e.getMessage());
        }
        input.close();
        int offset = 2;
        int lth = 4;
        int count5 = input.read(bytes, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,bytes[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(byte[])</code> method.
     */
public void testReadByteArray_literalMutation499() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation499");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(15);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),704,bytes[i]);
        }
        int count2 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,count2);
        for (int i = -1 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),706,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
        }
        int count3 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),708,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,count3);
        try {
            int count4 = input.read(bytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),710,(("Should have thrown an IOException, byte=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,e,711,e.getMessage());
        }
        input.close();
        int offset = 2;
        int lth = 4;
        int count5 = input.read(bytes, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,bytes[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(byte[])</code> method.
     */
public void testReadByteArray_literalMutation500() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation500");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(15);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),704,bytes[i]);
        }
        int count2 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),706,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
        }
        int count3 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),708,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,count3);
        try {
            int count4 = input.read(bytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),710,(("Should have thrown an IOException, byte=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,e,711,e.getMessage());
        }
        input.close();
        int offset = 3;
        int lth = 4;
        int count5 = input.read(bytes, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,bytes[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(byte[])</code> method.
     */
public void testReadByteArray_literalMutation501() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation501");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(15);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),704,bytes[i]);
        }
        int count2 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),706,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
        }
        int count3 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),708,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,count3);
        try {
            int count4 = input.read(bytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),710,(("Should have thrown an IOException, byte=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,e,711,e.getMessage());
        }
        input.close();
        int offset = 2;
        int lth = 3;
        int count5 = input.read(bytes, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,bytes[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(byte[])</code> method.
     */
@Test(timeout = 1000)
    public void testReadByteArray_remove91() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_remove91");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(15);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),704,bytes[i]);
        }
        int count2 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),706,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
        }
        int count3 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),708,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,count3);
        try {
            int count4 = input.read(bytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),710,(("Should have thrown an IOException, byte=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,e,711,e.getMessage());
        }
        int offset = 2;
        int lth = 4;
        int count5 = input.read(bytes, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,bytes[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test when configured to throw an EOFException at the end of file
     * (rather than return -1).
     */
public void testEOFException() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException");
        InputStream input = new TestNullInputStream(1 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),651,input,650,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),653,input,652,input.read());
        try {
            int result = input.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),654,(("Should have thrown an EOFException, byte=[" + result) + "]"));
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test when configured to throw an EOFException at the end of file
     * (rather than return -1).
     */
public void testEOFException_literalMutation478() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation478");
        InputStream input = new TestNullInputStream(2 , true , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),651,input,650,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),653,input,652,input.read());
        try {
            int result = input.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),654,(("Should have thrown an EOFException, byte=[" + result) + "]"));
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test when configured to throw an EOFException at the end of file
     * (rather than return -1).
     */
public void testEOFException_literalMutation479() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation479");
        InputStream input = new TestNullInputStream(2 , false , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),651,input,650,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),653,input,652,input.read());
        try {
            int result = input.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),654,(("Should have thrown an EOFException, byte=[" + result) + "]"));
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_add203() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_add203");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_add204() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_add204");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_add205() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_add205");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_add206() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_add206");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset");
        int position = 1;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation481() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation481");
        int position = 0;
        int readlimit = 9;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation482() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation482");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(99 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation483() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation483");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation484() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation484");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation485() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation485");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 4 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation486() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation486");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 1 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation487() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation487");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation488() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation488");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = -1 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation489() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation489");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 2) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_remove88() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_remove88");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        input.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_remove89() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_remove89");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,input,661,input.read());
        }
        input.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),666,input,665,input.read());
        }
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),668,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),670,input,669,input.read());
        }
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,e,672,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
@Test(timeout = 1000)
    public void testMarkNotSupported_add207() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_add207");
        InputStream input = new TestNullInputStream(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(5);
            input.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),677,e,676,e.getMessage());
        }
        try {
            input.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,e,678,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
@Test(timeout = 1000)
    public void testMarkNotSupported_add208() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_add208");
        InputStream input = new TestNullInputStream(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),677,e,676,e.getMessage());
        }
        try {
            input.reset();
            input.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,e,678,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported");
        InputStream input = new TestNullInputStream(101 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),677,e,676,e.getMessage());
        }
        try {
            input.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,e,678,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported_literalMutation491() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation491");
        InputStream input = new TestNullInputStream(100 , true , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),677,e,676,e.getMessage());
        }
        try {
            input.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,e,678,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported_literalMutation492() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation492");
        InputStream input = new TestNullInputStream(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),677,e,676,e.getMessage());
        }
        try {
            input.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,e,678,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported_literalMutation493() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation493");
        InputStream input = new TestNullInputStream(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(4);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),677,e,676,e.getMessage());
        }
        try {
            input.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,e,678,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip");
        InputStream input = new TestNullInputStream(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,e,730,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
@Test(timeout = 1000)
    public void testSkip_add211() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add211");
        InputStream input = new TestNullInputStream(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(5);
            input.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,e,730,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation502() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation502");
        InputStream input = new TestNullInputStream(9 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,e,730,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation503() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation503");
        InputStream input = new TestNullInputStream(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,e,730,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation504() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation504");
        InputStream input = new TestNullInputStream(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,e,730,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation505() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation505");
        InputStream input = new TestNullInputStream(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(4);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,e,730,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static final class TestNullInputStream extends NullInputStream {
        public TestNullInputStream(int size) {
            super(size);
        }

        public TestNullInputStream(int size ,boolean markSupported ,boolean throwEofException) {
            super(size, markSupported, throwEofException);
        }

        @Override
        protected int processByte() {
            return ((int)(getPosition())) - 1;
        }

        @Override
        protected void processBytes(byte[] bytes, int offset, int length) {
            int startPos = ((int)(getPosition())) - length;
            for (int i = offset ; i < length ; i++) {
                bytes[i] = ((byte)(startPos + i));
            }
        }
    }
}

