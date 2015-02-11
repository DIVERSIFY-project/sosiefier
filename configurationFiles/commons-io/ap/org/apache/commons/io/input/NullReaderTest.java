package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * JUnit Test Case for {@link NullReader}.
 * 
 * @version $Id$
 */
public class NullReaderTest extends TestCase {
    /** 
     * Constructor
     */
public NullReaderTest(String name) {
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
        TestNullReader reader = new TestNullReader(size);
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),762,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),763,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),765,reader,764,reader.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),766,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),768,reader,767,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),769,(("Should have thrown an IOException, value=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),771,e,770,e.getMessage());
        }
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),773,reader,772,reader.getPosition());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>available()</code> method.
     */
@Test(timeout = 1000)
    public void testRead_add218() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_add218");
        int size = 5;
        TestNullReader reader = new TestNullReader(size);
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),762,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),763,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),765,reader,764,reader.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),766,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),768,reader,767,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),769,(("Should have thrown an IOException, value=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),771,e,770,e.getMessage());
        }
        reader.close();
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),773,reader,772,reader.getPosition());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>available()</code> method.
     */
public void testRead_literalMutation523() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation523");
        int size = 4;
        TestNullReader reader = new TestNullReader(size);
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),762,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),763,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),765,reader,764,reader.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),766,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),768,reader,767,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),769,(("Should have thrown an IOException, value=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),771,e,770,e.getMessage());
        }
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),773,reader,772,reader.getPosition());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>available()</code> method.
     */
public void testRead_literalMutation524() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation524");
        int size = 5;
        TestNullReader reader = new TestNullReader(size);
        for (int i = -1 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),762,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),763,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),765,reader,764,reader.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),766,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),768,reader,767,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),769,(("Should have thrown an IOException, value=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),771,e,770,e.getMessage());
        }
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),773,reader,772,reader.getPosition());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>available()</code> method.
     */
@Test(timeout = 1000)
    public void testRead_remove94() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_remove94");
        int size = 5;
        TestNullReader reader = new TestNullReader(size);
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),762,(("Check Value [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),763,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),765,reader,764,reader.read());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),766,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),768,reader,767,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),769,(("Should have thrown an IOException, value=[" + result) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),771,e,770,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),773,reader,772,reader.getPosition());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
public void testReadCharArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray");
        char[] chars = new char[10];
        Reader reader = new TestNullReader(15);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        reader.close();
        int offset = 2;
        int lth = 4;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
@Test(timeout = 1000)
    public void testReadCharArray_add219() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_add219");
        char[] chars = new char[10];
        Reader reader = new TestNullReader(15);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        reader.close();
        reader.close();
        int offset = 2;
        int lth = 4;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
public void testReadCharArray_literalMutation525() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation525");
        char[] chars = new char[11];
        Reader reader = new TestNullReader(15);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        reader.close();
        int offset = 2;
        int lth = 4;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
public void testReadCharArray_literalMutation526() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation526");
        char[] chars = new char[10];
        Reader reader = new TestNullReader(16);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        reader.close();
        int offset = 2;
        int lth = 4;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
public void testReadCharArray_literalMutation527() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation527");
        char[] chars = new char[10];
        Reader reader = new TestNullReader(15);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = -1 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        reader.close();
        int offset = 2;
        int lth = 4;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
public void testReadCharArray_literalMutation528() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation528");
        char[] chars = new char[10];
        Reader reader = new TestNullReader(15);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 1 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        reader.close();
        int offset = 2;
        int lth = 4;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
public void testReadCharArray_literalMutation529() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation529");
        char[] chars = new char[10];
        Reader reader = new TestNullReader(15);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        reader.close();
        int offset = 3;
        int lth = 4;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
public void testReadCharArray_literalMutation530() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation530");
        char[] chars = new char[10];
        Reader reader = new TestNullReader(15);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        reader.close();
        int offset = 2;
        int lth = 3;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>read(char[])</code> method.
     */
@Test(timeout = 1000)
    public void testReadCharArray_remove95() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_remove95");
        char[] chars = new char[10];
        Reader reader = new TestNullReader(15);
        int count1 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,chars.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,count1);
        for (int i = 0 ; i < count1 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),776,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,chars[i]);
        }
        int count2 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,count2);
        for (int i = 0 ; i < count2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,(count1 + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,chars[i]);
        }
        int count3 = reader.read(chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,count3);
        try {
            int count4 = reader.read(chars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,(("Should have thrown an IOException, value=[" + count4) + "]"));
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,e,784,e.getMessage());
        }
        int offset = 2;
        int lth = 4;
        int count5 = reader.read(chars, offset, lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,lth);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,count5);
        for (int i = offset ; i < lth ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,chars[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test when configured to throw an EOFException at the end of file
     * (rather than return -1).
     */
public void testEOFException() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException");
        Reader reader = new TestNullReader(2 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),733,reader,732,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),735,reader,734,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),736,(("Should have thrown an EOFException, value=[" + result) + "]"));
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test when configured to throw an EOFException at the end of file
     * (rather than return -1).
     */
public void testEOFException_literalMutation506() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation506");
        Reader reader = new TestNullReader(3 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),733,reader,732,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),735,reader,734,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),736,(("Should have thrown an EOFException, value=[" + result) + "]"));
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test when configured to throw an EOFException at the end of file
     * (rather than return -1).
     */
public void testEOFException_literalMutation507() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation507");
        Reader reader = new TestNullReader(2 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),733,reader,732,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),735,reader,734,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),736,(("Should have thrown an EOFException, value=[" + result) + "]"));
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test when configured to throw an EOFException at the end of file
     * (rather than return -1).
     */
public void testEOFException_literalMutation508() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_literalMutation508");
        Reader reader = new TestNullReader(2 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),733,reader,732,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),735,reader,734,reader.read());
        try {
            int result = reader.read();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),736,(("Should have thrown an EOFException, value=[" + result) + "]"));
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_add212() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_add212");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_add213() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_add213");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_add214() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_add214");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_add215() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_add215");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation509() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation509");
        int position = -1;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation510() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation510");
        int position = 0;
        int readlimit = 11;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation511() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation511");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(101 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation512() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation512");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , false , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation513() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation513");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation514() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation514");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 4 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation515() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation515");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 1 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation516() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation516");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 2 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation517() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation517");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = -1 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
public void testMarkAndReset_literalMutation518() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_literalMutation518");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 2) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_remove92() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_remove92");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        reader.reset();
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> and <code>reset()</code> methods.
     */
@Test(timeout = 1000)
    public void testMarkAndReset_remove93() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkAndReset_remove93");
        int position = 0;
        int readlimit = 10;
        Reader reader = new TestNullReader(100 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),738,reader,737,reader.markSupported());
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),740,e,739,e.getMessage());
        }
        for ( ; position < 3 ; position++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,(("Read Before Mark [" + position) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),742,position);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),744,reader,743,reader.read());
        }
        reader.mark(readlimit);
        for (int i = 0 ; i < 3 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,(("Read After Mark [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),746,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,reader,747,reader.read());
        }
        for (int i = 0 ; i < (readlimit + 1) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,(("Read After Reset [" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,(position + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),752,reader,751,reader.read());
        }
        try {
            reader.reset();
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,(((("Marked position [" + position) + "] is no longer valid - passed the read limit [") + readlimit) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,e,754,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported");
        Reader reader = new TestNullReader(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,reader,756,reader.markSupported());
        try {
            reader.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,e,758,e.getMessage());
        }
        try {
            reader.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,e,760,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
@Test(timeout = 1000)
    public void testMarkNotSupported_add216() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_add216");
        Reader reader = new TestNullReader(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,reader,756,reader.markSupported());
        try {
            reader.mark(5);
            reader.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,e,758,e.getMessage());
        }
        try {
            reader.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,e,760,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
@Test(timeout = 1000)
    public void testMarkNotSupported_add217() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_add217");
        Reader reader = new TestNullReader(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,reader,756,reader.markSupported());
        try {
            reader.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,e,758,e.getMessage());
        }
        try {
            reader.reset();
            reader.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,e,760,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported_literalMutation519() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation519");
        Reader reader = new TestNullReader(99 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,reader,756,reader.markSupported());
        try {
            reader.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,e,758,e.getMessage());
        }
        try {
            reader.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,e,760,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported_literalMutation520() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation520");
        Reader reader = new TestNullReader(100 , true , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,reader,756,reader.markSupported());
        try {
            reader.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,e,758,e.getMessage());
        }
        try {
            reader.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,e,760,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported_literalMutation521() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation521");
        Reader reader = new TestNullReader(100 , false , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,reader,756,reader.markSupported());
        try {
            reader.mark(5);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,e,758,e.getMessage());
        }
        try {
            reader.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,e,760,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>mark()</code> not supported.
     */
public void testMarkNotSupported_literalMutation522() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkNotSupported_literalMutation522");
        Reader reader = new TestNullReader(100 , false , true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,reader,756,reader.markSupported());
        try {
            reader.mark(6);
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,e,758,e.getMessage());
        }
        try {
            reader.reset();
        } catch (UnsupportedOperationException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,e,760,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip");
        Reader reader = new TestNullReader(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,reader,790,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,reader,792,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,reader,794,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,reader,796,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,reader,798,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),800,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),802,reader,801,reader.skip(5));
        try {
            reader.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),804,e,803,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
@Test(timeout = 1000)
    public void testSkip_add220() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add220");
        Reader reader = new TestNullReader(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,reader,790,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,reader,792,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,reader,794,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,reader,796,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,reader,798,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),800,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),802,reader,801,reader.skip(5));
        try {
            reader.skip(5);
            reader.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),804,e,803,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation531() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation531");
        Reader reader = new TestNullReader(11 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,reader,790,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,reader,792,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,reader,794,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,reader,796,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,reader,798,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),800,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),802,reader,801,reader.skip(5));
        try {
            reader.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),804,e,803,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation532() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation532");
        Reader reader = new TestNullReader(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,reader,790,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,reader,792,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,reader,794,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,reader,796,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,reader,798,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),800,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),802,reader,801,reader.skip(5));
        try {
            reader.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),804,e,803,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation533() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation533");
        Reader reader = new TestNullReader(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,reader,790,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,reader,792,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,reader,794,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,reader,796,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,reader,798,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),800,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),802,reader,801,reader.skip(5));
        try {
            reader.skip(5);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),804,e,803,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test <code>skip()</code> method.
     */
public void testSkip_literalMutation534() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation534");
        Reader reader = new TestNullReader(10 , true , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,reader,790,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,reader,792,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,reader,794,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,reader,796,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,reader,798,reader.skip(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),800,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),802,reader,801,reader.skip(5));
        try {
            reader.skip(6);
        } catch (IOException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),804,e,803,e.getMessage());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static final class TestNullReader extends NullReader {
        public TestNullReader(int size) {
            super(size);
        }

        public TestNullReader(int size ,boolean markSupported ,boolean throwEofException) {
            super(size, markSupported, throwEofException);
        }

        @Override
        protected int processChar() {
            return ((int)(getPosition())) - 1;
        }

        @Override
        protected void processChars(char[] chars, int offset, int length) {
            int startPos = ((int)(getPosition())) - length;
            for (int i = offset ; i < length ; i++) {
                chars[i] = ((char)(startPos + i));
            }
        }
    }
}

