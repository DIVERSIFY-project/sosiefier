package com.google.gson.internal.bind;

import java.io.IOException;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;
import junit.framework.TestCase;

@SuppressWarnings(value = "resource")
public final class JsonElementReaderTest extends TestCase {
    @Test(timeout = 1000)
    public void testNumbers_add35() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add35");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),49,reader,48,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,reader,50,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,reader,52,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_add36() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_add36");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),49,reader,48,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,reader,50,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,reader,52,reader.nextDouble());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumbers() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),49,reader,48,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,reader,50,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,reader,52,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove34() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove34");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),49,reader,48,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,reader,50,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,reader,52,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbers_remove35() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbers_remove35");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),49,reader,48,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),51,reader,50,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),53,reader,52,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add12() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add12");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(true);
        reader.setLenient(true);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,null,28,java.lang.Double.isNaN(reader.nextDouble()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),30,java.lang.Double.NEGATIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,reader,31,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,reader,34,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add13() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add13");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(true);
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,null,28,java.lang.Double.isNaN(reader.nextDouble()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),30,java.lang.Double.NEGATIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,reader,31,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,reader,34,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_add14() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_add14");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(true);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,null,28,java.lang.Double.isNaN(reader.nextDouble()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),30,java.lang.Double.NEGATIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,reader,31,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,reader,34,reader.nextDouble());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLenientNansAndInfinities() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(true);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,null,28,java.lang.Double.isNaN(reader.nextDouble()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),30,java.lang.Double.NEGATIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,reader,31,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,reader,34,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLenientNansAndInfinities_literalMutation7() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_literalMutation7");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,null,28,java.lang.Double.isNaN(reader.nextDouble()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),30,java.lang.Double.NEGATIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,reader,31,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,reader,34,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove11() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove11");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,null,28,java.lang.Double.isNaN(reader.nextDouble()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),30,java.lang.Double.NEGATIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,reader,31,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,reader,34,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove12() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove12");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,null,28,java.lang.Double.isNaN(reader.nextDouble()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),30,java.lang.Double.NEGATIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,reader,31,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,reader,34,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLenientNansAndInfinities_remove13() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLenientNansAndInfinities_remove13");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(true);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),29,null,28,java.lang.Double.isNaN(reader.nextDouble()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),30,java.lang.Double.NEGATIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),32,reader,31,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),33,java.lang.Double.POSITIVE_INFINITY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),35,reader,34,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add46() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add46");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.setLenient(false);
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add47() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add47");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.beginArray();
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add48() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add48");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.beginArray();
        try {
            reader.nextDouble();
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add49() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add49");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add50() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add50");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_add51() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_add51");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrictNansAndInfinities() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrictNansAndInfinities_literalMutation16() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_literalMutation16");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(true);
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_remove45() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_remove45");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_remove46() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_remove46");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrictNansAndInfinities_remove47() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrictNansAndInfinities_remove47");
        JsonElement element = new JsonParser().parse("[NaN, -Infinity, Infinity]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        reader.beginArray();
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),90,reader,89,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),92,reader,91,reader.nextString());
        try {
            reader.nextDouble();
        } catch (NumberFormatException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),94,reader,93,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbersFromStrings_add37() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbersFromStrings_add37");
        JsonElement element = new JsonParser().parse("[\"1\", \"2\", \"3\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),43,reader,42,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),45,reader,44,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,reader,46,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbersFromStrings_add38() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbersFromStrings_add38");
        JsonElement element = new JsonParser().parse("[\"1\", \"2\", \"3\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),43,reader,42,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),45,reader,44,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,reader,46,reader.nextDouble());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumbersFromStrings() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbersFromStrings");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),43,reader,42,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),45,reader,44,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,reader,46,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbersFromStrings_remove36() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbersFromStrings_remove36");
        JsonElement element = new JsonParser().parse("[\"1\", \"2\", \"3\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),43,reader,42,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),45,reader,44,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,reader,46,reader.nextDouble());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumbersFromStrings_remove37() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumbersFromStrings_remove37");
        JsonElement element = new JsonParser().parse("[\"1\", \"2\", \"3\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),43,reader,42,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),45,reader,44,reader.nextLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),47,reader,46,reader.nextDouble());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsFromNumbers() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsFromNumbers");
        JsonElement element = new JsonParser().parse("[1]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),96,reader,95,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringsFromNumbers_add54() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsFromNumbers_add54");
        JsonElement element = new JsonParser().parse("[1]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),96,reader,95,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringsFromNumbers_add55() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsFromNumbers_add55");
        JsonElement element = new JsonParser().parse("[1]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),96,reader,95,reader.nextString());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsFromNumbers_literalMutation18() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsFromNumbers_literalMutation18");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),96,reader,95,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringsFromNumbers_remove50() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsFromNumbers_remove50");
        JsonElement element = new JsonParser().parse("[1]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),96,reader,95,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringsFromNumbers_remove51() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsFromNumbers_remove51");
        JsonElement element = new JsonParser().parse("[1]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),96,reader,95,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_add3() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_add3");
        JsonElement element = new JsonParser().parse("[true, false]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),25,reader,24,reader.nextBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),27,reader,26,reader.nextBoolean());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_add4() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_add4");
        JsonElement element = new JsonParser().parse("[true, false]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),25,reader,24,reader.nextBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),27,reader,26,reader.nextBoolean());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleans() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),25,reader,24,reader.nextBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),27,reader,26,reader.nextBoolean());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_remove3() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_remove3");
        JsonElement element = new JsonParser().parse("[true, false]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),25,reader,24,reader.nextBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),27,reader,26,reader.nextBoolean());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleans_remove4() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleans_remove4");
        JsonElement element = new JsonParser().parse("[true, false]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),25,reader,24,reader.nextBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),27,reader,26,reader.nextBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_add31() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_add31");
        JsonElement element = new JsonParser().parse("[null,null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.nextNull();
        reader.nextNull();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_add32() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_add32");
        JsonElement element = new JsonParser().parse("[null,null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.nextNull();
        reader.nextNull();
        reader.nextNull();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_add33() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_add33");
        JsonElement element = new JsonParser().parse("[null,null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.nextNull();
        reader.nextNull();
        reader.nextNull();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_add34() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_add34");
        JsonElement element = new JsonParser().parse("[null,null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.nextNull();
        reader.nextNull();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNulls() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.nextNull();
        reader.nextNull();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_remove30() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_remove30");
        JsonElement element = new JsonParser().parse("[null,null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.nextNull();
        reader.nextNull();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_remove31() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_remove31");
        JsonElement element = new JsonParser().parse("[null,null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.nextNull();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_remove32() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_remove32");
        JsonElement element = new JsonParser().parse("[null,null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.nextNull();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNulls_remove33() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNulls_remove33");
        JsonElement element = new JsonParser().parse("[null,null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.nextNull();
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add52() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add52");
        JsonElement element = new JsonParser().parse("[\"A\",\"B\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),98,reader,97,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),100,reader,99,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_add53() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_add53");
        JsonElement element = new JsonParser().parse("[\"A\",\"B\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),98,reader,97,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),100,reader,99,reader.nextString());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStrings() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),98,reader,97,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),100,reader,99,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove48() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove48");
        JsonElement element = new JsonParser().parse("[\"A\",\"B\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),98,reader,97,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),100,reader,99,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStrings_remove49() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStrings_remove49");
        JsonElement element = new JsonParser().parse("[\"A\",\"B\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),98,reader,97,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),100,reader,99,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_add1() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_add1");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),0,com.google.gson.stream.JsonToken.BEGIN_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2,reader,1,reader.peek());
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,reader,4,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7,reader,6,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),10,reader,9,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,reader,11,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),13,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),15,reader,14,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),17,reader,16,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),18,com.google.gson.stream.JsonToken.END_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),20,reader,19,reader.peek());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),21,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),23,reader,22,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_add2() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_add2");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),0,com.google.gson.stream.JsonToken.BEGIN_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2,reader,1,reader.peek());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,reader,4,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7,reader,6,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),10,reader,9,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,reader,11,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),13,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),15,reader,14,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),17,reader,16,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),18,com.google.gson.stream.JsonToken.END_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),20,reader,19,reader.peek());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),21,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),23,reader,22,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),0,com.google.gson.stream.JsonToken.BEGIN_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2,reader,1,reader.peek());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,reader,4,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7,reader,6,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),10,reader,9,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,reader,11,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),13,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),15,reader,14,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),17,reader,16,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),18,com.google.gson.stream.JsonToken.END_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),20,reader,19,reader.peek());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),21,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),23,reader,22,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_remove1() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_remove1");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),0,com.google.gson.stream.JsonToken.BEGIN_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2,reader,1,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,reader,4,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7,reader,6,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),10,reader,9,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,reader,11,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),13,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),15,reader,14,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),17,reader,16,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),18,com.google.gson.stream.JsonToken.END_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),20,reader,19,reader.peek());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),21,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),23,reader,22,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArray_remove2() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArray_remove2");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),0,com.google.gson.stream.JsonToken.BEGIN_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2,reader,1,reader.peek());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,reader,4,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7,reader,6,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),10,reader,9,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,reader,11,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),13,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),15,reader,14,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),17,reader,16,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),18,com.google.gson.stream.JsonToken.END_ARRAY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),20,reader,19,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),21,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),23,reader,22,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_add39() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_add39");
        JsonElement element = new JsonParser().parse("{\"A\": 1, \"B\": 2}");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),54,com.google.gson.stream.JsonToken.BEGIN_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),56,reader,55,reader.peek());
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),57,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),59,reader,58,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),61,reader,60,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),62,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),64,reader,63,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),66,reader,65,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),67,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),69,reader,68,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),71,reader,70,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),72,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),74,reader,73,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,reader,75,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,com.google.gson.stream.JsonToken.END_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),79,reader,78,reader.peek());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),82,reader,81,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_add40() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_add40");
        JsonElement element = new JsonParser().parse("{\"A\": 1, \"B\": 2}");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),54,com.google.gson.stream.JsonToken.BEGIN_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),56,reader,55,reader.peek());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),57,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),59,reader,58,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),61,reader,60,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),62,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),64,reader,63,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),66,reader,65,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),67,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),69,reader,68,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),71,reader,70,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),72,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),74,reader,73,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,reader,75,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,com.google.gson.stream.JsonToken.END_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),79,reader,78,reader.peek());
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),82,reader,81,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),54,com.google.gson.stream.JsonToken.BEGIN_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),56,reader,55,reader.peek());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),57,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),59,reader,58,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),61,reader,60,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),62,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),64,reader,63,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),66,reader,65,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),67,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),69,reader,68,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),71,reader,70,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),72,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),74,reader,73,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,reader,75,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,com.google.gson.stream.JsonToken.END_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),79,reader,78,reader.peek());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),82,reader,81,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_remove38() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_remove38");
        JsonElement element = new JsonParser().parse("{\"A\": 1, \"B\": 2}");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),54,com.google.gson.stream.JsonToken.BEGIN_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),56,reader,55,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),57,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),59,reader,58,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),61,reader,60,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),62,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),64,reader,63,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),66,reader,65,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),67,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),69,reader,68,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),71,reader,70,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),72,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),74,reader,73,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,reader,75,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,com.google.gson.stream.JsonToken.END_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),79,reader,78,reader.peek());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),82,reader,81,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObject_remove39() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObject_remove39");
        JsonElement element = new JsonParser().parse("{\"A\": 1, \"B\": 2}");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),54,com.google.gson.stream.JsonToken.BEGIN_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),56,reader,55,reader.peek());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),57,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),59,reader,58,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),61,reader,60,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),62,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),64,reader,63,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),66,reader,65,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),67,com.google.gson.stream.JsonToken.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),69,reader,68,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),71,reader,70,reader.nextName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),72,com.google.gson.stream.JsonToken.NUMBER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),74,reader,73,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),76,reader,75,reader.nextInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),77,com.google.gson.stream.JsonToken.END_OBJECT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),79,reader,78,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),80,com.google.gson.stream.JsonToken.END_DOCUMENT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),82,reader,81,reader.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyArray_add8() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray_add8");
        JsonElement element = new JsonParser().parse("[]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyArray_add9() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray_add9");
        JsonElement element = new JsonParser().parse("[]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyArray_remove7() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray_remove7");
        JsonElement element = new JsonParser().parse("[]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyArray_remove8() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyArray_remove8");
        JsonElement element = new JsonParser().parse("[]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_add15() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_add15");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_add16() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_add16");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_add17() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_add17");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_add18() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_add18");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_add19() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_add19");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_add20() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_add20");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_add21() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_add21");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_add22() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_add22");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedArrays() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_remove14() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_remove14");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_remove15() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_remove15");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_remove16() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_remove16");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_remove17() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_remove17");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_remove18() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_remove18");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.endArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_remove19() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_remove19");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_remove20() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_remove20");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedArrays_remove21() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedArrays_remove21");
        JsonElement element = new JsonParser().parse("[[],[[]]]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_add23() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_add23");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_add24() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_add24");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_add25() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_add25");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_add26() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_add26");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_add27() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_add27");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_add28() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_add28");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_add29() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_add29");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_add30() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_add30");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedObjects() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_remove22() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_remove22");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_remove23() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_remove23");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_remove24() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_remove24");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_remove25() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_remove25");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_remove26() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_remove26");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_remove27() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_remove27");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_remove28() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_remove28");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNestedObjects_remove29() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedObjects_remove29");
        JsonElement element = new JsonParser().parse("{\"A\":{},\"B\":{\"C\":{}}}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),37,reader,36,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),39,reader,38,reader.nextName());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),41,reader,40,reader.nextName());
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyObject_add10() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject_add10");
        JsonElement element = new JsonParser().parse("{}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyObject_add11() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject_add11");
        JsonElement element = new JsonParser().parse("{}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyObject() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyObject_remove10() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject_remove10");
        JsonElement element = new JsonParser().parse("{}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyObject_remove9() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyObject_remove9");
        JsonElement element = new JsonParser().parse("{}");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_add41() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_add41");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_add42() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_add42");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_add43() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_add43");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_add44() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_add44");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_add45() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_add45");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipValue() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_remove40() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_remove40");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_remove41() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_remove41");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_remove42() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_remove42");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_remove43() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_remove43");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipValue_remove44() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipValue_remove44");
        JsonElement element = new JsonParser().parse("[\"A\",{\"B\":[[]]},\"C\",[[]],\"D\",null]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),84,reader,83,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),86,reader,85,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),88,reader,87,reader.nextString());
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add56() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add56");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add57() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add57");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add58() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add58");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add59() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add59");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add60() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add60");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add61() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add61");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add62() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add62");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add63() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add63");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add64() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add64");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add65() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add65");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add66() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add66");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add67() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add67");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add68() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add68");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add69() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add69");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add70() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add70");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add71() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add71");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add72() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add72");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add73() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add73");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add74() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add74");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_add75() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_add75");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWrongType() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_remove52() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_remove52");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_remove53() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_remove53");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_remove54() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_remove54");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWrongType_remove55() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWrongType_remove55");
        JsonElement element = new JsonParser().parse("[[],\"A\"]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextString();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextLong();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextDouble();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.beginObject();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endArray();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.endObject();
        } catch (IllegalStateException expected) {
        }
        reader.beginArray();
        try {
            reader.nextBoolean();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextNull();
        } catch (IllegalStateException expected) {
        }
        try {
            reader.nextInt();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextLong();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextDouble();
        } catch (NumberFormatException expected) {
        }
        try {
            reader.nextName();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),102,reader,101,reader.nextString());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEarlyClose_add5() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEarlyClose_add5");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.beginArray();
        reader.close();
        try {
            reader.peek();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEarlyClose_add6() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEarlyClose_add6");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.close();
        reader.close();
        try {
            reader.peek();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEarlyClose_add7() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEarlyClose_add7");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.close();
        try {
            reader.peek();
            reader.peek();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEarlyClose() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEarlyClose");
        JsonElement element = new JsonParser().parse("foo");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        reader.close();
        try {
            reader.peek();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEarlyClose_remove5() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEarlyClose_remove5");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.close();
        try {
            reader.peek();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEarlyClose_remove6() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEarlyClose_remove6");
        JsonElement element = new JsonParser().parse("[1, 2, 3]");
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.beginArray();
        try {
            reader.peek();
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

