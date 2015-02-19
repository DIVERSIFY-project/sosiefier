package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests {@link DaitchMokotoffSoundex}.
 * <p>
 * Keep this file in UTF-8 encoding for proper Javadoc processing.
 * </p>
 * 
 * @since 1.10
 */
public class DaitchMokotoffSoundexTest extends StringEncoderAbstractTest<org.apache.commons.codec.language.DaitchMokotoffSoundex> {
    @Override
    protected DaitchMokotoffSoundex createStringEncoder() {
        return new DaitchMokotoffSoundex();
    }

    private String soundex(String source) {
        return getStringEncoder().soundex(source);
    }

    private String encode(String source) {
        return getStringEncoder().encode(source);
    }

    @Test
    public void testAccentedCharacterFolding() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentedCharacterFolding");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),455,null,454,soundex("Straßburg"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,null,456,soundex("Strasburg"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,null,458,soundex("Éregon"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,null,460,soundex("Eregon"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAdjacentCodes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdjacentCodes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,null,462,soundex("AKSSOL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),465,null,464,soundex("GERSCHFELD"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEncodeBasic() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeBasic");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,null,466,encode("AUERBACH"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,null,468,encode("OHRBACH"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,null,470,encode("LIPSHITZ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,null,472,encode("LIPPSZYC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,null,474,encode("LEWINSKY"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),477,null,476,encode("LEVINSKI"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,null,478,encode("SZLAMAWICZ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),481,null,480,encode("SHLAMOVITZ"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeIgnoreApostrophes_add147() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_add147");
        checkEncodingVariations("079600", new String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        checkEncodingVariations("079600", new String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes");
        checkEncodingVariations("bar", new String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation795() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation795");
        checkEncodingVariations("079600", new String[]{ "bar" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation796() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation796");
        checkEncodingVariations("079600", new String[]{ "OBrien" , "bar" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation797() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation797");
        checkEncodingVariations("079600", new String[]{ "OBrien" , "\'OBrien" , "foo" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation798() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation798");
        checkEncodingVariations("079600", new String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "foo" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation799() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation799");
        checkEncodingVariations("079600", new String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "bar" , "OBri\'en" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation800() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation800");
        checkEncodingVariations("079600", new String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "bar" , "OBrie\'n" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation801() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation801");
        checkEncodingVariations("079600", new String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "bar" , "OBrien\'" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreApostrophes_literalMutation802() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_literalMutation802");
        checkEncodingVariations("079600", new String[]{ "OBrien" , "\'OBrien" , "O\'Brien" , "OB\'rien" , "OBr\'ien" , "OBri\'en" , "OBrie\'n" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeIgnoreApostrophes_remove130() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreApostrophes_remove130");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testEncodeIgnoreHyphens_add148() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_add148");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
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
        checkEncodingVariations("bar", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation804() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation804");
        checkEncodingVariations("565463", new String[]{ "foo" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation805() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation805");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "foo" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation806() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation806");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "bar" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation807() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation807");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "bar" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation808() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation808");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "foo" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation809() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation809");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "foo" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation810() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation810");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "bar" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation811() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation811");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "bar" , "KINGSMI-TH" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation812() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation812");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "foo" , "KINGSMIT-H" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation813() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation813");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "bar" , "KINGSMITH-" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeIgnoreHyphens_literalMutation814() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_literalMutation814");
        checkEncodingVariations("565463", new String[]{ "KINGSMITH" , "-KINGSMITH" , "K-INGSMITH" , "KI-NGSMITH" , "KIN-GSMITH" , "KING-SMITH" , "KINGS-MITH" , "KINGSM-ITH" , "KINGSMI-TH" , "KINGSMIT-H" , "bar" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testEncodeIgnoreHyphens_remove131() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreHyphens_remove131");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeIgnoreTrimmable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeIgnoreTrimmable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),483,null,482,encode(" \t\n\r Washington \t\n\r "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,null,484,encode("Washington"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples from http://www.jewishgen.org/infofiles/soundex.html
     */
@Test
    public void testSoundexBasic() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoundexBasic");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,null,486,soundex("GOLDEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,null,488,soundex("Alpert"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,null,490,soundex("Breuer"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),493,null,492,soundex("Haber"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),495,null,494,soundex("Mannheim"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),497,null,496,soundex("Mintz"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),499,null,498,soundex("Topf"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),501,null,500,soundex("Kleinmann"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,null,502,soundex("Ben Aron"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,null,504,soundex("AUERBACH"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,null,506,soundex("OHRBACH"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,null,508,soundex("LIPSHITZ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,null,510,soundex("LIPPSZYC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,null,512,soundex("LEWINSKY"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,null,514,soundex("LEVINSKI"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,null,516,soundex("SZLAMAWICZ"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,null,518,soundex("SHLAMOVITZ"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples from http://www.avotaynu.com/soundex.htm
     */
@Test
    public void testSoundexBasic2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoundexBasic2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,null,520,soundex("Ceniow"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,null,522,soundex("Tsenyuv"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,null,524,soundex("Holubica"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,null,526,soundex("Golubitsa"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,null,528,soundex("Przemysl"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),531,null,530,soundex("Pshemeshil"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),533,null,532,soundex("Rosochowaciec"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),535,null,534,soundex("Rosokhovatsets"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Examples from http://en.wikipedia.org/wiki/Daitch%E2%80%93Mokotoff_Soundex
     */
@Test
    public void testSoundexBasic3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSoundexBasic3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),537,null,536,soundex("Peters"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),539,null,538,soundex("Peterson"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),541,null,540,soundex("Moskowitz"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),543,null,542,soundex("Moskovitz"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),545,null,544,soundex("Jackson"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),547,null,546,soundex("Jackson-Jackson"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpecialRomanianCharacters() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpecialRomanianCharacters");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),549,null,548,soundex("ţamas"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),551,null,550,soundex("țamas"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

