package com.google.gson.functional;

import com.google.gson.Gson;
import junit.framework.TestCase;

/** 
 * Functional tests for internationalized strings.
 * 
 * @author Inderjeet Singh
 */
public class InternationalizationTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testStringsWithRawChineseCharactersDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithRawChineseCharactersDeserialization");
        String expected = "foo";
        String json = ("\"" + expected) + "\"";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsWithRawChineseCharactersDeserialization_literalMutation1311() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithRawChineseCharactersDeserialization_literalMutation1311");
        String expected = "好好好";
        String json = ("foo" + expected) + "\"";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsWithRawChineseCharactersDeserialization_literalMutation1312() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithRawChineseCharactersDeserialization_literalMutation1312");
        String expected = "好好好";
        String json = ("\"" + expected) + "foo";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsWithUnicodeChineseCharactersSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithUnicodeChineseCharactersSerialization");
        String target = "foo";
        String json = gson.toJson(target);
        String expected = "\"好好好\"";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsWithUnicodeChineseCharactersSerialization_literalMutation1318() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithUnicodeChineseCharactersSerialization_literalMutation1318");
        String target = "好好好";
        String json = gson.toJson(target);
        String expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsWithUnicodeChineseCharactersDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithUnicodeChineseCharactersDeserialization");
        String expected = "foo";
        String json = ("\"" + expected) + "\"";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsWithUnicodeChineseCharactersDeserialization_literalMutation1314() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithUnicodeChineseCharactersDeserialization_literalMutation1314");
        String expected = "好好好";
        String json = ("foo" + expected) + "\"";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsWithUnicodeChineseCharactersDeserialization_literalMutation1315() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithUnicodeChineseCharactersDeserialization_literalMutation1315");
        String expected = "好好好";
        String json = ("\"" + expected) + "foo";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsWithUnicodeChineseCharactersEscapedDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsWithUnicodeChineseCharactersEscapedDeserialization");
        String actual = gson.fromJson("foo", String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

