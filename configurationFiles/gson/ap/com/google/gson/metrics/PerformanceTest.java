package com.google.gson.metrics;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.Gson;
import java.util.HashMap;
import com.google.gson.JsonParseException;
import java.util.List;
import java.util.Map;
import java.io.StringWriter;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Tests to measure performance for Gson. All tests in this file will be disabled in code. To run
 * them remove disabled_ prefix from the tests and run them.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PerformanceTest extends TestCase {
    private static final int COLLECTION_SIZE = 5000;

    private static final int NUM_ITERATIONS = 100;

    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testDummy() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDummy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testStringDeserialization_add1488() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_add1488");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testStringDeserialization_add1489() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_add1489");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testStringDeserialization_add1490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_add1490");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testStringDeserialization_add1491() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_add1491");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testStringDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization");
        StringBuilder sb = new StringBuilder(8095);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testStringDeserialization_literalMutation2175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_literalMutation2175");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("foo");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testStringDeserialization_literalMutation2176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_literalMutation2176");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testStringDeserialization_literalMutation2177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_literalMutation2177");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("foo" + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testStringDeserialization_literalMutation2178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_literalMutation2178");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "foo") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testStringDeserialization_literalMutation2179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_literalMutation2179");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "foo";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testStringDeserialization_literalMutation2180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_literalMutation2180");
        StringBuilder sb = new StringBuilder(8096);
        sb.append("Error Yippie");
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("foo" + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testStringDeserialization_remove1236() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testStringDeserialization_remove1236");
        StringBuilder sb = new StringBuilder(8096);
        while (true) {
            try {
                String stackTrace = sb.toString();
                sb.append(stackTrace);
                String json = (("{\"message\":\"Error message.\"," + "\"stackTrace\":\"") + stackTrace) + "\"}";
                parseLongJson(json);
                System.out.println(("Gson could handle a string of size: " + (stackTrace.length())));
            } catch (JsonParseException expected) {
                break;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void parseLongJson(String json) throws JsonParseException {
        ExceptionHolder target = gson.fromJson(json, ExceptionHolder.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2645,target.message,2644,target.message.contains("Error"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2647,target.stackTrace,2646,target.stackTrace.contains("Yippie"));
    }

    private static class ExceptionHolder {
        public final String message;

        public final String stackTrace;

        @SuppressWarnings(value = "unused")
        private ExceptionHolder() {
            this("", "");
        }

        public ExceptionHolder(String message ,String stackTrace) {
            this.message = message;
            this.stackTrace = stackTrace;
        }
    }

    @SuppressWarnings(value = "unused")
    private static class CollectionEntry {
        final String name;

        final String value;

        private CollectionEntry() {
            this(null, null);
        }

        CollectionEntry(String name ,String value) {
            this.name = name;
            this.value = value;
        }
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionSerialization_add1477() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionSerialization_add1477");
        int count = 1400000;
        List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
        for (int i = 0 ; i < count ; ++i) {
            list.add(new CollectionEntry(("name" + i) , ("value" + i)));
            list.add(new CollectionEntry(("name" + i) , ("value" + i)));
        }
        gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionSerialization_add1478() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionSerialization_add1478");
        int count = 1400000;
        List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
        for (int i = 0 ; i < count ; ++i) {
            list.add(new CollectionEntry(("name" + i) , ("value" + i)));
        }
        gson.toJson(list);
        gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionSerialization");
        int count = 1399999;
        List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
        for (int i = 0 ; i < count ; ++i) {
            list.add(new CollectionEntry(("name" + i) , ("value" + i)));
        }
        gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionSerialization_literalMutation2158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionSerialization_literalMutation2158");
        int count = 1400000;
        List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
        for (int i = 1 ; i < count ; ++i) {
            list.add(new CollectionEntry(("name" + i) , ("value" + i)));
        }
        gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionSerialization_literalMutation2159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionSerialization_literalMutation2159");
        int count = 1400000;
        List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
        for (int i = 0 ; i < count ; ++i) {
            list.add(new CollectionEntry(("foo" + i) , ("value" + i)));
        }
        gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionSerialization_literalMutation2160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionSerialization_literalMutation2160");
        int count = 1400000;
        List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
        for (int i = 0 ; i < count ; ++i) {
            list.add(new CollectionEntry(("name" + i) , ("foo" + i)));
        }
        gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionSerialization_remove1225() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionSerialization_remove1225");
        int count = 1400000;
        List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
        for (int i = 0 ; i < count ; ++i) {
        }
        gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionSerialization_remove1226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionSerialization_remove1226");
        int count = 1400000;
        List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
        for (int i = 0 ; i < count ; ++i) {
            list.add(new CollectionEntry(("name" + i) , ("value" + i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_add1472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_add1472");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_add1473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_add1473");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_add1474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_add1474");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_add1475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_add1475");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_add1476() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_add1476");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization");
        StringBuilder sb = new StringBuilder();
        int count = 87001;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionDeserialization_literalMutation2148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_literalMutation2148");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = false;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionDeserialization_literalMutation2150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_literalMutation2150");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 1 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionDeserialization_literalMutation2151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_literalMutation2151");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = true;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionDeserialization_literalMutation2153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_literalMutation2153");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("foo").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionDeserialization_literalMutation2154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_literalMutation2154");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("foo").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
public void disabled_testLargeCollectionDeserialization_literalMutation2155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_literalMutation2155");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("foo");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_remove1220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_remove1220");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_remove1221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_remove1221");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_remove1222() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_remove1222");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_remove1223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_remove1223");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */
@Test(timeout = 1000)
    public void disabled_testLargeCollectionDeserialization_remove1224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeCollectionDeserialization_remove1224");
        StringBuilder sb = new StringBuilder();
        int count = 87000;
        boolean first = true;
        sb.append('[');
        for (int i = 0 ; i < count ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(',');
            }
            sb.append("{name:\'name").append(i).append("\',value:\'value").append(i).append("\'}");
        }
        sb.append(']');
        String json = sb.toString();
        Type collectionType = new TypeToken<java.util.ArrayList<CollectionEntry>>() {        }.getType();
        List<CollectionEntry> list = gson.fromJson(json, collectionType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,list,2642,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
     */

    @Test(timeout = 1000)
    public void disabled_testSerializeClasses_add1482() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_add1482");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeClasses_add1483() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_add1483");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeClasses_add1484() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_add1484");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeClasses() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses");
        ClassWithList c = new ClassWithList("foo");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeClasses_literalMutation2165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_literalMutation2165");
        ClassWithList c = new ClassWithList("str");
        for (int i = -1 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeClasses_literalMutation2166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_literalMutation2166");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("foo" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeClasses_literalMutation2167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_literalMutation2167");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = -1 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeClasses_literalMutation2168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_literalMutation2168");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("foo", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeClasses_remove1230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_remove1230");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeClasses_remove1231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_remove1231");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeClasses_remove1232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeClasses_remove1232");
        ClassWithList c = new ClassWithList("str");
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            c.list.add(new ClassWithField(("element-" + i)));
        }
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testDeserializeClasses_add1470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testDeserializeClasses_add1470");
        String json = buildJsonForClassWithList();
        ClassWithList[] target = new ClassWithList[NUM_ITERATIONS];
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            target[i] = gson.fromJson(json, ClassWithList.class);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Deserialize classes avg time: %d ms\n", avg);
        System.out.printf("Deserialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testDeserializeClasses() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testDeserializeClasses");
        String json = buildJsonForClassWithList();
        ClassWithList[] target = new ClassWithList[NUM_ITERATIONS];
        long t1 = System.currentTimeMillis();
        for (int i = -1 ; i < (NUM_ITERATIONS) ; ++i) {
            target[i] = gson.fromJson(json, ClassWithList.class);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Deserialize classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testDeserializeClasses_literalMutation2144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testDeserializeClasses_literalMutation2144");
        String json = buildJsonForClassWithList();
        ClassWithList[] target = new ClassWithList[NUM_ITERATIONS];
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            target[i] = gson.fromJson(json, ClassWithList.class);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("foo", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testDeserializeClasses_remove1218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testDeserializeClasses_remove1218");
        String json = buildJsonForClassWithList();
        ClassWithList[] target = new ClassWithList[NUM_ITERATIONS];
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            target[i] = gson.fromJson(json, ClassWithList.class);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_add1463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_add1463");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_add1464() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_add1464");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_add1465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_add1465");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_add1466() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_add1466");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_add1467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_add1467");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testLargeObjectSerializationAndDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 1 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testLargeObjectSerializationAndDeserialization_literalMutation2133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_literalMutation2133");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100001 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testLargeObjectSerializationAndDeserialization_literalMutation2134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_literalMutation2134");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("foo" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testLargeObjectSerializationAndDeserialization_literalMutation2135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_literalMutation2135");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("foo", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testLargeObjectSerializationAndDeserialization_literalMutation2136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_literalMutation2136");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("foo", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_remove1211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_remove1211");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_remove1212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_remove1212");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_remove1213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_remove1213");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_remove1214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_remove1214");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disable_testLargeObjectSerializationAndDeserialization_remove1215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testLargeObjectSerializationAndDeserialization_remove1215");
        Map<java.lang.String, java.lang.Long> largeObject = new HashMap<java.lang.String, java.lang.Long>();
        for (long l = 0 ; l < 100000 ; l++) {
            largeObject.put(("field" + l), l);
        }
        long t1 = System.currentTimeMillis();
        String json = gson.toJson(largeObject);
        long t2 = System.currentTimeMillis();
        t1 = System.currentTimeMillis();
        gson.fromJson(json, new TypeToken<java.util.Map<java.lang.String, java.lang.Long>>() {        }.getType());
        t2 = System.currentTimeMillis();
        System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeExposedClasses_add1485() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_add1485");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeExposedClasses_add1486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_add1486");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeExposedClasses_add1487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_add1487");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeExposedClasses() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("foo");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeExposedClasses_literalMutation2170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_literalMutation2170");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 1 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeExposedClasses_literalMutation2171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_literalMutation2171");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("foo" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeExposedClasses_literalMutation2172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_literalMutation2172");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 1 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testSerializeExposedClasses_literalMutation2173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_literalMutation2173");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("foo", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeExposedClasses_remove1233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_remove1233");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeExposedClasses_remove1234() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_remove1234");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testSerializeExposedClasses_remove1235() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testSerializeExposedClasses_remove1235");
        ClassWithListOfObjects c1 = new ClassWithListOfObjects("str");
        for (int i1 = 0 ; i1 < (COLLECTION_SIZE) ; ++i1) {
            c1.list.add(new ClassWithExposedField(("element-" + i1)));
        }
        ClassWithListOfObjects c = c1;
        StringWriter w = new StringWriter();
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            gson.toJson(c, w);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testDeserializeExposedClasses_add1471() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testDeserializeExposedClasses_add1471");
        String json = buildJsonForClassWithList();
        ClassWithListOfObjects[] target = new ClassWithListOfObjects[NUM_ITERATIONS];
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            target[i] = gson.fromJson(json, ClassWithListOfObjects.class);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Deserialize exposed classes avg time: %d ms\n", avg);
        System.out.printf("Deserialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testDeserializeExposedClasses() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testDeserializeExposedClasses");
        String json = buildJsonForClassWithList();
        ClassWithListOfObjects[] target = new ClassWithListOfObjects[NUM_ITERATIONS];
        long t1 = System.currentTimeMillis();
        for (int i = 1 ; i < (NUM_ITERATIONS) ; ++i) {
            target[i] = gson.fromJson(json, ClassWithListOfObjects.class);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("Deserialize exposed classes avg time: %d ms\n", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testDeserializeExposedClasses_literalMutation2146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testDeserializeExposedClasses_literalMutation2146");
        String json = buildJsonForClassWithList();
        ClassWithListOfObjects[] target = new ClassWithListOfObjects[NUM_ITERATIONS];
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            target[i] = gson.fromJson(json, ClassWithListOfObjects.class);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        System.out.printf("foo", avg);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testDeserializeExposedClasses_remove1219() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testDeserializeExposedClasses_remove1219");
        String json = buildJsonForClassWithList();
        ClassWithListOfObjects[] target = new ClassWithListOfObjects[NUM_ITERATIONS];
        long t1 = System.currentTimeMillis();
        for (int i = 0 ; i < (NUM_ITERATIONS) ; ++i) {
            target[i] = gson.fromJson(json, ClassWithListOfObjects.class);
        }
        long t2 = System.currentTimeMillis();
        long avg = (t2 - t1) / (NUM_ITERATIONS);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testLargeGsonMapRoundTrip_add1479() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip_add1479");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 0 ; i < 1000000 ; i++) {
            original.put(i, (i + 1));
            original.put(i, (i + 1));
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        gson.fromJson(json, longToLong);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testLargeGsonMapRoundTrip_add1480() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip_add1480");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 0 ; i < 1000000 ; i++) {
            original.put(i, (i + 1));
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        gson.fromJson(json, longToLong);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testLargeGsonMapRoundTrip_add1481() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip_add1481");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 0 ; i < 1000000 ; i++) {
            original.put(i, (i + 1));
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        gson.fromJson(json, longToLong);
        gson.fromJson(json, longToLong);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testLargeGsonMapRoundTrip() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 1 ; i < 1000000 ; i++) {
            original.put(i, (i + 1));
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        gson.fromJson(json, longToLong);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testLargeGsonMapRoundTrip_literalMutation2162() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip_literalMutation2162");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 0 ; i < 999999 ; i++) {
            original.put(i, (i + 1));
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        gson.fromJson(json, longToLong);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testLargeGsonMapRoundTrip_literalMutation2163() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip_literalMutation2163");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 0 ; i < 1000000 ; i++) {
            original.put(i, (i + 0));
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        gson.fromJson(json, longToLong);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testLargeGsonMapRoundTrip_remove1227() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip_remove1227");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 0 ; i < 1000000 ; i++) {
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        gson.fromJson(json, longToLong);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testLargeGsonMapRoundTrip_remove1228() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip_remove1228");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 0 ; i < 1000000 ; i++) {
            original.put(i, (i + 1));
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        gson.fromJson(json, longToLong);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testLargeGsonMapRoundTrip_remove1229() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testLargeGsonMapRoundTrip_remove1229");
        Map<java.lang.Long, java.lang.Long> original = new HashMap<java.lang.Long, java.lang.Long>();
        for (long i = 0 ; i < 1000000 ; i++) {
            original.put(i, (i + 1));
        }
        Gson gson = new Gson();
        String json = gson.toJson(original);
        Type longToLong = new TypeToken<java.util.Map<java.lang.Long, java.lang.Long>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private String buildJsonForClassWithList() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("field:").append("\'str\',");
        sb.append("list:[");
        boolean first = true;
        for (int i = 0 ; i < (COLLECTION_SIZE) ; ++i) {
            if (first) {
                first = false;
            } else {
                sb.append(",");
            }
            sb.append((("{field:\'element-" + i) + "\'}"));
        }
        sb.append("]");
        sb.append("}");
        String json = sb.toString();
        return json;
    }

    @SuppressWarnings(value = "unused")
    private static final class ClassWithList {
        final String field;

        final List<ClassWithField> list = new ArrayList<ClassWithField>(PerformanceTest.COLLECTION_SIZE);

        ClassWithList() {
            this(null);
        }

        ClassWithList(String field) {
            this.field = field;
        }
    }

    @SuppressWarnings(value = "unused")
    private static final class ClassWithField {
        final String field;

        ClassWithField() {
            this("");
        }

        public ClassWithField(String field) {
            this.field = field;
        }
    }

    @SuppressWarnings(value = "unused")
    private static final class ClassWithListOfObjects {
        @Expose
        final String field;

        @Expose
        final List<ClassWithExposedField> list = new ArrayList<ClassWithExposedField>(PerformanceTest.COLLECTION_SIZE);

        ClassWithListOfObjects() {
            this(null);
        }

        ClassWithListOfObjects(String field) {
            this.field = field;
        }
    }

    @SuppressWarnings(value = "unused")
    private static final class ClassWithExposedField {
        @Expose
        final String field;

        ClassWithExposedField() {
            this("");
        }

        ClassWithExposedField(String field) {
            this.field = field;
        }
    }
}

