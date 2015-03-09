package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests {@link Nysiis}
 * 
 * @since 1.7
 * @version $Id$
 */
public class NysiisTest extends StringEncoderAbstractTest<org.apache.commons.codec.language.Nysiis> {
    private final Nysiis fullNysiis = new Nysiis(false);

    /** 
     * Takes an array of String pairs where each pair's first element is the input and the second element the expected
     * encoding.
     * 
     * @param testValues
     * an array of String pairs where each pair's first element is the input and the second element the
     * expected encoding.
     * @throws EncoderException
     */
private void assertEncodings(final String[]... testValues) throws EncoderException {
        for (final String[] arr : testValues) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,("Problem with " + (arr[0])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),907,arr[1]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,this.fullNysiis,908,this.fullNysiis.encode(arr[0]));
        }
    }

    @Override
    protected Nysiis createStringEncoder() {
        return new Nysiis();
    }

    private void encodeAll(final String[] strings, final String expectedEncoding) {
        for (final String string : strings) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),910,("Problem with " + string));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,expectedEncoding);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,getStringEncoder(),912,getStringEncoder().encode(string));
        }
    }

    @Test(timeout = 1000)
    public void testBran_add215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran_add215");
        encodeAll(new String[]{ "Brian" , "Brown" , "Brun" }, "BRAN");
        encodeAll(new String[]{ "Brian" , "Brown" , "Brun" }, "BRAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBran() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran");
        encodeAll(new String[]{ "foo" , "Brown" , "Brun" }, "BRAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBran_literalMutation1193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran_literalMutation1193");
        encodeAll(new String[]{ "Brian" , "bar" , "Brun" }, "BRAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBran_literalMutation1194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran_literalMutation1194");
        encodeAll(new String[]{ "Brian" , "Brown" , "bar" }, "BRAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBran_literalMutation1195() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran_literalMutation1195");
        encodeAll(new String[]{ "Brian" , "Brown" , "Brun" }, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBran_remove198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran_remove198");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCap_add216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_add216");
        encodeAll(new String[]{ "Capp" , "Cope" , "Copp" , "Kipp" }, "CAP");
        encodeAll(new String[]{ "Capp" , "Cope" , "Copp" , "Kipp" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap");
        encodeAll(new String[]{ "bar" , "Cope" , "Copp" , "Kipp" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap_literalMutation1197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_literalMutation1197");
        encodeAll(new String[]{ "Capp" , "bar" , "Copp" , "Kipp" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap_literalMutation1198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_literalMutation1198");
        encodeAll(new String[]{ "Capp" , "Cope" , "foo" , "Kipp" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap_literalMutation1199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_literalMutation1199");
        encodeAll(new String[]{ "Capp" , "Cope" , "Copp" , "bar" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap_literalMutation1200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_literalMutation1200");
        encodeAll(new String[]{ "Capp" , "Cope" , "Copp" , "Kipp" }, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCap_remove199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_remove199");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDad_add217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDad_add217");
        encodeAll(new String[]{ "Dent" }, "DAD");
        encodeAll(new String[]{ "Dent" }, "DAD");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDad() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDad");
        encodeAll(new String[]{ "foo" }, "DAD");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDad_literalMutation1202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDad_literalMutation1202");
        encodeAll(new String[]{ "Dent" }, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDad_remove200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDad_remove200");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDan_add218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan_add218");
        encodeAll(new String[]{ "Dane" , "Dean" , "Dionne" }, "DAN");
        encodeAll(new String[]{ "Dane" , "Dean" , "Dionne" }, "DAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDan() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan");
        encodeAll(new String[]{ "bar" , "Dean" , "Dionne" }, "DAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDan_literalMutation1204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan_literalMutation1204");
        encodeAll(new String[]{ "Dane" , "bar" , "Dionne" }, "DAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDan_literalMutation1205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan_literalMutation1205");
        encodeAll(new String[]{ "Dane" , "Dean" , "bar" }, "DAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDan_literalMutation1206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan_literalMutation1206");
        encodeAll(new String[]{ "Dane" , "Dean" , "Dionne" }, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDan_remove201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan_remove201");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testDropBy_add219() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_add219");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy");
        assertEncodings(new String[]{ "bar" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1208() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1208");
        assertEncodings(new String[]{ "MACINTOSH" , "bar" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1209() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1209");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "foo" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1210() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1210");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "foo" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1211() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1211");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "foo" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1212() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1212");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "foo" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1213() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1213");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "foo" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1214() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1214");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "foo" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1215() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1215");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "foo" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1216() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1216");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "bar" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1217() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1217");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "foo" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1218() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1218");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "bar" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1219() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1219");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "bar" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1220() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1220");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "foo" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1221() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1221");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "bar" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1222() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1222");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "foo" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1223() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1223");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "bar" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1224() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1224");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "bar" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1225() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1225");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "bar" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1226() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1226");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "bar" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1227() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1227");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "foo" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1228() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1228");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "bar" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1229() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1229");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "foo" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1230() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1230");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "bar" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1231() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1231");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "foo" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1232() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1232");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "foo" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1233() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1233");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "foo" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1234() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1234");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "foo" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1235() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1235");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "bar" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1236() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1236");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "foo" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1237() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1237");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "foo" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1238() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1238");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "foo" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1239() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1239");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "foo" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1240() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1240");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "bar" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1241() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1241");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "foo" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1242() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1242");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "foo" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1243() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1243");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "foo" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1244() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1244");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "foo" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1245() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1245");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "bar" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1246() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1246");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "bar" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1247() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1247");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "foo" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1248() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1248");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "bar" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1249() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1249");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "bar" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1250() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1250");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "bar" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1251() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1251");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "bar" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1252() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1252");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "bar" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1253() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1253");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "foo" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1254() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1254");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "foo" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1255() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1255");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "bar" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1256() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1256");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "bar" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1257() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1257");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "bar" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1258() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1258");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "foo" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1259() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1259");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "foo" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1260() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1260");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "bar" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testDropBy_remove202() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_remove202");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFal_add220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFal_add220");
        encodeAll(new String[]{ "Phil" }, "FAL");
        encodeAll(new String[]{ "Phil" }, "FAL");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFal() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFal");
        encodeAll(new String[]{ "bar" }, "FAL");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFal_literalMutation1262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFal_literalMutation1262");
        encodeAll(new String[]{ "Phil" }, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFal_remove203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFal_remove203");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testOthers_add221() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_add221");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers");
        assertEncodings(new String[]{ "bar" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1264() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1264");
        assertEncodings(new String[]{ "O\'Daniel" , "bar" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1265() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1265");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "foo" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1266() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1266");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "bar" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1267() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1267");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "foo" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1268() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1268");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "bar" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1269() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1269");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "bar" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1270() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1270");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "bar" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1271() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1271");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "foo" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1272() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1272");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "bar" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1273() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1273");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "foo" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1274() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1274");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "bar" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testOthers_remove204() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_remove204");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule1_add222() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_add222");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1");
        assertEncodings(new String[]{ "bar" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1276() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1276");
        assertEncodings(new String[]{ "MACX" , "bar" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1277() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1277");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "bar" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1278() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1278");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "foo" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1279() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1279");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "bar" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1280() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1280");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "bar" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1281() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1281");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "foo" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1282() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1282");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "bar" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1283() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1283");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "bar" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1284() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1284");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "bar" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1285() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1285");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "foo" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1286() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1286");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule1_remove205() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_remove205");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule2_add223() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_add223");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2");
        assertEncodings(new String[]{ "bar" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1288() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1288");
        assertEncodings(new String[]{ "XEE" , "foo" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1289() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1289");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "foo" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1290() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1290");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "foo" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1291() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1291");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "foo" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1292() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1292");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "foo" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1293() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1293");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "bar" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1294() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1294");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "bar" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1295() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1295");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "bar" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1296() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1296");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "bar" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1297() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1297");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "foo" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1298() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1298");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "foo" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1299() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1299");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "foo" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1300() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1300");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "bar" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule2_remove206() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_remove206");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule4Dot1_add224() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_add224");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1");
        assertEncodings(new String[]{ "bar" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1302() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1302");
        assertEncodings(new String[]{ "XEV" , "foo" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1303() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1303");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "bar" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1304() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1304");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "foo" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1305() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1305");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "foo" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1306() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1306");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "bar" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1307() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1307");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "bar" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1308() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1308");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "foo" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1309() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1309");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "foo" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1310() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1310");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "foo" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1311() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1311");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "bar" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1312() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1312");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule4Dot1_remove207() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_remove207");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule4Dot2_add225() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_add225");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "XZ" , "X" }, new String[]{ "XM" , "XN" });
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "XZ" , "X" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2");
        assertEncodings(new String[]{ "bar" , "XG" }, new String[]{ "XZ" , "X" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1314() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1314");
        assertEncodings(new String[]{ "XQ" , "foo" }, new String[]{ "XZ" , "X" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1315() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1315");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "bar" , "X" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1316() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1316");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "XZ" , "bar" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1317() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1317");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "XZ" , "X" }, new String[]{ "bar" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1318() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1318");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "XZ" , "X" }, new String[]{ "XM" , "bar" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule4Dot2_remove208() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_remove208");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule5_add226() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5_add226");
        assertEncodings(new String[]{ "XS" , "X" }, new String[]{ "XSS" , "X" });
        assertEncodings(new String[]{ "XS" , "X" }, new String[]{ "XSS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule5() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5");
        assertEncodings(new String[]{ "bar" , "X" }, new String[]{ "XSS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule5_literalMutation1320() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5_literalMutation1320");
        assertEncodings(new String[]{ "XS" , "foo" }, new String[]{ "XSS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule5_literalMutation1321() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5_literalMutation1321");
        assertEncodings(new String[]{ "XS" , "X" }, new String[]{ "foo" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule5_literalMutation1322() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5_literalMutation1322");
        assertEncodings(new String[]{ "XS" , "X" }, new String[]{ "XSS" , "bar" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule5_remove209() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5_remove209");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule6_add227() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6_add227");
        assertEncodings(new String[]{ "XAY" , "XY" }, new String[]{ "XAYS" , "XY" });
        assertEncodings(new String[]{ "XAY" , "XY" }, new String[]{ "XAYS" , "XY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule6() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6");
        assertEncodings(new String[]{ "bar" , "XY" }, new String[]{ "XAYS" , "XY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule6_literalMutation1324() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6_literalMutation1324");
        assertEncodings(new String[]{ "XAY" , "foo" }, new String[]{ "XAYS" , "XY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule6_literalMutation1325() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6_literalMutation1325");
        assertEncodings(new String[]{ "XAY" , "XY" }, new String[]{ "foo" , "XY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule6_literalMutation1326() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6_literalMutation1326");
        assertEncodings(new String[]{ "XAY" , "XY" }, new String[]{ "XAYS" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule6_remove210() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6_remove210");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 7: If last character is A, remove it.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule7_add228() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7_add228");
        assertEncodings(new String[]{ "XA" , "X" }, new String[]{ "XAS" , "X" });
        assertEncodings(new String[]{ "XA" , "X" }, new String[]{ "XAS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 7: If last character is A, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule7() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7");
        assertEncodings(new String[]{ "foo" , "X" }, new String[]{ "XAS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 7: If last character is A, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule7_literalMutation1328() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7_literalMutation1328");
        assertEncodings(new String[]{ "XA" , "foo" }, new String[]{ "XAS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 7: If last character is A, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule7_literalMutation1329() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7_literalMutation1329");
        assertEncodings(new String[]{ "XA" , "X" }, new String[]{ "foo" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 7: If last character is A, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule7_literalMutation1330() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7_literalMutation1330");
        assertEncodings(new String[]{ "XA" , "X" }, new String[]{ "XAS" , "bar" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 7: If last character is A, remove it.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testRule7_remove211() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7_remove211");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSnad_add229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnad_add229");
        encodeAll(new String[]{ "Schmidt" }, "SNAD");
        encodeAll(new String[]{ "Schmidt" }, "SNAD");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSnad() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnad");
        encodeAll(new String[]{ "foo" }, "SNAD");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSnad_literalMutation1332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnad_literalMutation1332");
        encodeAll(new String[]{ "Schmidt" }, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSnad_remove212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnad_remove212");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSnat_add230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnat_add230");
        encodeAll(new String[]{ "Smith" , "Schmit" }, "SNAT");
        encodeAll(new String[]{ "Smith" , "Schmit" }, "SNAT");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSnat() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnat");
        encodeAll(new String[]{ "bar" , "Schmit" }, "SNAT");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSnat_literalMutation1334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnat_literalMutation1334");
        encodeAll(new String[]{ "Smith" , "foo" }, "SNAT");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSnat_literalMutation1335() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnat_literalMutation1335");
        encodeAll(new String[]{ "Smith" , "Schmit" }, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSnat_remove213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnat_remove213");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_add231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_add231");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_add232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_add232");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_add233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_add233");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_add234() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_add234");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_add235() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_add235");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_add236() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_add236");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_add237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_add237");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches");
        encodeAll(new String[]{ "foo" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1337");
        encodeAll(new String[]{ "Kobwick" }, "foo");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1338");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "foo" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1339");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "bar");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1340() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1340");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "bar" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1341");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "bar");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1342");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "foo" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1343");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "bar");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1344() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1344");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "bar" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1345");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "bar");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1346");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "bar" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1347() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1347");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "foo");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1348");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "foo" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1349() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1349");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_remove214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_remove214");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_remove215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_remove215");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_remove216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_remove216");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_remove217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_remove217");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_remove218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_remove218");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_remove219() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_remove219");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpecialBranches_remove220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_remove220");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTranan_add238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranan_add238");
        encodeAll(new String[]{ "Trueman" , "Truman" }, "TRANAN");
        encodeAll(new String[]{ "Trueman" , "Truman" }, "TRANAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTranan() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranan");
        encodeAll(new String[]{ "bar" , "Truman" }, "TRANAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTranan_literalMutation1351() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranan_literalMutation1351");
        encodeAll(new String[]{ "Trueman" , "foo" }, "TRANAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTranan_literalMutation1352() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranan_literalMutation1352");
        encodeAll(new String[]{ "Trueman" , "Truman" }, "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTranan_remove221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranan_remove221");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTrueVariant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrueVariant");
        final Nysiis encoder = new Nysiis(false);
        final String encoded = encoder.encode("WESTERLUND");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,((encoded.length()) <= 6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,encoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTrueVariant_literalMutation1354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrueVariant_literalMutation1354");
        final Nysiis encoder = new Nysiis(true);
        final String encoded = encoder.encode("bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,((encoded.length()) <= 6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,encoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

