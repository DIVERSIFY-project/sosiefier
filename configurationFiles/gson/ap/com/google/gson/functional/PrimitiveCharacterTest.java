package com.google.gson.functional;

import com.google.gson.Gson;
import junit.framework.TestCase;

/** 
 * Functional tests for Java Character values.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrimitiveCharacterTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testPrimitiveCharacterAutoboxedSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveCharacterAutoboxedSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,gson,2158,gson.toJson('A'));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,gson,2160,gson.toJson('A', char.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2163,gson,2162,gson.toJson('A', java.lang.Character.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveCharacterAutoboxedDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveCharacterAutoboxedDeserialization");
        char expected = 'a';
        char actual = gson.fromJson("foo", char.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2155,actual);
        actual = gson.fromJson("\"a\"", char.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,actual);
        actual = gson.fromJson("a", java.lang.Character.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2157,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveCharacterAutoboxedDeserialization_literalMutation1809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveCharacterAutoboxedDeserialization_literalMutation1809");
        char expected = 'a';
        char actual = gson.fromJson("a", char.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2155,actual);
        actual = gson.fromJson("foo", char.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,actual);
        actual = gson.fromJson("a", java.lang.Character.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2157,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveCharacterAutoboxedDeserialization_literalMutation1810() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveCharacterAutoboxedDeserialization_literalMutation1810");
        char expected = 'a';
        char actual = gson.fromJson("a", char.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2155,actual);
        actual = gson.fromJson("\"a\"", char.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1658,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,actual);
        actual = gson.fromJson("foo", java.lang.Character.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2157,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

