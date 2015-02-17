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
public void testRead_literalMutation1032() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation1032");
        int size = 4;
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
public void testRead_literalMutation1033() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation1033");
        int size = 2;
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
public void testRead_literalMutation1034() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation1034");
        int size = 10;
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
public void testRead_literalMutation1035() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation1035");
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
public void testRead_literalMutation1036() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation1036");
        int size = 5;
        InputStream input = new TestNullInputStream(size);
        for (int i = 1 ; i < size ; i++) {
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
public void testRead_literalMutation1037() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation1037");
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
public void testRead_literalMutation1038() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation1038");
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
        byte[] bytes = new byte[9];
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
public void testReadByteArray_literalMutation1040() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1040");
        byte[] bytes = new byte[5];
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
public void testReadByteArray_literalMutation1041() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1041");
        byte[] bytes = new byte[20];
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
public void testReadByteArray_literalMutation1042() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1042");
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
public void testReadByteArray_literalMutation1043() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1043");
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
public void testReadByteArray_literalMutation1044() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1044");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(14);
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
public void testReadByteArray_literalMutation1045() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1045");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(7);
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
public void testReadByteArray_literalMutation1046() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1046");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(30);
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
public void testReadByteArray_literalMutation1047() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1047");
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
public void testReadByteArray_literalMutation1048() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1048");
        byte[] bytes = new byte[10];
        InputStream input = new TestNullInputStream(15);
        int count1 = input.read(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,bytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),702,count1);
        for (int i = -1 ; i < count1 ; i++) {
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
public void testReadByteArray_literalMutation1049() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1049");
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
public void testReadByteArray_literalMutation1050() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1050");
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
        for (int i = 1 ; i < count2 ; i++) {
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
public void testReadByteArray_literalMutation1051() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1051");
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
public void testReadByteArray_literalMutation1052() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1052");
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
public void testReadByteArray_literalMutation1053() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1053");
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
        int offset = 1;
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
public void testReadByteArray_literalMutation1054() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1054");
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
        int offset = 4;
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
public void testReadByteArray_literalMutation1055() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1055");
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
public void testReadByteArray_literalMutation1056() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1056");
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
        int lth = 2;
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
public void testReadByteArray_literalMutation1057() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1057");
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
        int lth = 8;
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
public void testReadByteArray_literalMutation1058() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1058");
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
        int lth = 5;
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
public void testReadByteArray_literalMutation1059() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByteArray_literalMutation1059");
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
public void testEOFException_literalMutation988() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation988");
        InputStream input = new TestNullInputStream(4 , false , true);
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
public void testEOFException_literalMutation989() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation989");
        InputStream input = new TestNullInputStream(3 , false , true);
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
public void testEOFException_literalMutation990() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation990");
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
public void testEOFException_literalMutation991() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation991");
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
public void testMarkAndReset_literalMutation1000() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1000");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(101 , true , false);
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
public void testMarkAndReset_literalMutation1001() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1001");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(50 , true , false);
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
public void testMarkAndReset_literalMutation1002() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1002");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(200 , true , false);
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
public void testMarkAndReset_literalMutation1003() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1003");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , false , false);
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
public void testMarkAndReset_literalMutation1004() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1004");
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
public void testMarkAndReset_literalMutation1005() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1005");
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
public void testMarkAndReset_literalMutation1006() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1006");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 2 ; position++) {
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
public void testMarkAndReset_literalMutation1007() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1007");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 1 ; position++) {
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
public void testMarkAndReset_literalMutation1008() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1008");
        int position = 0;
        int readlimit = 10;
        InputStream input = new TestNullInputStream(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),656,input,655,input.markSupported());
        try {
            input.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),658,e,657,e.getMessage());
        }
        for ( ; position < 6 ; position++) {
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
public void testMarkAndReset_literalMutation1009() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1009");
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
public void testMarkAndReset_literalMutation1010() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1010");
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
        for (int i = -1 ; i < 3 ; i++) {
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
public void testMarkAndReset_literalMutation1011() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1011");
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
public void testMarkAndReset_literalMutation1012() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1012");
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
        for (int i = 0 ; i < 4 ; i++) {
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
public void testMarkAndReset_literalMutation1013() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1013");
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
public void testMarkAndReset_literalMutation1014() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1014");
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
        for (int i = 0 ; i < 1 ; i++) {
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
public void testMarkAndReset_literalMutation1015() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1015");
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
        for (int i = 0 ; i < 6 ; i++) {
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
public void testMarkAndReset_literalMutation1016() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1016");
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
        for (int i = 1 ; i < (readlimit + 1) ; i++) {
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
public void testMarkAndReset_literalMutation1017() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1017");
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
public void testMarkAndReset_literalMutation1018() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1018");
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
public void testMarkAndReset_literalMutation1019() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1019");
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
public void testMarkAndReset_literalMutation1020() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1020");
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
        for (int i = 0 ; i < (readlimit + 0) ; i++) {
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
public void testMarkAndReset_literalMutation1021() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation1021");
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
        for (int i = 0 ; i < (readlimit + 0) ; i++) {
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
public void testMarkAndReset_literalMutation993() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation993");
        int position = -1;
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
public void testMarkAndReset_literalMutation994() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation994");
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
public void testMarkAndReset_literalMutation995() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation995");
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
public void testMarkAndReset_literalMutation996() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation996");
        int position = 0;
        int readlimit = 5;
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
public void testMarkAndReset_literalMutation997() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation997");
        int position = 0;
        int readlimit = 20;
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
public void testMarkAndReset_literalMutation998() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation998");
        int position = 0;
        int readlimit = 11;
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
public void testMarkAndReset_literalMutation999() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation999");
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
        InputStream input = new TestNullInputStream(99 , false , true);
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
public void testMarkNotSupported_literalMutation1023() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1023");
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
public void testMarkNotSupported_literalMutation1024() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1024");
        InputStream input = new TestNullInputStream(50 , false , true);
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
public void testMarkNotSupported_literalMutation1025() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1025");
        InputStream input = new TestNullInputStream(200 , false , true);
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
public void testMarkNotSupported_literalMutation1026() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1026");
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
public void testMarkNotSupported_literalMutation1027() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1027");
        InputStream input = new TestNullInputStream(100 , false , false);
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
public void testMarkNotSupported_literalMutation1028() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1028");
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
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported_literalMutation1029() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1029");
        InputStream input = new TestNullInputStream(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(2);
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
public void testMarkNotSupported_literalMutation1030() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1030");
        InputStream input = new TestNullInputStream(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(10);
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
public void testMarkNotSupported_literalMutation1031() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation1031");
        InputStream input = new TestNullInputStream(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,input,674,input.markSupported());
        try {
            input.mark(6);
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
public void testSkip_literalMutation1060() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1060");
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
public void testSkip_literalMutation1061() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1061");
        InputStream input = new TestNullInputStream(5 , true , false);
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
public void testSkip_literalMutation1062() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1062");
        InputStream input = new TestNullInputStream(20 , true , false);
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
public void testSkip_literalMutation1063() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1063");
        InputStream input = new TestNullInputStream(11 , true , false);
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
public void testSkip_literalMutation1064() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1064");
        InputStream input = new TestNullInputStream(10 , false , false);
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
public void testSkip_literalMutation1065() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1065");
        InputStream input = new TestNullInputStream(10 , true , true);
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
public void testSkip_literalMutation1066() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1066");
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

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation1067() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1067");
        InputStream input = new TestNullInputStream(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(2);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,e,730,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation1068() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1068");
        InputStream input = new TestNullInputStream(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(10);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,e,730,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation1069() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation1069");
        InputStream input = new TestNullInputStream(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),718,input,717,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),720,input,719,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),722,input,721,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),724,input,723,input.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),726,input,725,input.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,input,728,input.skip(5));
        try {
            input.skip(6);
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

