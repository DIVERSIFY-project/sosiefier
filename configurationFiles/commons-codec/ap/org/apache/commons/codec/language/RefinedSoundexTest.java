package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests RefinedSoundex.
 * 
 * @version $Id$
 */
public class RefinedSoundexTest extends StringEncoderAbstractTest<org.apache.commons.codec.language.RefinedSoundex> {
    @Override
    protected RefinedSoundex createStringEncoder() {
        return new RefinedSoundex();
    }

    @Test
    public void testDifference() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDifference");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,getStringEncoder(),916,getStringEncoder().difference(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,getStringEncoder(),918,getStringEncoder().difference("", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,getStringEncoder(),920,getStringEncoder().difference(" ", " "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,getStringEncoder(),922,getStringEncoder().difference("Smith", "Smythe"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,getStringEncoder(),924,getStringEncoder().difference("Ann", "Andrew"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,getStringEncoder(),926,getStringEncoder().difference("Margaret", "Andrew"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,getStringEncoder(),928,getStringEncoder().difference("Janet", "Margaret"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,getStringEncoder(),930,getStringEncoder().difference("Green", "Greene"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,getStringEncoder(),932,getStringEncoder().difference("Blotchet-Halls", "Greene"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,getStringEncoder(),934,getStringEncoder().difference("Smith", "Smythe"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,getStringEncoder(),936,getStringEncoder().difference("Smithers", "Smythers"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,getStringEncoder(),938,getStringEncoder().difference("Anothers", "Brothers"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncode");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,getStringEncoder(),940,getStringEncoder().encode("testing"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,getStringEncoder(),942,getStringEncoder().encode("TESTING"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,getStringEncoder(),944,getStringEncoder().encode("The"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,getStringEncoder(),946,getStringEncoder().encode("quick"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,getStringEncoder(),948,getStringEncoder().encode("brown"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,getStringEncoder(),950,getStringEncoder().encode("fox"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,getStringEncoder(),952,getStringEncoder().encode("jumped"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),955,getStringEncoder(),954,getStringEncoder().encode("over"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),957,getStringEncoder(),956,getStringEncoder().encode("the"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),959,getStringEncoder(),958,getStringEncoder().encode("lazy"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,getStringEncoder(),960,getStringEncoder().encode("dogs"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH,962,org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH.encode("dogs"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetMappingCodeNonLetter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetMappingCodeNonLetter");
        final char code = getStringEncoder().getMappingCode('#');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,code);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewInstance");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,new org.apache.commons.codec.language.RefinedSoundex(),965,new org.apache.commons.codec.language.RefinedSoundex().soundex("dogs"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewInstance2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewInstance2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),968,new org.apache.commons.codec.language.RefinedSoundex(org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING_STRING.toCharArray()),967,new org.apache.commons.codec.language.RefinedSoundex(org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING_STRING.toCharArray()).soundex("dogs"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewInstance3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewInstance3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,new org.apache.commons.codec.language.RefinedSoundex(org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING_STRING),969,new org.apache.commons.codec.language.RefinedSoundex(org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING_STRING).soundex("dogs"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

