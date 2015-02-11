package org.apache.commons.io.output;

import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Test {@link ProxyWriter}.
 * 
 * @version $Id$
 */
public class ProxyWriterTest extends TestCase {
    public ProxyWriterTest(String name) {
        super(name);
    }

    /** 
     * Test Appending a CharSequence
     */
@Test(timeout = 1000)
    public void testAppendCharSequence_add1066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequence_add1066");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.append("ABC");
            proxy.append("ABC");
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1601,("Appending CharSequence threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,writer,1602,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Appending a CharSequence
     */
public void testAppendCharSequence() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequence");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.append("foo");
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1601,("Appending CharSequence threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,writer,1602,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a String
     */
@Test(timeout = 1000)
    public void testWriteString_add1074() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString_add1074");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write("ABC");
            proxy.write("ABC");
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,("Writing String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,writer,1619,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a String
     */
public void testWriteString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write("foo");
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,("Writing String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,writer,1619,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a Partial String
     */
@Test(timeout = 1000)
    public void testWriteStringPartial_add1075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPartial_add1075");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write("ABC", 1, 2);
            proxy.write("ABC", 1, 2);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,("Writing String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,writer,1616,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a Partial String
     */
public void testWriteStringPartial() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPartial");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write("foo", 1, 2);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,("Writing String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,writer,1616,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a Partial String
     */
public void testWriteStringPartial_literalMutation2430() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPartial_literalMutation2430");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write("ABC", 0, 2);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,("Writing String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,writer,1616,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a Partial String
     */
public void testWriteStringPartial_literalMutation2431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPartial_literalMutation2431");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write("ABC", 1, 3);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,("Writing String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,writer,1616,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a Char array
     */
@Test(timeout = 1000)
    public void testWriteCharArray_add1072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArray_add1072");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write(new char[]{ 'A' , 'B' , 'C' });
            proxy.write(new char[]{ 'A' , 'B' , 'C' });
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1612,("Writing char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,writer,1613,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a Partial Char array
     */
@Test(timeout = 1000)
    public void testWriteCharArrayPartial_add1073() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPartial_add1073");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write(new char[]{ 'A' , 'B' , 'C' }, 1, 2);
            proxy.write(new char[]{ 'A' , 'B' , 'C' }, 1, 2);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1609,("Writing char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,writer,1610,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a Partial Char array
     */
public void testWriteCharArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArray");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write(new char[]{ 'A' , 'B' , 'C' }, 0, 2);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1609,("Writing char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,writer,1610,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Writing a Partial Char array
     */
public void testWriteCharArrayPartial() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPartial");
        StringBuilderWriter writer = new StringBuilderWriter();
        ProxyWriter proxy = new ProxyWriter(writer);
        try {
            proxy.write(new char[]{ 'A' , 'B' , 'C' }, 1, 1);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1609,("Writing char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,writer,1610,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null String
     */
@Test(timeout = 1000)
    public void testNullString_add1070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullString_add1070");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((String)(null)));
            proxy.write(((String)(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,("Writing null String threw " + e));
        }
        try {
            proxy.write(((String)(null)), 0, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null String
     */
@Test(timeout = 1000)
    public void testNullString_add1071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullString_add1071");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((String)(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,("Writing null String threw " + e));
        }
        try {
            proxy.write(((String)(null)), 0, 0);
            proxy.write(((String)(null)), 0, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null String
     */
public void testNullString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullString");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((String)(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,("Writing null String threw " + e));
        }
        try {
            proxy.write(((String)(null)), -1, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null String
     */
public void testNullString_literalMutation2419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullString_literalMutation2419");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((String)(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,("Writing null String threw " + e));
        }
        try {
            proxy.write(((String)(null)), 0, -1);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,("Writing null String threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char array
     */
public void testNullCharArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1604,("Writing null char[] threw " + e));
        }
        try {
            proxy.write(((char[])(null)), 0, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,("Writing null char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char array
     */
@Test(timeout = 1000)
    public void testNullCharArray_add1067() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray_add1067");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((char[])(null)));
            proxy.write(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1604,("Writing null char[] threw " + e));
        }
        try {
            proxy.write(((char[])(null)), 0, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,("Writing null char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char array
     */
@Test(timeout = 1000)
    public void testNullCharArray_add1068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray_add1068");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1604,("Writing null char[] threw " + e));
        }
        try {
            proxy.write(((char[])(null)), 0, 0);
            proxy.write(((char[])(null)), 0, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,("Writing null char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char array
     */
public void testNullCharArray_literalMutation2413() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray_literalMutation2413");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1604,("Writing null char[] threw " + e));
        }
        try {
            proxy.write(((char[])(null)), 1, 0);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,("Writing null char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test writing Null Char array
     */
public void testNullCharArray_literalMutation2414() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharArray_literalMutation2414");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.write(((char[])(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1604,("Writing null char[] threw " + e));
        }
        try {
            proxy.write(((char[])(null)), 0, -1);
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,("Writing null char[] threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test appending Null CharSequence
     */
@Test(timeout = 1000)
    public void testNullCharSequencec() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullCharSequencec");
        ProxyWriter proxy = new ProxyWriter(new NullWriter());
        try {
            proxy.append(((String)(null)));
            proxy.append(((String)(null)));
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1606,("Appending null CharSequence threw " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

