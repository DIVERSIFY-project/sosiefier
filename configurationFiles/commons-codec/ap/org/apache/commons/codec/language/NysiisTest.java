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
    public void testBran_literalMutation1098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran_literalMutation1098");
        encodeAll(new String[]{ "Brian" , "foo" , "Brun" }, "BRAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBran_literalMutation1099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran_literalMutation1099");
        encodeAll(new String[]{ "Brian" , "Brown" , "foo" }, "BRAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBran_literalMutation1100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBran_literalMutation1100");
        encodeAll(new String[]{ "Brian" , "Brown" , "Brun" }, "foo");
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
        encodeAll(new String[]{ "foo" , "Cope" , "Copp" , "Kipp" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap_literalMutation1102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_literalMutation1102");
        encodeAll(new String[]{ "Capp" , "foo" , "Copp" , "Kipp" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap_literalMutation1103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_literalMutation1103");
        encodeAll(new String[]{ "Capp" , "Cope" , "foo" , "Kipp" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap_literalMutation1104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_literalMutation1104");
        encodeAll(new String[]{ "Capp" , "Cope" , "Copp" , "foo" }, "CAP");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCap_literalMutation1105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCap_literalMutation1105");
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
    public void testDad_literalMutation1107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDad_literalMutation1107");
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
        encodeAll(new String[]{ "foo" , "Dean" , "Dionne" }, "DAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDan_literalMutation1109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan_literalMutation1109");
        encodeAll(new String[]{ "Dane" , "foo" , "Dionne" }, "DAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDan_literalMutation1110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan_literalMutation1110");
        encodeAll(new String[]{ "Dane" , "Dean" , "foo" }, "DAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDan_literalMutation1111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDan_literalMutation1111");
        encodeAll(new String[]{ "Dane" , "Dean" , "Dionne" }, "foo");
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
        assertEncodings(new String[]{ "foo" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1113() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1113");
        assertEncodings(new String[]{ "MACINTOSH" , "foo" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1114() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1114");
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
    public void testDropBy_literalMutation1115() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1115");
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
    public void testDropBy_literalMutation1116() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1116");
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
    public void testDropBy_literalMutation1117() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1117");
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
    public void testDropBy_literalMutation1118() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1118");
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
    public void testDropBy_literalMutation1119() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1119");
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
    public void testDropBy_literalMutation1120() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1120");
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
    public void testDropBy_literalMutation1121() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1121");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "foo" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1122() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1122");
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
    public void testDropBy_literalMutation1123() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1123");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "foo" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1124() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1124");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "foo" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1125() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1125");
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
    public void testDropBy_literalMutation1126() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1126");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "foo" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1127() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1127");
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
    public void testDropBy_literalMutation1128() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1128");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "foo" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1129() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1129");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "foo" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1130() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1130");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "foo" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1131() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1131");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "foo" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1132() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1132");
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
    public void testDropBy_literalMutation1133() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1133");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "foo" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1134() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1134");
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
    public void testDropBy_literalMutation1135() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1135");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "foo" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1136() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1136");
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
    public void testDropBy_literalMutation1137() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1137");
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
    public void testDropBy_literalMutation1138() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1138");
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
    public void testDropBy_literalMutation1139() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1139");
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
    public void testDropBy_literalMutation1140() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1140");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "foo" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1141() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1141");
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
    public void testDropBy_literalMutation1142() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1142");
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
    public void testDropBy_literalMutation1143() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1143");
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
    public void testDropBy_literalMutation1144() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1144");
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
    public void testDropBy_literalMutation1145() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1145");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "foo" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1146() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1146");
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
    public void testDropBy_literalMutation1147() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1147");
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
    public void testDropBy_literalMutation1148() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1148");
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
    public void testDropBy_literalMutation1149() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1149");
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
    public void testDropBy_literalMutation1150() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1150");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "foo" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1151() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1151");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "foo" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1152() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1152");
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
    public void testDropBy_literalMutation1153() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1153");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "foo" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1154() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1154");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "foo" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1155() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1155");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "foo" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1156() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1156");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "foo" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1157() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1157");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "foo" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1158() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1158");
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
    public void testDropBy_literalMutation1159() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1159");
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
    public void testDropBy_literalMutation1160() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1160");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "foo" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1161() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1161");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "foo" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1162() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1162");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "foo" , "CARY" }, new String[]{ "YAMADA" , "YANAD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internet.
     * 
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     */
@Test
    public void testDropBy_literalMutation1163() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1163");
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
    public void testDropBy_literalMutation1164() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1164");
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
    public void testDropBy_literalMutation1165() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDropBy_literalMutation1165");
        assertEncodings(new String[]{ "MACINTOSH" , "MCANT" }, new String[]{ "KNUTH" , "NAT" }, new String[]{ "KOEHN" , "CAN" }, new String[]{ "PHILLIPSON" , "FALAPSAN" }, new String[]{ "PFEISTER" , "FASTAR" }, new String[]{ "SCHOENHOEFT" , "SANAFT" }, new String[]{ "MCKEE" , "MCY" }, new String[]{ "MACKIE" , "MCY" }, new String[]{ "HEITSCHMIDT" , "HATSNAD" }, new String[]{ "BART" , "BAD" }, new String[]{ "HURD" , "HAD" }, new String[]{ "HUNT" , "HAD" }, new String[]{ "WESTERLUND" , "WASTARLAD" }, new String[]{ "CASSTEVENS" , "CASTAFAN" }, new String[]{ "VASQUEZ" , "VASG" }, new String[]{ "FRAZIER" , "FRASAR" }, new String[]{ "BOWMAN" , "BANAN" }, new String[]{ "MCKNIGHT" , "MCNAGT" }, new String[]{ "RICKERT" , "RACAD" }, new String[]{ "DEUTSCH" , "DAT" }, new String[]{ "WESTPHAL" , "WASTFAL" }, new String[]{ "SHRIVER" , "SRAVAR" }, new String[]{ "KUHL" , "CAL" }, new String[]{ "RAWSON" , "RASAN" }, new String[]{ "JILES" , "JAL" }, new String[]{ "CARRAWAY" , "CARY" }, new String[]{ "YAMADA" , "foo" });
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
        encodeAll(new String[]{ "foo" }, "FAL");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFal_literalMutation1167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFal_literalMutation1167");
        encodeAll(new String[]{ "Phil" }, "foo");
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
        assertEncodings(new String[]{ "foo" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1169() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1169");
        assertEncodings(new String[]{ "O\'Daniel" , "foo" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1170() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1170");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "foo" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1171() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1171");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "foo" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1172() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1172");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "foo" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1173() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1173");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "foo" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1174() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1174");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "foo" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1175() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1175");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "foo" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1176() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1176");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "foo" , "CARY" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1177() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1177");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "foo" }, new String[]{ "FUZZY" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1178() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1178");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "foo" , "FASY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests data gathered from around the internets.
     * 
     * @throws EncoderException
     */
@Test
    public void testOthers_literalMutation1179() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOthers_literalMutation1179");
        assertEncodings(new String[]{ "O\'Daniel" , "ODANAL" }, new String[]{ "O\'Donnel" , "ODANAL" }, new String[]{ "Cory" , "CARY" }, new String[]{ "Corey" , "CARY" }, new String[]{ "Kory" , "CARY" }, new String[]{ "FUZZY" , "foo" });
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
        assertEncodings(new String[]{ "foo" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1181() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1181");
        assertEncodings(new String[]{ "MACX" , "foo" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1182() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1182");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "foo" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1183() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1183");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "foo" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1184() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1184");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "foo" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1185() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1185");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "foo" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1186() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1186");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "foo" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1187() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1187");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "foo" }, new String[]{ "PFX" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1188() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1188");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "foo" , "FX" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1189() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1189");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "foo" }, new String[]{ "SCHX" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1190() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1190");
        assertEncodings(new String[]{ "MACX" , "MCX" }, new String[]{ "KNX" , "NX" }, new String[]{ "KX" , "CX" }, new String[]{ "PHX" , "FX" }, new String[]{ "PFX" , "FX" }, new String[]{ "foo" , "SX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     * 
     * @throws EncoderException
     */
@Test
    public void testRule1_literalMutation1191() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule1_literalMutation1191");
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
        assertEncodings(new String[]{ "foo" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1193() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1193");
        assertEncodings(new String[]{ "XEE" , "foo" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1194() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1194");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "foo" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1195() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1195");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "foo" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1196() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1196");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "foo" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1197() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1197");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "foo" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1198() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1198");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "foo" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1199() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1199");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "foo" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1200() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1200");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "foo" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1201() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1201");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "foo" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1202() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1202");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "foo" , "XD" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1203() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1203");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "foo" }, new String[]{ "XND" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1204() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1204");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "foo" , "XD" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     * 
     * @throws EncoderException
     */
@Test
    public void testRule2_literalMutation1205() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule2_literalMutation1205");
        assertEncodings(new String[]{ "XEE" , "XY" }, new String[]{ "XIE" , "XY" }, new String[]{ "XDT" , "XD" }, new String[]{ "XRT" , "XD" }, new String[]{ "XRD" , "XD" }, new String[]{ "XNT" , "XD" }, new String[]{ "XND" , "foo" });
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
        assertEncodings(new String[]{ "foo" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1207() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1207");
        assertEncodings(new String[]{ "XEV" , "foo" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1208() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1208");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "foo" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1209() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1209");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "foo" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1210() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1210");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "foo" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1211() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1211");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "foo" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1212() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1212");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "foo" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1213() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1213");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "foo" }, new String[]{ "XOX" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1214() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1214");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "foo" , "XAX" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1215() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1215");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "foo" }, new String[]{ "XUX" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1216() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1216");
        assertEncodings(new String[]{ "XEV" , "XAF" }, new String[]{ "XAX" , "XAX" }, new String[]{ "XEX" , "XAX" }, new String[]{ "XIX" , "XAX" }, new String[]{ "XOX" , "XAX" }, new String[]{ "foo" , "XAX" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot1_literalMutation1217() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot1_literalMutation1217");
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
        assertEncodings(new String[]{ "foo" , "XG" }, new String[]{ "XZ" , "X" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1219() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1219");
        assertEncodings(new String[]{ "XQ" , "foo" }, new String[]{ "XZ" , "X" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1220() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1220");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "foo" , "X" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1221() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1221");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "XZ" , "foo" }, new String[]{ "XM" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1222() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1222");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "XZ" , "X" }, new String[]{ "foo" , "XN" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 4.2: Q → G, Z → S, M → N
     * 
     * @throws EncoderException
     */
@Test
    public void testRule4Dot2_literalMutation1223() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule4Dot2_literalMutation1223");
        assertEncodings(new String[]{ "XQ" , "XG" }, new String[]{ "XZ" , "X" }, new String[]{ "XM" , "foo" });
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
        assertEncodings(new String[]{ "foo" , "X" }, new String[]{ "XSS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule5_literalMutation1225() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5_literalMutation1225");
        assertEncodings(new String[]{ "XS" , "foo" }, new String[]{ "XSS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule5_literalMutation1226() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5_literalMutation1226");
        assertEncodings(new String[]{ "XS" , "X" }, new String[]{ "foo" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 5: If last character is S, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule5_literalMutation1227() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule5_literalMutation1227");
        assertEncodings(new String[]{ "XS" , "X" }, new String[]{ "XSS" , "foo" });
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
        assertEncodings(new String[]{ "foo" , "XY" }, new String[]{ "XAYS" , "XY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule6_literalMutation1229() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6_literalMutation1229");
        assertEncodings(new String[]{ "XAY" , "foo" }, new String[]{ "XAYS" , "XY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule6_literalMutation1230() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6_literalMutation1230");
        assertEncodings(new String[]{ "XAY" , "XY" }, new String[]{ "foo" , "XY" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 6: If last characters are AY, replace with Y.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule6_literalMutation1231() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule6_literalMutation1231");
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
    public void testRule7_literalMutation1233() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7_literalMutation1233");
        assertEncodings(new String[]{ "XA" , "foo" }, new String[]{ "XAS" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 7: If last character is A, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule7_literalMutation1234() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7_literalMutation1234");
        assertEncodings(new String[]{ "XA" , "X" }, new String[]{ "foo" , "X" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests rule 7: If last character is A, remove it.
     * 
     * @throws EncoderException
     */
@Test
    public void testRule7_literalMutation1235() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRule7_literalMutation1235");
        assertEncodings(new String[]{ "XA" , "X" }, new String[]{ "XAS" , "foo" });
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
    public void testSnad_literalMutation1237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnad_literalMutation1237");
        encodeAll(new String[]{ "Schmidt" }, "foo");
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
        encodeAll(new String[]{ "foo" , "Schmit" }, "SNAT");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSnat_literalMutation1239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnat_literalMutation1239");
        encodeAll(new String[]{ "Smith" , "foo" }, "SNAT");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSnat_literalMutation1240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSnat_literalMutation1240");
        encodeAll(new String[]{ "Smith" , "Schmit" }, "foo");
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
    public void testSpecialBranches_literalMutation1242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1242");
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
    public void testSpecialBranches_literalMutation1243() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1243");
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
    public void testSpecialBranches_literalMutation1244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1244");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "foo");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1245");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "foo" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1246");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "foo");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1247");
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
    public void testSpecialBranches_literalMutation1248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1248");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "foo");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1249");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "foo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1250");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "foo");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1251");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "foo" }, "UH");
        encodeAll(new String[]{ "Um" }, "UN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialBranches_literalMutation1252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1252");
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
    public void testSpecialBranches_literalMutation1253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1253");
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
    public void testSpecialBranches_literalMutation1254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialBranches_literalMutation1254");
        encodeAll(new String[]{ "Kobwick" }, "CABWAC");
        encodeAll(new String[]{ "Kocher" }, "CACAR");
        encodeAll(new String[]{ "Fesca" }, "FASC");
        encodeAll(new String[]{ "Shom" }, "SAN");
        encodeAll(new String[]{ "Ohlo" }, "OL");
        encodeAll(new String[]{ "Uhu" }, "UH");
        encodeAll(new String[]{ "Um" }, "foo");
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
        encodeAll(new String[]{ "foo" , "Truman" }, "TRANAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTranan_literalMutation1256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranan_literalMutation1256");
        encodeAll(new String[]{ "Trueman" , "foo" }, "TRANAN");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTranan_literalMutation1257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranan_literalMutation1257");
        encodeAll(new String[]{ "Trueman" , "Truman" }, "foo");
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
    public void testTrueVariant_literalMutation1259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrueVariant_literalMutation1259");
        final Nysiis encoder = new Nysiis(true);
        final String encoded = encoder.encode("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,((encoded.length()) <= 6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,encoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

