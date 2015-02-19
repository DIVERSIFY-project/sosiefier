package com.google.gson.stream;

import java.io.IOException;
import java.io.StringWriter;
import org.junit.Test;
import junit.framework.TestCase;

@SuppressWarnings(value = "resource")
public final class JsonWriterTest extends TestCase {
    @Test(timeout = 1000)
    public void testWrongTopLevelType_add921() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongTopLevelType_add921");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.value("a");
            jsonWriter.value("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrongTopLevelType() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongTopLevelType");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.value("foo");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoNames_add909() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoNames_add909");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("a");
        try {
            jsonWriter.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoNames_add910() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoNames_add910");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.name("a");
        try {
            jsonWriter.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoNames_add911() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoNames_add911");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        try {
            jsonWriter.name("a");
            jsonWriter.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTwoNames() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoNames");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("foo");
        try {
            jsonWriter.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTwoNames_literalMutation769() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoNames_literalMutation769");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        try {
            jsonWriter.name("foo");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoNames_remove750() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoNames_remove750");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.name("a");
        try {
            jsonWriter.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoNames_remove751() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoNames_remove751");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        try {
            jsonWriter.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNameWithoutValue_add815() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNameWithoutValue_add815");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("a");
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNameWithoutValue_add816() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNameWithoutValue_add816");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.name("a");
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNameWithoutValue_add817() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNameWithoutValue_add817");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        try {
            jsonWriter.endObject();
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNameWithoutValue() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNameWithoutValue");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("foo");
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNameWithoutValue_remove665() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNameWithoutValue_remove665");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.name("a");
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNameWithoutValue_remove666() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNameWithoutValue_remove666");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testValueWithoutName_add915() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueWithoutName_add915");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        try {
            jsonWriter.value(true);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testValueWithoutName_add916() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueWithoutName_add916");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        try {
            jsonWriter.value(true);
            jsonWriter.value(true);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testValueWithoutName() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueWithoutName");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        try {
            jsonWriter.value(true);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testValueWithoutName_remove755() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueWithoutName_remove755");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.value(true);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValues() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValues");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray().endArray();
        jsonWriter.beginArray().endArray();
        try {
            jsonWriter.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValues_add814() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValues_add814");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray().endArray();
        try {
            jsonWriter.beginArray();
            jsonWriter.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValues_remove664() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValues_remove664");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingObject");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        try {
            jsonWriter.endArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingObject_add751() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingObject_add751");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        try {
            jsonWriter.endArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingObject_add752() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingObject_add752");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        try {
            jsonWriter.endArray();
            jsonWriter.endArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingObject_remove609() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingObject_remove609");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        try {
            jsonWriter.endArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingObject_remove610() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingObject_remove610");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.endArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingArray");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingArray_add748() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingArray_add748");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingArray_add749() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingArray_add749");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        try {
            jsonWriter.endObject();
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingArray_remove607() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingArray_remove607");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNestingArray_remove608() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNestingArray_remove608");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullName() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullName");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        try {
            jsonWriter.name(null);
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullName_add827() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullName_add827");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        try {
            jsonWriter.name(null);
            jsonWriter.name(null);
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullName_remove669() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullName_remove669");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.name(null);
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullStringValue_add828() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue_add828");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.value(((String)(null)));
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullStringValue_add829() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue_add829");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.name("a");
        jsonWriter.value(((String)(null)));
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullStringValue_add830() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue_add830");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.value(((String)(null)));
        jsonWriter.value(((String)(null)));
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullStringValue_add831() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue_add831");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.value(((String)(null)));
        jsonWriter.endObject();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullStringValue() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("foo");
        jsonWriter.value(((String)(null)));
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullStringValue_remove670() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue_remove670");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.name("a");
        jsonWriter.value(((String)(null)));
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullStringValue_remove671() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue_remove671");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.value(((String)(null)));
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullStringValue_remove672() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue_remove672");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullStringValue_remove673() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullStringValue_remove673");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.value(((String)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,stringWriter,867,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteDoubles() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteDoubles");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        try {
            jsonWriter.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteDoubles_add823() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteDoubles_add823");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.value(java.lang.Double.NaN);
            jsonWriter.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteDoubles_add824() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteDoubles_add824");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.NEGATIVE_INFINITY);
            jsonWriter.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteDoubles_add825() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteDoubles_add825");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.POSITIVE_INFINITY);
            jsonWriter.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteDoubles_remove668() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteDoubles_remove668");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteBoxedDoubles() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteBoxedDoubles");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteBoxedDoubles_add819() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteBoxedDoubles_add819");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NaN));
            jsonWriter.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteBoxedDoubles_add820() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteBoxedDoubles_add820");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
            jsonWriter.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteBoxedDoubles_add821() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteBoxedDoubles_add821");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
            jsonWriter.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonFiniteBoxedDoubles_remove667() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonFiniteBoxedDoubles_remove667");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            jsonWriter.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubles() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add783() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add783");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add784() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add784");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add785() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add785");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add786() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add786");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add787() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add787");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add788() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add788");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add789() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add789");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add790() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add790");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add791() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add791");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add792() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add792");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add793() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add793");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_add794() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_add794");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubles_literalMutation667() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_literalMutation667");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubles_literalMutation668() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_literalMutation668");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(0.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubles_literalMutation669() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_literalMutation669");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(1.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubles_literalMutation670() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_literalMutation670");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubles_literalMutation671() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_literalMutation671");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove634() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove634");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove635() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove635");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove636() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove636");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove637() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove637");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove638() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove638");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove639() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove639");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove640() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove640");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove641() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove641");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove642() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove642");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove643() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove643");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove644() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove644");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubles_remove645() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubles_remove645");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(-0.0);
        jsonWriter.value(1.0);
        jsonWriter.value(java.lang.Double.MAX_VALUE);
        jsonWriter.value(java.lang.Double.MIN_VALUE);
        jsonWriter.value(0.0);
        jsonWriter.value(-0.5);
        jsonWriter.value(2.2250738585072014E-308);
        jsonWriter.value(java.lang.Math.PI);
        jsonWriter.value(java.lang.Math.E);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,("[-0.0," + ("1.0," + ("1.7976931348623157E308," + ("4.9E-324," + ("0.0," + ("-0.5," + ("2.2250738585072014E-308," + ("3.141592653589793," + "2.718281828459045]")))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,stringWriter,856,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongs() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_add805() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_add805");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_add806() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_add806");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_add807() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_add807");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_add808() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_add808");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_add809() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_add809");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_add810() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_add810");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_add811() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_add811");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_add812() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_add812");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongs_literalMutation673() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_literalMutation673");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongs_literalMutation674() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_literalMutation674");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(0);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongs_literalMutation675() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_literalMutation675");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(0);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_remove656() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_remove656");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_remove657() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_remove657");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_remove658() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_remove658");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_remove659() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_remove659");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_remove660() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_remove660");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_remove661() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_remove661");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_remove662() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_remove662");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLongs_remove663() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongs_remove663");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(0);
        jsonWriter.value(1);
        jsonWriter.value(-1);
        jsonWriter.value(java.lang.Long.MIN_VALUE);
        jsonWriter.value(java.lang.Long.MAX_VALUE);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,("[0," + ("1," + ("-1," + ("-9223372036854775808," + "9223372036854775807]")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,stringWriter,865,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumbers() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_add835() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add835");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_add836() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add836");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_add837() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add837");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_add838() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add838");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_add839() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add839");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_add840() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add840");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_add841() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add841");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumbers_literalMutation680() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_literalMutation680");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("foo"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumbers_literalMutation681() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_literalMutation681");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("foo"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumbers_literalMutation682() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_literalMutation682");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("foo"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumbers_literalMutation683() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_literalMutation683");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("foo"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove677() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove677");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove678() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove678");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove679() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove679");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove680() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove680");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove681() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove681");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove682() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove682");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove683() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove683");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(new java.math.BigInteger("0"));
        jsonWriter.value(new java.math.BigInteger("9223372036854775808"));
        jsonWriter.value(new java.math.BigInteger("-9223372036854775809"));
        jsonWriter.value(new java.math.BigDecimal("3.141592653589793238462643383"));
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),871,("[0," + ("9223372036854775808," + ("-9223372036854775809," + "3.141592653589793238462643383]"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,stringWriter,872,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleans() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_add753() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_add753");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_add754() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_add754");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_add755() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_add755");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(false);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_add756() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_add756");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleans_literalMutation654() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_literalMutation654");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleans_literalMutation655() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_literalMutation655");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(true);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_remove611() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_remove611");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_remove612() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_remove612");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_remove613() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_remove613");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_remove614() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_remove614");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,stringWriter,848,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNulls() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.nullValue();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stringWriter,869,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_add832() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_add832");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.nullValue();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stringWriter,869,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_add833() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_add833");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.nullValue();
        jsonWriter.nullValue();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stringWriter,869,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_add834() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_add834");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.nullValue();
        jsonWriter.endArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stringWriter,869,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_remove674() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_remove674");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.nullValue();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stringWriter,869,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_remove675() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_remove675");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stringWriter,869,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_remove676() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_remove676");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.nullValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,stringWriter,869,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add889() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add889");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add890() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add890");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add891() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add891");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add892() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add892");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add893() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add893");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add894() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add894");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add895() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add895");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add896() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add896");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add897() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add897");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add898() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add898");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add899() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add899");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add900() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add900");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add901() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add901");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add902() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add902");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add903() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add903");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add904() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add904");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add905() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add905");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add906() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add906");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add907() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add907");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add908() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add908");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation750() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation750");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("foo");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation751() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation751");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("foo");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation752() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation752");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("foo");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation753() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation753");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value("foo");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation754() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation754");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value("foo");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation755() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation755");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("foo");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation756() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation756");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("foo");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation757() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation757");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("foo");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation758() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation758");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("foo");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation759() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation759");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("foo");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation760() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation760");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value("foo");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation761() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation761");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("foo");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation762() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation762");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("foo");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation763() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation763");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("foo");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation764() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation764");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("foo");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation765() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation765");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("foo");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation766() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation766");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value("foo");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings_literalMutation767() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_literalMutation767");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("foo");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove730() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove730");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove731() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove731");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove732() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove732");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove733() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove733");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove734() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove734");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove735() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove735");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove736() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove736");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove737() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove737");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove738() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove738");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove739() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove739");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove740() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove740");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove741() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove741");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove742() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove742");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove743() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove743");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove744() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove744");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove745() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove745");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove746() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove746");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove747() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove747");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove748() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove748");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove749() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove749");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("a");
        jsonWriter.value("a\"");
        jsonWriter.value("\"");
        jsonWriter.value(":");
        jsonWriter.value(",");
        jsonWriter.value("\b");
        jsonWriter.value("\f");
        jsonWriter.value("\n");
        jsonWriter.value("\r");
        jsonWriter.value("\t");
        jsonWriter.value(" ");
        jsonWriter.value("\\");
        jsonWriter.value("{");
        jsonWriter.value("}");
        jsonWriter.value("[");
        jsonWriter.value("]");
        jsonWriter.value(" ");
        jsonWriter.value("");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,("[\"a\"," + ("\"a\\\"\"," + ("\"\\\"\"," + ("\":\"," + ("\",\"," + ("\"\\b\"," + ("\"\\f\"," + ("\"\\n\"," + ("\"\\r\"," + ("\"\\t\"," + ("\" \"," + ("\"\\\\\"," + ("\"{\"," + ("\"}\"," + ("\"[\"," + ("\"]\"," + ("\"\\u0000\"," + "\"\\u0019\"]"))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,stringWriter,886,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnicodeLineBreaksEscaped_add912() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicodeLineBreaksEscaped_add912");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value("   ");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),889,stringWriter,888,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnicodeLineBreaksEscaped_add913() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicodeLineBreaksEscaped_add913");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("   ");
        jsonWriter.value("   ");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),889,stringWriter,888,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnicodeLineBreaksEscaped_add914() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicodeLineBreaksEscaped_add914");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("   ");
        jsonWriter.endArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),889,stringWriter,888,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnicodeLineBreaksEscaped() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicodeLineBreaksEscaped");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("foo");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),889,stringWriter,888,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnicodeLineBreaksEscaped_remove752() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicodeLineBreaksEscaped_remove752");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.value("   ");
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),889,stringWriter,888,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnicodeLineBreaksEscaped_remove753() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicodeLineBreaksEscaped_remove753");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),889,stringWriter,888,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnicodeLineBreaksEscaped_remove754() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicodeLineBreaksEscaped_remove754");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value("   ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),889,stringWriter,888,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,stringWriter,858,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyArray_add795() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray_add795");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,stringWriter,858,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyArray_add796() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray_add796");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,stringWriter,858,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyArray_remove646() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray_remove646");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,stringWriter,858,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyArray_remove647() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray_remove647");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,stringWriter,858,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),861,stringWriter,860,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyObject_add797() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject_add797");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),861,stringWriter,860,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyObject_add798() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject_add798");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.endObject();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),861,stringWriter,860,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyObject_remove648() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject_remove648");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),861,stringWriter,860,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyObject_remove649() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject_remove649");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),861,stringWriter,860,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add842() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add842");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add843() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add843");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add844() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add844");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add845() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add845");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add846() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add846");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add847() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add847");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add848() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add848");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add849() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add849");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add850() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add850");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_add851() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_add851");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectsInArrays() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("foo").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectsInArrays_literalMutation685() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_literalMutation685");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectsInArrays_literalMutation686() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_literalMutation686");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("foo").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectsInArrays_literalMutation687() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_literalMutation687");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectsInArrays_literalMutation688() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_literalMutation688");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("foo").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectsInArrays_literalMutation689() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_literalMutation689");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(5);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectsInArrays_literalMutation690() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_literalMutation690");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("foo").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectsInArrays_literalMutation691() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_literalMutation691");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove684() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove684");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove685() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove685");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove686() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove686");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove687() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove687");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove688() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove688");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove689() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove689");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove690() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove690");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove691() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove691");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove692() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove692");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectsInArrays_remove693() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectsInArrays_remove693");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(5);
        jsonWriter.name("b").value(false);
        jsonWriter.endObject();
        jsonWriter.beginObject();
        jsonWriter.name("c").value(6);
        jsonWriter.name("d").value(true);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),874,("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,stringWriter,875,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add735() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add735");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add736() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add736");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add737() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add737");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add738() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add738");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add739() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add739");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add740() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add740");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add741() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add741");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add742() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add742");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add743() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add743");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add744() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add744");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add745() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add745");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_add746() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_add746");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArraysInObjects() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("foo");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArraysInObjects_literalMutation649() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_literalMutation649");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(4);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArraysInObjects_literalMutation650() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_literalMutation650");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArraysInObjects_literalMutation651() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_literalMutation651");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("foo");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArraysInObjects_literalMutation652() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_literalMutation652");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(7);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArraysInObjects_literalMutation653() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_literalMutation653");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove595() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove595");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove596() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove596");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove597() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove597");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove598() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove598");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove599() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove599");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove600() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove600");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove601() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove601");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove602() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove602");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove603() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove603");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove604() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove604");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove605() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove605");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArraysInObjects_remove606() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArraysInObjects_remove606");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.beginArray();
        jsonWriter.value(5);
        jsonWriter.value(false);
        jsonWriter.endArray();
        jsonWriter.name("b");
        jsonWriter.beginArray();
        jsonWriter.value(6);
        jsonWriter.value(true);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,("{\"a\":[5,false]," + "\"b\":[6,true]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,stringWriter,846,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingArrays_add776() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingArrays_add776");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.beginArray();
            jsonWriter.beginArray();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endArray();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,stringWriter,850,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingArrays_add777() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingArrays_add777");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.beginArray();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endArray();
            jsonWriter.endArray();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,stringWriter,850,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingArrays() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingArrays");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 1 ; i < 20 ; i++) {
            jsonWriter.beginArray();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endArray();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,stringWriter,850,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingArrays_literalMutation659() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingArrays_literalMutation659");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 0 ; i < 21 ; i++) {
            jsonWriter.beginArray();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endArray();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,stringWriter,850,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingArrays_literalMutation660() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingArrays_literalMutation660");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.beginArray();
        }
        for (int i = 1 ; i < 20 ; i++) {
            jsonWriter.endArray();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,stringWriter,850,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingArrays_literalMutation661() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingArrays_literalMutation661");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.beginArray();
        }
        for (int i = 0 ; i < 19 ; i++) {
            jsonWriter.endArray();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,stringWriter,850,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingArrays_remove627() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingArrays_remove627");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 0 ; i < 20 ; i++) {
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endArray();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,stringWriter,850,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingArrays_remove628() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingArrays_remove628");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.beginArray();
        }
        for (int i = 0 ; i < 20 ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,stringWriter,850,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_add778() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_add778");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_add779() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_add779");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_add780() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_add780");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_add781() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_add781");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_add782() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_add782");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingObjects() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 1 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingObjects_literalMutation663() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_literalMutation663");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 21 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingObjects_literalMutation664() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_literalMutation664");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("foo");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingObjects_literalMutation665() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_literalMutation665");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 1 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepNestingObjects_literalMutation666() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_literalMutation666");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 19 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_remove629() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_remove629");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_remove630() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_remove630");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_remove631() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_remove631");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_remove632() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_remove632");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
        }
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepNestingObjects_remove633() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepNestingObjects_remove633");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.name("a");
            jsonWriter.beginObject();
        }
        for (int i = 0 ; i < 20 ; i++) {
            jsonWriter.endObject();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),852,("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":" + ("{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{\"a\":{" + "}}}}}}}}}}}}}}}}}}}}}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),854,stringWriter,853,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRepeatedName_add882() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_add882");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRepeatedName_add883() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_add883");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRepeatedName_add884() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_add884");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(false);
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRepeatedName_add885() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_add885");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRepeatedName() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("foo").value(true);
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRepeatedName_literalMutation747() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_literalMutation747");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(false);
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRepeatedName_literalMutation748() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_literalMutation748");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("foo").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRepeatedName_literalMutation749() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_literalMutation749");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRepeatedName_remove724() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_remove724");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRepeatedName_remove725() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_remove725");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRepeatedName_remove726() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_remove726");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(false);
        jsonWriter.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRepeatedName_remove727() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedName_remove727");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,stringWriter,883,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add867() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add867");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add868() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add868");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add869() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add869");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add870() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add870");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add871() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add871");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add872() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add872");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add873() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add873");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add874() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add874");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add875() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add875");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add876() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add876");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add877() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add877");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add878() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add878");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add879() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add879");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add880() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add880");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_add881() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_add881");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("foo");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation717() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation717");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("foo").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation718() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation718");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(false);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation719() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation719");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("foo").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation720() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation720");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation721() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation721");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("foo").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation722() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation722");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(4.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation723() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation723");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("foo").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation724() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation724");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("foo").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation725() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation725");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(5.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation726() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation726");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(6.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation727() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation727");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("foo").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation728() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation728");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("foo").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation729() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation729");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(9.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation730() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation730");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("foo").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation731() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation731");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(10.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation732() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation732");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "foo" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation733() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation733");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("foo" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation734() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation734");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("foo" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation735() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation735");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("foo" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation736() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation736");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("foo" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation737() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation737");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("foo" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation738() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation738");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("foo" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation739() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation739");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("foo" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation740() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation740");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("foo" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation741() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation741");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("foo" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation742() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation742");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("foo" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation743() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation743");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("foo" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation744() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation744");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("foo" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintObject_literalMutation745() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_literalMutation745");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "foo"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove709() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove709");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove710() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove710");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove711() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove711");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove712() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove712");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove713() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove713");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove714() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove714");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove715() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove715");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove716() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove716");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove717() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove717");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove718() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove718");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove719() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove719");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove720() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove720");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove721() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove721");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove722() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove722");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintObject_remove723() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintObject_remove723");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(true);
        jsonWriter.name("b").value(false);
        jsonWriter.name("c").value(5.0);
        jsonWriter.name("e").nullValue();
        jsonWriter.name("f").beginArray();
        jsonWriter.value(6.0);
        jsonWriter.value(7.0);
        jsonWriter.endArray();
        jsonWriter.name("g").beginObject();
        jsonWriter.name("h").value(8.0);
        jsonWriter.name("i").value(9.0);
        jsonWriter.endObject();
        String expected = "{\n" + ("   \"a\": true,\n" + ("   \"b\": false,\n" + ("   \"c\": 5.0,\n" + ("   \"e\": null,\n" + ("   \"f\": [\n" + ("      6.0,\n" + ("      7.0\n" + ("   ],\n" + ("   \"g\": {\n" + ("      \"h\": 8.0,\n" + ("      \"i\": 9.0\n" + ("   }\n" + "}"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),880,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,stringWriter,881,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add852() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add852");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add853() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add853");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add854() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add854");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add855() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add855");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add856() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add856");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add857() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add857");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add858() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add858");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add859() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add859");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add860() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add860");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add861() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add861");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add862() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add862");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add863() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add863");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add864() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add864");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add865() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add865");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_add866() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_add866");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("foo");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation693() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation693");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation694() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation694");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(true);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation695() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation695");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(6.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation696() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation696");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("foo").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation697() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation697");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(7.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation698() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation698");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("foo").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation699() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation699");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(6.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation700() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation700");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(7.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation701() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation701");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(10.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation702() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation702");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "foo" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation703() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation703");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("foo" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation704() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation704");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("foo" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation705() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation705");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("foo" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation706() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation706");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("foo" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation707() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation707");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("foo" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation708() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation708");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("foo" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation709() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation709");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("foo" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation710() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation710");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("foo" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation711() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation711");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("foo" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation712() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation712");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("foo" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation713() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation713");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("foo" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation714() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation714");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("foo" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrettyPrintArray_literalMutation715() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_literalMutation715");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "foo"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove694() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove694");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove695() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove695");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove696() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove696");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove697() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove697");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove698() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove698");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove699() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove699");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove700() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove700");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove701() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove701");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove702() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove702");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove703() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove703");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove704() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove704");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove705() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove705");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove706() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove706");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove707() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove707");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrettyPrintArray_remove708() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrettyPrintArray_remove708");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("   ");
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value(5.0);
        jsonWriter.nullValue();
        jsonWriter.beginObject();
        jsonWriter.name("a").value(6.0);
        jsonWriter.name("b").value(7.0);
        jsonWriter.endObject();
        jsonWriter.beginArray();
        jsonWriter.value(8.0);
        jsonWriter.value(9.0);
        jsonWriter.endArray();
        String expected = "[\n" + ("   true,\n" + ("   false,\n" + ("   5.0,\n" + ("   null,\n" + ("   {\n" + ("      \"a\": 6.0,\n" + ("      \"b\": 7.0\n" + ("   },\n" + ("   [\n" + ("      8.0,\n" + ("      9.0\n" + ("   ]\n" + "]"))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),877,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,stringWriter,878,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_add799() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_add799");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_add800() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_add800");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_add801() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_add801");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_add802() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_add802");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_add803() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_add803");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_add804() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_add804");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLenientWriterPermitsMultipleTopLevelValues() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_remove650() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_remove650");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_remove651() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_remove651");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_remove652() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_remove652");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_remove653() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_remove653");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_remove654() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_remove654");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientWriterPermitsMultipleTopLevelValues_remove655() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientWriterPermitsMultipleTopLevelValues_remove655");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,stringWriter,862,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictWriterDoesNotPermitMultipleTopLevelValues() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictWriterDoesNotPermitMultipleTopLevelValues");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictWriterDoesNotPermitMultipleTopLevelValues_add887() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictWriterDoesNotPermitMultipleTopLevelValues_add887");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictWriterDoesNotPermitMultipleTopLevelValues_add888() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictWriterDoesNotPermitMultipleTopLevelValues_add888");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        try {
            writer.beginArray();
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictWriterDoesNotPermitMultipleTopLevelValues_remove728() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictWriterDoesNotPermitMultipleTopLevelValues_remove728");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.endArray();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictWriterDoesNotPermitMultipleTopLevelValues_remove729() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictWriterDoesNotPermitMultipleTopLevelValues_remove729");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_add766() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_add766");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_add767() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_add767");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_add768() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_add768");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_add769() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_add769");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_add770() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_add770");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_add771() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_add771");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_remove621() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_remove621");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_remove622() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_remove622");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnStructure_remove623() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnStructure_remove623");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            writer.endObject();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnName_add761() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnName_add761");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnName_add762() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnName_add762");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.close();
        try {
            writer.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnName_add763() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnName_add763");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close();
        try {
            writer.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnName_add764() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnName_add764");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.name("a");
            writer.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClosedWriterThrowsOnName() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnName");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.name("foo");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnName_remove618() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnName_remove618");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.endArray();
        writer.close();
        try {
            writer.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnName_remove619() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnName_remove619");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.close();
        try {
            writer.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnName_remove620() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnName_remove620");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        try {
            writer.name("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnValue_add772() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnValue_add772");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.value("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnValue_add773() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnValue_add773");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.close();
        try {
            writer.value("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnValue_add774() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnValue_add774");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close();
        try {
            writer.value("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnValue_add775() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnValue_add775");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.value("a");
            writer.value("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClosedWriterThrowsOnValue() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnValue");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.value("foo");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnValue_remove624() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnValue_remove624");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.endArray();
        writer.close();
        try {
            writer.value("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnValue_remove625() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnValue_remove625");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.close();
        try {
            writer.value("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnValue_remove626() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnValue_remove626");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        try {
            writer.value("a");
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnFlush() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnFlush");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.flush();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnFlush_add758() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnFlush_add758");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.close();
        try {
            writer.flush();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnFlush_add759() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnFlush_add759");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close();
        try {
            writer.flush();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnFlush_add760() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnFlush_add760");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.flush();
            writer.flush();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnFlush_remove615() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnFlush_remove615");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.endArray();
        writer.close();
        try {
            writer.flush();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnFlush_remove616() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnFlush_remove616");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.close();
        try {
            writer.flush();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClosedWriterThrowsOnFlush_remove617() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClosedWriterThrowsOnFlush_remove617");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        try {
            writer.flush();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterCloseIsIdempotent() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterCloseIsIdempotent");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterCloseIsIdempotent_add918() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterCloseIsIdempotent_add918");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterCloseIsIdempotent_add919() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterCloseIsIdempotent_add919");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterCloseIsIdempotent_add920() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterCloseIsIdempotent_add920");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterCloseIsIdempotent_remove756() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterCloseIsIdempotent_remove756");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.endArray();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterCloseIsIdempotent_remove757() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterCloseIsIdempotent_remove757");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.close();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterCloseIsIdempotent_remove758() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterCloseIsIdempotent_remove758");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterCloseIsIdempotent_remove759() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterCloseIsIdempotent_remove759");
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        writer.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

