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
        checkEncodingVariations("foo", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation268() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation268");
        checkEncodingVariations("AT1111", new String[]{ "foo" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation269() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation269");
        checkEncodingVariations("AT1111", new String[]{ "add" , "foo" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation270() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation270");
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation271() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation271");
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation272() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation272");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "foo" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation273() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation273");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "foo" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation274() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation274");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "foo" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation275() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation275");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "foo" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation276() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation276");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "foo" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation277() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation277");
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation278() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation278");
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation279() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation279");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "foo" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation280() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation280");
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation281() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation281");
        checkEncodingVariations("AT1111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "foo" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT1111_literalMutation282() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT1111_literalMutation282");
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
    public void testEndMb_literalMutation284() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation284");
        final String[][] data = new String[][]{ new String[]{ "mb" , "foo" } , new String[]{ "mbmb" , "MPM111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation285() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation285");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M11111" } , new String[]{ "foo" , "MPM111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation286() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation286");
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
        final String[][] data = new String[][]{ new String[]{ "foo" , "TFT111" } , new String[]{ "Whittle" , "WTL111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testSpecificationV1Examples_literalMutation288() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples_literalMutation288");
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
    public void testSpecificationV1Examples_literalMutation289() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples_literalMutation289");
        final String[][] data = new String[][]{ new String[]{ "David" , "TFT111" } , new String[]{ "foo" , "WTL111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testSpecificationV1Examples_literalMutation290() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationV1Examples_literalMutation290");
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
        final String[][] data = new String[][]{ new String[]{ "foo" , "L11111" } , new String[]{ "Thompson" , "TMPSN1" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests examples from http://en.wikipedia.org/wiki/Caverphone
     * 
     * @throws EncoderException
     */
@Test
    public void testWikipediaExamples_literalMutation292() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples_literalMutation292");
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
    public void testWikipediaExamples_literalMutation293() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples_literalMutation293");
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
    public void testWikipediaExamples_literalMutation294() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWikipediaExamples_literalMutation294");
        final String[][] data = new String[][]{ new String[]{ "Lee" , "L11111" } , new String[]{ "Thompson" , "foo" } };
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

