package org.apache.commons.io.output;

import java.io.IOException;
import org.junit.Test;
import junit.framework.TestCase;
import java.io.Writer;

/** 
 * Test case for {@link StringBuilderWriter}.
 * 
 * @version $Id$
 */
public class StringBuilderWriterTest extends TestCase {
    private static final char[] FOOBAR_CHARS = new char[]{ 'F' , 'o' , 'o' , 'B' , 'a' , 'r' };

    /** 
     * Contruct a new test case.
     * @param name The name of the test
     */
public StringBuilderWriterTest(String name) {
        super(name);
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
@Test(timeout = 1000)
    public void testAppendConstructCapacity_add1079() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructCapacity_add1079");
        Writer writer = new StringBuilderWriter(100);
        writer.append("Foo");
        writer.append("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,writer,1625,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
public void testAppendConstructCapacity() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructCapacity");
        Writer writer = new StringBuilderWriter(99);
        writer.append("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,writer,1625,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
public void testAppendConstructCapacity_literalMutation3607() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructCapacity_literalMutation3607");
        Writer writer = new StringBuilderWriter(101);
        writer.append("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,writer,1625,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
public void testAppendConstructCapacity_literalMutation3608() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructCapacity_literalMutation3608");
        Writer writer = new StringBuilderWriter(50);
        writer.append("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,writer,1625,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
public void testAppendConstructCapacity_literalMutation3609() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructCapacity_literalMutation3609");
        Writer writer = new StringBuilderWriter(200);
        writer.append("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,writer,1625,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
public void testAppendConstructCapacity_literalMutation3610() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructCapacity_literalMutation3610");
        Writer writer = new StringBuilderWriter(100);
        writer.append("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,writer,1625,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
@Test(timeout = 1000)
    public void testAppendConstructCapacity_remove836() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructCapacity_remove836");
        Writer writer = new StringBuilderWriter(100);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,writer,1625,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
@Test(timeout = 1000)
    public void testAppendConstructStringBuilder_add1081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructStringBuilder_add1081");
        StringBuilder builder = new StringBuilder("Foo");
        StringBuilderWriter writer = new StringBuilderWriter(builder);
        writer.append("Bar");
        writer.append("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,writer,1629,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,builder);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,writer,1632,writer.getBuilder());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
public void testAppendConstructStringBuilder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructStringBuilder");
        StringBuilder builder = new StringBuilder("bar");
        StringBuilderWriter writer = new StringBuilderWriter(builder);
        writer.append("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,writer,1629,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,builder);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,writer,1632,writer.getBuilder());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
public void testAppendConstructStringBuilder_literalMutation3614() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructStringBuilder_literalMutation3614");
        StringBuilder builder = new StringBuilder("Foo");
        StringBuilderWriter writer = new StringBuilderWriter(builder);
        writer.append("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,writer,1629,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,builder);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,writer,1632,writer.getBuilder());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
@Test(timeout = 1000)
    public void testAppendConstructStringBuilder_remove838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructStringBuilder_remove838");
        StringBuilder builder = new StringBuilder("Foo");
        StringBuilderWriter writer = new StringBuilderWriter(builder);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1630,writer,1629,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,builder);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,writer,1632,writer.getBuilder());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
@Test(timeout = 1000)
    public void testAppendConstructNull_add1080() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructNull_add1080");
        Writer writer = new StringBuilderWriter(((StringBuilder)(null)));
        writer.append("Foo");
        writer.append("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,writer,1627,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
public void testAppendConstructNull() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructNull");
        Writer writer = new StringBuilderWriter(((StringBuilder)(null)));
        writer.append("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,writer,1627,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link StringBuilderWriter} constructor.
     */
@Test(timeout = 1000)
    public void testAppendConstructNull_remove837() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendConstructNull_remove837");
        Writer writer = new StringBuilderWriter(((StringBuilder)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,writer,1627,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(char)}.
     */
@Test(timeout = 1000)
    public void testAppendChar_add1076() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendChar_add1076");
        Writer writer = new StringBuilderWriter();
        writer.append('F').append('o').append('o');
        writer.append('F').append('o').append('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,writer,1616,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(char)}.
     */
@Test(timeout = 1000)
    public void testAppendChar_remove833() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendChar_remove833");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,writer,1616,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence)}.
     */
public void testAppendCharSequence() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequence");
        Writer writer = new StringBuilderWriter();
        writer.append("Foo").append("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,writer,1621,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence)}.
     */
@Test(timeout = 1000)
    public void testAppendCharSequence_add1077() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequence_add1077");
        Writer writer = new StringBuilderWriter();
        writer.append("Foo").append("Bar");
        writer.append("Foo").append("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,writer,1621,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence)}.
     */
public void testAppendChar() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendChar");
        Writer writer = new StringBuilderWriter();
        writer.append("foo").append("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,writer,1621,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence)}.
     */
public void testAppendCharSequence_literalMutation3588() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequence_literalMutation3588");
        Writer writer = new StringBuilderWriter();
        writer.append("Foo").append("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,writer,1621,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence)}.
     */
@Test(timeout = 1000)
    public void testAppendCharSequence_remove834() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequence_remove834");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,writer,1621,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
@Test(timeout = 1000)
    public void testAppendCharSequencePortion_add1078() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_add1078");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion");
        Writer writer = new StringBuilderWriter();
        writer.append("foo", 3, 6).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3590() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3590");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 4, 6).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3591() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3591");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 2, 6).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3592() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3592");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 1, 6).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3593() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3593");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 6, 6).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3594() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3594");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 5).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3595() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3595");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 3).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3596() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3596");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 12).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3597() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3597");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 7).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3598() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3598");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("bar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3599() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3599");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), 1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3600() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3600");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), -1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3601() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3601");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3602() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3602");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), 0, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3603() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3603");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), 0, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3604() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3604");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), 0, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
public void testAppendCharSequencePortion_literalMutation3605() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_literalMutation3605");
        Writer writer = new StringBuilderWriter();
        writer.append("FooBar", 3, 6).append(new java.lang.StringBuffer("FooBar"), 0, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#append(CharSequence, int, int)}.
     */
@Test(timeout = 1000)
    public void testAppendCharSequencePortion_remove835() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAppendCharSequencePortion_remove835");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,writer,1623,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#close()}.
     */
public void testClose() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose");
        Writer writer = new StringBuilderWriter();
        try {
            writer.append("Foo");
            writer.close();
            writer.append("Bar");
        } catch (Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,("Threw: " + t));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,writer,1635,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#close()}.
     */
@Test(timeout = 1000)
    public void testClose_add1082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add1082");
        Writer writer = new StringBuilderWriter();
        try {
            writer.append("Foo");
            writer.append("Foo");
            writer.close();
            writer.append("Bar");
        } catch (Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,("Threw: " + t));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,writer,1635,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#close()}.
     */
@Test(timeout = 1000)
    public void testClose_add1083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add1083");
        Writer writer = new StringBuilderWriter();
        try {
            writer.append("Foo");
            writer.close();
            writer.close();
            writer.append("Bar");
        } catch (Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,("Threw: " + t));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,writer,1635,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#close()}.
     */
@Test(timeout = 1000)
    public void testClose_add1084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add1084");
        Writer writer = new StringBuilderWriter();
        try {
            writer.append("Foo");
            writer.close();
            writer.append("Bar");
            writer.append("Bar");
        } catch (Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,("Threw: " + t));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,writer,1635,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#close()}.
     */
public void testClose_literalMutation3615() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_literalMutation3615");
        Writer writer = new StringBuilderWriter();
        try {
            writer.append("foo");
            writer.close();
            writer.append("Bar");
        } catch (Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,("Threw: " + t));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,writer,1635,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#close()}.
     */
public void testClose_literalMutation3616() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_literalMutation3616");
        Writer writer = new StringBuilderWriter();
        try {
            writer.append("Foo");
            writer.close();
            writer.append("bar");
        } catch (Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,("Threw: " + t));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,writer,1635,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(int)}.
     */
@Test(timeout = 1000)
    public void testWriteChar_add1085() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteChar_add1085");
        Writer writer = new StringBuilderWriter();
        writer.write('F');
        writer.write('F');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,writer,1645,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,writer,1647,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,writer,1649,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(int)}.
     */
@Test(timeout = 1000)
    public void testWriteChar_add1086() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteChar_add1086");
        Writer writer = new StringBuilderWriter();
        writer.write('F');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,writer,1645,writer.toString());
        writer.write('o');
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,writer,1647,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,writer,1649,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(int)}.
     */
@Test(timeout = 1000)
    public void testWriteChar_add1087() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteChar_add1087");
        Writer writer = new StringBuilderWriter();
        writer.write('F');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,writer,1645,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,writer,1647,writer.toString());
        writer.write('o');
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,writer,1649,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(int)}.
     */
@Test(timeout = 1000)
    public void testWriteChar_remove839() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteChar_remove839");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,writer,1645,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,writer,1647,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,writer,1649,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(int)}.
     */
@Test(timeout = 1000)
    public void testWriteChar_remove840() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteChar_remove840");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,writer,1645,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,writer,1647,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,writer,1649,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(int)}.
     */
@Test(timeout = 1000)
    public void testWriteChar_remove841() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteChar_remove841");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,writer,1645,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,writer,1647,writer.toString());
        writer.write('o');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,writer,1649,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[])}.
     */
public void testWriteCharArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArray");
        Writer writer = new StringBuilderWriter();
        writer.write(new char[]{ 'F' , 'o' , 'o' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,writer,1637,writer.toString());
        writer.write(new char[]{ 'B' , 'a' , 'r' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,writer,1639,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[])}.
     */
@Test(timeout = 1000)
    public void testWriteCharArray_add1088() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArray_add1088");
        Writer writer = new StringBuilderWriter();
        writer.write(new char[]{ 'F' , 'o' , 'o' });
        writer.write(new char[]{ 'F' , 'o' , 'o' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,writer,1637,writer.toString());
        writer.write(new char[]{ 'B' , 'a' , 'r' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,writer,1639,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[])}.
     */
@Test(timeout = 1000)
    public void testWriteCharArray_add1089() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArray_add1089");
        Writer writer = new StringBuilderWriter();
        writer.write(new char[]{ 'F' , 'o' , 'o' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,writer,1637,writer.toString());
        writer.write(new char[]{ 'B' , 'a' , 'r' });
        writer.write(new char[]{ 'B' , 'a' , 'r' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,writer,1639,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[])}.
     */
@Test(timeout = 1000)
    public void testWriteCharArray_remove842() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArray_remove842");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,writer,1637,writer.toString());
        writer.write(new char[]{ 'B' , 'a' , 'r' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,writer,1639,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[])}.
     */
@Test(timeout = 1000)
    public void testWriteCharArray_remove843() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArray_remove843");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,writer,1637,writer.toString());
        writer.write(new char[]{ 'B' , 'a' , 'r' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,writer,1639,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
@Test(timeout = 1000)
    public void testWriteCharArrayPortion_add1090() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_add1090");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
@Test(timeout = 1000)
    public void testWriteCharArrayPortion_add1091() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_add1091");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteChar() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteChar");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 4, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3627() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3627");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3628() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3628");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3629() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3629");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 6, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3630() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3630");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3631() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3631");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3632() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3632");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3633() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3633");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3634() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3634");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3635() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3635");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, -1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3636() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3636");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3637() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3637");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3638() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3638");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3639() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3639");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
public void testWriteCharArrayPortion_literalMutation3640() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_literalMutation3640");
        Writer writer = new StringBuilderWriter();
        writer.write(FOOBAR_CHARS, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
@Test(timeout = 1000)
    public void testWriteCharArrayPortion_remove844() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_remove844");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(char[], int, int)}.
     */
@Test(timeout = 1000)
    public void testWriteCharArrayPortion_remove845() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteCharArrayPortion_remove845");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,writer,1641,writer.toString());
        writer.write(FOOBAR_CHARS, 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,writer,1643,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String)}.
     */
public void testWriteString() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString");
        Writer writer = new StringBuilderWriter();
        writer.write("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,writer,1651,writer.toString());
        writer.write("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,writer,1653,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String)}.
     */
@Test(timeout = 1000)
    public void testWriteString_add1092() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString_add1092");
        Writer writer = new StringBuilderWriter();
        writer.write("Foo");
        writer.write("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,writer,1651,writer.toString());
        writer.write("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,writer,1653,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String)}.
     */
@Test(timeout = 1000)
    public void testWriteString_add1093() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString_add1093");
        Writer writer = new StringBuilderWriter();
        writer.write("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,writer,1651,writer.toString());
        writer.write("Bar");
        writer.write("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,writer,1653,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String)}.
     */
public void testWriteString_literalMutation3641() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString_literalMutation3641");
        Writer writer = new StringBuilderWriter();
        writer.write("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,writer,1651,writer.toString());
        writer.write("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,writer,1653,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String)}.
     */
public void testWriteString_literalMutation3642() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString_literalMutation3642");
        Writer writer = new StringBuilderWriter();
        writer.write("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,writer,1651,writer.toString());
        writer.write("bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,writer,1653,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String)}.
     */
@Test(timeout = 1000)
    public void testWriteString_remove846() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString_remove846");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,writer,1651,writer.toString());
        writer.write("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,writer,1653,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String)}.
     */
@Test(timeout = 1000)
    public void testWriteString_remove847() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteString_remove847");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,writer,1651,writer.toString());
        writer.write("Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,writer,1653,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
@Test(timeout = 1000)
    public void testWriteStringPortion_add1094() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_add1094");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
@Test(timeout = 1000)
    public void testWriteStringPortion_add1095() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_add1095");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion");
        Writer writer = new StringBuilderWriter();
        writer.write("bar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3644() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3644");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 4, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3645() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3645");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3646() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3646");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3647() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3647");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 6, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3648() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3648");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3649() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3649");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3650() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3650");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3651() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3651");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3652() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3652");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("bar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3653() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3653");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3654() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3654");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", -1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3655() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3655");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3656() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3656");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3657() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3657");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3658() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3658");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
public void testWriteStringPortion_literalMutation3659() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_literalMutation3659");
        Writer writer = new StringBuilderWriter();
        writer.write("FooBar", 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
@Test(timeout = 1000)
    public void testWriteStringPortion_remove848() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_remove848");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Writer#write(String, int, int)}.
     */
@Test(timeout = 1000)
    public void testWriteStringPortion_remove849() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteStringPortion_remove849");
        Writer writer = new StringBuilderWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1656,writer,1655,writer.toString());
        writer.write("FooBar", 0, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,writer,1657,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

