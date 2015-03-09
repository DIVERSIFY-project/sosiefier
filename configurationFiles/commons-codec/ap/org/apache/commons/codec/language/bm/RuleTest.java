package org.apache.commons.codec.language.bm;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;

/** 
 * Tests Rule.
 * 
 * @since 1.6
 */
public class RuleTest {
    private static class NegativeIntegerBaseMatcher extends BaseMatcher<java.lang.Integer> {
        @Override
        public void describeTo(final Description description) {
            description.appendText("value should be negative");
        }

        @Override
        public boolean matches(final Object item) {
            return (((Integer)(item)).intValue()) < 0;
        }
    }

    private Rule.Phoneme[][] makePhonemes() {
        final String[][] words = new String[][]{ new String[]{ "rinD" , "rinDlt" , "rina" , "rinalt" , "rino" , "rinolt" , "rinu" , "rinult" } , new String[]{ "dortlaj" , "dortlej" , "ortlaj" , "ortlej" , "ortlej-dortlaj" } };
        final Rule.Phoneme[][] phonemes = new Rule.Phoneme[words.length][];
        for (int i = 0 ; i < (words.length) ; i++) {
            final String[] words_i = words[i];
            final Rule.Phoneme[] phonemes_i = phonemes[i] = new Rule.Phoneme[words_i.length];
            for (int j = 0 ; j < (words_i.length) ; j++) {
                phonemes_i[j] = new Rule.Phoneme(words_i[j] , Languages.NO_LANGUAGES);
            }
        }
        return phonemes;
    }

    @Test
    public void testPhonemeComparedToLaterIsNegative() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPhonemeComparedToLaterIsNegative");
        for (final Rule.Phoneme[] phs : makePhonemes()) {
            for (int i = 1 ; i < (phs.length) ; i++) {
                for (int j = i + 1 ; j < (phs.length) ; j++) {
                    final int c = Rule.Phoneme.COMPARATOR.compare(phs[i], phs[j]);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,(((("Comparing " + (phs[i].getPhonemeText())) + " to ") + (phs[j].getPhonemeText())) + " should be negative"));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,null,350,java.lang.Integer.valueOf(c));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,new org.apache.commons.codec.language.bm.RuleTest.NegativeIntegerBaseMatcher());
                }
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPhonemeComparedToLaterIsNegative_literalMutation319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPhonemeComparedToLaterIsNegative_literalMutation319");
        for (final Rule.Phoneme[] phs : makePhonemes()) {
            for (int i = -1 ; i < (phs.length) ; i++) {
                for (int j = i + 1 ; j < (phs.length) ; j++) {
                    final int c = Rule.Phoneme.COMPARATOR.compare(phs[i], phs[j]);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,(((("Comparing " + (phs[i].getPhonemeText())) + " to ") + (phs[j].getPhonemeText())) + " should be negative"));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,null,350,java.lang.Integer.valueOf(c));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,new org.apache.commons.codec.language.bm.RuleTest.NegativeIntegerBaseMatcher());
                }
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPhonemeComparedToLaterIsNegative_literalMutation320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPhonemeComparedToLaterIsNegative_literalMutation320");
        for (final Rule.Phoneme[] phs : makePhonemes()) {
            for (int i = 0 ; i < (phs.length) ; i++) {
                for (int j = i + 1 ; j < (phs.length) ; j++) {
                    final int c = Rule.Phoneme.COMPARATOR.compare(phs[i], phs[j]);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,(((("Comparing " + (phs[i].getPhonemeText())) + " to ") + (phs[j].getPhonemeText())) + " should be negative"));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,null,350,java.lang.Integer.valueOf(c));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,new org.apache.commons.codec.language.bm.RuleTest.NegativeIntegerBaseMatcher());
                }
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPhonemeComparedToLaterIsNegative_literalMutation321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPhonemeComparedToLaterIsNegative_literalMutation321");
        for (final Rule.Phoneme[] phs : makePhonemes()) {
            for (int i = 0 ; i < (phs.length) ; i++) {
                for (int j = i + 2 ; j < (phs.length) ; j++) {
                    final int c = Rule.Phoneme.COMPARATOR.compare(phs[i], phs[j]);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,(((("Comparing " + (phs[i].getPhonemeText())) + " to ") + (phs[j].getPhonemeText())) + " should be negative"));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,null,350,java.lang.Integer.valueOf(c));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,new org.apache.commons.codec.language.bm.RuleTest.NegativeIntegerBaseMatcher());
                }
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPhonemeComparedToLaterIsNegative_literalMutation322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPhonemeComparedToLaterIsNegative_literalMutation322");
        for (final Rule.Phoneme[] phs : makePhonemes()) {
            for (int i = 0 ; i < (phs.length) ; i++) {
                for (int j = i + 0 ; j < (phs.length) ; j++) {
                    final int c = Rule.Phoneme.COMPARATOR.compare(phs[i], phs[j]);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,(((("Comparing " + (phs[i].getPhonemeText())) + " to ") + (phs[j].getPhonemeText())) + " should be negative"));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,null,350,java.lang.Integer.valueOf(c));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,new org.apache.commons.codec.language.bm.RuleTest.NegativeIntegerBaseMatcher());
                }
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPhonemeComparedToLaterIsNegative_literalMutation323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPhonemeComparedToLaterIsNegative_literalMutation323");
        for (final Rule.Phoneme[] phs : makePhonemes()) {
            for (int i = 0 ; i < (phs.length) ; i++) {
                for (int j = i + 0 ; j < (phs.length) ; j++) {
                    final int c = Rule.Phoneme.COMPARATOR.compare(phs[i], phs[j]);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,(((("Comparing " + (phs[i].getPhonemeText())) + " to ") + (phs[j].getPhonemeText())) + " should be negative"));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,null,350,java.lang.Integer.valueOf(c));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,new org.apache.commons.codec.language.bm.RuleTest.NegativeIntegerBaseMatcher());
                }
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPhonemeComparedToSelfIsZero() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPhonemeComparedToSelfIsZero");
        for (final Rule.Phoneme[] phs : makePhonemes()) {
            for (final Rule.Phoneme ph : phs) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,("Phoneme compared to itself should be zero: " + (ph.getPhonemeText())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),355,org.apache.commons.codec.language.bm.Rule.Phoneme.COMPARATOR,354,org.apache.commons.codec.language.bm.Rule.Phoneme.COMPARATOR.compare(ph, ph));
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSubSequenceWorks() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubSequenceWorks");
        final Rule.Phoneme a = new Rule.Phoneme("foo" , null);
        final Rule.Phoneme b = new Rule.Phoneme("b" , null);
        final Rule.Phoneme cd = new Rule.Phoneme("cd" , null);
        final Rule.Phoneme ef = new Rule.Phoneme("ef" , null);
        final Rule.Phoneme ghi = new Rule.Phoneme("ghi" , null);
        final Rule.Phoneme jkl = new Rule.Phoneme("jkl" , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),357,a.getPhonemeText(),356,a.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),359,b.getPhonemeText(),358,b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),361,cd.getPhonemeText(),360,cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),363,cd.getPhonemeText(),362,cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,ef.getPhonemeText(),364,ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ef.getPhonemeText(),366,ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ghi.getPhonemeText(),368,ghi.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ghi.getPhonemeText(),370,ghi.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,ghi.getPhonemeText(),372,ghi.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,jkl.getPhonemeText(),374,jkl.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),377,jkl.getPhonemeText(),376,jkl.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),379,jkl.getPhonemeText(),378,jkl.getPhonemeText().charAt(2));
        final Rule.Phoneme a_b = new Rule.Phoneme(a , b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),381,a_b.getPhonemeText(),380,a_b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),383,a_b.getPhonemeText(),382,a_b.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),385,a_b.getPhonemeText().subSequence(0, 2),384,a_b.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),387,a_b.getPhonemeText().subSequence(0, 1),386,a_b.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),389,a_b.getPhonemeText().subSequence(1, 2),388,a_b.getPhonemeText().subSequence(1, 2).toString());
        final Rule.Phoneme cd_ef = new Rule.Phoneme(cd , ef);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),391,cd_ef.getPhonemeText(),390,cd_ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,cd_ef.getPhonemeText(),392,cd_ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),395,cd_ef.getPhonemeText(),394,cd_ef.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,cd_ef.getPhonemeText(),396,cd_ef.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,cd_ef.getPhonemeText().subSequence(0, 1),398,cd_ef.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,cd_ef.getPhonemeText().subSequence(1, 2),400,cd_ef.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,cd_ef.getPhonemeText().subSequence(2, 3),402,cd_ef.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,cd_ef.getPhonemeText().subSequence(3, 4),404,cd_ef.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,cd_ef.getPhonemeText().subSequence(0, 2),406,cd_ef.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,cd_ef.getPhonemeText().subSequence(1, 3),408,cd_ef.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,cd_ef.getPhonemeText().subSequence(2, 4),410,cd_ef.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,cd_ef.getPhonemeText().subSequence(0, 3),412,cd_ef.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,cd_ef.getPhonemeText().subSequence(1, 4),414,cd_ef.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,cd_ef.getPhonemeText().subSequence(0, 4),416,cd_ef.getPhonemeText().subSequence(0, 4).toString());
        final Rule.Phoneme a_b_cd = new Rule.Phoneme(new Rule.Phoneme(a , b) , cd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,a_b_cd.getPhonemeText(),418,a_b_cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,a_b_cd.getPhonemeText(),420,a_b_cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,a_b_cd.getPhonemeText(),422,a_b_cd.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),425,a_b_cd.getPhonemeText(),424,a_b_cd.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),427,a_b_cd.getPhonemeText().subSequence(0, 1),426,a_b_cd.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),429,a_b_cd.getPhonemeText().subSequence(1, 2),428,a_b_cd.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,a_b_cd.getPhonemeText().subSequence(2, 3),430,a_b_cd.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,a_b_cd.getPhonemeText().subSequence(3, 4),432,a_b_cd.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,a_b_cd.getPhonemeText().subSequence(0, 2),434,a_b_cd.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,a_b_cd.getPhonemeText().subSequence(1, 3),436,a_b_cd.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,a_b_cd.getPhonemeText().subSequence(2, 4),438,a_b_cd.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),441,a_b_cd.getPhonemeText().subSequence(0, 3),440,a_b_cd.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),443,a_b_cd.getPhonemeText().subSequence(1, 4),442,a_b_cd.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),445,a_b_cd.getPhonemeText().subSequence(0, 4),444,a_b_cd.getPhonemeText().subSequence(0, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSubSequenceWorks_literalMutation326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubSequenceWorks_literalMutation326");
        final Rule.Phoneme a = new Rule.Phoneme("a" , null);
        final Rule.Phoneme b = new Rule.Phoneme("bar" , null);
        final Rule.Phoneme cd = new Rule.Phoneme("cd" , null);
        final Rule.Phoneme ef = new Rule.Phoneme("ef" , null);
        final Rule.Phoneme ghi = new Rule.Phoneme("ghi" , null);
        final Rule.Phoneme jkl = new Rule.Phoneme("jkl" , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),357,a.getPhonemeText(),356,a.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),359,b.getPhonemeText(),358,b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),361,cd.getPhonemeText(),360,cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),363,cd.getPhonemeText(),362,cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,ef.getPhonemeText(),364,ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ef.getPhonemeText(),366,ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ghi.getPhonemeText(),368,ghi.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ghi.getPhonemeText(),370,ghi.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,ghi.getPhonemeText(),372,ghi.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,jkl.getPhonemeText(),374,jkl.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),377,jkl.getPhonemeText(),376,jkl.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),379,jkl.getPhonemeText(),378,jkl.getPhonemeText().charAt(2));
        final Rule.Phoneme a_b = new Rule.Phoneme(a , b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),381,a_b.getPhonemeText(),380,a_b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),383,a_b.getPhonemeText(),382,a_b.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),385,a_b.getPhonemeText().subSequence(0, 2),384,a_b.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),387,a_b.getPhonemeText().subSequence(0, 1),386,a_b.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),389,a_b.getPhonemeText().subSequence(1, 2),388,a_b.getPhonemeText().subSequence(1, 2).toString());
        final Rule.Phoneme cd_ef = new Rule.Phoneme(cd , ef);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),391,cd_ef.getPhonemeText(),390,cd_ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,cd_ef.getPhonemeText(),392,cd_ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),395,cd_ef.getPhonemeText(),394,cd_ef.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,cd_ef.getPhonemeText(),396,cd_ef.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,cd_ef.getPhonemeText().subSequence(0, 1),398,cd_ef.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,cd_ef.getPhonemeText().subSequence(1, 2),400,cd_ef.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,cd_ef.getPhonemeText().subSequence(2, 3),402,cd_ef.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,cd_ef.getPhonemeText().subSequence(3, 4),404,cd_ef.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,cd_ef.getPhonemeText().subSequence(0, 2),406,cd_ef.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,cd_ef.getPhonemeText().subSequence(1, 3),408,cd_ef.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,cd_ef.getPhonemeText().subSequence(2, 4),410,cd_ef.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,cd_ef.getPhonemeText().subSequence(0, 3),412,cd_ef.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,cd_ef.getPhonemeText().subSequence(1, 4),414,cd_ef.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,cd_ef.getPhonemeText().subSequence(0, 4),416,cd_ef.getPhonemeText().subSequence(0, 4).toString());
        final Rule.Phoneme a_b_cd = new Rule.Phoneme(new Rule.Phoneme(a , b) , cd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,a_b_cd.getPhonemeText(),418,a_b_cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,a_b_cd.getPhonemeText(),420,a_b_cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,a_b_cd.getPhonemeText(),422,a_b_cd.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),425,a_b_cd.getPhonemeText(),424,a_b_cd.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),427,a_b_cd.getPhonemeText().subSequence(0, 1),426,a_b_cd.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),429,a_b_cd.getPhonemeText().subSequence(1, 2),428,a_b_cd.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,a_b_cd.getPhonemeText().subSequence(2, 3),430,a_b_cd.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,a_b_cd.getPhonemeText().subSequence(3, 4),432,a_b_cd.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,a_b_cd.getPhonemeText().subSequence(0, 2),434,a_b_cd.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,a_b_cd.getPhonemeText().subSequence(1, 3),436,a_b_cd.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,a_b_cd.getPhonemeText().subSequence(2, 4),438,a_b_cd.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),441,a_b_cd.getPhonemeText().subSequence(0, 3),440,a_b_cd.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),443,a_b_cd.getPhonemeText().subSequence(1, 4),442,a_b_cd.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),445,a_b_cd.getPhonemeText().subSequence(0, 4),444,a_b_cd.getPhonemeText().subSequence(0, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSubSequenceWorks_literalMutation328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubSequenceWorks_literalMutation328");
        final Rule.Phoneme a = new Rule.Phoneme("a" , null);
        final Rule.Phoneme b = new Rule.Phoneme("b" , null);
        final Rule.Phoneme cd = new Rule.Phoneme("bar" , null);
        final Rule.Phoneme ef = new Rule.Phoneme("ef" , null);
        final Rule.Phoneme ghi = new Rule.Phoneme("ghi" , null);
        final Rule.Phoneme jkl = new Rule.Phoneme("jkl" , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),357,a.getPhonemeText(),356,a.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),359,b.getPhonemeText(),358,b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),361,cd.getPhonemeText(),360,cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),363,cd.getPhonemeText(),362,cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,ef.getPhonemeText(),364,ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ef.getPhonemeText(),366,ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ghi.getPhonemeText(),368,ghi.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ghi.getPhonemeText(),370,ghi.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,ghi.getPhonemeText(),372,ghi.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,jkl.getPhonemeText(),374,jkl.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),377,jkl.getPhonemeText(),376,jkl.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),379,jkl.getPhonemeText(),378,jkl.getPhonemeText().charAt(2));
        final Rule.Phoneme a_b = new Rule.Phoneme(a , b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),381,a_b.getPhonemeText(),380,a_b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),383,a_b.getPhonemeText(),382,a_b.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),385,a_b.getPhonemeText().subSequence(0, 2),384,a_b.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),387,a_b.getPhonemeText().subSequence(0, 1),386,a_b.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),389,a_b.getPhonemeText().subSequence(1, 2),388,a_b.getPhonemeText().subSequence(1, 2).toString());
        final Rule.Phoneme cd_ef = new Rule.Phoneme(cd , ef);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),391,cd_ef.getPhonemeText(),390,cd_ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,cd_ef.getPhonemeText(),392,cd_ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),395,cd_ef.getPhonemeText(),394,cd_ef.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,cd_ef.getPhonemeText(),396,cd_ef.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,cd_ef.getPhonemeText().subSequence(0, 1),398,cd_ef.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,cd_ef.getPhonemeText().subSequence(1, 2),400,cd_ef.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,cd_ef.getPhonemeText().subSequence(2, 3),402,cd_ef.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,cd_ef.getPhonemeText().subSequence(3, 4),404,cd_ef.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,cd_ef.getPhonemeText().subSequence(0, 2),406,cd_ef.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,cd_ef.getPhonemeText().subSequence(1, 3),408,cd_ef.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,cd_ef.getPhonemeText().subSequence(2, 4),410,cd_ef.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,cd_ef.getPhonemeText().subSequence(0, 3),412,cd_ef.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,cd_ef.getPhonemeText().subSequence(1, 4),414,cd_ef.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,cd_ef.getPhonemeText().subSequence(0, 4),416,cd_ef.getPhonemeText().subSequence(0, 4).toString());
        final Rule.Phoneme a_b_cd = new Rule.Phoneme(new Rule.Phoneme(a , b) , cd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,a_b_cd.getPhonemeText(),418,a_b_cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,a_b_cd.getPhonemeText(),420,a_b_cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,a_b_cd.getPhonemeText(),422,a_b_cd.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),425,a_b_cd.getPhonemeText(),424,a_b_cd.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),427,a_b_cd.getPhonemeText().subSequence(0, 1),426,a_b_cd.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),429,a_b_cd.getPhonemeText().subSequence(1, 2),428,a_b_cd.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,a_b_cd.getPhonemeText().subSequence(2, 3),430,a_b_cd.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,a_b_cd.getPhonemeText().subSequence(3, 4),432,a_b_cd.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,a_b_cd.getPhonemeText().subSequence(0, 2),434,a_b_cd.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,a_b_cd.getPhonemeText().subSequence(1, 3),436,a_b_cd.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,a_b_cd.getPhonemeText().subSequence(2, 4),438,a_b_cd.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),441,a_b_cd.getPhonemeText().subSequence(0, 3),440,a_b_cd.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),443,a_b_cd.getPhonemeText().subSequence(1, 4),442,a_b_cd.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),445,a_b_cd.getPhonemeText().subSequence(0, 4),444,a_b_cd.getPhonemeText().subSequence(0, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSubSequenceWorks_literalMutation330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubSequenceWorks_literalMutation330");
        final Rule.Phoneme a = new Rule.Phoneme("a" , null);
        final Rule.Phoneme b = new Rule.Phoneme("b" , null);
        final Rule.Phoneme cd = new Rule.Phoneme("cd" , null);
        final Rule.Phoneme ef = new Rule.Phoneme("foo" , null);
        final Rule.Phoneme ghi = new Rule.Phoneme("ghi" , null);
        final Rule.Phoneme jkl = new Rule.Phoneme("jkl" , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),357,a.getPhonemeText(),356,a.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),359,b.getPhonemeText(),358,b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),361,cd.getPhonemeText(),360,cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),363,cd.getPhonemeText(),362,cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,ef.getPhonemeText(),364,ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ef.getPhonemeText(),366,ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ghi.getPhonemeText(),368,ghi.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ghi.getPhonemeText(),370,ghi.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,ghi.getPhonemeText(),372,ghi.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,jkl.getPhonemeText(),374,jkl.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),377,jkl.getPhonemeText(),376,jkl.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),379,jkl.getPhonemeText(),378,jkl.getPhonemeText().charAt(2));
        final Rule.Phoneme a_b = new Rule.Phoneme(a , b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),381,a_b.getPhonemeText(),380,a_b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),383,a_b.getPhonemeText(),382,a_b.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),385,a_b.getPhonemeText().subSequence(0, 2),384,a_b.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),387,a_b.getPhonemeText().subSequence(0, 1),386,a_b.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),389,a_b.getPhonemeText().subSequence(1, 2),388,a_b.getPhonemeText().subSequence(1, 2).toString());
        final Rule.Phoneme cd_ef = new Rule.Phoneme(cd , ef);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),391,cd_ef.getPhonemeText(),390,cd_ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,cd_ef.getPhonemeText(),392,cd_ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),395,cd_ef.getPhonemeText(),394,cd_ef.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,cd_ef.getPhonemeText(),396,cd_ef.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,cd_ef.getPhonemeText().subSequence(0, 1),398,cd_ef.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,cd_ef.getPhonemeText().subSequence(1, 2),400,cd_ef.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,cd_ef.getPhonemeText().subSequence(2, 3),402,cd_ef.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,cd_ef.getPhonemeText().subSequence(3, 4),404,cd_ef.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,cd_ef.getPhonemeText().subSequence(0, 2),406,cd_ef.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,cd_ef.getPhonemeText().subSequence(1, 3),408,cd_ef.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,cd_ef.getPhonemeText().subSequence(2, 4),410,cd_ef.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,cd_ef.getPhonemeText().subSequence(0, 3),412,cd_ef.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,cd_ef.getPhonemeText().subSequence(1, 4),414,cd_ef.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,cd_ef.getPhonemeText().subSequence(0, 4),416,cd_ef.getPhonemeText().subSequence(0, 4).toString());
        final Rule.Phoneme a_b_cd = new Rule.Phoneme(new Rule.Phoneme(a , b) , cd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,a_b_cd.getPhonemeText(),418,a_b_cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,a_b_cd.getPhonemeText(),420,a_b_cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,a_b_cd.getPhonemeText(),422,a_b_cd.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),425,a_b_cd.getPhonemeText(),424,a_b_cd.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),427,a_b_cd.getPhonemeText().subSequence(0, 1),426,a_b_cd.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),429,a_b_cd.getPhonemeText().subSequence(1, 2),428,a_b_cd.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,a_b_cd.getPhonemeText().subSequence(2, 3),430,a_b_cd.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,a_b_cd.getPhonemeText().subSequence(3, 4),432,a_b_cd.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,a_b_cd.getPhonemeText().subSequence(0, 2),434,a_b_cd.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,a_b_cd.getPhonemeText().subSequence(1, 3),436,a_b_cd.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,a_b_cd.getPhonemeText().subSequence(2, 4),438,a_b_cd.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),441,a_b_cd.getPhonemeText().subSequence(0, 3),440,a_b_cd.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),443,a_b_cd.getPhonemeText().subSequence(1, 4),442,a_b_cd.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),445,a_b_cd.getPhonemeText().subSequence(0, 4),444,a_b_cd.getPhonemeText().subSequence(0, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSubSequenceWorks_literalMutation332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubSequenceWorks_literalMutation332");
        final Rule.Phoneme a = new Rule.Phoneme("a" , null);
        final Rule.Phoneme b = new Rule.Phoneme("b" , null);
        final Rule.Phoneme cd = new Rule.Phoneme("cd" , null);
        final Rule.Phoneme ef = new Rule.Phoneme("ef" , null);
        final Rule.Phoneme ghi = new Rule.Phoneme("foo" , null);
        final Rule.Phoneme jkl = new Rule.Phoneme("jkl" , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),357,a.getPhonemeText(),356,a.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),359,b.getPhonemeText(),358,b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),361,cd.getPhonemeText(),360,cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),363,cd.getPhonemeText(),362,cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,ef.getPhonemeText(),364,ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ef.getPhonemeText(),366,ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ghi.getPhonemeText(),368,ghi.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ghi.getPhonemeText(),370,ghi.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,ghi.getPhonemeText(),372,ghi.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,jkl.getPhonemeText(),374,jkl.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),377,jkl.getPhonemeText(),376,jkl.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),379,jkl.getPhonemeText(),378,jkl.getPhonemeText().charAt(2));
        final Rule.Phoneme a_b = new Rule.Phoneme(a , b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),381,a_b.getPhonemeText(),380,a_b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),383,a_b.getPhonemeText(),382,a_b.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),385,a_b.getPhonemeText().subSequence(0, 2),384,a_b.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),387,a_b.getPhonemeText().subSequence(0, 1),386,a_b.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),389,a_b.getPhonemeText().subSequence(1, 2),388,a_b.getPhonemeText().subSequence(1, 2).toString());
        final Rule.Phoneme cd_ef = new Rule.Phoneme(cd , ef);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),391,cd_ef.getPhonemeText(),390,cd_ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,cd_ef.getPhonemeText(),392,cd_ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),395,cd_ef.getPhonemeText(),394,cd_ef.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,cd_ef.getPhonemeText(),396,cd_ef.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,cd_ef.getPhonemeText().subSequence(0, 1),398,cd_ef.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,cd_ef.getPhonemeText().subSequence(1, 2),400,cd_ef.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,cd_ef.getPhonemeText().subSequence(2, 3),402,cd_ef.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,cd_ef.getPhonemeText().subSequence(3, 4),404,cd_ef.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,cd_ef.getPhonemeText().subSequence(0, 2),406,cd_ef.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,cd_ef.getPhonemeText().subSequence(1, 3),408,cd_ef.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,cd_ef.getPhonemeText().subSequence(2, 4),410,cd_ef.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,cd_ef.getPhonemeText().subSequence(0, 3),412,cd_ef.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,cd_ef.getPhonemeText().subSequence(1, 4),414,cd_ef.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,cd_ef.getPhonemeText().subSequence(0, 4),416,cd_ef.getPhonemeText().subSequence(0, 4).toString());
        final Rule.Phoneme a_b_cd = new Rule.Phoneme(new Rule.Phoneme(a , b) , cd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,a_b_cd.getPhonemeText(),418,a_b_cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,a_b_cd.getPhonemeText(),420,a_b_cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,a_b_cd.getPhonemeText(),422,a_b_cd.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),425,a_b_cd.getPhonemeText(),424,a_b_cd.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),427,a_b_cd.getPhonemeText().subSequence(0, 1),426,a_b_cd.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),429,a_b_cd.getPhonemeText().subSequence(1, 2),428,a_b_cd.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,a_b_cd.getPhonemeText().subSequence(2, 3),430,a_b_cd.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,a_b_cd.getPhonemeText().subSequence(3, 4),432,a_b_cd.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,a_b_cd.getPhonemeText().subSequence(0, 2),434,a_b_cd.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,a_b_cd.getPhonemeText().subSequence(1, 3),436,a_b_cd.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,a_b_cd.getPhonemeText().subSequence(2, 4),438,a_b_cd.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),441,a_b_cd.getPhonemeText().subSequence(0, 3),440,a_b_cd.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),443,a_b_cd.getPhonemeText().subSequence(1, 4),442,a_b_cd.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),445,a_b_cd.getPhonemeText().subSequence(0, 4),444,a_b_cd.getPhonemeText().subSequence(0, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSubSequenceWorks_literalMutation334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubSequenceWorks_literalMutation334");
        final Rule.Phoneme a = new Rule.Phoneme("a" , null);
        final Rule.Phoneme b = new Rule.Phoneme("b" , null);
        final Rule.Phoneme cd = new Rule.Phoneme("cd" , null);
        final Rule.Phoneme ef = new Rule.Phoneme("ef" , null);
        final Rule.Phoneme ghi = new Rule.Phoneme("ghi" , null);
        final Rule.Phoneme jkl = new Rule.Phoneme("bar" , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),357,a.getPhonemeText(),356,a.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),359,b.getPhonemeText(),358,b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),361,cd.getPhonemeText(),360,cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),363,cd.getPhonemeText(),362,cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,ef.getPhonemeText(),364,ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ef.getPhonemeText(),366,ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ghi.getPhonemeText(),368,ghi.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ghi.getPhonemeText(),370,ghi.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,ghi.getPhonemeText(),372,ghi.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,jkl.getPhonemeText(),374,jkl.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),377,jkl.getPhonemeText(),376,jkl.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),379,jkl.getPhonemeText(),378,jkl.getPhonemeText().charAt(2));
        final Rule.Phoneme a_b = new Rule.Phoneme(a , b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),381,a_b.getPhonemeText(),380,a_b.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),383,a_b.getPhonemeText(),382,a_b.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),385,a_b.getPhonemeText().subSequence(0, 2),384,a_b.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),387,a_b.getPhonemeText().subSequence(0, 1),386,a_b.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),389,a_b.getPhonemeText().subSequence(1, 2),388,a_b.getPhonemeText().subSequence(1, 2).toString());
        final Rule.Phoneme cd_ef = new Rule.Phoneme(cd , ef);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),391,cd_ef.getPhonemeText(),390,cd_ef.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,cd_ef.getPhonemeText(),392,cd_ef.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),395,cd_ef.getPhonemeText(),394,cd_ef.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,cd_ef.getPhonemeText(),396,cd_ef.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,cd_ef.getPhonemeText().subSequence(0, 1),398,cd_ef.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,cd_ef.getPhonemeText().subSequence(1, 2),400,cd_ef.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,cd_ef.getPhonemeText().subSequence(2, 3),402,cd_ef.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,cd_ef.getPhonemeText().subSequence(3, 4),404,cd_ef.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,cd_ef.getPhonemeText().subSequence(0, 2),406,cd_ef.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,cd_ef.getPhonemeText().subSequence(1, 3),408,cd_ef.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,cd_ef.getPhonemeText().subSequence(2, 4),410,cd_ef.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,cd_ef.getPhonemeText().subSequence(0, 3),412,cd_ef.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,cd_ef.getPhonemeText().subSequence(1, 4),414,cd_ef.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,cd_ef.getPhonemeText().subSequence(0, 4),416,cd_ef.getPhonemeText().subSequence(0, 4).toString());
        final Rule.Phoneme a_b_cd = new Rule.Phoneme(new Rule.Phoneme(a , b) , cd);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,a_b_cd.getPhonemeText(),418,a_b_cd.getPhonemeText().charAt(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,a_b_cd.getPhonemeText(),420,a_b_cd.getPhonemeText().charAt(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,a_b_cd.getPhonemeText(),422,a_b_cd.getPhonemeText().charAt(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),425,a_b_cd.getPhonemeText(),424,a_b_cd.getPhonemeText().charAt(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),427,a_b_cd.getPhonemeText().subSequence(0, 1),426,a_b_cd.getPhonemeText().subSequence(0, 1).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),429,a_b_cd.getPhonemeText().subSequence(1, 2),428,a_b_cd.getPhonemeText().subSequence(1, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),431,a_b_cd.getPhonemeText().subSequence(2, 3),430,a_b_cd.getPhonemeText().subSequence(2, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,a_b_cd.getPhonemeText().subSequence(3, 4),432,a_b_cd.getPhonemeText().subSequence(3, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),435,a_b_cd.getPhonemeText().subSequence(0, 2),434,a_b_cd.getPhonemeText().subSequence(0, 2).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),437,a_b_cd.getPhonemeText().subSequence(1, 3),436,a_b_cd.getPhonemeText().subSequence(1, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),439,a_b_cd.getPhonemeText().subSequence(2, 4),438,a_b_cd.getPhonemeText().subSequence(2, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),441,a_b_cd.getPhonemeText().subSequence(0, 3),440,a_b_cd.getPhonemeText().subSequence(0, 3).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),443,a_b_cd.getPhonemeText().subSequence(1, 4),442,a_b_cd.getPhonemeText().subSequence(1, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),445,a_b_cd.getPhonemeText().subSequence(0, 4),444,a_b_cd.getPhonemeText().subSequence(0, 4).toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

