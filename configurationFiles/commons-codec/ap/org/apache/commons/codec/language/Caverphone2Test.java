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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation365() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation365");
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation366() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation366");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "bar" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation367() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation367");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "bar" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation368() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation368");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "bar" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation369() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation369");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "bar" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation370() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation370");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "bar" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation371() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation371");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "bar" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation372() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation372");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "bar" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation373() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation373");
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation374() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation374");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "bar" , "hard" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation375() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation375");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "bar" , "heart" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation376() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation376");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "bar" , "it" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation377() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation377");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "bar" , "out" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation378() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation378");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "bar" , "old" });
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
    public void testCaverphoneRevisitedCommonCodeAT11111111_literalMutation379() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedCommonCodeAT11111111_literalMutation379");
        checkEncodingVariations("AT11111111", new String[]{ "add" , "aid" , "at" , "art" , "eat" , "earth" , "head" , "hit" , "hot" , "hold" , "hard" , "heart" , "it" , "out" , "bar" });
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
        final String[][] data = new String[][]{ new String[]{ "bar" , "STFNSN1111" } , new String[]{ "Peter" , "PTA1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedExamples_literalMutation381() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples_literalMutation381");
        final String[][] data = new String[][]{ new String[]{ "Stevenson" , "bar" } , new String[]{ "Peter" , "PTA1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedExamples_literalMutation382() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples_literalMutation382");
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
    public void testCaverphoneRevisitedExamples_literalMutation383() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedExamples_literalMutation383");
        final String[][] data = new String[][]{ new String[]{ "Stevenson" , "STFNSN1111" } , new String[]{ "Peter" , "bar" } };
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
        checkEncodingVariations("bar", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "bar" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "bar" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "bar" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "foo" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "bar" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "bar" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "foo" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "foo" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "bar" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "bar" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "bar" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "bar" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
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
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "bar" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation398() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation398");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "foo" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation399() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation399");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "bar" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation400() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation400");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "bar" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation401() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation401");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "foo" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation402() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation402");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "bar" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation403() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation403");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "bar" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation404() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation404");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "bar" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation405() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation405");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "bar" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation406() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation406");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "bar" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation407() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation407");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "foo" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation408() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation408");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "bar" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation409() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation409");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "foo" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation410() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation410");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "foo" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation411() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation411");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "foo" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation412() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation412");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "foo" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation413() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation413");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "bar" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation414() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation414");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "bar" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation415() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation415");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "foo" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation416() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation416");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "foo" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation417() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation417");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "bar" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation418() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation418");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "foo" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation419() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation419");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "foo" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation420() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation420");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "bar" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation421() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation421");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "bar" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation422() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation422");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "bar" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation423() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation423");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "foo" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation424() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation424");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "bar" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation425() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation425");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "bar" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation426() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation426");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "bar" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation427() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation427");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "bar" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation428() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation428");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "foo" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation429() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation429");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "foo" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation430() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation430");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "bar" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation431() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation431");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "foo" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation432() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation432");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "bar" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation433() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation433");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "bar" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation434() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation434");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "foo" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation435() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation435");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "foo" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation436() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation436");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "bar" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation437() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation437");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "foo" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation438() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation438");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "foo" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation439() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation439");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "bar" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation440() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation440");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "bar" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation441() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation441");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "foo" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation442() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation442");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "foo" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation443() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation443");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "bar" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation444() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation444");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "bar" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation445() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation445");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "bar" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation446() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation446");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "bar" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation447() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation447");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "foo" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation448() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation448");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "bar" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation449() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation449");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "foo" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation450() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation450");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "bar" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation451() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation451");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "foo" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation452() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation452");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "bar" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation453() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation453");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "foo" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation454() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation454");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "foo" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation455() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation455");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "foo" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation456() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation456");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "foo" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation457() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation457");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "foo" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation458() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation458");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "bar" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation459() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation459");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "bar" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation460() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation460");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "foo" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation461() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation461");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "foo" , "Kylynn" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation462() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation462");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "bar" , "Quillan" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation463() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation463");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "foo" , "Quillon" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation464() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation464");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "bar" , "Qulllon" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation465() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation465");
        checkEncodingVariations("KLN1111111", new String[]{ "Cailean" , "Calan" , "Calen" , "Callahan" , "Callan" , "Callean" , "Carleen" , "Carlen" , "Carlene" , "Carlin" , "Carline" , "Carlyn" , "Carlynn" , "Carlynne" , "Charlean" , "Charleen" , "Charlene" , "Charline" , "Cherlyn" , "Chirlin" , "Clein" , "Cleon" , "Cline" , "Cohleen" , "Colan" , "Coleen" , "Colene" , "Colin" , "Colleen" , "Collen" , "Collin" , "Colline" , "Colon" , "Cullan" , "Cullen" , "Cullin" , "Gaelan" , "Galan" , "Galen" , "Garlan" , "Garlen" , "Gaulin" , "Gayleen" , "Gaylene" , "Giliane" , "Gillan" , "Gillian" , "Glen" , "Glenn" , "Glyn" , "Glynn" , "Gollin" , "Gorlin" , "Kalin" , "Karlan" , "Karleen" , "Karlen" , "Karlene" , "Karlin" , "Karlyn" , "Kaylyn" , "Keelin" , "Kellen" , "Kellene" , "Kellyann" , "Kellyn" , "Khalin" , "Kilan" , "Kilian" , "Killen" , "Killian" , "Killion" , "Klein" , "Kleon" , "Kline" , "Koerlin" , "Kylen" , "Kylynn" , "Quillan" , "Quillon" , "foo" , "Xylon" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameKLN1111111_literalMutation466() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameKLN1111111_literalMutation466");
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
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation468() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation468");
        checkEncodingVariations("TN11111111", new String[]{ "foo" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation469() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation469");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "bar" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation470() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation470");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "foo" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation471() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation471");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "foo" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation472() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation472");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "bar" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation473() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation473");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "foo" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation474() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation474");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "bar" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation475() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation475");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "foo" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation476() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation476");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "bar" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation477() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation477");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "bar" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation478() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation478");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "bar" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation479() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation479");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "foo" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation480() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation480");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "foo" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation481() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation481");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "foo" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation482() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation482");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "foo" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation483() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation483");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "bar" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation484() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation484");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "bar" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation485() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation485");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "bar" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation486() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation486");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "foo" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation487() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation487");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "foo" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation488() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation488");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "foo" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation489() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation489");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "foo" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation490() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation490");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "foo" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation491() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation491");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "foo" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation492() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation492");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "bar" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation493() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation493");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "bar" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation494() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation494");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "bar" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation495() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation495");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "bar" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation496() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation496");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "bar" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation497() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation497");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "bar" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation498() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation498");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "foo" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation499() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation499");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "bar" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation500() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation500");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "foo" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation501() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation501");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "bar" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation502() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation502");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "foo" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation503() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation503");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "bar" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation504() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation504");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "foo" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation505() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation505");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "foo" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation506() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation506");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "bar" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation507() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation507");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "foo" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation508() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation508");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "bar" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation509() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation509");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "bar" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation510() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation510");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "bar" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation511() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation511");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "foo" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation512() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation512");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "foo" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation513() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation513");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "foo" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation514() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation514");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "bar" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation515() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation515");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "bar" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation516() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation516");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "bar" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation517() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation517");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "bar" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation518() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation518");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "bar" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation519() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation519");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "bar" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation520() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation520");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "foo" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation521() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation521");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "foo" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation522() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation522");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "bar" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation523() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation523");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "bar" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation524() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation524");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "foo" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation525() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation525");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "foo" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation526() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation526");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "foo" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation527() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation527");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "bar" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation528() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation528");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "foo" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation529() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation529");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "bar" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation530() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation530");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "bar" , "Tine" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation531() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation531");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "bar" , "Tjon" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation532() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation532");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "foo" , "Town" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation533() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation533");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "foo" , "Towne" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation534() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation534");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "foo" , "Turne" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation535() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation535");
        checkEncodingVariations("TN11111111", new String[]{ "Dan" , "Dane" , "Dann" , "Darn" , "Daune" , "Dawn" , "Ddene" , "Dean" , "Deane" , "Deanne" , "DeeAnn" , "Deeann" , "Deeanne" , "Deeyn" , "Den" , "Dene" , "Denn" , "Deonne" , "Diahann" , "Dian" , "Diane" , "Diann" , "Dianne" , "Diannne" , "Dine" , "Dion" , "Dione" , "Dionne" , "Doane" , "Doehne" , "Don" , "Donn" , "Doone" , "Dorn" , "Down" , "Downe" , "Duane" , "Dun" , "Dunn" , "Duyne" , "Dyan" , "Dyane" , "Dyann" , "Dyanne" , "Dyun" , "Tan" , "Tann" , "Teahan" , "Ten" , "Tenn" , "Terhune" , "Thain" , "Thaine" , "Thane" , "Thanh" , "Thayne" , "Theone" , "Thin" , "Thorn" , "Thorne" , "Thun" , "Thynne" , "Tien" , "Tine" , "Tjon" , "Town" , "Towne" , "bar" , "Tyne" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTN11111111_literalMutation536() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTN11111111_literalMutation536");
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
        checkEncodingVariations("bar", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation538() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation538");
        checkEncodingVariations("TTA1111111", new String[]{ "bar" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation539() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation539");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "bar" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation540() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation540");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "bar" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation541() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation541");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "foo" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation542() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation542");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "foo" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation543() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation543");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "foo" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation544() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation544");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "foo" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation545() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation545");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "bar" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation546() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation546");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "bar" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation547() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation547");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "bar" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation548() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation548");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "bar" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation549() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation549");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "bar" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation550() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation550");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "foo" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation551() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation551");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "foo" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation552() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation552");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "foo" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation553() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation553");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "foo" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation554() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation554");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "foo" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation555() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation555");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "foo" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation556() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation556");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "bar" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation557() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation557");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "bar" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation558() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation558");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "foo" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation559() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation559");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "bar" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation560() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation560");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "foo" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation561() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation561");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "bar" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation562() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation562");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "bar" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation563() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation563");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "foo" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation564() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation564");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "bar" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation565() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation565");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "bar" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation566() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation566");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "bar" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation567() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation567");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "bar" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation568() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation568");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "bar" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation569() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation569");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "bar" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation570() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation570");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "foo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation571() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation571");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "foo" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation572() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation572");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "foo" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation573() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation573");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "bar" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation574() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation574");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "foo" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation575() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation575");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "foo" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation576() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation576");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "foo" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation577() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation577");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "foo" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation578() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation578");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "bar" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation579() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation579");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "foo" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation580() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation580");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "foo" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation581() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation581");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "foo" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation582() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation582");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "foo" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation583() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation583");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "bar" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation584() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation584");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "foo" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation585() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation585");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "foo" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation586() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation586");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "bar" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation587() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation587");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "foo" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation588() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation588");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "foo" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation589() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation589");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "bar" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation590() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation590");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "bar" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation591() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation591");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "bar" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation592() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation592");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "bar" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation593() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation593");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "foo" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation594() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation594");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "foo" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation595() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation595");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "bar" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation596() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation596");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "foo" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation597() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation597");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "bar" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation598() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation598");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "bar" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation599() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation599");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "foo" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation600() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation600");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "bar" , "Tuddor" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation601() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation601");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "foo" , "Tudor" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation602() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation602");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "bar" , "Turtle" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation603() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation603");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "foo" , "Tuttle" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation604() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation604");
        checkEncodingVariations("TTA1111111", new String[]{ "Darda" , "Datha" , "Dedie" , "Deedee" , "Deerdre" , "Deidre" , "Deirdre" , "Detta" , "Didi" , "Didier" , "Dido" , "Dierdre" , "Dieter" , "Dita" , "Ditter" , "Dodi" , "Dodie" , "Dody" , "Doherty" , "Dorthea" , "Dorthy" , "Doti" , "Dotti" , "Dottie" , "Dotty" , "Doty" , "Doughty" , "Douty" , "Dowdell" , "Duthie" , "Tada" , "Taddeo" , "Tadeo" , "Tadio" , "Tati" , "Teador" , "Tedda" , "Tedder" , "Teddi" , "Teddie" , "Teddy" , "Tedi" , "Tedie" , "Teeter" , "Teodoor" , "Teodor" , "Terti" , "Theda" , "Theodor" , "Theodore" , "Theta" , "Thilda" , "Thordia" , "Tilda" , "Tildi" , "Tildie" , "Tildy" , "Tita" , "Tito" , "Tjader" , "Toddie" , "Toddy" , "Torto" , "Tuddor" , "Tudor" , "Turtle" , "foo" , "Tutto" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomNameTTA1111111_literalMutation605() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomNameTTA1111111_literalMutation605");
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
    public void testCaverphoneRevisitedRandomWords_literalMutation607() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation607");
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
    public void testCaverphoneRevisitedRandomWords_literalMutation608() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation608");
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
    public void testCaverphoneRevisitedRandomWords_literalMutation609() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation609");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "bar" });
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
    public void testCaverphoneRevisitedRandomWords_literalMutation610() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation610");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("bar", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation611() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation611");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "bar");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation612() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation612");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("bar", new String[]{ "able" , "appear" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     * 
     * @throws EncoderException
     */
@Test
    public void testCaverphoneRevisitedRandomWords_literalMutation613() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation613");
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
    public void testCaverphoneRevisitedRandomWords_literalMutation614() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaverphoneRevisitedRandomWords_literalMutation614");
        checkEncodingVariations("RTA1111111", new String[]{ "rather" , "ready" , "writer" });
        checkEncoding("SSA1111111", "social");
        checkEncodingVariations("APA1111111", new String[]{ "able" , "bar" });
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
    public void testEndMb_literalMutation615() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation615");
        final String[][] data = new String[][]{ new String[]{ "bar" , "M111111111" } , new String[]{ "mbmb" , "MPM1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation616() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation616");
        final String[][] data = new String[][]{ new String[]{ "mb" , "bar" } , new String[]{ "mbmb" , "MPM1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation617() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation617");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M111111111" } , new String[]{ "foo" , "MPM1111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEndMb_literalMutation618() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEndMb_literalMutation618");
        final String[][] data = new String[][]{ new String[]{ "mb" , "M111111111" } , new String[]{ "mbmb" , "bar" } };
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
        final String[][] data = new String[][]{ new String[]{ "bar" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation620() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation620");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "foo" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation621() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation621");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "foo" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation622() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation622");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "bar" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation623() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation623");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "bar" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation624() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation624");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "foo" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation625() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation625");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "bar" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation626() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation626");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "foo" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation627() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation627");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "foo" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation628() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation628");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "bar" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation629() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation629");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "foo" , "KLN1111111" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation630() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation630");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "foo" } , new String[]{ "Dyun" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation631() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation631");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "foo" , "TN11111111" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecificationExamples_literalMutation632() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecificationExamples_literalMutation632");
        final String[][] data = new String[][]{ new String[]{ "Peter" , "PTA1111111" } , new String[]{ "ready" , "RTA1111111" } , new String[]{ "social" , "SSA1111111" } , new String[]{ "able" , "APA1111111" } , new String[]{ "Tedder" , "TTA1111111" } , new String[]{ "Karleen" , "KLN1111111" } , new String[]{ "Dyun" , "bar" } };
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

