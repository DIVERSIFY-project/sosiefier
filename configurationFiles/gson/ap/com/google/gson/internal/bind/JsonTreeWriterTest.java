package com.google.gson.internal.bind;

import java.io.IOException;
import org.junit.Test;
import junit.framework.TestCase;

@SuppressWarnings(value = "resource")
public final class JsonTreeWriterTest extends TestCase {
    public void testArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_add76() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_add76");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_add77() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_add77");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_add78() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_add78");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_add79() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_add79");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_add80() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_add80");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArray_literalMutation20() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_literalMutation20");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(2);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArray_literalMutation21() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_literalMutation21");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(1);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArray_literalMutation22() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_literalMutation22");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(2);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_remove56() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_remove56");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_remove57() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_remove57");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_remove58() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_remove58");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_remove59() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_remove59");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(2);
        writer.value(3);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_remove60() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_remove60");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),104,writer.get(),103,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_add88() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_add88");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_add89() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_add89");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_add90() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_add90");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_add91() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_add91");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_add92() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_add92");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_add93() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_add93");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_add94() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_add94");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_remove67() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_remove67");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_remove68() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_remove68");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_remove69() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_remove69");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_remove70() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_remove70");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_remove71() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_remove71");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_remove72() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_remove72");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_remove73() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_remove73");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArray_remove74() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArray_remove74");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),111,writer.get(),110,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A").value(1);
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_add106() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_add106");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.beginObject();
        writer.name("A").value(1);
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_add107() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_add107");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A").value(1);
        writer.name("A").value(1);
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_add108() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_add108");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A").value(1);
        writer.name("B").value(2);
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_add109() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_add109");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A").value(1);
        writer.name("B").value(2);
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObject_literalMutation27() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_literalMutation27");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("foo").value(1);
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObject_literalMutation28() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_literalMutation28");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A").value(2);
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObject_literalMutation29() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_literalMutation29");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A").value(1);
        writer.name("foo").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObject_literalMutation30() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_literalMutation30");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A").value(1);
        writer.name("B").value(1);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_remove86() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_remove86");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.name("A").value(1);
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_remove87() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_remove87");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_remove88() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_remove88");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("B").value(2);
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_remove89() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_remove89");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A").value(1);
        writer.name("B").value(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),115,writer.get(),114,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add100() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add100");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add101() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add101");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add102() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add102");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add103() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add103");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add104() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add104");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add105() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add105");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add95() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add95");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add96() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add96");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add97() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add97");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add98() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add98");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_add99() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_add99");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("foo");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedObject_literalMutation25() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_literalMutation25");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("foo");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedObject_literalMutation26() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_literalMutation26");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("foo");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove75() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove75");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove76() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove76");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove77() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove77");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove78() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove78");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove79() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove79");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove80() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove80");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove81() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove81");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove82() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove82");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove83() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove83");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove84() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove84");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObject_remove85() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObject_remove85");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.beginObject();
        writer.name("B");
        writer.beginObject();
        writer.endObject();
        writer.name("C");
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),113,writer.get(),112,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_add133() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_add133");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.setLenient(true);
        writer.beginArray();
        writer.value("A");
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_add134() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_add134");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.beginArray();
        writer.value("A");
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_add135() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_add135");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value("A");
        writer.value("A");
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_add136() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_add136");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value("A");
        writer.endArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_add137() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_add137");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value("A");
        writer.endArray();
        writer.close();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_add138() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_add138");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value("A");
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteAfterClose() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value("A");
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteAfterClose_literalMutation39() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_literalMutation39");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value("foo");
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_remove106() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_remove106");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value("A");
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_remove107() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_remove107");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.value("A");
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_remove108() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_remove108");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_remove109() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_remove109");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value("A");
        writer.close();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteAfterClose_remove110() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteAfterClose_remove110");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value("A");
        writer.endArray();
        try {
            writer.beginArray();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrematureClose_add110() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrematureClose_add110");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.setLenient(true);
        writer.beginArray();
        try {
            writer.close();
        } catch (IOException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrematureClose_add111() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrematureClose_add111");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.beginArray();
        try {
            writer.close();
        } catch (IOException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrematureClose_add112() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrematureClose_add112");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        try {
            writer.close();
            writer.close();
        } catch (IOException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrematureClose() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrematureClose");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.close();
        } catch (IOException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrematureClose_remove90() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrematureClose_remove90");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        try {
            writer.close();
        } catch (IOException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPrematureClose_remove91() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrematureClose_remove91");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        try {
            writer.close();
        } catch (IOException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_add113() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_add113");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_add114() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_add114");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_add115() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_add115");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("A");
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_add116() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_add116");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_add117() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_add117");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNullsFalse() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNullsFalse_literalMutation33() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_literalMutation33");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("foo");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_remove92() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_remove92");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_remove93() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_remove93");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_remove94() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_remove94");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_remove95() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_remove95");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("A");
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsFalse_remove96() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsFalse_remove96");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),117,writer.get(),116,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_add118() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_add118");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_add119() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_add119");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_add120() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_add120");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("A");
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_add121() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_add121");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_add122() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_add122");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNullsTrue() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeNullsTrue_literalMutation35() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_literalMutation35");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("foo");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_remove100() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_remove100");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("A");
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_remove101() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_remove101");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_remove97() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_remove97");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_remove98() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_remove98");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.name("A");
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeNullsTrue_remove99() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeNullsTrue_remove99");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.nullValue();
        writer.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),119,writer.get(),118,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyWriter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyWriter");
        JsonTreeWriter writer = new JsonTreeWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),105,com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),107,writer,106,writer.get());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLenientNansAndInfinities() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add81() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add81");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add82() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add82");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add83() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add83");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add84() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add84");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add85() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add85");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add86() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add86");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLenientNansAndInfinities_literalMutation23() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_literalMutation23");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove61() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove61");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove62() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove62");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove63() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove63");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove64() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove64");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove65() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove65");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        writer.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove66() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove66");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(java.lang.Double.NaN);
        writer.value(java.lang.Double.NEGATIVE_INFINITY);
        writer.value(java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),109,writer.get(),108,writer.get().toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrictNansAndInfinities() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add128() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add128");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add129() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add129");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        writer.beginArray();
        try {
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add130() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add130");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(java.lang.Double.NaN);
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add131() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add131");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add132() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add132");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrictNansAndInfinities_literalMutation37() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_literalMutation37");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_remove104() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_remove104");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        try {
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_remove105() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_remove105");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        try {
            writer.value(java.lang.Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(java.lang.Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictBoxedNansAndInfinities_add123() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictBoxedNansAndInfinities_add123");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictBoxedNansAndInfinities_add124() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictBoxedNansAndInfinities_add124");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        writer.beginArray();
        try {
            writer.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictBoxedNansAndInfinities_add125() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictBoxedNansAndInfinities_add125");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(new java.lang.Double(java.lang.Double.NaN));
            writer.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictBoxedNansAndInfinities_add126() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictBoxedNansAndInfinities_add126");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictBoxedNansAndInfinities_add127() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictBoxedNansAndInfinities_add127");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        writer.beginArray();
        try {
            writer.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrictBoxedNansAndInfinities() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictBoxedNansAndInfinities");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        try {
            writer.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictBoxedNansAndInfinities_remove102() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictBoxedNansAndInfinities_remove102");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        try {
            writer.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictBoxedNansAndInfinities_remove103() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictBoxedNansAndInfinities_remove103");
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        try {
            writer.value(new java.lang.Double(java.lang.Double.NaN));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        try {
            writer.value(new java.lang.Double(java.lang.Double.POSITIVE_INFINITY));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

