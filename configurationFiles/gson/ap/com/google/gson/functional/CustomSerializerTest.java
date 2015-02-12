package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;

/** 
 * Functional Test exercising custom serialization only.  When test applies to both
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 * 
 * @author Inderjeet Singh
 */
public class CustomSerializerTest extends TestCase {
    public void testBaseClassSerializerInvokedForBaseClassFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseClassSerializerInvokedForBaseClassFields");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new TestTypes.BaseSerializer()).registerTypeAdapter(TestTypes.Sub.class, new TestTypes.SubSerializer()).create();
        TestTypes.ClassWithBaseField target = new TestTypes.ClassWithBaseField(new TestTypes.Base());
        JsonObject json = ((JsonObject)(gson.toJsonTree(target)));
        JsonObject base = json.get("foo").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1092,com.google.gson.common.TestTypes.BaseSerializer.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1094,base.get(com.google.gson.common.TestTypes.Base.SERIALIZER_KEY),1093,base.get(com.google.gson.common.TestTypes.Base.SERIALIZER_KEY).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new TestTypes.BaseSerializer()).registerTypeAdapter(TestTypes.Sub.class, new TestTypes.SubSerializer()).create();
        TestTypes.ClassWithBaseField target = new TestTypes.ClassWithBaseField(new TestTypes.Sub());
        JsonObject json = ((JsonObject)(gson.toJsonTree(target)));
        JsonObject base = json.get("foo").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1100,com.google.gson.common.TestTypes.SubSerializer.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1102,base.get(com.google.gson.common.TestTypes.Base.SERIALIZER_KEY),1101,base.get(com.google.gson.common.TestTypes.Base.SERIALIZER_KEY).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubClassSerializerInvokedForBaseClassFieldsHoldingArrayOfSubClassInstances() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubClassSerializerInvokedForBaseClassFieldsHoldingArrayOfSubClassInstances");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new TestTypes.BaseSerializer()).registerTypeAdapter(TestTypes.Sub.class, new TestTypes.SubSerializer()).create();
        TestTypes.ClassWithBaseArrayField target = new TestTypes.ClassWithBaseArrayField(new TestTypes.Base[]{ new TestTypes.Sub() , new TestTypes.Sub() });
        JsonObject json = ((JsonObject)(gson.toJsonTree(target)));
        JsonArray array = json.get("foo").getAsJsonArray();
        for (JsonElement element : array) {
            JsonElement serializerKey = element.getAsJsonObject().get(TestTypes.Base.SERIALIZER_KEY);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1097,com.google.gson.common.TestTypes.SubSerializer.NAME);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1099,serializerKey,1098,serializerKey.getAsString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBaseClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new TestTypes.BaseSerializer()).create();
        TestTypes.ClassWithBaseField target = new TestTypes.ClassWithBaseField(new TestTypes.Sub());
        JsonObject json = ((JsonObject)(gson.toJsonTree(target)));
        JsonObject base = json.get("base").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1089,com.google.gson.common.TestTypes.BaseSerializer.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1091,base.get(com.google.gson.common.TestTypes.Base.SERIALIZER_KEY),1090,base.get(com.google.gson.common.TestTypes.Base.SERIALIZER_KEY).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBaseClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances_literalMutation1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances_literalMutation1022");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new TestTypes.BaseSerializer()).create();
        TestTypes.ClassWithBaseField target = new TestTypes.ClassWithBaseField(new TestTypes.Sub());
        JsonObject json = ((JsonObject)(gson.toJsonTree(target)));
        JsonObject base = json.get("foo").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1089,com.google.gson.common.TestTypes.BaseSerializer.NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1091,base.get(com.google.gson.common.TestTypes.Base.SERIALIZER_KEY),1090,base.get(com.google.gson.common.TestTypes.Base.SERIALIZER_KEY).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializerReturnsNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializerReturnsNull");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        JsonElement json = gson.toJsonTree(new TestTypes.Base());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1096,json,1095,json.isJsonNull());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializerReturnsNull_remove838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializerReturnsNull_remove838");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        JsonElement json = gson.toJsonTree(new TestTypes.Base());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1096,json,1095,json.isJsonNull());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

