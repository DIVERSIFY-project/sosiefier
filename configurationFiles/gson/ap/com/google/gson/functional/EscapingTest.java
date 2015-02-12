package com.google.gson.functional;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;

/** 
 * Performs some functional test involving JSON output escaping.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class EscapingTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testEscapingQuotesInStringArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingQuotesInStringArray");
        String[] valueWithQuotes = new String[]{ "foo" };
        String jsonRepresentation = gson.toJson(valueWithQuotes);
        String[] target = gson.fromJson(jsonRepresentation, String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),898,target.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,valueWithQuotes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_add1128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_add1128");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add("<");
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_add1129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_add1129");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_add1130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_add1130");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add("=");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_add1131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_add1131");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_add1132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_add1132");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_add1133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_add1133");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapeAllHtmlCharacters() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("foo");
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapeAllHtmlCharacters_literalMutation1216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_literalMutation1216");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add("foo");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapeAllHtmlCharacters_literalMutation1217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_literalMutation1217");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add("foo");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapeAllHtmlCharacters_literalMutation1218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_literalMutation1218");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add("=");
        strings.add("foo");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapeAllHtmlCharacters_literalMutation1219() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_literalMutation1219");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("foo");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapeAllHtmlCharacters_literalMutation1220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_literalMutation1220");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add("<");
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_remove945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_remove945");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_remove946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_remove946");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_remove947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_remove947");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_remove948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_remove948");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_remove949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_remove949");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEscapeAllHtmlCharacters_remove950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapeAllHtmlCharacters_remove950");
        List<java.lang.String> strings = new ArrayList<java.lang.String>();
        strings.add(">");
        strings.add("=");
        strings.add("&");
        strings.add("\'");
        strings.add("\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,gson,1472,gson.toJson(strings));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingObjectFields() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingObjectFields");
        TestTypes.BagOfPrimitives objWithPrimitives = new TestTypes.BagOfPrimitives(2L , 1 , true , "test with\" <script>");
        String jsonRepresentation = gson.toJson(objWithPrimitives);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1475,jsonRepresentation,1474,jsonRepresentation.contains("<"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,jsonRepresentation,1476,jsonRepresentation.contains(">"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,jsonRepresentation,1478,jsonRepresentation.contains("\\\""));
        TestTypes.BagOfPrimitives expectedObject = gson.fromJson(jsonRepresentation, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,objWithPrimitives,1480,objWithPrimitives.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1483,expectedObject,1482,expectedObject.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingObjectFields_literalMutation1222() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingObjectFields_literalMutation1222");
        TestTypes.BagOfPrimitives objWithPrimitives = new TestTypes.BagOfPrimitives(1L , 2 , true , "test with\" <script>");
        String jsonRepresentation = gson.toJson(objWithPrimitives);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1475,jsonRepresentation,1474,jsonRepresentation.contains("<"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,jsonRepresentation,1476,jsonRepresentation.contains(">"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,jsonRepresentation,1478,jsonRepresentation.contains("\\\""));
        TestTypes.BagOfPrimitives expectedObject = gson.fromJson(jsonRepresentation, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,objWithPrimitives,1480,objWithPrimitives.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1483,expectedObject,1482,expectedObject.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingObjectFields_literalMutation1223() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingObjectFields_literalMutation1223");
        TestTypes.BagOfPrimitives objWithPrimitives = new TestTypes.BagOfPrimitives(1L , 1 , false , "test with\" <script>");
        String jsonRepresentation = gson.toJson(objWithPrimitives);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1475,jsonRepresentation,1474,jsonRepresentation.contains("<"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,jsonRepresentation,1476,jsonRepresentation.contains(">"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,jsonRepresentation,1478,jsonRepresentation.contains("\\\""));
        TestTypes.BagOfPrimitives expectedObject = gson.fromJson(jsonRepresentation, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,objWithPrimitives,1480,objWithPrimitives.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1483,expectedObject,1482,expectedObject.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEscapingObjectFields_literalMutation1224() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEscapingObjectFields_literalMutation1224");
        TestTypes.BagOfPrimitives objWithPrimitives = new TestTypes.BagOfPrimitives(1L , 1 , true , "foo");
        String jsonRepresentation = gson.toJson(objWithPrimitives);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1475,jsonRepresentation,1474,jsonRepresentation.contains("<"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,jsonRepresentation,1476,jsonRepresentation.contains(">"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,jsonRepresentation,1478,jsonRepresentation.contains("\\\""));
        TestTypes.BagOfPrimitives expectedObject = gson.fromJson(jsonRepresentation, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,objWithPrimitives,1480,objWithPrimitives.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1483,expectedObject,1482,expectedObject.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonAcceptsEscapedAndNonEscapedJsonDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonAcceptsEscapedAndNonEscapedJsonDeserialization");
        Gson escapeHtmlGson = new GsonBuilder().create();
        Gson noEscapeHtmlGson = new GsonBuilder().disableHtmlEscaping().create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(0L , 1 , true , "test\' / w\'ith\" / \\ <script>");
        String escapedJsonForm = escapeHtmlGson.toJson(target);
        String nonEscapedJsonForm = noEscapeHtmlGson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,escapedJsonForm,1486,escapedJsonForm.equals(nonEscapedJsonForm));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1488,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1490,noEscapeHtmlGson,1489,noEscapeHtmlGson.fromJson(escapedJsonForm, com.google.gson.common.TestTypes.BagOfPrimitives.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,escapeHtmlGson,1492,escapeHtmlGson.fromJson(nonEscapedJsonForm, com.google.gson.common.TestTypes.BagOfPrimitives.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonAcceptsEscapedAndNonEscapedJsonDeserialization_literalMutation1227() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonAcceptsEscapedAndNonEscapedJsonDeserialization_literalMutation1227");
        Gson escapeHtmlGson = new GsonBuilder().create();
        Gson noEscapeHtmlGson = new GsonBuilder().disableHtmlEscaping().create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(1L , 0 , true , "test\' / w\'ith\" / \\ <script>");
        String escapedJsonForm = escapeHtmlGson.toJson(target);
        String nonEscapedJsonForm = noEscapeHtmlGson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,escapedJsonForm,1486,escapedJsonForm.equals(nonEscapedJsonForm));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1488,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1490,noEscapeHtmlGson,1489,noEscapeHtmlGson.fromJson(escapedJsonForm, com.google.gson.common.TestTypes.BagOfPrimitives.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,escapeHtmlGson,1492,escapeHtmlGson.fromJson(nonEscapedJsonForm, com.google.gson.common.TestTypes.BagOfPrimitives.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonAcceptsEscapedAndNonEscapedJsonDeserialization_literalMutation1228() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonAcceptsEscapedAndNonEscapedJsonDeserialization_literalMutation1228");
        Gson escapeHtmlGson = new GsonBuilder().create();
        Gson noEscapeHtmlGson = new GsonBuilder().disableHtmlEscaping().create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(1L , 1 , true , "test\' / w\'ith\" / \\ <script>");
        String escapedJsonForm = escapeHtmlGson.toJson(target);
        String nonEscapedJsonForm = noEscapeHtmlGson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,escapedJsonForm,1486,escapedJsonForm.equals(nonEscapedJsonForm));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1488,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1490,noEscapeHtmlGson,1489,noEscapeHtmlGson.fromJson(escapedJsonForm, com.google.gson.common.TestTypes.BagOfPrimitives.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,escapeHtmlGson,1492,escapeHtmlGson.fromJson(nonEscapedJsonForm, com.google.gson.common.TestTypes.BagOfPrimitives.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonAcceptsEscapedAndNonEscapedJsonDeserialization_literalMutation1229() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonAcceptsEscapedAndNonEscapedJsonDeserialization_literalMutation1229");
        Gson escapeHtmlGson = new GsonBuilder().create();
        Gson noEscapeHtmlGson = new GsonBuilder().disableHtmlEscaping().create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(1L , 1 , true , "foo");
        String escapedJsonForm = escapeHtmlGson.toJson(target);
        String nonEscapedJsonForm = noEscapeHtmlGson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,escapedJsonForm,1486,escapedJsonForm.equals(nonEscapedJsonForm));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1488,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1490,noEscapeHtmlGson,1489,noEscapeHtmlGson.fromJson(escapedJsonForm, com.google.gson.common.TestTypes.BagOfPrimitives.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,escapeHtmlGson,1492,escapeHtmlGson.fromJson(nonEscapedJsonForm, com.google.gson.common.TestTypes.BagOfPrimitives.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonDoubleDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonDoubleDeserialization");
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives(2L , 4 , true , "value1");
        String json = gson.toJson(gson.toJson(expected));
        String value = gson.fromJson(json, String.class);
        TestTypes.BagOfPrimitives actual = gson.fromJson(value, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonDoubleDeserialization_literalMutation1231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonDoubleDeserialization_literalMutation1231");
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives(3L , 3 , true , "value1");
        String json = gson.toJson(gson.toJson(expected));
        String value = gson.fromJson(json, String.class);
        TestTypes.BagOfPrimitives actual = gson.fromJson(value, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonDoubleDeserialization_literalMutation1232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonDoubleDeserialization_literalMutation1232");
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives(3L , 4 , false , "value1");
        String json = gson.toJson(gson.toJson(expected));
        String value = gson.fromJson(json, String.class);
        TestTypes.BagOfPrimitives actual = gson.fromJson(value, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonDoubleDeserialization_literalMutation1233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonDoubleDeserialization_literalMutation1233");
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives(3L , 4 , true , "foo");
        String json = gson.toJson(gson.toJson(expected));
        String value = gson.fromJson(json, String.class);
        TestTypes.BagOfPrimitives actual = gson.fromJson(value, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

