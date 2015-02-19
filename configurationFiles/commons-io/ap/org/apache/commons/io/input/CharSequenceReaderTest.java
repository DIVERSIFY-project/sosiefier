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
    public void testClose_literalMutation828() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_literalMutation828");
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
    public void testClose_literalMutation829() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_literalMutation829");
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
    public void testClose_literalMutation830() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClose_literalMutation830");
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
    public void testMarkSupported_literalMutation840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation840");
        Reader reader = new CharSequenceReader("bar");
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
        Reader reader = new CharSequenceReader("bar");
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
    public void testMark_literalMutation832() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation832");
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
    public void testMark_literalMutation833() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation833");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(1);
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
    public void testMark_literalMutation834() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation834");
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
    public void testMark_literalMutation835() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation835");
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
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Reader#mark(int)}.
     */
@Test
    public void testMark_literalMutation836() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation836");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "bar");
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
    public void testMark_literalMutation837() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation837");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "bar");
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
    public void testMark_literalMutation838() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation838");
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
    public void testMark_literalMutation839() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMark_literalMutation839");
        Reader reader = new CharSequenceReader("FooBar");
        checkRead(reader, "Foo");
        reader.mark(0);
        checkRead(reader, "Bar");
        reader.reset();
        checkRead(reader, "Bar");
        reader.close();
        checkRead(reader, "Foo");
        reader.reset();
        checkRead(reader, "bar");
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
    public void testSkip_literalMutation874() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation874");
        Reader reader = new CharSequenceReader("bar");
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
    public void testSkip_literalMutation875() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkip_literalMutation875");
        Reader reader = new CharSequenceReader("FooBar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,reader,560,reader.skip(3));
        checkRead(reader, "bar");
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
    public void testRead_literalMutation841() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead_literalMutation841");
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
        Reader reader = new CharSequenceReader("bar");
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
    public void testReadCharArray_literalMutation843() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation843");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[1];
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
    public void testReadCharArray_literalMutation844() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation844");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[4];
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
    public void testReadCharArray_literalMutation845() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation845");
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
    public void testReadCharArray_literalMutation848() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation848");
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
    public void testReadCharArray_literalMutation849() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation849");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[2];
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
    public void testReadCharArray_literalMutation850() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation850");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[1];
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
    public void testReadCharArray_literalMutation851() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation851");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[6];
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
    public void testReadCharArray_literalMutation855() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation855");
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
@Test
    public void testReadCharArray_literalMutation856() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation856");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[2];
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
    public void testReadCharArray_literalMutation857() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation857");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[1];
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
    public void testReadCharArray_literalMutation858() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArray_literalMutation858");
        Reader reader = new CharSequenceReader("FooBar");
        char[] chars = new char[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,reader,551,reader.read(chars));
        checkArray(new char[]{ 'F' , 'o' }, chars);
        chars = new char[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),554,reader,553,reader.read(chars));
        checkArray(new char[]{ 'o' , 'B' , 'a' }, chars);
        chars = new char[6];
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
        char[] chars = new char[9];
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
    public void testReadCharArrayPortion_literalMutation861() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_literalMutation861");
        char[] chars = new char[5];
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
    public void testReadCharArrayPortion_literalMutation862() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_literalMutation862");
        char[] chars = new char[20];
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
    public void testReadCharArrayPortion_literalMutation863() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_literalMutation863");
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
    public void testReadCharArrayPortion_literalMutation864() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadCharArrayPortion_literalMutation864");
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

