package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;
import org.junit.Test;

/** 
 * Test case for {@link CharSequenceReader}.
 * 
 * @version $Id$
 */
public class CharSequenceReaderTest {
    private static final char NONE = (new char[1])[0];

    /** 
     * Test {@link Reader#close()}.
     */
@Test
    public void testClose() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.close();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test(timeout = 1000)
    public void testClose_add173() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add173");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        checkRead(reader, "Foo");
        reader.close();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test(timeout = 1000)
    public void testClose_add174() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add174");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.close();
        reader.close();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test(timeout = 1000)
    public void testClose_add175() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_add175");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.close();
        checkRead(reader, "Foo");
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test
    public void testClose_literalMutation409() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_literalMutation409");
        Reader reader = new CharSequenceReader("foo");
        checkRead(reader, "Foo");
        reader.close();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test
    public void testClose_literalMutation410() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_literalMutation410");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "foo");
        reader.close();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test
    public void testClose_literalMutation411() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_literalMutation411");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.close();
        checkRead(reader, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test(timeout = 1000)
    public void testClose_remove60() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove60");
        Reader reader = new CharSequenceReader("FooBar");
        reader.close();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test(timeout = 1000)
    public void testClose_remove61() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove61");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#close()}.
     */
@Test(timeout = 1000)
    public void testClose_remove62() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_remove62");
        Reader reader = new CharSequenceReader("FooBar");
        reader.close();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#markSupported()}.
     */
@Test
    public void testMarkSupported() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),532,reader,531,reader.markSupported());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#markSupported()}.
     */
@Test
    public void testMarkSupported_literalMutation419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation419");
        Reader reader = new CharSequenceReader("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),532,reader,531,reader.markSupported());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add176() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add176");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add177() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add177");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add178() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add178");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add179() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add179");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add180() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add180");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add181() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add181");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add182() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add182");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add183() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add183");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_add184() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_add184");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test
    public void testMark() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark");
        Reader reader = new CharSequenceReader("foo");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test
    public void testMark_literalMutation413() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation413");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test
    public void testMark_literalMutation414() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation414");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(-1);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test
    public void testMark_literalMutation415() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation415");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "foo");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test
    public void testMark_literalMutation416() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation416");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "foo");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test
    public void testMark_literalMutation417() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation417");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test
    public void testMark_literalMutation418() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation418");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove63() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove63");
        Reader reader = new CharSequenceReader("FooBar");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove64() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove64");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove65() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove65");
        Reader reader = new CharSequenceReader("FooBar");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove66() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove66");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove67() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove67");
        Reader reader = new CharSequenceReader("FooBar");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove68() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove68");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove69() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove69");
        Reader reader = new CharSequenceReader("FooBar");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove70() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove70");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test(timeout = 1000)
    public void testMark_remove71() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_remove71");
        Reader reader = new CharSequenceReader("FooBar");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "Foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test
    public void testSkip() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        reader.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test(timeout = 1000)
    public void testSkip_add190() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add190");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "Bar");
        checkRead(reader, "Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        reader.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test(timeout = 1000)
    public void testSkip_add191() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add191");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        reader.reset();
        reader.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test(timeout = 1000)
    public void testSkip_add192() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_add192");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        reader.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        reader.close();
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test
    public void testSkip_literalMutation442() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation442");
        Reader reader = new CharSequenceReader("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        reader.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test
    public void testSkip_literalMutation443() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation443");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        reader.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test(timeout = 1000)
    public void testSkip_remove77() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_remove77");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        reader.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test(timeout = 1000)
    public void testSkip_remove78() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_remove78");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#skip(long)}.
     */
@Test(timeout = 1000)
    public void testSkip_remove79() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_remove79");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "Bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,reader,563,reader.skip(3));
        reader.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,reader,565,reader.skip(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,reader,567,reader.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,reader,570,reader.skip(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,reader,572,reader.skip(20));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),576,reader,575,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read()}.
     */
@Test
    public void testRead() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead");
        Reader reader = new CharSequenceReader("Foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),534,reader,533,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),536,reader,535,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),538,reader,537,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),539,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),541,reader,540,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),542,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),544,reader,543,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read()}.
     */
@Test
    public void testRead_literalMutation420() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation420");
        Reader reader = new CharSequenceReader("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),534,reader,533,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),536,reader,535,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),538,reader,537,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),539,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),541,reader,540,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),542,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),544,reader,543,reader.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test(timeout = 1000)
    public void testReadCharArray_add185() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_add185");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test(timeout = 1000)
    public void testReadCharArray_add186() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_add186");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test(timeout = 1000)
    public void testReadCharArray_add187() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_add187");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test
    public void testReadCharArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray");
        Reader reader = new CharSequenceReader("foo");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test
    public void testReadCharArray_literalMutation422() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation422");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test
    public void testReadCharArray_literalMutation425() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation425");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[4];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test
    public void testReadCharArray_literalMutation429() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation429");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[4];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test(timeout = 1000)
    public void testReadCharArray_remove72() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_remove72");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test(timeout = 1000)
    public void testReadCharArray_remove73() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_remove73");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[])}.
     */
@Test(timeout = 1000)
    public void testReadCharArray_remove74() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_remove74");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,reader,555,reader.read(chars));
        checkArray(new char[]{ 'r' , NONE , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,reader,558,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadCharArrayPortion_add188() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_add188");
        char[] chars = new char[10];
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),546,reader,545,reader.read(chars, 3, 3));
        checkArray(new char[]{ NONE , NONE , NONE , 'F' , 'o' , 'o' }, chars);
        checkArray(new char[]{ NONE , NONE , NONE , 'F' , 'o' , 'o' }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),548,reader,547,reader.read(chars, 0, 3));
        checkArray(new char[]{ 'B' , 'a' , 'r' , 'F' , 'o' , 'o' , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),550,reader,549,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadCharArrayPortion_add189() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_add189");
        char[] chars = new char[10];
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),546,reader,545,reader.read(chars, 3, 3));
        checkArray(new char[]{ NONE , NONE , NONE , 'F' , 'o' , 'o' }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),548,reader,547,reader.read(chars, 0, 3));
        checkArray(new char[]{ 'B' , 'a' , 'r' , 'F' , 'o' , 'o' , NONE }, chars);
        checkArray(new char[]{ 'B' , 'a' , 'r' , 'F' , 'o' , 'o' , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),550,reader,549,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[], int, int)}.
     */
@Test
    public void testReadCharArrayPortion() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion");
        char[] chars = new char[11];
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),546,reader,545,reader.read(chars, 3, 3));
        checkArray(new char[]{ NONE , NONE , NONE , 'F' , 'o' , 'o' }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),548,reader,547,reader.read(chars, 0, 3));
        checkArray(new char[]{ 'B' , 'a' , 'r' , 'F' , 'o' , 'o' , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),550,reader,549,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[], int, int)}.
     */
@Test
    public void testReadCharArrayPortion_literalMutation432() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_literalMutation432");
        char[] chars = new char[10];
        Reader reader = new CharSequenceReader("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),546,reader,545,reader.read(chars, 3, 3));
        checkArray(new char[]{ NONE , NONE , NONE , 'F' , 'o' , 'o' }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),548,reader,547,reader.read(chars, 0, 3));
        checkArray(new char[]{ 'B' , 'a' , 'r' , 'F' , 'o' , 'o' , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),550,reader,549,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadCharArrayPortion_remove75() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_remove75");
        char[] chars = new char[10];
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),546,reader,545,reader.read(chars, 3, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),548,reader,547,reader.read(chars, 0, 3));
        checkArray(new char[]{ 'B' , 'a' , 'r' , 'F' , 'o' , 'o' , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),550,reader,549,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#read(char[], int, int)}.
     */
@Test(timeout = 1000)
    public void testReadCharArrayPortion_remove76() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_remove76");
        char[] chars = new char[10];
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),546,reader,545,reader.read(chars, 3, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),548,reader,547,reader.read(chars, 0, 3));
        checkArray(new char[]{ 'B' , 'a' , 'r' , 'F' , 'o' , 'o' , NONE }, chars);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),550,reader,549,reader.read(chars));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void checkRead(Reader reader, String expected) throws IOException {
        for (int i = 0 ; i < (expected.length()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),526,(((("Read[" + i) + "] of \'") + expected) + "\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),528,expected,527,expected.charAt(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),530,reader,529,((char)(reader.read())));
        }
    }

    private void checkArray(char[] expected, char[] actual) {
        for (int i = 0 ; i < (expected.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,(("Compare[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),524,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,actual[i]);
        }
    }
}

