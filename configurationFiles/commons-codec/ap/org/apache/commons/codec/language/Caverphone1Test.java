package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests Caverphone1.
 * 
 * @version $Id: CaverphoneTest.java 1075947 2011-03-01 17:56:14Z ggregory $
 * @since 1.5
 */
public class Caverphone1Test extends StringEncoderAbstractTest<org.apache.commons.codec.language.Caverphone1> {
    @Override
    protected Caverphone1 createStringEncoder() {
        return new Caverphone1();
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedCommonCodeAT1111_add124() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_add124");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111");
        checkEncodingVariations("bar", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation337() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation337");
        checkEncodingVariations("AT1111", new String[]{ "bar" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation338() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation338");
        checkEncodingVariations("AT1111", new String[]{ "add" , "bar" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation339() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation339");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "foo" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation340() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation340");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "foo" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation341() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation341");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "bar" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation342() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation342");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "bar" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation343() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation343");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "bar" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation344() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation344");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "bar" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation345() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation345");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "bar" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation346() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation346");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "foo" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation347() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation347");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "foo" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation348() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation348");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "bar" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation349() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation349");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "foo" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation350() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation350");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "bar" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation351() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation351");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedCommonCodeAT1111_remove107() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_remove107");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEndMb_add125() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_add125");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M11111" } , new String[]{ "mbmb" , "MPM111" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb");
        final String[][] data = new String[][]{ new String[]{ "foo" , "M11111" } , new String[]{ "mbmb" , "MPM111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation353() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation353");
        final String[][] data = new String[][]{ new String[]{ "mb" , "bar" } , new String[]{ "mbmb" , "MPM111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation354() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation354");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M11111" } , new String[]{ "bar" , "MPM111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation355() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation355");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M11111" } , new String[]{ "mbmb" , "foo" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEndMb_remove108() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_remove108");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M11111" } , new String[]{ "mbmb" , "MPM111" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests some examples from version 2.0 http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testIsCaverphoneEquals() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsCaverphoneEquals");
        final Caverphone1 caverphone = new Caverphone1();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),447,caverphone,446,caverphone.isEncodeEqual("Peter", "Stevenson"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,caverphone,448,caverphone.isEncodeEqual("Peter", "Peady"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testSpecificationV1Examples_add126() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples_add126");
        final String[][] data = new String[][]{ new String[]{ "David" , "TFT111" } , new String[]{ "Whittle" , "WTL111" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testSpecificationV1Examples() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples");
        final String[][] data = new String[][]{ new String[]{ "bar" , "TFT111" } , new String[]{ "Whittle" , "WTL111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testSpecificationV1Examples_literalMutation357() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples_literalMutation357");
        final String[][] data = new String[][]{ new String[]{ "David" , "foo" } , new String[]{ "Whittle" , "WTL111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testSpecificationV1Examples_literalMutation358() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples_literalMutation358");
        final String[][] data = new String[][]{ new String[]{ "David" , "TFT111" } , new String[]{ "bar" , "WTL111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testSpecificationV1Examples_literalMutation359() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples_literalMutation359");
        final String[][] data = new String[][]{ new String[]{ "David" , "TFT111" } , new String[]{ "Whittle" , "foo" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testSpecificationV1Examples_remove109() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples_remove109");
        final String[][] data = new String[][]{ new String[]{ "David" , "TFT111" } , new String[]{ "Whittle" , "WTL111" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests examples from http://en.wikipedia.org/wiki/Caverphone
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testWikipediaExamples_add127() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples_add127");
        final String[][] data = new String[][]{ new String[]{ "Lee" , "L11111" } , new String[]{ "Thompson" , "TMPSN1" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests examples from http://en.wikipedia.org/wiki/Caverphone
     * 
     * @throws EncoderException
     */
@Test
    public void testWikipediaExamples() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples");
        final String[][] data = new String[][]{ new String[]{ "bar" , "L11111" } , new String[]{ "Thompson" , "TMPSN1" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests examples from http://en.wikipedia.org/wiki/Caverphone
     * 
     * @throws EncoderException
     */
@Test
    public void testWikipediaExamples_literalMutation361() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples_literalMutation361");
        final String[][] data = new String[][]{ new String[]{ "Lee" , "foo" } , new String[]{ "Thompson" , "TMPSN1" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests examples from http://en.wikipedia.org/wiki/Caverphone
     * 
     * @throws EncoderException
     */
@Test
    public void testWikipediaExamples_literalMutation362() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples_literalMutation362");
        final String[][] data = new String[][]{ new String[]{ "Lee" , "L11111" } , new String[]{ "foo" , "TMPSN1" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests examples from http://en.wikipedia.org/wiki/Caverphone
     * 
     * @throws EncoderException
     */
@Test
    public void testWikipediaExamples_literalMutation363() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples_literalMutation363");
        final String[][] data = new String[][]{ new String[]{ "Lee" , "L11111" } , new String[]{ "Thompson" , "bar" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests examples from http://en.wikipedia.org/wiki/Caverphone
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testWikipediaExamples_remove110() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples_remove110");
        final String[][] data = new String[][]{ new String[]{ "Lee" , "L11111" } , new String[]{ "Thompson" , "TMPSN1" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

