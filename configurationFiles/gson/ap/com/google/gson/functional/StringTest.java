package com.google.gson.functional;

import com.google.gson.Gson;
import junit.framework.TestCase;

/** 
 * Functional tests for Json serialization and deserialization of strings.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class StringTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testStringValueSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringValueSerialization");
        String value = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2494,(('\"' + value) + '\"'));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2496,gson,2495,gson.toJson(value));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringValueDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringValueDeserialization");
        String value = "foo";
        String actual = gson.fromJson((("\"" + value) + "\""), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringValueDeserialization_literalMutation2014() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringValueDeserialization_literalMutation2014");
        String value = "someRandomStringValue";
        String actual = gson.fromJson((("foo" + value) + "\""), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringValueDeserialization_literalMutation2015() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringValueDeserialization_literalMutation2015");
        String value = "someRandomStringValue";
        String actual = gson.fromJson((("\"" + value) + "foo"), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2492,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2493,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleQuoteInStringSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleQuoteInStringSerialization");
        String valueWithQuotes = "foo";
        String jsonRepresentation = gson.toJson(valueWithQuotes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,valueWithQuotes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2487,gson,2486,gson.fromJson(jsonRepresentation, java.lang.String.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapedCtrlNInStringSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapedCtrlNInStringSerialization");
        String value = "foo";
        String json = gson.toJson(value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapedCtrlNInStringDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapedCtrlNInStringDeserialization");
        String json = "foo";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2470,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapedCtrlRInStringSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapedCtrlRInStringSerialization");
        String value = "foo";
        String json = gson.toJson(value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapedCtrlRInStringDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapedCtrlRInStringDeserialization");
        String json = "foo";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2472,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapedBackslashInStringSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapedBackslashInStringSerialization");
        String value = "foo";
        String json = gson.toJson(value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1542,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapedBackslashInStringDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapedBackslashInStringDeserialization");
        String actual = gson.fromJson("foo", String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1969,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleQuoteInStringDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleQuoteInStringDeserialization");
        String value = "foo";
        String actual = gson.fromJson((("\"" + value) + "\""), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleQuoteInStringDeserialization_literalMutation2009() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleQuoteInStringDeserialization_literalMutation2009");
        String value = "beforeQuote\'afterQuote";
        String actual = gson.fromJson((("foo" + value) + "\""), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSingleQuoteInStringDeserialization_literalMutation2010() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingleQuoteInStringDeserialization_literalMutation2010");
        String value = "beforeQuote\'afterQuote";
        String actual = gson.fromJson((("\"" + value) + "foo"), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingQuotesInStringSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingQuotesInStringSerialization");
        String valueWithQuotes = "foo";
        String jsonRepresentation = gson.toJson(valueWithQuotes);
        String target = gson.fromJson(jsonRepresentation, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2476,valueWithQuotes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingQuotesInStringDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingQuotesInStringDeserialization");
        String value = "foo";
        String actual = gson.fromJson((("\"" + value) + "\""), String.class);
        String expected = "beforeQuote\"afterQuote";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2474,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingQuotesInStringDeserialization_literalMutation2002() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingQuotesInStringDeserialization_literalMutation2002");
        String value = "beforeQuote\\\"afterQuote";
        String actual = gson.fromJson((("foo" + value) + "\""), String.class);
        String expected = "beforeQuote\"afterQuote";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2474,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingQuotesInStringDeserialization_literalMutation2003() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingQuotesInStringDeserialization_literalMutation2003");
        String value = "beforeQuote\\\"afterQuote";
        String actual = gson.fromJson((("\"" + value) + "foo"), String.class);
        String expected = "beforeQuote\"afterQuote";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2474,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingQuotesInStringDeserialization_literalMutation2004() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingQuotesInStringDeserialization_literalMutation2004");
        String value = "beforeQuote\\\"afterQuote";
        String actual = gson.fromJson((("\"" + value) + "\""), String.class);
        String expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2474,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringValueAsSingleElementArraySerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringValueAsSingleElementArraySerialization");
        String[] target = new String[]{ "foo" };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2489,gson,2488,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2491,gson,2490,gson.toJson(target, java.lang.String[].class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringWithEscapedSlashDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringWithEscapedSlashDeserialization");
        String value = "foo";
        String json = "\'\\/\'";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringWithEscapedSlashDeserialization_literalMutation2018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringWithEscapedSlashDeserialization_literalMutation2018");
        String value = "/";
        String json = "foo";
        String actual = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2497,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://groups.google.com/group/google-gson/browse_thread/thread/2431d4a3d0d6cb23
     */
public void testAssignmentCharSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAssignmentCharSerialization");
        String value = "foo";
        String json = gson.toJson(value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://groups.google.com/group/google-gson/browse_thread/thread/2431d4a3d0d6cb23
     */
public void testAssignmentCharDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAssignmentCharDeserialization");
        String json = "foo";
        String value = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,value);
        json = "\'abc=\'";
        value = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://groups.google.com/group/google-gson/browse_thread/thread/2431d4a3d0d6cb23
     */
public void testAssignmentCharDeserialization_literalMutation1993() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAssignmentCharDeserialization_literalMutation1993");
        String json = "\"abc=\"";
        String value = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,value);
        json = "foo";
        value = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJavascriptKeywordsInStringSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJavascriptKeywordsInStringSerialization");
        String value = "foo";
        String json = gson.toJson(value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,(("\"" + value) + "\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJavascriptKeywordsInStringDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJavascriptKeywordsInStringDeserialization");
        String json = "foo";
        String value = gson.fromJson(json, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,json,2478,json.substring(1, ((json.length()) - 1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

