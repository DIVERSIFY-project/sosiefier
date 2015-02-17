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
        assertMetaphoneEqual(new String[][]{ new String[]{ "bar" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation963");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "bar" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation964");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "bar" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation965");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "bar" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation966");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "bar" , "cAsE" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation967() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation967");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "foo" } , new String[]{ "quick" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation968");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "bar" , "cookie" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsMetaphoneEqual1_literalMutation969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual1_literalMutation969");
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
        assertMetaphoneEqual(new String[][]{ new String[]{ "bar" , "Lorenza" } , new String[]{ "Gary" , "Cahra" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqual2_literalMutation971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2_literalMutation971");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Lawrence" , "foo" } , new String[]{ "Gary" , "Cahra" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqual2_literalMutation972() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2_literalMutation972");
        assertMetaphoneEqual(new String[][]{ new String[]{ "Lawrence" , "Lorenza" } , new String[]{ "bar" , "Cahra" } });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqual2_literalMutation973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqual2_literalMutation973");
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
        assertIsMetaphoneEqual("bar", new String[]{ "Eure" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial AE case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAero_literalMutation975() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAero_literalMutation975");
        assertIsMetaphoneEqual("Aero", new String[]{ "bar" });
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
        assertIsMetaphoneEqual("bar", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1162");
        assertIsMetaphoneEqual("White", new String[]{ "foo" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1163");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "bar" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1164");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "foo" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1165");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "bar" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1166");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "bar" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1167");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "bar" , "Wit" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1168");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "foo" , "Wittie" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1169");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "foo" , "Witty" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1170");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "bar" , "Wood" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1171");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "bar" , "Woodie" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1172");
        assertIsMetaphoneEqual("White", new String[]{ "Wade" , "Wait" , "Waite" , "Wat" , "Whit" , "Wiatt" , "Wit" , "Wittie" , "Witty" , "Wood" , "foo" , "Woody" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WH case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWhite_literalMutation1173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWhite_literalMutation1173");
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
        assertIsMetaphoneEqual("bar", new String[]{ "Ailbert" , "Alberik" , "Albert" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation977() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation977");
        assertIsMetaphoneEqual("Albert", new String[]{ "bar" , "Alberik" , "Albert" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation978");
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "bar" , "Albert" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation979");
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "Alberik" , "bar" , "Alberto" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation980() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation980");
        assertIsMetaphoneEqual("Albert", new String[]{ "Ailbert" , "Alberik" , "Albert" , "bar" , "Albrecht" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial A, not followed by an E case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualAlbert_literalMutation981() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualAlbert_literalMutation981");
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
    public void testIsMetaphoneEqualGary_literalMutation1000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1000");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "foo" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1001");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "foo" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1002");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "bar" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1003() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1003");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "bar" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1004() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1004");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "foo" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1005");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "foo" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1006() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1006");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "bar" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1007() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1007");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "foo" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1008");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "foo" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1009");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "foo" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1010() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1010");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "bar" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1011");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "bar" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1012() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1012");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "bar" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1013");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "foo" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1014");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "foo" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1015");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "foo" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1016");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "bar" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1017");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "bar" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1018");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "foo" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1019() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1019");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "bar" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1020");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "foo" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1021");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "foo" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1022");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "foo" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1023");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "bar" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1024() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1024");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "foo" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1025");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "bar" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation1026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation1026");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "bar" });
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
    public void testIsMetaphoneEqualGary_literalMutation983() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation983");
        assertIsMetaphoneEqual("Gary", new String[]{ "bar" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation984() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation984");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "foo" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation985() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation985");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "bar" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation986() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation986");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "bar" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation987() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation987");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "bar" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation988() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation988");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "bar" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation989() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation989");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "bar" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation990() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation990");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "bar" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation991() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation991");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "foo" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation992() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation992");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "foo" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation993() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation993");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "foo" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation994() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation994");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "bar" , "Cora" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation995() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation995");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "foo" , "Corey" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation996() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation996");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "foo" , "Cori" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation997() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation997");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "foo" , "Corie" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation998() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation998");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "foo" , "Correy" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualGary_literalMutation999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualGary_literalMutation999");
        assertIsMetaphoneEqual("Gary", new String[]{ "Cahra" , "Cara" , "Carey" , "Cari" , "Caria" , "Carie" , "Caro" , "Carree" , "Carri" , "Carrie" , "Carry" , "Cary" , "Cora" , "Corey" , "Cori" , "Corie" , "bar" , "Corri" , "Corrie" , "Corry" , "Cory" , "Gray" , "Kara" , "Kare" , "Karee" , "Kari" , "Karia" , "Karie" , "Karrah" , "Karrie" , "Karry" , "Kary" , "Keri" , "Kerri" , "Kerrie" , "Kerry" , "Kira" , "Kiri" , "Kora" , "Kore" , "Kori" , "Korie" , "Korrie" , "Korry" });
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
    public void testIsMetaphoneEqualJohn_literalMutation1028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1028");
        assertIsMetaphoneEqual("John", new String[]{ "foo" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1029() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1029");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "bar" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1030");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "foo" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1031() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1031");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "bar" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1032");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "bar" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1033() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1033");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "foo" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1034");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "bar" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1035");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "foo" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1036");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "bar" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1037");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "foo" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1038() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1038");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "bar" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1039() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1039");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "bar" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1040() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1040");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "bar" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1041() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1041");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "foo" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1042() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1042");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "bar" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1043");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "bar" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1044");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "foo" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1045");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "bar" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1046");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "foo" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1047");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "foo" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1048() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1048");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "foo" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1049() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1049");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "foo" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1050() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1050");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "foo" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1051() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1051");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "bar" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1052");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "foo" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1053() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1053");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "bar" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1054");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "bar" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1055");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "bar" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1056");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "foo" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1057");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "foo" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1058");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "bar" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1059");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "bar" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1060");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "bar" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1061");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "bar" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1062");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "foo" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1063");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "foo" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1064");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "bar" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1065");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "bar" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1066");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "bar" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1067() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1067");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "foo" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1068");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "bar" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1069() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1069");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "bar" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1070");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "bar" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1071");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "bar" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1072");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "bar" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1073() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1073");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "bar" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1074() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1074");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "foo" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1075");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "bar" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1076() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1076");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "foo" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1077() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1077");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "foo" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1078");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "bar" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1079() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1079");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "bar" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1080() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1080");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "bar" , "Joni" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1081");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "bar" , "Jonie" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1082");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "foo" , "Juana" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1083");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "foo" , "June" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1084");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "foo" , "Junia" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1085() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1085");
        assertIsMetaphoneEqual("John", new String[]{ "Gena" , "Gene" , "Genia" , "Genna" , "Genni" , "Gennie" , "Genny" , "Giana" , "Gianna" , "Gina" , "Ginni" , "Ginnie" , "Ginny" , "Jaine" , "Jan" , "Jana" , "Jane" , "Janey" , "Jania" , "Janie" , "Janna" , "Jany" , "Jayne" , "Jean" , "Jeana" , "Jeane" , "Jeanie" , "Jeanna" , "Jeanne" , "Jeannie" , "Jen" , "Jena" , "Jeni" , "Jenn" , "Jenna" , "Jennee" , "Jenni" , "Jennie" , "Jenny" , "Jinny" , "Jo Ann" , "Jo-Ann" , "Jo-Anne" , "Joan" , "Joana" , "Joane" , "Joanie" , "Joann" , "Joanna" , "Joanne" , "Joeann" , "Johna" , "Johnna" , "Joni" , "Jonie" , "Juana" , "June" , "bar" , "Junie" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualJohn_literalMutation1086() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualJohn_literalMutation1086");
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
    public void testIsMetaphoneEqualKnight() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight");
        assertIsMetaphoneEqual("bar", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1088() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1088");
        assertIsMetaphoneEqual("Knight", new String[]{ "foo" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1089() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1089");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "foo" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1090() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1090");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "bar" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1091");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "foo" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1092() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1092");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "foo" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1093() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1093");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "bar" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1094() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1094");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "bar" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1095() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1095");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "foo" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1096() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1096");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "bar" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1097() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1097");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "bar" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1098");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "bar" , "Netti" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1099");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "foo" , "Nettie" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1100");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "bar" , "Netty" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1101");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "foo" , "Nita" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1102");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "foo" , "Nydia" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial KN case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualKnight_literalMutation1103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualKnight_literalMutation1103");
        assertIsMetaphoneEqual("Knight", new String[]{ "Hynda" , "Nada" , "Nadia" , "Nady" , "Nat" , "Nata" , "Natty" , "Neda" , "Nedda" , "Nedi" , "Netta" , "Netti" , "Nettie" , "Netty" , "Nita" , "bar" });
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
        assertIsMetaphoneEqual("bar", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1105");
        assertIsMetaphoneEqual("Mary", new String[]{ "foo" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1106");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "foo" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1107");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "foo" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1108");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "bar" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1109");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "foo" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1110");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "bar" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1111");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "bar" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1112");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "bar" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1113");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "foo" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1114");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "foo" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1115");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "bar" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1116");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "bar" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1117");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "bar" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1118");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "bar" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1119");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "foo" , "Mora" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1120");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "bar" , "Moria" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1121");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "foo" , "Moyra" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1122");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "foo" , "Muire" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1123");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "bar" , "Myra" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1124");
        assertIsMetaphoneEqual("Mary", new String[]{ "Mair" , "Maire" , "Mara" , "Mareah" , "Mari" , "Maria" , "Marie" , "Mary" , "Maura" , "Maure" , "Meara" , "Merrie" , "Merry" , "Mira" , "Moira" , "Mora" , "Moria" , "Moyra" , "Muire" , "foo" , "Myrah" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualMary_literalMutation1125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualMary_literalMutation1125");
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
    public void testIsMetaphoneEqualParis_literalMutation1127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1127");
        assertIsMetaphoneEqual("Paris", new String[]{ "foo" , "Perris" , "Piercy" , "Pierz" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1128");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "foo" , "Piercy" , "Pierz" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1129");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "Perris" , "foo" , "Pierz" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1130");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "Perris" , "Piercy" , "bar" , "Pryse" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualParis_literalMutation1131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualParis_literalMutation1131");
        assertIsMetaphoneEqual("Paris", new String[]{ "Pearcy" , "Perris" , "Piercy" , "Pierz" , "bar" });
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
    public void testIsMetaphoneEqualPeter_literalMutation1133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1133");
        assertIsMetaphoneEqual("Peter", new String[]{ "bar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1134");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "bar" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1135");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "foo" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1136");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "foo" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1137");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "foo" , "Peyter" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1138");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "bar" , "Pieter" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1139");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "bar" , "Pietro" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1140");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "foo" , "Piotr" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualPeter_literalMutation1141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualPeter_literalMutation1141");
        assertIsMetaphoneEqual("Peter", new String[]{ "Peadar" , "Peder" , "Pedro" , "Peter" , "Petr" , "Peyter" , "Pieter" , "Pietro" , "bar" });
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
    public void testIsMetaphoneEqualRay_literalMutation1143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1143");
        assertIsMetaphoneEqual("Ray", new String[]{ "foo" , "Rey" , "Roi" , "Roy" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1144");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "foo" , "Roi" , "Roy" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1145");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "Rey" , "foo" , "Roy" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1146");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "Rey" , "Roi" , "bar" , "Ruy" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualRay_literalMutation1147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualRay_literalMutation1147");
        assertIsMetaphoneEqual("Ray", new String[]{ "Ray" , "Rey" , "Roi" , "Roy" , "bar" });
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
    public void testIsMetaphoneEqualSusan_literalMutation1149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1149");
        assertIsMetaphoneEqual("Susan", new String[]{ "foo" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1150");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "foo" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1151");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "foo" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1152");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "foo" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1153");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "foo" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1154");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "foo" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1155");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "bar" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1156");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "foo" , "Suzann" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1157");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "foo" , "Suzanna" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1158");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "bar" , "Suzanne" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1159");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "bar" , "Zuzana" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualSusan_literalMutation1160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualSusan_literalMutation1160");
        assertIsMetaphoneEqual("Susan", new String[]{ "Siusan" , "Sosanna" , "Susan" , "Susana" , "Susann" , "Susanna" , "Susannah" , "Susanne" , "Suzann" , "Suzanna" , "Suzanne" , "bar" });
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
        assertIsMetaphoneEqual("bar", new String[]{ "Rota" , "Rudd" , "Ryde" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWright_literalMutation1175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright_literalMutation1175");
        assertIsMetaphoneEqual("Wright", new String[]{ "foo" , "Rudd" , "Ryde" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWright_literalMutation1176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright_literalMutation1176");
        assertIsMetaphoneEqual("Wright", new String[]{ "Rota" , "foo" , "Ryde" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Initial WR case.
     * 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualWright_literalMutation1177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualWright_literalMutation1177");
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
        assertIsMetaphoneEqual("bar", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1179");
        assertIsMetaphoneEqual("Xalan", new String[]{ "bar" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1180");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "foo" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1181");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "bar" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1182");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "foo" , "Selene" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1183");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "bar" , "Selina" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1184");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "bar" , "Seline" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1185");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "bar" , "Suellen" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1186");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "foo" , "Xylina" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
@Test
    public void testIsMetaphoneEqualXalan_literalMutation1187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsMetaphoneEqualXalan_literalMutation1187");
        assertIsMetaphoneEqual("Xalan", new String[]{ "Celene" , "Celina" , "Celine" , "Selena" , "Selene" , "Selina" , "Seline" , "Suellen" , "bar" });
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

    @Test
    public void testSetMaxLengthWithTruncation_literalMutation1189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxLengthWithTruncation_literalMutation1189");
        getStringEncoder().setMaxCodeLen(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,getStringEncoder(),871,getStringEncoder().metaphone("AXEAXEAXE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSetMaxLengthWithTruncation_literalMutation1190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxLengthWithTruncation_literalMutation1190");
        getStringEncoder().setMaxCodeLen(12);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,getStringEncoder(),871,getStringEncoder().metaphone("AXEAXEAXE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSetMaxLengthWithTruncation_literalMutation1191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxLengthWithTruncation_literalMutation1191");
        getStringEncoder().setMaxCodeLen(7);
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

