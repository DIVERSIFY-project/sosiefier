package com.google.gson;

import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Unit test for the {@link JsonObject} class.
 * 
 * @author Joel Leitch
 */
public class JsonObjectTest extends TestCase {
    @Test(timeout = 1000)
    public void testAddingAndRemovingObjectProperties_add1570() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingAndRemovingObjectProperties_add1570");
        JsonObject jsonObj = new JsonObject();
        String propertyName = "property";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2827,jsonObj,2826,jsonObj.has(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2829,jsonObj,2828,jsonObj.get(propertyName));
        JsonPrimitive value = new JsonPrimitive("blah");
        jsonObj.add(propertyName, value);
        jsonObj.add(propertyName, value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,jsonObj,2831,jsonObj.get(propertyName));
        JsonElement removedElement = jsonObj.remove(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2833,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,removedElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,jsonObj,2835,jsonObj.has(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,jsonObj,2837,jsonObj.get(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingAndRemovingObjectProperties() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingAndRemovingObjectProperties");
        JsonObject jsonObj = new JsonObject();
        String propertyName = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2827,jsonObj,2826,jsonObj.has(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2829,jsonObj,2828,jsonObj.get(propertyName));
        JsonPrimitive value = new JsonPrimitive("blah");
        jsonObj.add(propertyName, value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,jsonObj,2831,jsonObj.get(propertyName));
        JsonElement removedElement = jsonObj.remove(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2833,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,removedElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,jsonObj,2835,jsonObj.has(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,jsonObj,2837,jsonObj.get(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingAndRemovingObjectProperties_literalMutation2275() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingAndRemovingObjectProperties_literalMutation2275");
        JsonObject jsonObj = new JsonObject();
        String propertyName = "property";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2827,jsonObj,2826,jsonObj.has(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2829,jsonObj,2828,jsonObj.get(propertyName));
        JsonPrimitive value = new JsonPrimitive("foo");
        jsonObj.add(propertyName, value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,jsonObj,2831,jsonObj.get(propertyName));
        JsonElement removedElement = jsonObj.remove(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2833,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,removedElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,jsonObj,2835,jsonObj.has(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,jsonObj,2837,jsonObj.get(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingAndRemovingObjectProperties_remove1286() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingAndRemovingObjectProperties_remove1286");
        JsonObject jsonObj = new JsonObject();
        String propertyName = "property";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2827,jsonObj,2826,jsonObj.has(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2829,jsonObj,2828,jsonObj.get(propertyName));
        JsonPrimitive value = new JsonPrimitive("blah");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,jsonObj,2831,jsonObj.get(propertyName));
        JsonElement removedElement = jsonObj.remove(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2833,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,removedElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,jsonObj,2835,jsonObj.has(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,jsonObj,2837,jsonObj.get(propertyName));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingNullPropertyValue_add1576() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullPropertyValue_add1576");
        String propertyName = "property";
        JsonObject jsonObj = new JsonObject();
        jsonObj.add(propertyName, null);
        jsonObj.add(propertyName, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2855,jsonObj,2854,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,jsonElement,2857,jsonElement.isJsonNull());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingNullPropertyValue() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullPropertyValue");
        String propertyName = "foo";
        JsonObject jsonObj = new JsonObject();
        jsonObj.add(propertyName, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2855,jsonObj,2854,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,jsonElement,2857,jsonElement.isJsonNull());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingNullPropertyValue_remove1291() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullPropertyValue_remove1291");
        String propertyName = "property";
        JsonObject jsonObj = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2855,jsonObj,2854,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,jsonElement,2857,jsonElement.isJsonNull());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingNullOrEmptyPropertyName_add1573() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullOrEmptyPropertyName_add1573");
        JsonObject jsonObj = new JsonObject();
        try {
            jsonObj.add(null, com.google.gson.JsonNull.INSTANCE);
            jsonObj.add(null, com.google.gson.JsonNull.INSTANCE);
        } catch (NullPointerException expected) {
        }
        jsonObj.add("", com.google.gson.JsonNull.INSTANCE);
        jsonObj.add("   \t", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingNullOrEmptyPropertyName_add1574() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullOrEmptyPropertyName_add1574");
        JsonObject jsonObj = new JsonObject();
        try {
            jsonObj.add(null, com.google.gson.JsonNull.INSTANCE);
        } catch (NullPointerException expected) {
        }
        jsonObj.add("", com.google.gson.JsonNull.INSTANCE);
        jsonObj.add("", com.google.gson.JsonNull.INSTANCE);
        jsonObj.add("   \t", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingNullOrEmptyPropertyName_add1575() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullOrEmptyPropertyName_add1575");
        JsonObject jsonObj = new JsonObject();
        try {
            jsonObj.add(null, com.google.gson.JsonNull.INSTANCE);
        } catch (NullPointerException expected) {
        }
        jsonObj.add("", com.google.gson.JsonNull.INSTANCE);
        jsonObj.add("   \t", com.google.gson.JsonNull.INSTANCE);
        jsonObj.add("   \t", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingNullOrEmptyPropertyName() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullOrEmptyPropertyName");
        JsonObject jsonObj = new JsonObject();
        try {
            jsonObj.add(null, com.google.gson.JsonNull.INSTANCE);
        } catch (NullPointerException expected) {
        }
        jsonObj.add("foo", com.google.gson.JsonNull.INSTANCE);
        jsonObj.add("   \t", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingNullOrEmptyPropertyName_literalMutation2282() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullOrEmptyPropertyName_literalMutation2282");
        JsonObject jsonObj = new JsonObject();
        try {
            jsonObj.add(null, com.google.gson.JsonNull.INSTANCE);
        } catch (NullPointerException expected) {
        }
        jsonObj.add("", com.google.gson.JsonNull.INSTANCE);
        jsonObj.add("foo", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingNullOrEmptyPropertyName_remove1289() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullOrEmptyPropertyName_remove1289");
        JsonObject jsonObj = new JsonObject();
        try {
            jsonObj.add(null, com.google.gson.JsonNull.INSTANCE);
        } catch (NullPointerException expected) {
        }
        jsonObj.add("   \t", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingNullOrEmptyPropertyName_remove1290() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingNullOrEmptyPropertyName_remove1290");
        JsonObject jsonObj = new JsonObject();
        try {
            jsonObj.add(null, com.google.gson.JsonNull.INSTANCE);
        } catch (NullPointerException expected) {
        }
        jsonObj.add("   \t", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingBooleanProperties_add1571() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingBooleanProperties_add1571");
        String propertyName = "property";
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty(propertyName, true);
        jsonObj.addProperty(propertyName, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,jsonObj,2839,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2841,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2843,jsonElement,2842,jsonElement.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingBooleanProperties() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingBooleanProperties");
        String propertyName = "foo";
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty(propertyName, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,jsonObj,2839,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2841,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2843,jsonElement,2842,jsonElement.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingBooleanProperties_literalMutation2277() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingBooleanProperties_literalMutation2277");
        String propertyName = "property";
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty(propertyName, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,jsonObj,2839,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2841,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2843,jsonElement,2842,jsonElement.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingBooleanProperties_remove1287() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingBooleanProperties_remove1287");
        String propertyName = "property";
        JsonObject jsonObj = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,jsonObj,2839,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2841,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2843,jsonElement,2842,jsonElement.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingStringProperties_add1577() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingStringProperties_add1577");
        String propertyName = "property";
        String value = "blah";
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty(propertyName, value);
        jsonObj.addProperty(propertyName, value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,jsonObj,2859,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2861,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,jsonElement,2863,jsonElement.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingStringProperties() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingStringProperties");
        String propertyName = "foo";
        String value = "blah";
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty(propertyName, value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,jsonObj,2859,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2861,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,jsonElement,2863,jsonElement.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingStringProperties_literalMutation2286() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingStringProperties_literalMutation2286");
        String propertyName = "property";
        String value = "foo";
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty(propertyName, value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,jsonObj,2859,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2861,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,jsonElement,2863,jsonElement.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingStringProperties_remove1292() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingStringProperties_remove1292");
        String propertyName = "property";
        String value = "blah";
        JsonObject jsonObj = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,jsonObj,2859,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2861,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,jsonElement,2863,jsonElement.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingCharacterProperties_add1572() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingCharacterProperties_add1572");
        String propertyName = "property";
        char value = 'a';
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty(propertyName, value);
        jsonObj.addProperty(propertyName, value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2845,jsonObj,2844,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.String.valueOf(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,jsonElement,2849,jsonElement.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2851,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2853,jsonElement,2852,jsonElement.getAsCharacter());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddingCharacterProperties() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingCharacterProperties");
        String propertyName = "foo";
        char value = 'a';
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty(propertyName, value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2845,jsonObj,2844,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.String.valueOf(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,jsonElement,2849,jsonElement.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2851,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2853,jsonElement,2852,jsonElement.getAsCharacter());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddingCharacterProperties_remove1288() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddingCharacterProperties_remove1288");
        String propertyName = "property";
        char value = 'a';
        JsonObject jsonObj = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2845,jsonObj,2844,jsonObj.has(propertyName));
        JsonElement jsonElement = jsonObj.get(propertyName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,jsonElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.String.valueOf(value));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,jsonElement,2849,jsonElement.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2851,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2853,jsonElement,2852,jsonElement.getAsCharacter());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=182
     */
@Test(timeout = 1000)
    public void testPropertyWithQuotes_add1586() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertyWithQuotes_add1586");
        JsonObject jsonObj = new JsonObject();
        jsonObj.add("a\"b", new JsonPrimitive("c\"d"));
        jsonObj.add("a\"b", new JsonPrimitive("c\"d"));
        String json = new Gson().toJson(jsonObj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=182
     */
public void testPropertyWithQuotes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertyWithQuotes");
        JsonObject jsonObj = new JsonObject();
        jsonObj.add("foo", new JsonPrimitive("c\"d"));
        String json = new Gson().toJson(jsonObj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=182
     */
public void testPropertyWithQuotes_literalMutation2294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertyWithQuotes_literalMutation2294");
        JsonObject jsonObj = new JsonObject();
        jsonObj.add("a\"b", new JsonPrimitive("foo"));
        String json = new Gson().toJson(jsonObj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=182
     */
@Test(timeout = 1000)
    public void testPropertyWithQuotes_remove1301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertyWithQuotes_remove1301");
        JsonObject jsonObj = new JsonObject();
        String json = new Gson().toJson(jsonObj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From issue 227.
     */
@Test(timeout = 1000)
    public void testWritePropertyWithEmptyStringName_add1587() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritePropertyWithEmptyStringName_add1587");
        JsonObject jsonObj = new JsonObject();
        jsonObj.add("", new JsonPrimitive(true));
        jsonObj.add("", new JsonPrimitive(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2885,new com.google.gson.Gson(),2884,new com.google.gson.Gson().toJson(jsonObj));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From issue 227.
     */
public void testWritePropertyWithEmptyStringName() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritePropertyWithEmptyStringName");
        JsonObject jsonObj = new JsonObject();
        jsonObj.add("foo", new JsonPrimitive(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2885,new com.google.gson.Gson(),2884,new com.google.gson.Gson().toJson(jsonObj));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From issue 227.
     */
public void testWritePropertyWithEmptyStringName_literalMutation2297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritePropertyWithEmptyStringName_literalMutation2297");
        JsonObject jsonObj = new JsonObject();
        jsonObj.add("", new JsonPrimitive(false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2885,new com.google.gson.Gson(),2884,new com.google.gson.Gson().toJson(jsonObj));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From issue 227.
     */
@Test(timeout = 1000)
    public void testWritePropertyWithEmptyStringName_remove1302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritePropertyWithEmptyStringName_remove1302");
        JsonObject jsonObj = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2885,new com.google.gson.Gson(),2884,new com.google.gson.Gson().toJson(jsonObj));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadPropertyWithEmptyStringName() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadPropertyWithEmptyStringName");
        JsonObject jsonObj = new JsonParser().parse("foo").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2883,jsonObj.get(""),2882,jsonObj.get("").getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsOnEmptyObject() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsOnEmptyObject");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonObject(), new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonObject(), new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsOnEmptyObject_remove1300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsOnEmptyObject_remove1300");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_add1580() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_add1580");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_add1581() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_add1581");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_add1582() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_add1582");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_add1583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_add1583");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_add1584() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_add1584");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsNonEmptyObject() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsNonEmptyObject_literalMutation2290() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_literalMutation2290");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsNonEmptyObject_literalMutation2291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_literalMutation2291");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsNonEmptyObject_literalMutation2292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_literalMutation2292");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("foo", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_remove1295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_remove1295");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_remove1296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_remove1296");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_remove1297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_remove1297");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        a.add("foo", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_remove1298() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_remove1298");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyObject_remove1299() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyObject_remove1299");
        JsonObject a = new JsonObject();
        JsonObject b = new JsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2869,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2871,a,2870,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2873,b,2872,b.equals(a));
        b.add("foo", new JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add("bar", new JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2875,a,2874,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2877,b,2876,b.equals(a));
        b.add("bar", com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2879,a,2878,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2881,b,2880,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy");
        JsonObject original = new JsonObject();
        JsonArray firstEntry = new JsonArray();
        original.add("key", firstEntry);
        JsonObject copy = original.deepCopy();
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,original.get("key").getAsJsonArray(),2865,original.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,copy.get("key").getAsJsonArray(),2867,copy.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_add1578() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_add1578");
        JsonObject original = new JsonObject();
        JsonArray firstEntry = new JsonArray();
        original.add("key", firstEntry);
        original.add("key", firstEntry);
        JsonObject copy = original.deepCopy();
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,original.get("key").getAsJsonArray(),2865,original.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,copy.get("key").getAsJsonArray(),2867,copy.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_add1579() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_add1579");
        JsonObject original = new JsonObject();
        JsonArray firstEntry = new JsonArray();
        original.add("key", firstEntry);
        JsonObject copy = original.deepCopy();
        firstEntry.add(new JsonPrimitive("z"));
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,original.get("key").getAsJsonArray(),2865,original.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,copy.get("key").getAsJsonArray(),2867,copy.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy_literalMutation2287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_literalMutation2287");
        JsonObject original = new JsonObject();
        JsonArray firstEntry = new JsonArray();
        original.add("foo", firstEntry);
        JsonObject copy = original.deepCopy();
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,original.get("key").getAsJsonArray(),2865,original.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,copy.get("key").getAsJsonArray(),2867,copy.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy_literalMutation2288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_literalMutation2288");
        JsonObject original = new JsonObject();
        JsonArray firstEntry = new JsonArray();
        original.add("key", firstEntry);
        JsonObject copy = original.deepCopy();
        firstEntry.add(new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,original.get("key").getAsJsonArray(),2865,original.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,copy.get("key").getAsJsonArray(),2867,copy.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_remove1293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_remove1293");
        JsonObject original = new JsonObject();
        JsonArray firstEntry = new JsonArray();
        JsonObject copy = original.deepCopy();
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,original.get("key").getAsJsonArray(),2865,original.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,copy.get("key").getAsJsonArray(),2867,copy.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_remove1294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_remove1294");
        JsonObject original = new JsonObject();
        JsonArray firstEntry = new JsonArray();
        original.add("key", firstEntry);
        JsonObject copy = original.deepCopy();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,original.get("key").getAsJsonArray(),2865,original.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,copy.get("key").getAsJsonArray(),2867,copy.get("key").getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

