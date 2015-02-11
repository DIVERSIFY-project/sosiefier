package org.apache.commons.codec.language.bm;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests BeiderMorseEncoder.
 * 
 * @since 1.6
 */
public class BeiderMorseEncoderTest extends StringEncoderAbstractTest<org.apache.commons.codec.StringEncoder> {
    private static final char[] TEST_CHARS = new char[]{ 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'o' , 'u' };

    private void assertNotEmpty(final BeiderMorseEncoder bmpm, final String value) throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),201,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),203,bmpm.encode(value),202,bmpm.encode(value).equals(""));
    }

    private BeiderMorseEncoder createGenericApproxEncoder() {
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.APPROX);
        return encoder;
    }

    @Override
    protected StringEncoder createStringEncoder() {
        return new BeiderMorseEncoder();
    }

    /** 
     * Tests we do not blow up.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testAllChars() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllChars");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c = Character.MIN_VALUE ; c < (Character.MAX_VALUE) ; c++) {
            bmpm.encode(Character.toString(c));
            bmpm.encode(Character.toString(c));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests we do not blow up.
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testAllChars_remove33() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllChars_remove33");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c = Character.MIN_VALUE ; c < (Character.MAX_VALUE) ; c++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAsciiEncodeNotEmpty1Letter() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsciiEncodeNotEmpty1Letter");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c = 'a' ; c <= 'z' ; c++) {
            final String value = Character.toString(c);
            final String valueU = value.toUpperCase();
            assertNotEmpty(bmpm, value);
            assertNotEmpty(bmpm, value);
            assertNotEmpty(bmpm, valueU);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAsciiEncodeNotEmpty1Letter_add52() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsciiEncodeNotEmpty1Letter_add52");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c = 'a' ; c <= 'z' ; c++) {
            final String value = Character.toString(c);
            final String valueU = value.toUpperCase();
            assertNotEmpty(bmpm, value);
            assertNotEmpty(bmpm, valueU);
            assertNotEmpty(bmpm, valueU);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAsciiEncodeNotEmpty1Letter_remove34() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsciiEncodeNotEmpty1Letter_remove34");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c = 'a' ; c <= 'z' ; c++) {
            final String value = Character.toString(c);
            final String valueU = value.toUpperCase();
            assertNotEmpty(bmpm, valueU);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAsciiEncodeNotEmpty1Letter_remove35() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsciiEncodeNotEmpty1Letter_remove35");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c = 'a' ; c <= 'z' ; c++) {
            final String value = Character.toString(c);
            final String valueU = value.toUpperCase();
            assertNotEmpty(bmpm, valueU);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAsciiEncodeNotEmpty2Letters() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsciiEncodeNotEmpty2Letters");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c1 = 'a' ; c1 <= 'z' ; c1++) {
            for (char c2 = 'a' ; c2 <= 'z' ; c2++) {
                final String value = new String(new char[]{ c1 , c2 });
                final String valueU = value.toUpperCase();
                assertNotEmpty(bmpm, value);
                assertNotEmpty(bmpm, value);
                assertNotEmpty(bmpm, valueU);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAsciiEncodeNotEmpty2Letters_add54() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsciiEncodeNotEmpty2Letters_add54");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c1 = 'a' ; c1 <= 'z' ; c1++) {
            for (char c2 = 'a' ; c2 <= 'z' ; c2++) {
                final String value = new String(new char[]{ c1 , c2 });
                final String valueU = value.toUpperCase();
                assertNotEmpty(bmpm, value);
                assertNotEmpty(bmpm, valueU);
                assertNotEmpty(bmpm, valueU);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAsciiEncodeNotEmpty2Letters_remove36() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsciiEncodeNotEmpty2Letters_remove36");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c1 = 'a' ; c1 <= 'z' ; c1++) {
            for (char c2 = 'a' ; c2 <= 'z' ; c2++) {
                final String value = new String(new char[]{ c1 , c2 });
                final String valueU = value.toUpperCase();
                assertNotEmpty(bmpm, valueU);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAsciiEncodeNotEmpty2Letters_remove37() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsciiEncodeNotEmpty2Letters_remove37");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        for (char c1 = 'a' ; c1 <= 'z' ; c1++) {
            for (char c2 = 'a' ; c2 <= 'z' ; c2++) {
                final String value = new String(new char[]{ c1 , c2 });
                final String valueU = value.toUpperCase();
                assertNotEmpty(bmpm, valueU);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeAtzNotEmpty_add55() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeAtzNotEmpty_add55");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String[] names = new String[]{ "ácz" , "átz" , "Ignácz" , "Ignátz" , "Ignác" };
        for (final String name : names) {
            assertNotEmpty(bmpm, name);
            assertNotEmpty(bmpm, name);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeAtzNotEmpty() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeAtzNotEmpty");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String[] names = new String[]{ "foo" , "átz" , "Ignácz" , "Ignátz" , "Ignác" };
        for (final String name : names) {
            assertNotEmpty(bmpm, name);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeAtzNotEmpty_literalMutation126() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeAtzNotEmpty_literalMutation126");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String[] names = new String[]{ "ácz" , "foo" , "Ignácz" , "Ignátz" , "Ignác" };
        for (final String name : names) {
            assertNotEmpty(bmpm, name);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeAtzNotEmpty_literalMutation127() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeAtzNotEmpty_literalMutation127");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String[] names = new String[]{ "ácz" , "átz" , "foo" , "Ignátz" , "Ignác" };
        for (final String name : names) {
            assertNotEmpty(bmpm, name);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeAtzNotEmpty_literalMutation128() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeAtzNotEmpty_literalMutation128");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String[] names = new String[]{ "ácz" , "átz" , "Ignácz" , "foo" , "Ignác" };
        for (final String name : names) {
            assertNotEmpty(bmpm, name);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeAtzNotEmpty_literalMutation129() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeAtzNotEmpty_literalMutation129");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String[] names = new String[]{ "ácz" , "átz" , "Ignácz" , "Ignátz" , "foo" };
        for (final String name : names) {
            assertNotEmpty(bmpm, name);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeAtzNotEmpty_remove38() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeAtzNotEmpty_remove38");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String[] names = new String[]{ "ácz" , "átz" , "Ignácz" , "Ignátz" , "Ignác" };
        for (final String name : names) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests https://issues.apache.org/jira/browse/CODEC-125?focusedCommentId=13071566&page=com.atlassian.jira.plugin.system.issuetabpanels:
     * comment-tabpanel#comment-13071566
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testEncodeGna_add56() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeGna_add56");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        bmpm.encode("gna");
        bmpm.encode("gna");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests https://issues.apache.org/jira/browse/CODEC-125?focusedCommentId=13071566&page=com.atlassian.jira.plugin.system.issuetabpanels:
     * comment-tabpanel#comment-13071566
     * 
     * @throws EncoderException
     */
@Test
    public void testEncodeGna() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeGna");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        bmpm.encode("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests https://issues.apache.org/jira/browse/CODEC-125?focusedCommentId=13071566&page=com.atlassian.jira.plugin.system.issuetabpanels:
     * comment-tabpanel#comment-13071566
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testEncodeGna_remove39() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeGna_remove39");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInvalidLangIllegalArgumentException_add57() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLangIllegalArgumentException_add57");
        Rule.getInstance(org.apache.commons.codec.language.bm.NameType.GENERIC, org.apache.commons.codec.language.bm.RuleType.APPROX, "noSuchLanguage");
        Rule.getInstance(org.apache.commons.codec.language.bm.NameType.GENERIC, org.apache.commons.codec.language.bm.RuleType.APPROX, "noSuchLanguage");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLangIllegalArgumentException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLangIllegalArgumentException");
        Rule.getInstance(org.apache.commons.codec.language.bm.NameType.GENERIC, org.apache.commons.codec.language.bm.RuleType.APPROX, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInvalidLangIllegalArgumentException_remove40() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLangIllegalArgumentException_remove40");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalStateException.class, timeout = 1000)
    public void testInvalidLangIllegalStateException_add58() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLangIllegalStateException_add58");
        org.apache.commons.codec.language.bm.Lang.loadFromResource("thisIsAMadeUpResourceName", Languages.getInstance(org.apache.commons.codec.language.bm.NameType.GENERIC));
        org.apache.commons.codec.language.bm.Lang.loadFromResource("thisIsAMadeUpResourceName", Languages.getInstance(org.apache.commons.codec.language.bm.NameType.GENERIC));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidLangIllegalStateException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLangIllegalStateException");
        org.apache.commons.codec.language.bm.Lang.loadFromResource("foo", Languages.getInstance(org.apache.commons.codec.language.bm.NameType.GENERIC));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalStateException.class, timeout = 1000)
    public void testInvalidLangIllegalStateException_remove41() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLangIllegalStateException_remove41");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInvalidLanguageIllegalArgumentException_add59() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLanguageIllegalArgumentException_add59");
        Languages.getInstance("thereIsNoSuchLanguage");
        Languages.getInstance("thereIsNoSuchLanguage");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLanguageIllegalArgumentException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLanguageIllegalArgumentException");
        Languages.getInstance("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInvalidLanguageIllegalArgumentException_remove42() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidLanguageIllegalArgumentException_remove42");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongestEnglishSurname_add60() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestEnglishSurname_add60");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        bmpm.encode("MacGhilleseatheanaich");
        bmpm.encode("MacGhilleseatheanaich");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 10000L)
    public void testLongestEnglishSurname() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestEnglishSurname");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        bmpm.encode("MacGhilleseatheanaich");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 10000L)
    public void testLongestEnglishSurname_literalMutation135() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestEnglishSurname_literalMutation135");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        bmpm.encode("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongestEnglishSurname_remove43() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestEnglishSurname_remove43");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class, timeout = 1000)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException_add61() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeIndexForRuleMatchIndexOutOfBoundsException_add61");
        final Rule r = new Rule("a" , "" , "" , new Rule.Phoneme("" , Languages.ANY_LANGUAGE));
        r.patternAndContextMatches("bob", -1);
        r.patternAndContextMatches("bob", -1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeIndexForRuleMatchIndexOutOfBoundsException");
        final Rule r = new Rule("foo" , "" , "" , new Rule.Phoneme("" , Languages.ANY_LANGUAGE));
        r.patternAndContextMatches("bob", -1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation137");
        final Rule r = new Rule("a" , "foo" , "" , new Rule.Phoneme("" , Languages.ANY_LANGUAGE));
        r.patternAndContextMatches("bob", -1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation138");
        final Rule r = new Rule("a" , "" , "foo" , new Rule.Phoneme("" , Languages.ANY_LANGUAGE));
        r.patternAndContextMatches("bob", -1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation139");
        final Rule r = new Rule("a" , "" , "" , new Rule.Phoneme("foo" , Languages.ANY_LANGUAGE));
        r.patternAndContextMatches("bob", -1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation140");
        final Rule r = new Rule("a" , "" , "" , new Rule.Phoneme("" , Languages.ANY_LANGUAGE));
        r.patternAndContextMatches("foo", -1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeIndexForRuleMatchIndexOutOfBoundsException_literalMutation141");
        final Rule r = new Rule("a" , "" , "" , new Rule.Phoneme("" , Languages.ANY_LANGUAGE));
        r.patternAndContextMatches("bob", 0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class, timeout = 1000)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException_remove44() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeIndexForRuleMatchIndexOutOfBoundsException_remove44");
        final Rule r = new Rule("a" , "" , "" , new Rule.Phoneme("" , Languages.ANY_LANGUAGE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOOM_add62() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_add62");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOOM_add63() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_add63");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOOM_add64() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_add64");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(10);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testOOM() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM");
        final String phrase = "foo" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testOOM_literalMutation143() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_literalMutation143");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("foo" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testOOM_literalMutation144() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_literalMutation144");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "foo");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testOOM_literalMutation145() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_literalMutation145");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(9);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testOOM_literalMutation146() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_literalMutation146");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOOM_remove45() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_remove45");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOOM_remove46() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_remove46");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setMaxPhonemes(10);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testOOM_remove47() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOOM_remove47");
        final String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(org.apache.commons.codec.language.bm.NameType.GENERIC);
        encoder.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        final String phonemes = encoder.encode(phrase);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),204,((phonemes.length()) > 0));
        final String[] phonemeArr = phonemes.split("\\|");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),205,((phonemeArr.length) <= 10));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetConcat_add65() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetConcat_add65");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        bmpm.setConcat(false);
        bmpm.setConcat(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),207,bmpm,206,bmpm.isConcat());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSetConcat() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetConcat");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        bmpm.setConcat(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),207,bmpm,206,bmpm.isConcat());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetConcat_remove48() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetConcat_remove48");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),207,bmpm,206,bmpm.isConcat());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetNameTypeAsh() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetNameTypeAsh");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        bmpm.setNameType(org.apache.commons.codec.language.bm.NameType.ASHKENAZI);
        bmpm.setNameType(org.apache.commons.codec.language.bm.NameType.ASHKENAZI);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),208,org.apache.commons.codec.language.bm.NameType.ASHKENAZI);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),210,bmpm,209,bmpm.getNameType());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetNameTypeAsh_remove49() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetNameTypeAsh_remove49");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),208,org.apache.commons.codec.language.bm.NameType.ASHKENAZI);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),210,bmpm,209,bmpm.getNameType());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetRuleTypeExact() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetRuleTypeExact");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        bmpm.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        bmpm.setRuleType(org.apache.commons.codec.language.bm.RuleType.EXACT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),211,org.apache.commons.codec.language.bm.RuleType.EXACT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),213,bmpm,212,bmpm.getRuleType());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetRuleTypeExact_remove50() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetRuleTypeExact_remove50");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),211,org.apache.commons.codec.language.bm.RuleType.EXACT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),213,bmpm,212,bmpm.getRuleType());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSetRuleTypeToRulesIllegalArgumentException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetRuleTypeToRulesIllegalArgumentException");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        bmpm.setRuleType(org.apache.commons.codec.language.bm.RuleType.RULES);
        bmpm.setRuleType(org.apache.commons.codec.language.bm.RuleType.RULES);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSetRuleTypeToRulesIllegalArgumentException_remove51() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetRuleTypeToRulesIllegalArgumentException_remove51");
        final BeiderMorseEncoder bmpm = new BeiderMorseEncoder();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testSpeedCheck_add69() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_add69");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 0, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testSpeedCheck_add70() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_add70");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 0, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testSpeedCheck_add71() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_add71");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 0, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test
    public void testSpeedCheck() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[-1]);
        for (int i = 0, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test
    public void testSpeedCheck_literalMutation149() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_literalMutation149");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 1, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test
    public void testSpeedCheck_literalMutation150() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_literalMutation150");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 0, j = 2 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test
    public void testSpeedCheck_literalMutation151() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_literalMutation151");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 0, j = 1 ; i < 41 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test
    public void testSpeedCheck_literalMutation152() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_literalMutation152");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 0, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 1;
            } 
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testSpeedCheck_remove52() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_remove52");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testSpeedCheck_remove53() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_remove53");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 0, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            stringBuffer.append(TEST_CHARS[j]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testSpeedCheck_remove54() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck_remove54");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(TEST_CHARS[0]);
        for (int i = 0, j = 1 ; i < 40 ; i++ , j++) {
            if (j == (TEST_CHARS.length)) {
                j = 0;
            } 
            bmpm.encode(stringBuffer.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpeedCheck2_add72() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck2_add72");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "ItstheendoftheworldasweknowitandIfeelfine";
        for (int i = 1 ; i <= (phrase.length()) ; i++) {
            bmpm.encode(phrase.subSequence(0, i));
            bmpm.encode(phrase.subSequence(0, i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpeedCheck2() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck2");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "foo";
        for (int i = 1 ; i <= (phrase.length()) ; i++) {
            bmpm.encode(phrase.subSequence(0, i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpeedCheck2_literalMutation154() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck2_literalMutation154");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "ItstheendoftheworldasweknowitandIfeelfine";
        for (int i = 2 ; i <= (phrase.length()) ; i++) {
            bmpm.encode(phrase.subSequence(0, i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpeedCheck2_literalMutation155() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck2_literalMutation155");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "ItstheendoftheworldasweknowitandIfeelfine";
        for (int i = 1 ; i <= (phrase.length()) ; i++) {
            bmpm.encode(phrase.subSequence(-1, i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpeedCheck2_remove55() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck2_remove55");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "ItstheendoftheworldasweknowitandIfeelfine";
        for (int i = 1 ; i <= (phrase.length()) ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpeedCheck3_add73() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck3_add73");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        for (int i = 1 ; i <= (phrase.length()) ; i++) {
            bmpm.encode(phrase.subSequence(0, i));
            bmpm.encode(phrase.subSequence(0, i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpeedCheck3() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck3");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "foo";
        for (int i = 1 ; i <= (phrase.length()) ; i++) {
            bmpm.encode(phrase.subSequence(0, i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpeedCheck3_literalMutation157() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck3_literalMutation157");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        for (int i = 0 ; i <= (phrase.length()) ; i++) {
            bmpm.encode(phrase.subSequence(0, i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSpeedCheck3_literalMutation158() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck3_literalMutation158");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        for (int i = 1 ; i <= (phrase.length()) ; i++) {
            bmpm.encode(phrase.subSequence(1, i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSpeedCheck3_remove56() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSpeedCheck3_remove56");
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        final String phrase = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        for (int i = 1 ; i <= (phrase.length()) ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

