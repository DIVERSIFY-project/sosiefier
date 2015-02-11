package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests {@link Soundex}.
 * 
 * <p>Keep this file in UTF-8 encoding for proper Javadoc processing.</p>
 * 
 * @version $Id$
 */
public class SoundexTest extends StringEncoderAbstractTest<org.apache.commons.codec.language.Soundex> {
    @Override
    protected Soundex createStringEncoder() {
        return new Soundex();
    }

    @Test(timeout = 1000)
    public void testB650_add239() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_add239");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650");
        checkEncodingVariations("foo", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1262() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1262");
        checkEncodingVariations("B650", new java.lang.String[]{ "foo" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1263() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1263");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "foo" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1264() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1264");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "foo" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1265() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1265");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "foo" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1266() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1266");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "foo" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1267() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1267");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "foo" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1268() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1268");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "foo" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1269() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1269");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "foo" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1270() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1270");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "foo" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1271() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1271");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "foo" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1272() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1272");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "foo" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1273() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1273");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "foo" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1274() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1274");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "foo" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1275() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1275");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "foo" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1276() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1276");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "foo" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1277() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1277");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "foo" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1278() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1278");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "foo" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1279() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1279");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "foo" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1280() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1280");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "foo" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1281() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1281");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "foo" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1282() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1282");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "foo" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1283() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1283");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "foo" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1284() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1284");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "foo" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1285() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1285");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "foo" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1286() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1286");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "foo" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1287() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1287");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "foo" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1288() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1288");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "foo" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1289() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1289");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "foo" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1290() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1290");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "foo" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1291() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1291");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "foo" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1292() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1292");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "foo" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1293() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1293");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "foo" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1294() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1294");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "foo" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1295() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1295");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "foo" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1296() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1296");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "foo" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1297() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1297");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "foo" , "BYRAM" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1298() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1298");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "foo" , "BYRNE" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1299() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1299");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "foo" , "BYRON" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1300() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1300");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "foo" , "BYRUM" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testB650_literalMutation1301() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_literalMutation1301");
        checkEncodingVariations("B650", new java.lang.String[]{ "BARHAM" , "BARONE" , "BARRON" , "BERNA" , "BIRNEY" , "BIRNIE" , "BOOROM" , "BOREN" , "BORN" , "BOURN" , "BOURNE" , "BOWRON" , "BRAIN" , "BRAME" , "BRANN" , "BRAUN" , "BREEN" , "BRIEN" , "BRIM" , "BRIMM" , "BRINN" , "BRION" , "BROOM" , "BROOME" , "BROWN" , "BROWNE" , "BRUEN" , "BRUHN" , "BRUIN" , "BRUMM" , "BRUN" , "BRUNO" , "BRYAN" , "BURIAN" , "BURN" , "BURNEY" , "BYRAM" , "BYRNE" , "BYRON" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testB650_remove222() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testB650_remove222");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBadCharacters() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadCharacters");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,getStringEncoder(),971,getStringEncoder().encode("HOL>MES"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDifference() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifference");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),974,getStringEncoder(),973,getStringEncoder().difference(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,getStringEncoder(),975,getStringEncoder().difference("", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,getStringEncoder(),977,getStringEncoder().difference(" ", " "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,getStringEncoder(),979,getStringEncoder().difference("Smith", "Smythe"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,getStringEncoder(),981,getStringEncoder().difference("Ann", "Andrew"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,getStringEncoder(),983,getStringEncoder().difference("Margaret", "Andrew"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,getStringEncoder(),985,getStringEncoder().difference("Janet", "Margaret"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,getStringEncoder(),987,getStringEncoder().difference("Green", "Greene"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,getStringEncoder(),989,getStringEncoder().difference("Blotchet-Halls", "Greene"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,getStringEncoder(),991,getStringEncoder().difference("Smith", "Smythe"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,getStringEncoder(),993,getStringEncoder().difference("Smithers", "Smythers"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,getStringEncoder(),995,getStringEncoder().difference("Anothers", "Brothers"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeBasic() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeBasic");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,getStringEncoder(),997,getStringEncoder().encode("testing"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,getStringEncoder(),999,getStringEncoder().encode("The"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,getStringEncoder(),1001,getStringEncoder().encode("quick"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,getStringEncoder(),1003,getStringEncoder().encode("brown"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,getStringEncoder(),1005,getStringEncoder().encode("fox"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,getStringEncoder(),1007,getStringEncoder().encode("jumped"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,getStringEncoder(),1009,getStringEncoder().encode("over"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,getStringEncoder(),1011,getStringEncoder().encode("the"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,getStringEncoder(),1013,getStringEncoder().encode("lazy"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,getStringEncoder(),1015,getStringEncoder().encode("dogs"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples from http://www.bradandkathy.com/genealogy/overviewofsoundex.html
     */
@Test
    public void testEncodeBatch2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeBatch2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,getStringEncoder(),1017,getStringEncoder().encode("Allricht"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,getStringEncoder(),1019,getStringEncoder().encode("Eberhard"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,getStringEncoder(),1021,getStringEncoder().encode("Engebrethson"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,getStringEncoder(),1023,getStringEncoder().encode("Heimbach"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,getStringEncoder(),1025,getStringEncoder().encode("Hanselmann"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1028,getStringEncoder(),1027,getStringEncoder().encode("Hildebrand"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1030,getStringEncoder(),1029,getStringEncoder().encode("Kavanagh"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1032,getStringEncoder(),1031,getStringEncoder().encode("Lind"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1034,getStringEncoder(),1033,getStringEncoder().encode("Lukaschowsky"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1036,getStringEncoder(),1035,getStringEncoder().encode("McDonnell"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1038,getStringEncoder(),1037,getStringEncoder().encode("McGee"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1040,getStringEncoder(),1039,getStringEncoder().encode("Opnian"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,getStringEncoder(),1041,getStringEncoder().encode("Oppenheimer"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,getStringEncoder(),1043,getStringEncoder().encode("Riedemanas"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,getStringEncoder(),1045,getStringEncoder().encode("Zita"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,getStringEncoder(),1047,getStringEncoder().encode("Zitzmeinn"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples from http://www.archives.gov/research_room/genealogy/census/soundex.html
     */
@Test
    public void testEncodeBatch3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeBatch3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,getStringEncoder(),1049,getStringEncoder().encode("Washington"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,getStringEncoder(),1051,getStringEncoder().encode("Lee"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,getStringEncoder(),1053,getStringEncoder().encode("Gutierrez"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,getStringEncoder(),1055,getStringEncoder().encode("Pfister"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,getStringEncoder(),1057,getStringEncoder().encode("Jackson"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,getStringEncoder(),1059,getStringEncoder().encode("Tymczak"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,getStringEncoder(),1061,getStringEncoder().encode("VanDeusen"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples from: http://www.myatt.demon.co.uk/sxalg.htm
     */
@Test
    public void testEncodeBatch4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeBatch4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,getStringEncoder(),1063,getStringEncoder().encode("HOLMES"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,getStringEncoder(),1065,getStringEncoder().encode("ADOMOMI"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,getStringEncoder(),1067,getStringEncoder().encode("VONDERLEHR"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,getStringEncoder(),1069,getStringEncoder().encode("BALL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,getStringEncoder(),1071,getStringEncoder().encode("SHAW"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,getStringEncoder(),1073,getStringEncoder().encode("JACKSON"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,getStringEncoder(),1075,getStringEncoder().encode("SCANLON"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,getStringEncoder(),1077,getStringEncoder().encode("SAINTJOHN"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeIgnoreApostrophes_add240() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_add240");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1302() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1302");
        checkEncodingVariations("foo", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1303() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1303");
        checkEncodingVariations("O165", new java.lang.String[]{ "foo" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1304() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1304");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "foo" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1305() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1305");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "foo" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1306() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1306");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "foo" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1307() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1307");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "foo" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1308() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1308");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "foo" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1309() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1309");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "foo" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation1310() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation1310");
        checkEncodingVariations("O165", new java.lang.String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeIgnoreApostrophes_remove223() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_remove223");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testEncodeIgnoreHyphens_add241() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_add241");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1311() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1311");
        checkEncodingVariations("foo", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1312() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1312");
        checkEncodingVariations("K525", new java.lang.String[]{ "foo" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1313() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1313");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "foo" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1314() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1314");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "foo" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1315() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1315");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "foo" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1316() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1316");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "foo" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1317() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1317");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "foo" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1318() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1318");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "foo" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1319() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1319");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "foo" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1320() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1320");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "foo" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1321() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1321");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "foo" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation1322() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation1322");
        checkEncodingVariations("K525", new java.lang.String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testEncodeIgnoreHyphens_remove224() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_remove224");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreTrimmable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreTrimmable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,getStringEncoder(),1079,getStringEncoder().encode(" \t\n\r Washington \t\n\r "));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     */
@Test
    public void testHWRuleEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1082,getStringEncoder(),1081,getStringEncoder().encode("Ashcraft"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     */
@Test
    public void testHWRuleEx2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1084,getStringEncoder(),1083,getStringEncoder().encode("BOOTHDAVIS"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1086,getStringEncoder(),1085,getStringEncoder().encode("BOOTH-DAVIS"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testHWRuleEx3_add242() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_add242");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("foo", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1324() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1324");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "foo" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1325() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1325");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "foo" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1326() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1326");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "foo" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1327() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1327");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "foo" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1328() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1328");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "foo" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1329() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1329");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "foo" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1330() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1330");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "foo" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1331() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1331");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "foo" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1332() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1332");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "foo" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1333() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1333");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "foo" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1334() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1334");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "foo" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1335() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1335");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "foo" , "SHULER" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1336() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1336");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "foo" , "SILAR" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1337() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1337");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "foo" , "SILER" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1338() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1338");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "foo" , "SILLER" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test
    public void testHWRuleEx3_literalMutation1339() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_literalMutation1339");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        checkEncodingVariations("S460", new java.lang.String[]{ "SAILOR" , "SALYER" , "SAYLOR" , "SCHALLER" , "SCHELLER" , "SCHILLER" , "SCHOOLER" , "SCHULER" , "SCHUYLER" , "SEILER" , "SEYLER" , "SHOLAR" , "SHULER" , "SILAR" , "SILER" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Consonants from the same code group separated by W or H are treated as one.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testHWRuleEx3_remove225() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHWRuleEx3_remove225");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,getStringEncoder(),1087,getStringEncoder().encode("Sgler"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,getStringEncoder(),1089,getStringEncoder().encode("Swhgler"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_setu-sus_3o6w.asp
     */
@Test
    public void testMsSqlServer1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1092,getStringEncoder(),1091,getStringEncoder().encode("Smith"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1094,getStringEncoder(),1093,getStringEncoder().encode("Smythe"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testMsSqlServer2_add243() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2_add243");
        checkEncodingVariations("E625", new java.lang.String[]{ "Erickson" , "Erickson" , "Erikson" , "Ericson" , "Ericksen" , "Ericsen" });
        checkEncodingVariations("E625", new java.lang.String[]{ "Erickson" , "Erickson" , "Erikson" , "Ericson" , "Ericksen" , "Ericsen" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test
    public void testMsSqlServer2() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2");
        checkEncodingVariations("foo", new java.lang.String[]{ "Erickson" , "Erickson" , "Erikson" , "Ericson" , "Ericksen" , "Ericsen" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test
    public void testMsSqlServer2_literalMutation1341() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2_literalMutation1341");
        checkEncodingVariations("E625", new java.lang.String[]{ "foo" , "Erickson" , "Erikson" , "Ericson" , "Ericksen" , "Ericsen" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test
    public void testMsSqlServer2_literalMutation1342() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2_literalMutation1342");
        checkEncodingVariations("E625", new java.lang.String[]{ "Erickson" , "foo" , "Erikson" , "Ericson" , "Ericksen" , "Ericsen" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test
    public void testMsSqlServer2_literalMutation1343() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2_literalMutation1343");
        checkEncodingVariations("E625", new java.lang.String[]{ "Erickson" , "Erickson" , "foo" , "Ericson" , "Ericksen" , "Ericsen" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test
    public void testMsSqlServer2_literalMutation1344() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2_literalMutation1344");
        checkEncodingVariations("E625", new java.lang.String[]{ "Erickson" , "Erickson" , "Erikson" , "foo" , "Ericksen" , "Ericsen" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test
    public void testMsSqlServer2_literalMutation1345() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2_literalMutation1345");
        checkEncodingVariations("E625", new java.lang.String[]{ "Erickson" , "Erickson" , "Erikson" , "Ericson" , "foo" , "Ericsen" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test
    public void testMsSqlServer2_literalMutation1346() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2_literalMutation1346");
        checkEncodingVariations("E625", new java.lang.String[]{ "Erickson" , "Erickson" , "Erikson" , "Ericson" , "Ericksen" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testMsSqlServer2_remove226() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer2_remove226");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples for MS SQLServer from http://databases.about.com/library/weekly/aa042901a.htm
     */
@Test
    public void testMsSqlServer3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMsSqlServer3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1096,getStringEncoder(),1095,getStringEncoder().encode("Ann"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1098,getStringEncoder(),1097,getStringEncoder().encode("Andrew"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1100,getStringEncoder(),1099,getStringEncoder().encode("Janet"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1102,getStringEncoder(),1101,getStringEncoder().encode("Margaret"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1104,getStringEncoder(),1103,getStringEncoder().encode("Steven"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1106,getStringEncoder(),1105,getStringEncoder().encode("Michael"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1108,getStringEncoder(),1107,getStringEncoder().encode("Robert"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1110,getStringEncoder(),1109,getStringEncoder().encode("Laura"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1112,getStringEncoder(),1111,getStringEncoder().encode("Anne"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * https://issues.apache.org/jira/browse/CODEC-54 https://issues.apache.org/jira/browse/CODEC-56
     */
@Test
    public void testNewInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewInstance");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1114,new org.apache.commons.codec.language.Soundex(),1113,new org.apache.commons.codec.language.Soundex().soundex("Williams"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewInstance2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewInstance2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1116,new org.apache.commons.codec.language.Soundex(org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING_STRING.toCharArray()),1115,new org.apache.commons.codec.language.Soundex(org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING_STRING.toCharArray()).soundex("Williams"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewInstance3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewInstance3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1118,new org.apache.commons.codec.language.Soundex(org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING_STRING),1117,new org.apache.commons.codec.language.Soundex(org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING_STRING).soundex("Williams"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSoundexUtilsConstructable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoundexUtilsConstructable");
        new SoundexUtils();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSoundexUtilsNullBehaviour() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoundexUtilsNullBehaviour");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1120,null,1119,org.apache.commons.codec.language.SoundexUtils.clean(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,null,1121,org.apache.commons.codec.language.SoundexUtils.clean(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1124,null,1123,org.apache.commons.codec.language.SoundexUtils.differenceEncoded(null, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,null,1125,org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * https://issues.apache.org/jira/browse/CODEC-54 https://issues.apache.org/jira/browse/CODEC-56
     */
@Test
    public void testUsEnglishStatic() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUsEnglishStatic");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1128,org.apache.commons.codec.language.Soundex.US_ENGLISH,1127,org.apache.commons.codec.language.Soundex.US_ENGLISH.soundex("Williams"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Fancy characters are not mapped by the default US mapping.
     * 
     * http://issues.apache.org/bugzilla/show_bug.cgi?id=29080
     */
@Test
    public void testUsMappingEWithAcute() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUsMappingEWithAcute");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1130,getStringEncoder(),1129,getStringEncoder().encode("e"));
        if (java.lang.Character.isLetter('é')) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1132,getStringEncoder(),1131,getStringEncoder().encode("é"));
            } catch (final IllegalArgumentException e) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1134,getStringEncoder(),1133,getStringEncoder().encode("é"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Fancy characters are not mapped by the default US mapping.
     * 
     * http://issues.apache.org/bugzilla/show_bug.cgi?id=29080
     */
@Test
    public void testUsMappingOWithDiaeresis() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUsMappingOWithDiaeresis");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1136,getStringEncoder(),1135,getStringEncoder().encode("o"));
        if (java.lang.Character.isLetter('ö')) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,getStringEncoder(),1137,getStringEncoder().encode("ö"));
            } catch (final IllegalArgumentException e) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,getStringEncoder(),1139,getStringEncoder().encode("ö"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

