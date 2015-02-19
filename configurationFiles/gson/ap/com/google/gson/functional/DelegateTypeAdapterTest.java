package com.google.gson.functional;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for {@link Gson#getDelegateAdapter(TypeAdapterFactory, TypeToken)} method.
 * 
 * @author Inderjeet Singh
 */
public class DelegateTypeAdapterTest extends TestCase {
    private StatsTypeAdapterFactory stats;

    private Gson gson;

    protected void setUp() throws Exception {
        super.setUp();
        stats = new StatsTypeAdapterFactory();
        gson = new GsonBuilder().registerTypeAdapterFactory(stats).create();
    }

    @Test(timeout = 1000)
    public void testDelegateInvoked_add1112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvoked_add1112");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> bags = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 10 ; ++i) {
            bags.add(new TestTypes.BagOfPrimitives(i , i , ((i % 2) == 0) , String.valueOf(i)));
            bags.add(new TestTypes.BagOfPrimitives(i , i , ((i % 2) == 0) , String.valueOf(i)));
        }
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDelegateInvoked_add1113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvoked_add1113");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> bags = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 10 ; ++i) {
            bags.add(new TestTypes.BagOfPrimitives(i , i , ((i % 2) == 0) , String.valueOf(i)));
        }
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvoked() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvoked");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> bags = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = -1 ; i < 10 ; ++i) {
            bags.add(new TestTypes.BagOfPrimitives(i , i , ((i % 2) == 0) , String.valueOf(i)));
        }
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvoked_literalMutation1203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvoked_literalMutation1203");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> bags = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 11 ; ++i) {
            bags.add(new TestTypes.BagOfPrimitives(i , i , ((i % 2) == 0) , String.valueOf(i)));
        }
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvoked_literalMutation1204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvoked_literalMutation1204");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> bags = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 10 ; ++i) {
            bags.add(new TestTypes.BagOfPrimitives(i , i , ((i % 3) == 0) , String.valueOf(i)));
        }
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvoked_literalMutation1205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvoked_literalMutation1205");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> bags = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 10 ; ++i) {
            bags.add(new TestTypes.BagOfPrimitives(i , i , ((i % 2) == -1) , String.valueOf(i)));
        }
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDelegateInvoked_remove929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvoked_remove929");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> bags = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 10 ; ++i) {
        }
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDelegateInvoked_remove930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvoked_remove930");
        List<com.google.gson.common.TestTypes.BagOfPrimitives> bags = new ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        for (int i = 0 ; i < 10 ; ++i) {
            bags.add(new TestTypes.BagOfPrimitives(i , i , ((i % 2) == 0) , String.valueOf(i)));
        }
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, new TypeToken<java.util.List<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvokedOnStrings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvokedOnStrings");
        String[] bags = new String[]{ "1" , "2" , "3" , "4" };
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1416,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1417,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvokedOnStrings_literalMutation1206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvokedOnStrings_literalMutation1206");
        String[] bags = new String[]{ "foo" , "2" , "3" , "4" };
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1416,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1417,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvokedOnStrings_literalMutation1207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvokedOnStrings_literalMutation1207");
        String[] bags = new String[]{ "1" , "foo" , "3" , "4" };
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1416,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1417,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvokedOnStrings_literalMutation1208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvokedOnStrings_literalMutation1208");
        String[] bags = new String[]{ "1" , "2" , "foo" , "4" };
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1416,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1417,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDelegateInvokedOnStrings_literalMutation1209() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelegateInvokedOnStrings_literalMutation1209");
        String[] bags = new String[]{ "1" , "2" , "3" , "foo" };
        String json = gson.toJson(bags);
        bags = gson.fromJson(json, String[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1416,stats.numReads);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1417,stats.numWrites);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class StatsTypeAdapterFactory implements TypeAdapterFactory {
        public int numReads = 0;

        public int numWrites = 0;

        public <T>TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);
            return new TypeAdapter<T>() {
                @Override
                public void write(JsonWriter out, T value) throws IOException {
                    ++(numWrites);
                    delegate.write(out, value);
                }

                @Override
                public T read(JsonReader in) throws IOException {
                    ++(numReads);
                    return delegate.read(in);
                }
            };
        }
    }
}

