package org.apache.commons.codec.language;

import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Series of tests for the Match Rating Approach algorithm.
 * 
 * General naming nomenclature for the test is of the form:
 * GeneralMetadataOnTheTestArea_ActualTestValues_ExpectedResult
 * 
 * An unusual value is indicated by the term "corner case"
 */
public class MatchRatingApproachEncoderTest extends StringEncoderAbstractTest<org.apache.commons.codec.language.MatchRatingApproachEncoder> {
    @Test
    public final void testAccentRemoval_AllLower_SuccessfullyRemoved() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemoval_AllLower_SuccessfullyRemoved");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,getStringEncoder(),632,getStringEncoder().removeAccents("áéíóú"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testAccentRemoval_WithSpaces_SuccessfullyRemovedAndSpacesInvariant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemoval_WithSpaces_SuccessfullyRemovedAndSpacesInvariant");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),647,getStringEncoder(),646,getStringEncoder().removeAccents("áé íó  ú"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testAccentRemoval_UpperandLower_SuccessfullyRemovedAndCaseInvariant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemoval_UpperandLower_SuccessfullyRemovedAndCaseInvariant");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,getStringEncoder(),644,getStringEncoder().removeAccents("ÁeíÓuu"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testAccentRemoval_MixedWithUnusualChars_SuccessfullyRemovedAndUnusualcharactersInvariant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemoval_MixedWithUnusualChars_SuccessfullyRemovedAndUnusualcharactersInvariant");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),639,getStringEncoder(),638,getStringEncoder().removeAccents("Á-e\'í.,ó&ú"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testAccentRemoval_GerSpanFrenMix_SuccessfullyRemoved() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemoval_GerSpanFrenMix_SuccessfullyRemoved");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,getStringEncoder(),636,getStringEncoder().removeAccents("äëöüßÄËÖÜñÑà"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testAccentRemoval_ComprehensiveAccentMix_AllSuccessfullyRemoved() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemoval_ComprehensiveAccentMix_AllSuccessfullyRemoved");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,getStringEncoder(),634,getStringEncoder().removeAccents("È,É,Ê,Ë,Û,Ù,Ï,Î,À,Â,Ô,è,é,ê,ë,û,ù,ï,î,à,â,ô,ç"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testAccentRemovalNormalString_NoChange() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemovalNormalString_NoChange");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,getStringEncoder(),630,getStringEncoder().removeAccents("Colorless green ideas sleep furiously"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testAccentRemoval_NINO_NoChange() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemoval_NINO_NoChange");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),641,getStringEncoder(),640,getStringEncoder().removeAccents(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testAccentRemoval_NullValue_ReturnNullSuccessfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccentRemoval_NullValue_ReturnNullSuccessfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,getStringEncoder(),642,getStringEncoder().removeAccents(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testRemoveSingleDoubleConsonants_BUBLE_RemovedSuccessfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveSingleDoubleConsonants_BUBLE_RemovedSuccessfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),769,getStringEncoder(),768,getStringEncoder().removeDoubleConsonants("BUBBLE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testRemoveDoubleConsonants_MISSISSIPPI_RemovedSuccessfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveDoubleConsonants_MISSISSIPPI_RemovedSuccessfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),765,getStringEncoder(),764,getStringEncoder().removeDoubleConsonants("MISSISSIPPI"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testRemoveDoubleDoubleVowel_BEETLE_NotRemoved() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveDoubleDoubleVowel_BEETLE_NotRemoved");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),767,getStringEncoder(),766,getStringEncoder().removeDoubleConsonants("BEETLE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testIsVowel_CapitalA_ReturnsTrue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsVowel_CapitalA_ReturnsTrue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,getStringEncoder(),760,getStringEncoder().isVowel("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testIsVowel_SmallD_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsVowel_SmallD_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),763,getStringEncoder(),762,getStringEncoder().isVowel("d"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testRemoveVowel_ALESSANDRA_Returns_ALSSNDR() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveVowel_ALESSANDRA_Returns_ALSSNDR");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),771,getStringEncoder(),770,getStringEncoder().removeVowels("ALESSANDRA"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testRemoveVowel__AIDAN_Returns_ADN() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveVowel__AIDAN_Returns_ADN");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),773,getStringEncoder(),772,getStringEncoder().removeVowels("AIDAN"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testRemoveVowel__DECLAN_Returns_DCLN() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveVowel__DECLAN_Returns_DCLN");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,getStringEncoder(),774,getStringEncoder().removeVowels("DECLAN"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetFirstLast3__ALEXANDER_Returns_Aleder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFirstLast3__ALEXANDER_Returns_Aleder");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),751,getStringEncoder(),750,getStringEncoder().getFirst3Last3("Alexzander"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetFirstLast3_PETE_Returns_PETE() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFirstLast3_PETE_Returns_PETE");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),749,getStringEncoder(),748,getStringEncoder().getFirst3Last3("PETE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testleftTorightThenRightToLeft_ALEXANDER_ALEXANDRA_Returns4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testleftTorightThenRightToLeft_ALEXANDER_ALEXANDRA_Returns4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),811,getStringEncoder(),810,getStringEncoder().leftToRightThenRightToLeftProcessing("ALEXANDER", "ALEXANDRA"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testleftTorightThenRightToLeft_EINSTEIN_MICHAELA_Returns0() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testleftTorightThenRightToLeft_EINSTEIN_MICHAELA_Returns0");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),813,getStringEncoder(),812,getStringEncoder().leftToRightThenRightToLeftProcessing("EINSTEIN", "MICHAELA"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetMinRating_7_Return4_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetMinRating_7_Return4_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,getStringEncoder(),758,getStringEncoder().getMinRating(7));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetMinRating_1_Returns5_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetMinRating_1_Returns5_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,getStringEncoder(),754,getStringEncoder().getMinRating(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetMinRating_2_Returns5_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetMinRating_2_Returns5_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,getStringEncoder(),756,getStringEncoder().getMinRating(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testgetMinRating_5_Returns4_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testgetMinRating_5_Returns4_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,getStringEncoder(),782,getStringEncoder().getMinRating(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testgetMinRating_5_Returns4_Successfully2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testgetMinRating_5_Returns4_Successfully2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,getStringEncoder(),784,getStringEncoder().getMinRating(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testgetMinRating_6_Returns4_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testgetMinRating_6_Returns4_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,getStringEncoder(),786,getStringEncoder().getMinRating(6));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testgetMinRating_7_Returns4_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testgetMinRating_7_Returns4_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,getStringEncoder(),788,getStringEncoder().getMinRating(7));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testgetMinRating_8_Returns3_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testgetMinRating_8_Returns3_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,getStringEncoder(),790,getStringEncoder().getMinRating(8));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testgetMinRating_10_Returns3_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testgetMinRating_10_Returns3_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,getStringEncoder(),778,getStringEncoder().getMinRating(10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testgetMinRating_11_Returns_3_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testgetMinRating_11_Returns_3_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,getStringEncoder(),780,getStringEncoder().getMinRating(11));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetMinRating_13_Returns_1_Successfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetMinRating_13_Returns_1_Successfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,getStringEncoder(),752,getStringEncoder().getMinRating(13));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testcleanName_SuccessfullyClean() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testcleanName_SuccessfullyClean");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,getStringEncoder(),776,getStringEncoder().cleanName("This-ís   a t.,es &t"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisVowel_SingleVowel_ReturnsTrue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisVowel_SingleVowel_ReturnsTrue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),809,getStringEncoder(),808,getStringEncoder().isVowel("I"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisEncodeEquals_CornerCase_SecondNameNothing_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisEncodeEquals_CornerCase_SecondNameNothing_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),805,getStringEncoder(),804,getStringEncoder().isEncodeEquals("test", ""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisEncodeEquals_CornerCase_FirstNameNothing_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisEncodeEquals_CornerCase_FirstNameNothing_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,getStringEncoder(),798,getStringEncoder().isEncodeEquals("", "test"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisEncodeEquals_CornerCase_SecondNameJustSpace_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisEncodeEquals_CornerCase_SecondNameJustSpace_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),803,getStringEncoder(),802,getStringEncoder().isEncodeEquals("test", " "));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisEncodeEquals_CornerCase_FirstNameJustSpace_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisEncodeEquals_CornerCase_FirstNameJustSpace_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,getStringEncoder(),796,getStringEncoder().isEncodeEquals(" ", "test"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisEncodeEquals_CornerCase_SecondNameNull_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisEncodeEquals_CornerCase_SecondNameNull_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),807,getStringEncoder(),806,getStringEncoder().isEncodeEquals("test", null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisEncodeEquals_CornerCase_FirstNameNull_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisEncodeEquals_CornerCase_FirstNameNull_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),801,getStringEncoder(),800,getStringEncoder().isEncodeEquals(null, "test"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisEncodeEquals_CornerCase_FirstNameJust1Letter_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisEncodeEquals_CornerCase_FirstNameJust1Letter_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,getStringEncoder(),794,getStringEncoder().isEncodeEquals("t", "test"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testisEncodeEqualsSecondNameJust1Letter_ReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testisEncodeEqualsSecondNameJust1Letter_ReturnsFalse");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,getStringEncoder(),792,getStringEncoder().isEncodeEquals("test", "t"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetEncoding_HARPER_HRPR() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetEncoding_HARPER_HRPR");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),735,getStringEncoder(),734,getStringEncoder().encode("HARPER"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetEncoding_SMITH_to_SMTH() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetEncoding_SMITH_to_SMTH");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),743,getStringEncoder(),742,getStringEncoder().encode("Smith"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetEncoding_SMYTH_to_SMYTH() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetEncoding_SMYTH_to_SMYTH");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,getStringEncoder(),744,getStringEncoder().encode("Smyth"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetEncoding_Space_to_Nothing() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetEncoding_Space_to_Nothing");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),747,getStringEncoder(),746,getStringEncoder().encode(" "));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetEncoding_NoSpace_to_Nothing() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetEncoding_NoSpace_to_Nothing");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),737,getStringEncoder(),736,getStringEncoder().encode(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetEncoding_Null_to_Nothing() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetEncoding_Null_to_Nothing");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),739,getStringEncoder(),738,getStringEncoder().encode(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testGetEncoding_One_Letter_to_Nothing() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetEncoding_One_Letter_to_Nothing");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,getStringEncoder(),740,getStringEncoder().encode("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompareNameNullSpace_ReturnsFalseSuccessfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompareNameNullSpace_ReturnsFalseSuccessfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,getStringEncoder(),648,getStringEncoder().isEncodeEquals(null, " "));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompareNameSameNames_ReturnsFalseSuccessfully() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompareNameSameNames_ReturnsFalseSuccessfully");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),651,getStringEncoder(),650,getStringEncoder().isEncodeEquals("John", "John"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_SMITH_SMYTH_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_SMITH_SMYTH_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),689,getStringEncoder(),688,getStringEncoder().isEncodeEquals("smith", "smyth"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_BURNS_BOURNE_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_BURNS_BOURNE_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),657,getStringEncoder(),656,getStringEncoder().isEncodeEquals("Burns", "Bourne"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_ShortNames_AL_ED_WorksButNoMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_ShortNames_AL_ED_WorksButNoMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),699,getStringEncoder(),698,getStringEncoder().isEncodeEquals("Al", "Ed"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_CATHERINE_KATHRYN_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_CATHERINE_KATHRYN_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,getStringEncoder(),658,getStringEncoder().isEncodeEquals("Catherine", "Kathryn"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_BRIAN_BRYAN_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_BRIAN_BRYAN_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),655,getStringEncoder(),654,getStringEncoder().isEncodeEquals("Brian", "Bryan"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_SEAN_SHAUN_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_SEAN_SHAUN_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,getStringEncoder(),686,getStringEncoder().isEncodeEquals("Séan", "Shaun"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_COLM_COLIN_WithAccentsAndSymbolsAndSpaces_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_COLM_COLIN_WithAccentsAndSymbolsAndSpaces_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),661,getStringEncoder(),660,getStringEncoder().isEncodeEquals("Cólm.   ", "C-olín"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_STEPHEN_STEVEN_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_STEPHEN_STEVEN_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),695,getStringEncoder(),694,getStringEncoder().isEncodeEquals("Stephen", "Steven"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_STEVEN_STEFAN_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_STEVEN_STEFAN_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),697,getStringEncoder(),696,getStringEncoder().isEncodeEquals("Steven", "Stefan"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_STEPHEN_STEFAN_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_STEPHEN_STEFAN_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),693,getStringEncoder(),692,getStringEncoder().isEncodeEquals("Stephen", "Stefan"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_SAM_SAMUEL_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_SAM_SAMUEL_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,getStringEncoder(),684,getStringEncoder().isEncodeEquals("Sam", "Samuel"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_MICKY_MICHAEL_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_MICKY_MICHAEL_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,getStringEncoder(),678,getStringEncoder().isEncodeEquals("Micky", "Michael"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_OONA_OONAGH_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_OONA_OONAGH_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),681,getStringEncoder(),680,getStringEncoder().isEncodeEquals("Oona", "Oonagh"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_SOPHIE_SOFIA_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_SOPHIE_SOFIA_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),691,getStringEncoder(),690,getStringEncoder().isEncodeEquals("Sophie", "Sofia"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_FRANCISZEK_FRANCES_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_FRANCISZEK_FRANCES_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),663,getStringEncoder(),662,getStringEncoder().isEncodeEquals("Franciszek", "Frances"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_TOMASZ_TOM_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_TOMASZ_TOM_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,getStringEncoder(),730,getStringEncoder().isEncodeEquals("Tomasz", "tom"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_SmallInput_CARK_Kl_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_SmallInput_CARK_Kl_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,getStringEncoder(),700,getStringEncoder().isEncodeEquals("Kl", "Karl"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompareNameToSingleLetter_KARL_C_DoesNotMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompareNameToSingleLetter_KARL_C_DoesNotMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),653,getStringEncoder(),652,getStringEncoder().isEncodeEquals("Karl", "C"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_ZACH_ZAKARIA_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_ZACH_ZAKARIA_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),733,getStringEncoder(),732,getStringEncoder().isEncodeEquals("Zach", "Zacharia"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_KARL_ALESSANDRO_DoesNotMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_KARL_ALESSANDRO_DoesNotMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,getStringEncoder(),670,getStringEncoder().isEncodeEquals("Karl", "Alessandro"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Forenames_UNA_OONAGH_ShouldSuccessfullyMatchButDoesNot() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Forenames_UNA_OONAGH_ShouldSuccessfullyMatchButDoesNot");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),669,getStringEncoder(),668,getStringEncoder().isEncodeEquals("Úna", "Oonagh"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_OSULLIVAN_OSUILLEABHAIN_SuccessfulMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_OSULLIVAN_OSUILLEABHAIN_SuccessfulMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),717,getStringEncoder(),716,getStringEncoder().isEncodeEquals("O\'Sullivan", "Ó \' Súilleabháin"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_LongSurnames_MORIARTY_OMUIRCHEARTAIGH_DoesNotSuccessfulMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_LongSurnames_MORIARTY_OMUIRCHEARTAIGH_DoesNotSuccessfulMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,getStringEncoder(),672,getStringEncoder().isEncodeEquals("Moriarty", "OMuircheartaigh"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_LongSurnames_OMUIRCHEARTAIGH_OMIREADHAIGH_SuccessfulMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_LongSurnames_OMUIRCHEARTAIGH_OMIREADHAIGH_SuccessfulMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,getStringEncoder(),674,getStringEncoder().isEncodeEquals("o\'muireadhaigh", "Ó \'Muircheartaigh "));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_COOPERFLYNN_SUPERLYN_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_COOPERFLYNN_SUPERLYN_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,getStringEncoder(),706,getStringEncoder().isEncodeEquals("Cooper-Flynn", "Super-Lyn"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_HAILEY_HALLEY_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_HAILEY_HALLEY_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,getStringEncoder(),708,getStringEncoder().isEncodeEquals("Hailey", "Halley"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_AUERBACH_UHRBACH_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_AUERBACH_UHRBACH_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,getStringEncoder(),704,getStringEncoder().isEncodeEquals("Auerbach", "Uhrbach"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_MOSKOWITZ_MOSKOVITZ_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_MOSKOWITZ_MOSKOVITZ_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),715,getStringEncoder(),714,getStringEncoder().isEncodeEquals("Moskowitz", "Moskovitz"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_LIPSHITZ_LIPPSZYC_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_LIPSHITZ_LIPPSZYC_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),713,getStringEncoder(),712,getStringEncoder().isEncodeEquals("LIPSHITZ", "LIPPSZYC"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_LEWINSKY_LEVINSKI_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_LEWINSKY_LEVINSKI_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),711,getStringEncoder(),710,getStringEncoder().isEncodeEquals("LEWINSKY", "LEVINSKI"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_SZLAMAWICZ_SHLAMOVITZ_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_SZLAMAWICZ_SHLAMOVITZ_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),723,getStringEncoder(),722,getStringEncoder().isEncodeEquals("SZLAMAWICZ", "SHLAMOVITZ"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_ROSOCHOWACIEC_ROSOKHOVATSETS_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_ROSOCHOWACIEC_ROSOKHOVATSETS_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),721,getStringEncoder(),720,getStringEncoder().isEncodeEquals("R o s o ch o w a c ie c", " R o s o k ho v a ts e ts"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surname_PRZEMYSL_PSHEMESHIL_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surname_PRZEMYSL_PSHEMESHIL_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),719,getStringEncoder(),718,getStringEncoder().isEncodeEquals(" P rz e m y s l", " P sh e m e sh i l"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_PETERSON_PETERS_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_PETERSON_PETERS_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),683,getStringEncoder(),682,getStringEncoder().isEncodeEquals("Peterson", "Peters"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_MCGOWAN_MCGEOGHEGAN_SuccessfullyMatched() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_MCGOWAN_MCGEOGHEGAN_SuccessfullyMatched");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),677,getStringEncoder(),676,getStringEncoder().isEncodeEquals("McGowan", "Mc Geoghegan"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_SurnamesCornerCase_MURPHY_Space_NoMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_SurnamesCornerCase_MURPHY_Space_NoMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,getStringEncoder(),726,getStringEncoder().isEncodeEquals("Murphy", " "));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_SurnamesCornerCase_MURPHY_NoSpace_NoMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_SurnamesCornerCase_MURPHY_NoSpace_NoMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),725,getStringEncoder(),724,getStringEncoder().isEncodeEquals("Murphy", ""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_SurnameCornerCase_Nulls_NoMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_SurnameCornerCase_Nulls_NoMatch");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,getStringEncoder(),702,getStringEncoder().isEncodeEquals(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Surnames_MURPHY_LYNCH_NoMatchExpected() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Surnames_MURPHY_LYNCH_NoMatchExpected");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),729,getStringEncoder(),728,getStringEncoder().isEncodeEquals("Murphy", "Lynch"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Forenames_SEAN_JOHN_MatchExpected() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Forenames_SEAN_JOHN_MatchExpected");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),665,getStringEncoder(),664,getStringEncoder().isEncodeEquals("Sean", "John"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public final void testCompare_Forenames_SEAN_PETE_NoMatchExpected() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompare_Forenames_SEAN_PETE_NoMatchExpected");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,getStringEncoder(),666,getStringEncoder().isEncodeEquals("Sean", "Pete"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    protected MatchRatingApproachEncoder createStringEncoder() {
        return new MatchRatingApproachEncoder();
    }
}

