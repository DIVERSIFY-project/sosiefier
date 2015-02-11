package org.apache.commons.codec.language;

import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * @version $Id$
 */
public class MetaphoneTest extends StringEncoderAbstractTest<org.apache.commons.codec.language.Metaphone> {
    public void assertIsMetaphoneEqual(final String source, final String[] matches) {
        for (final String matche : matches) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),814,((("Source: " + source) + ", should have same Metaphone as: ") + matche));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),816,getStringEncoder(),815,getStringEncoder().isMetaphoneEqual(source, matche));
        }
        for (final String matche : matches) {
            for (final String matche2 : matches) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),818,getStringEncoder(),817,getStringEncoder().isMetaphoneEqual(matche, matche2));
            }
        }
    }

    public void assertMetaphoneEqual(final String[][] pairs) {
        validateFixture(pairs);
        for (final String[] pair : pairs) {
            final String name0 = pair[0];
            final String name1 = pair[1];
            final String failMsg = (("Expected match between " + name0) + " and ") + name1;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),819,failMsg);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),821,getStringEncoder(),820,getStringEncoder().isMetaphoneEqual(name0, name1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),822,failMsg);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),824,getStringEncoder(),823,getStringEncoder().isMetaphoneEqual(name1, name0));
        }
    }

    @Override
    protected Metaphone createStringEncoder() {
        return new Metaphone();
    }

    @Test(timeout = 1000)
    public void testIsMetaphoneEqual1_add199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_add199");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1");
        assertMetaphoneEqual(new String[][]{ new String[]{ "foo" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation871");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "foo" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation872");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "foo" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation873");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "foo" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation874");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "foo" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation875");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "foo" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation876");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "foo" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation877");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "foo" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsMetaphoneEqual1_remove182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_remove182");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqual2_add200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2_add200");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Lawrence" , "Lorenza" } , new String[]{ "Gary" , "Cahra" } });
        assertMetaphoneEqual(new String[][]{ new String[]{ "Lawrence" , "Lorenza" } , new String[]{ "Gary" , "Cahra" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqual2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2");
        assertMetaphoneEqual(new String[][]{ new String[]{ "foo" , "Lorenza" } , new String[]{ "Gary" , "Cahra" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqual2_literalMutation879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2_literalMutation879");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Lawrence" , "foo" } , new String[]{ "Gary" , "Cahra" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqual2_literalMutation880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2_literalMutation880");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Lawrence" , "Lorenza" } , new String[]{ "foo" , "Cahra" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqual2_literalMutation881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2_literalMutation881");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Lawrence" , "Lorenza" } , new String[]{ "Gary" , "foo" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqual2_remove183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2_remove183");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial AE case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualAero_add201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAero_add201");
        assertIsMetaphoneEqual("Aero", new String[]{ "Eure" });
        assertIsMetaphoneEqual("Aero", new String[]{ "Eure" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial AE case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAero() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAero");
        assertIsMetaphoneEqual("foo", new String[]{ "Eure" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial AE case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAero_literalMutation883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAero_literalMutation883");
        assertIsMetaphoneEqual("Aero", new String[]{ "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial AE case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualAero_remove184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAero_remove184");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualWhite_add211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_add211");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite");
        assertIsMetaphoneEqual("foo", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1070");
        assertIsMetaphoneEqual("White", new String[]{ "foo" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1071");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "foo" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1072");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "foo" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1073() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1073");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "foo" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1074() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1074");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "foo" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1075");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "foo" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1076() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1076");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "foo" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1077() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1077");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "foo" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1078");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "foo" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1079() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1079");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "foo" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1080() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1080");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "foo" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1081");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualWhite_remove194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_remove194");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualAlbert_add202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_add202");
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "Alberik" , "Albert" , "Alberto" , "Albrecht" });
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "Alberik" , "Albert" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert");
        assertIsMetaphoneEqual("foo", new String[]{ "Ailbert" , "Alberik" , "Albert" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation885() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation885");
        assertIsMetaphoneEqual("Albert", new String[]{ "foo" , "Alberik" , "Albert" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation886");
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "foo" , "Albert" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation887");
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "Alberik" , "foo" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation888");
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "Alberik" , "Albert" , "foo" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation889");
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "Alberik" , "Albert" , "Alberto" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualAlbert_remove185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_remove185");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualGary_add203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_add203");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary");
        assertIsMetaphoneEqual("foo", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation891() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation891");
        assertIsMetaphoneEqual("Gary", new String[]{ "foo" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation892");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "foo" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation893");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "foo" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation894");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "foo" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation895");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "foo" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation896");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "foo" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation897");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "foo" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation898");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "foo" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation899() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation899");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "foo" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation900");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "foo" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation901");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "foo" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation902");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "foo" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation903");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "foo" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation904");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "foo" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation905");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "foo" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation906");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "foo" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation907");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "foo" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation908() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation908");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "foo" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation909");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "foo" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation910");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "foo" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation911");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "foo" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation912");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "foo" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation913");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "foo" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation914() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation914");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "foo" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation915");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "foo" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation916");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "foo" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation917");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "foo" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation918() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation918");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "foo" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation919");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "foo" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation920");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "foo" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation921");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "foo" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation922");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "foo" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation923");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "foo" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation924");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "foo" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation925");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "foo" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation926");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "foo" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation927");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "foo" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation928");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "foo" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation929");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "foo" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation930");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "foo" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation931");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "foo" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation932");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "foo" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation933");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "foo" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation934");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualGary_remove186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_remove186");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualJohn_add204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_add204");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn");
        assertIsMetaphoneEqual("foo", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation936");
        assertIsMetaphoneEqual("John", new String[]{ "foo" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation937");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "foo" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation938");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "foo" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation939");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "foo" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation940");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "foo" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation941");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "foo" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation942");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "foo" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation943");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "foo" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation944");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "foo" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation945");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "foo" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation946");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "foo" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation947");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "foo" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation948");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "foo" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation949");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "foo" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation950");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "foo" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation951");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "foo" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation952");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "foo" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation953");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "foo" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation954");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "foo" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation955");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "foo" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation956() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation956");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "foo" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation957");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "foo" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation958");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "foo" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation959");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "foo" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation960");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "foo" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation961");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "foo" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation962");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "foo" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation963");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "foo" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation964");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "foo" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation965");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "foo" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation966");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "foo" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation967() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation967");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "foo" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation968");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "foo" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation969");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "foo" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation970");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "foo" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation971");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "foo" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation972() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation972");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "foo" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation973");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "foo" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation974() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation974");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "foo" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation975() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation975");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "foo" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation976() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation976");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "foo" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation977() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation977");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "foo" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation978");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "foo" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation979");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "foo" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation980() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation980");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "foo" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation981() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation981");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "foo" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation982() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation982");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "foo" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation983() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation983");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "foo" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation984() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation984");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "foo" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation985() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation985");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "foo" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation986() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation986");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "foo" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation987() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation987");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "foo" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation988() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation988");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "foo" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation989() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation989");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "foo" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation990() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation990");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "foo" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation991() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation991");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "foo" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation992() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation992");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "foo" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation993() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation993");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "foo" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation994() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation994");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualJohn_remove187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_remove187");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualKnight_add205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_add205");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1000");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "foo" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1001");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "foo" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1002");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "foo" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1003() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1003");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "foo" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1004() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1004");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "foo" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1005");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "foo" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1006() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1006");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "foo" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1007() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1007");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "foo" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1008");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "foo" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1009");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "foo" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1010() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1010");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "foo" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1011");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight");
        assertIsMetaphoneEqual("foo", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation996() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation996");
        assertIsMetaphoneEqual("Knight", new String[]{ "foo" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation997() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation997");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "foo" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation998() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation998");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "foo" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation999");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "foo" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualKnight_remove188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_remove188");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualMary_add206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_add206");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary");
        assertIsMetaphoneEqual("foo", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1013");
        assertIsMetaphoneEqual("Mary", new String[]{ "foo" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1014");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "foo" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1015");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "foo" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1016");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "foo" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1017");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "foo" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1018");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "foo" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1019() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1019");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "foo" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1020");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "foo" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1021");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "foo" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1022");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "foo" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1023");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "foo" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1024() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1024");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "foo" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1025");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "foo" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1026");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "foo" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1027() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1027");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "foo" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1028");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "foo" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1029() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1029");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "foo" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1030");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "foo" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1031() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1031");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "foo" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1032");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "foo" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1033() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1033");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualMary_remove189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_remove189");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualParis_add207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_add207");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "Perris" , "Piercy" , "Pierz" , "Pryse" });
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "Perris" , "Piercy" , "Pierz" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis");
        assertIsMetaphoneEqual("foo", new String[]{ "Pearcy" , "Perris" , "Piercy" , "Pierz" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1035");
        assertIsMetaphoneEqual("Paris", new String[]{ "foo" , "Perris" , "Piercy" , "Pierz" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1036");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "foo" , "Piercy" , "Pierz" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1037");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "Perris" , "foo" , "Pierz" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1038() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1038");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "Perris" , "Piercy" , "foo" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1039() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1039");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "Perris" , "Piercy" , "Pierz" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualParis_remove190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_remove190");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualPeter_add208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_add208");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter");
        assertIsMetaphoneEqual("foo", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1041() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1041");
        assertIsMetaphoneEqual("Peter", new String[]{ "foo" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1042() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1042");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "foo" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1043");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "foo" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1044");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "foo" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1045");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "foo" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1046");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "foo" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1047");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "foo" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1048() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1048");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "foo" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1049() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1049");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualPeter_remove191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_remove191");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualRay_add209() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_add209");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "Rey" , "Roi" , "Roy" , "Ruy" });
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "Rey" , "Roi" , "Roy" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay");
        assertIsMetaphoneEqual("foo", new String[]{ "Ray" , "Rey" , "Roi" , "Roy" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1051() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1051");
        assertIsMetaphoneEqual("Ray", new String[]{ "foo" , "Rey" , "Roi" , "Roy" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1052");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "foo" , "Roi" , "Roy" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1053() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1053");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "Rey" , "foo" , "Roy" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1054");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "Rey" , "Roi" , "foo" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1055");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "Rey" , "Roi" , "Roy" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualRay_remove192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_remove192");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualSusan_add210() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_add210");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan");
        assertIsMetaphoneEqual("foo", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1057");
        assertIsMetaphoneEqual("Susan", new String[]{ "foo" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1058");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "foo" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1059");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "foo" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1060");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "foo" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1061");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "foo" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1062");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "foo" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1063");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "foo" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1064");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "foo" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1065");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "foo" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1066");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "foo" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1067() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1067");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "foo" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1068");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualSusan_remove193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_remove193");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualWright_add212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright_add212");
        assertIsMetaphoneEqual("Wright", new String[]{ "Rota" , "Rudd" , "Ryde" });
        assertIsMetaphoneEqual("Wright", new String[]{ "Rota" , "Rudd" , "Ryde" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWright() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright");
        assertIsMetaphoneEqual("foo", new String[]{ "Rota" , "Rudd" , "Ryde" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWright_literalMutation1083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright_literalMutation1083");
        assertIsMetaphoneEqual("Wright", new String[]{ "foo" , "Rudd" , "Ryde" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWright_literalMutation1084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright_literalMutation1084");
        assertIsMetaphoneEqual("Wright", new String[]{ "Rota" , "foo" , "Ryde" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWright_literalMutation1085() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright_literalMutation1085");
        assertIsMetaphoneEqual("Wright", new String[]{ "Rota" , "Rudd" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualWright_remove195() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright_remove195");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualXalan_add213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_add213");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan");
        assertIsMetaphoneEqual("foo", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1087() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1087");
        assertIsMetaphoneEqual("Xalan", new String[]{ "foo" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1088() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1088");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "foo" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1089() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1089");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "foo" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1090() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1090");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "foo" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1091");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "foo" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1092() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1092");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "foo" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1093() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1093");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "foo" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1094() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1094");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "foo" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1095() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1095");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test(timeout = 1000)
    public void testIsMetaphoneEqualXalan_remove196() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_remove196");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testMetaphone() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMetaphone");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,getStringEncoder(),841,getStringEncoder().metaphone("howl"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),844,getStringEncoder(),843,getStringEncoder().metaphone("testing"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),846,getStringEncoder(),845,getStringEncoder().metaphone("The"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),848,getStringEncoder(),847,getStringEncoder().metaphone("quick"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),850,getStringEncoder(),849,getStringEncoder().metaphone("brown"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,getStringEncoder(),851,getStringEncoder().metaphone("fox"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,getStringEncoder(),853,getStringEncoder().metaphone("jumped"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),856,getStringEncoder(),855,getStringEncoder().metaphone("over"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),858,getStringEncoder(),857,getStringEncoder().metaphone("the"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),860,getStringEncoder(),859,getStringEncoder().metaphone("lazy"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),862,getStringEncoder(),861,getStringEncoder().metaphone("dogs"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testWordEndingInMB() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWordEndingInMB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),898,getStringEncoder(),897,getStringEncoder().metaphone("COMB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,getStringEncoder(),899,getStringEncoder().metaphone("TOMB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,getStringEncoder(),901,getStringEncoder().metaphone("WOMB"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDiscardOfSCEOrSCIOrSCY() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDiscardOfSCEOrSCIOrSCY");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),826,getStringEncoder(),825,getStringEncoder().metaphone("SCIENCE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),828,getStringEncoder(),827,getStringEncoder().metaphone("SCENE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),830,getStringEncoder(),829,getStringEncoder().metaphone("SCY"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests (CODEC-57) Metaphone.metaphone(String) returns an empty string when passed the word "why"
     */
@Test
    public void testWhy() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWhy");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,getStringEncoder(),895,getStringEncoder().metaphone("WHY"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testWordsWithCIA() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWordsWithCIA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),904,getStringEncoder(),903,getStringEncoder().metaphone("CIAPO"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTranslateOfSCHAndCH() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranslateOfSCHAndCH");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,getStringEncoder(),881,getStringEncoder().metaphone("SCHEDULE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,getStringEncoder(),883,getStringEncoder().metaphone("SCHEMATIC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),886,getStringEncoder(),885,getStringEncoder().metaphone("CHARACTER"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,getStringEncoder(),887,getStringEncoder().metaphone("TEACH"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTranslateToJOfDGEOrDGIOrDGY() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTranslateToJOfDGEOrDGIOrDGY");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,getStringEncoder(),889,getStringEncoder().metaphone("DODGY"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),892,getStringEncoder(),891,getStringEncoder().metaphone("DODGE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,getStringEncoder(),893,getStringEncoder().metaphone("ADGIEMTI"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDiscardOfSilentHAfterG() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDiscardOfSilentHAfterG");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),836,getStringEncoder(),835,getStringEncoder().metaphone("GHENT"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),838,getStringEncoder(),837,getStringEncoder().metaphone("BAUGH"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDiscardOfSilentGN() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDiscardOfSilentGN");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),832,getStringEncoder(),831,getStringEncoder().metaphone("GNU"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),834,getStringEncoder(),833,getStringEncoder().metaphone("SIGNED"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPHTOF() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPHTOF");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,getStringEncoder(),863,getStringEncoder().metaphone("PHISH"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSHAndSIOAndSIAToX() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSHAndSIOAndSIAToX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,getStringEncoder(),865,getStringEncoder().metaphone("SHOT"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,getStringEncoder(),867,getStringEncoder().metaphone("ODSIAN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,getStringEncoder(),869,getStringEncoder().metaphone("PULSION"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTIOAndTIAToX() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTIOAndTIAToX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,getStringEncoder(),877,getStringEncoder().metaphone("OTIA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,getStringEncoder(),879,getStringEncoder().metaphone("PORTION"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTCH() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTCH");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,getStringEncoder(),873,getStringEncoder().metaphone("RETCH"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,getStringEncoder(),875,getStringEncoder().metaphone("WATCH"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExceedLength() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceedLength");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),840,getStringEncoder(),839,getStringEncoder().metaphone("AXEAXE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetMaxLengthWithTruncation_add214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxLengthWithTruncation_add214");
        getStringEncoder().setMaxCodeLen(6);
        getStringEncoder().setMaxCodeLen(6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,getStringEncoder(),871,getStringEncoder().metaphone("AXEAXEAXE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSetMaxLengthWithTruncation() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxLengthWithTruncation");
        getStringEncoder().setMaxCodeLen(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,getStringEncoder(),871,getStringEncoder().metaphone("AXEAXEAXE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetMaxLengthWithTruncation_remove197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxLengthWithTruncation_remove197");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,getStringEncoder(),871,getStringEncoder().metaphone("AXEAXEAXE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void validateFixture(final String[][] pairs) {
        if ((pairs.length) == 0) {
        } 
        for (int i = 0 ; i < (pairs.length) ; i++) {
            if ((pairs[i].length) != 2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,("Error in test fixture in the data array at index " + i));
            } 
        }
    }
}

