package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests Caverphone2.
 * 
 * @version $Id$
 * @since 1.5
 */
public class Caverphone2Test extends StringEncoderAbstractTest<org.apache.commons.codec.language.Caverphone2> {
    @Override
    protected Caverphone2 createStringEncoder() {
        return new Caverphone2();
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedCommonCodeAT11111111_add128() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_add128");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111");
        checkEncodingVariations("foo", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation296() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation296");
        checkEncodingVariations("AT11111111", new String[]{ "foo" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation297() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation297");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "foo" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation298() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation298");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "foo" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation299() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation299");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "foo" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation300() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation300");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "foo" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation301() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation301");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "foo" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation302() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation302");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "foo" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation303() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation303");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "foo" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation304() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation304");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "foo" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation305() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation305");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "foo" , "hard" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation306() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation306");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "foo" , "heart" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation307() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation307");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "foo" , "it" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation308() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation308");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "foo" , "out" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation309() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation309");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "foo" , "old" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation310() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation310");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedCommonCodeAT11111111_remove111() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_remove111");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedExamples_add129() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples_add129");
        final String[][] data = new String[][]{ new String[]{ "Stevenson" , "STFNSN1111" } , new String[]{ "Peter" , "PTA1111111" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedExamples() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples");
        final String[][] data = new String[][]{ new String[]{ "foo" , "STFNSN1111" } , new String[]{ "Peter" , "PTA1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedExamples_literalMutation312() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples_literalMutation312");
        final String[][] data = new String[][]{ new String[]{ "Stevenson" , "foo" } , new String[]{ "Peter" , "PTA1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedExamples_literalMutation313() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples_literalMutation313");
        final String[][] data = new String[][]{ new String[]{ "Stevenson" , "STFNSN1111" } , new String[]{ "foo" , "PTA1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedExamples_literalMutation314() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples_literalMutation314");
        final String[][] data = new String[][]{ new String[]{ "Stevenson" , "STFNSN1111" } , new String[]{ "Peter" , "foo" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedExamples_remove112() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples_remove112");
        final String[][] data = new String[][]{ new String[]{ "Stevenson" , "STFNSN1111" } , new String[]{ "Peter" , "PTA1111111" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomNameKLN1111111_add130() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_add130");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111");
        checkEncodingVariations("foo", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation316() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation316");
        checkEncodingVariations("KLN1111111", new String[]{ "foo" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation317() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation317");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "foo" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation318() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation318");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "foo" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation319() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation319");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "foo" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation320() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation320");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "foo" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation321() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation321");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "foo" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation322() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation322");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "foo" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation323() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation323");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "foo" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation324() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation324");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "foo" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation325() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation325");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "foo" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation326() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation326");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "foo" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation327() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation327");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "foo" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation328() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation328");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "foo" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation329() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation329");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "foo" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation330() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation330");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "foo" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation331() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation331");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "foo" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation332() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation332");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "foo" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation333() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation333");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "foo" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation334() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation334");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "foo" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation335() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation335");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "foo" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation336() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation336");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "foo" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation337() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation337");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "foo" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation338() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation338");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "foo" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation339() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation339");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "foo" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation340() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation340");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "foo" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation341() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation341");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "foo" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation342() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation342");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "foo" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation343() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation343");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "foo" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation344() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation344");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "foo" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation345() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation345");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "foo" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation346() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation346");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "foo" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation347() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation347");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "foo" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation348() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation348");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "foo" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation349() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation349");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "foo" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation350() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation350");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "foo" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation351() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation351");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "foo" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation352() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation352");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "foo" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation353() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation353");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "foo" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation354() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation354");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "foo" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation355() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation355");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "foo" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation356() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation356");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "foo" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation357() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation357");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "foo" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation358() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation358");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "foo" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation359() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation359");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "foo" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation360() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation360");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "foo" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation361() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation361");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "foo" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation362() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation362");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "foo" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation363() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation363");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "foo" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation364() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation364");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "foo" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation365() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation365");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "foo" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation366() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation366");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "foo" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation367() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation367");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "foo" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation368() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation368");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "foo" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation369() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation369");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "foo" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation370() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation370");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "foo" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation371() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation371");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "foo" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation372() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation372");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "foo" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation373() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation373");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "foo" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation374() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation374");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "foo" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation375() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation375");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "foo" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation376() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation376");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "foo" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation377() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation377");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "foo" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation378() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation378");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "foo" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation379() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation379");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "foo" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation380() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation380");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "foo" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation381() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation381");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "foo" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation382() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation382");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "foo" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation383() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation383");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "foo" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation384() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation384");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "foo" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation385() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation385");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "foo" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation386() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation386");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "foo" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation387() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation387");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "foo" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation388() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation388");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "foo" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation389() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation389");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "foo" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation390() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation390");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "foo" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation391() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation391");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "foo" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation392() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation392");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "foo" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation393() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation393");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "foo" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation394() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation394");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "foo" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation395() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation395");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "foo" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation396() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation396");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "foo" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation397() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation397");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomNameKLN1111111_remove113() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_remove113");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomNameTN11111111_add131() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_add131");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111");
        checkEncodingVariations("foo", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation399() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation399");
        checkEncodingVariations("TN11111111", new String[]{ "foo" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation400() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation400");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "foo" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation401() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation401");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "foo" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation402() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation402");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "foo" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation403() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation403");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "foo" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation404() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation404");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "foo" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation405() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation405");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "foo" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation406() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation406");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "foo" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation407() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation407");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "foo" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation408() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation408");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "foo" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation409() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation409");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "foo" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation410() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation410");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "foo" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation411() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation411");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "foo" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation412() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation412");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "foo" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation413() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation413");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "foo" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation414() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation414");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "foo" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation415() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation415");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "foo" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation416() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation416");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "foo" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation417() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation417");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "foo" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation418() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation418");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "foo" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation419() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation419");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "foo" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation420() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation420");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "foo" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation421() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation421");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "foo" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation422() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation422");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "foo" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation423() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation423");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "foo" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation424() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation424");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "foo" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation425() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation425");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "foo" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation426() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation426");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "foo" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation427() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation427");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "foo" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation428() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation428");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "foo" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation429() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation429");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "foo" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation430() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation430");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "foo" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation431() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation431");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "foo" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation432() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation432");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "foo" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation433() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation433");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "foo" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation434() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation434");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "foo" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation435() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation435");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "foo" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation436() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation436");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "foo" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation437() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation437");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "foo" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation438() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation438");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "foo" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation439() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation439");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "foo" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation440() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation440");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "foo" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation441() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation441");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "foo" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation442() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation442");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "foo" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation443() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation443");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "foo" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation444() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation444");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "foo" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation445() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation445");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "foo" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation446() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation446");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "foo" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation447() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation447");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "foo" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation448() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation448");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "foo" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation449() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation449");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "foo" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation450() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation450");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "foo" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation451() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation451");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "foo" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation452() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation452");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "foo" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation453() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation453");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "foo" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation454() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation454");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "foo" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation455() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation455");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "foo" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation456() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation456");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "foo" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation457() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation457");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "foo" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation458() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation458");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "foo" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation459() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation459");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "foo" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation460() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation460");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "foo" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation461() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation461");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "foo" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation462() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation462");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "foo" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation463() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation463");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "foo" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation464() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation464");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "foo" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation465() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation465");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "foo" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation466() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation466");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "foo" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation467() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation467");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomNameTN11111111_remove114() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_remove114");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomNameTTA1111111_add132() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_add132");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111");
        checkEncodingVariations("foo", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation469() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation469");
        checkEncodingVariations("TTA1111111", new String[]{ "foo" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation470() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation470");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "foo" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation471() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation471");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "foo" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation472() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation472");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "foo" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation473() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation473");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "foo" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation474() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation474");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "foo" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation475() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation475");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "foo" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation476() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation476");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "foo" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation477() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation477");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "foo" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation478() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation478");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "foo" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation479() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation479");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "foo" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation480() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation480");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "foo" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation481() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation481");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "foo" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation482() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation482");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "foo" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation483() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation483");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "foo" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation484() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation484");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "foo" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation485() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation485");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "foo" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation486() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation486");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "foo" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation487() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation487");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "foo" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation488() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation488");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "foo" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation489() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation489");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "foo" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation490() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation490");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "foo" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation491() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation491");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "foo" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation492() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation492");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "foo" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation493() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation493");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "foo" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation494() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation494");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "foo" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation495() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation495");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "foo" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation496() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation496");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "foo" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation497() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation497");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "foo" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation498() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation498");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "foo" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation499() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation499");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "foo" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation500() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation500");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "foo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation501() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation501");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "foo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation502() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation502");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "foo" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation503() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation503");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "foo" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation504() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation504");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "foo" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation505() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation505");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "foo" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation506() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation506");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "foo" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation507() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation507");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "foo" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation508() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation508");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "foo" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation509() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation509");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "foo" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation510() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation510");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "foo" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation511() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation511");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "foo" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation512() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation512");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "foo" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation513() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation513");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "foo" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation514() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation514");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "foo" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation515() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation515");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "foo" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation516() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation516");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "foo" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation517() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation517");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "foo" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation518() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation518");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "foo" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation519() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation519");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "foo" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation520() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation520");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "foo" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation521() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation521");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "foo" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation522() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation522");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "foo" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation523() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation523");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "foo" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation524() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation524");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "foo" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation525() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation525");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "foo" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation526() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation526");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "foo" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation527() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation527");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "foo" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation528() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation528");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "foo" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation529() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation529");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "foo" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation530() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation530");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "foo" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation531() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation531");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "foo" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation532() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation532");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "foo" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation533() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation533");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "foo" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation534() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation534");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "foo" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation535() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation535");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "foo" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation536() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation536");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomNameTTA1111111_remove115() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_remove115");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomWords_add133() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_add133");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomWords_add134() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_add134");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomWords_add135() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_add135");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords");
        checkEncodingVariations("foo", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation538() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation538");
        checkEncodingVariations("RTA1111111", new String[]{ "foo" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation539() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation539");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "foo" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation540() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation540");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "foo" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation541() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation541");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("foo", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation542() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation542");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "foo");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation543() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation543");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("foo", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation544() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation544");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "foo" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation545() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation545");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomWords_remove116() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_remove116");
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomWords_remove117() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_remove117");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testCaverphoneRevisitedRandomWords_remove118() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_remove118");
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M111111111" } , new String[]{ "mbmb" , "MPM1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEndMb_add136() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_add136");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M111111111" } , new String[]{ "mbmb" , "MPM1111111" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation546() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation546");
        final String[][] data = new String[][]{ new String[]{ "foo" , "M111111111" } , new String[]{ "mbmb" , "MPM1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation547() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation547");
        final String[][] data = new String[][]{ new String[]{ "mb" , "foo" } , new String[]{ "mbmb" , "MPM1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation548() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation548");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M111111111" } , new String[]{ "foo" , "MPM1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation549() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation549");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M111111111" } , new String[]{ "mbmb" , "foo" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEndMb_remove119() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_remove119");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M111111111" } , new String[]{ "mbmb" , "MPM1111111" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsCaverphoneEquals() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsCaverphoneEquals");
        final Caverphone2 caverphone = new Caverphone2();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),451,caverphone,450,caverphone.isEncodeEqual("Peter", "Stevenson"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,caverphone,452,caverphone.isEncodeEqual("Peter", "Peady"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecificationExamples_add137() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_add137");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples");
        final String[][] data = new String[][]{ new String[]{ "foo" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation551() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation551");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "foo" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation552() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation552");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "foo" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation553() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation553");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "foo" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation554() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation554");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "foo" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation555() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation555");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "foo" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation556() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation556");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "foo" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation557() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation557");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "foo" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation558() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation558");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "foo" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation559() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation559");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "foo" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation560() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation560");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "foo" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation561() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation561");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "foo" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation562() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation562");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "foo" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation563() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation563");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "foo" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecificationExamples_remove120() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_remove120");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

