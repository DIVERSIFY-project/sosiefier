package com.google.gson;

import java.util.NoSuchElementException;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Unit tests for {@link JsonStreamParser}
 * 
 * @author Inderjeet Singh
 */
public class JsonStreamParserTest extends TestCase {
    private JsonStreamParser parser;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        parser = new JsonStreamParser("\'one\' \'two\'");
    }

    public void testParseTwoStrings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseTwoStrings");
        String actualOne = parser.next().getAsString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3111,actualOne);
        String actualTwo = parser.next().getAsString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3112,actualTwo);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3084,parser,3083,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3086,parser.next(),3085,parser.next().getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3088,parser,3087,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3090,parser.next(),3089,parser.next().getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3092,parser,3091,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoSideEffectForHasNext() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoSideEffectForHasNext");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3094,parser,3093,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3096,parser,3095,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3098,parser,3097,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3100,parser.next(),3099,parser.next().getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3102,parser,3101,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3104,parser,3103,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3106,parser.next(),3105,parser.next().getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3108,parser,3107,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3110,parser,3109,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCallingNextBeyondAvailableInput() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCallingNextBeyondAvailableInput");
        parser.next();
        parser.next();
        parser.next();
        try {
            parser.next();
        } catch (NoSuchElementException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCallingNextBeyondAvailableInput_add1610() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCallingNextBeyondAvailableInput_add1610");
        parser.next();
        parser.next();
        parser.next();
        try {
            parser.next();
        } catch (NoSuchElementException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCallingNextBeyondAvailableInput_add1611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCallingNextBeyondAvailableInput_add1611");
        parser.next();
        parser.next();
        try {
            parser.next();
            parser.next();
        } catch (NoSuchElementException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

