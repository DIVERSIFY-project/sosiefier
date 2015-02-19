package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;

/** 
 * Functional Test exercising custom deserialization only.  When test applies to both
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 * 
 * @author Joel Leitch
 */
public class CustomDeserializerTest extends TestCase {
    private static final String DEFAULT_VALUE = "test123";

    private static final String SUFFIX = "blah";

    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new GsonBuilder().registerTypeAdapter(DataHolder.class, new DataHolderDeserializer()).create();
    }

    public void testDefaultConstructorNotCalledOnObject() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultConstructorNotCalledOnObject");
        DataHolder data = new DataHolder(DEFAULT_VALUE);
        String json = gson.toJson(data);
        DataHolder actual = gson.fromJson(json, DataHolder.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1085,((com.google.gson.functional.CustomDeserializerTest.DEFAULT_VALUE) + (com.google.gson.functional.CustomDeserializerTest.SUFFIX)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,actual,1086,actual.getData());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultConstructorNotCalledOnField() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultConstructorNotCalledOnField");
        DataHolderWrapper dataWrapper = new DataHolderWrapper(new DataHolder(DEFAULT_VALUE));
        String json = gson.toJson(dataWrapper);
        DataHolderWrapper actual = gson.fromJson(json, DataHolderWrapper.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1082,((com.google.gson.functional.CustomDeserializerTest.DEFAULT_VALUE) + (com.google.gson.functional.CustomDeserializerTest.SUFFIX)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1084,actual.getWrappedData(),1083,actual.getWrappedData().getData());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class DataHolder {
        private final String data;

        @SuppressWarnings(value = "unused")
        private DataHolder() {
            throw new IllegalStateException();
        }

        public DataHolder(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }
    }

    private static class DataHolderWrapper {
        private final DataHolder wrappedData;

        @SuppressWarnings(value = "unused")
        private DataHolderWrapper() {
            this(new DataHolder(CustomDeserializerTest.DEFAULT_VALUE));
        }

        public DataHolderWrapper(DataHolder data) {
            this.wrappedData = data;
        }

        public DataHolder getWrappedData() {
            return wrappedData;
        }
    }

    private static class DataHolderDeserializer implements JsonDeserializer<DataHolder> {
        public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObj = json.getAsJsonObject();
            String dataString = jsonObj.get("data").getAsString();
            return new DataHolder((dataString + (CustomDeserializerTest.SUFFIX)));
        }
    }

    @Test(timeout = 1000)
    public void testJsonTypeFieldBasedDeserialization_add1011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTypeFieldBasedDeserialization_add1011");
        String json = "{field1:\'abc\',field2:\'def\',__type__:\'SUB_TYPE1\'}";
        Gson gson = new GsonBuilder().registerTypeAdapter(MyBase.class, new JsonDeserializer<MyBase>() {
            public MyBase deserialize(JsonElement json, Type pojoType, JsonDeserializationContext context) throws JsonParseException {
                String type = json.getAsJsonObject().get(MyBase.TYPE_ACCESS).getAsString();
                return context.deserialize(json, SubTypes.valueOf(type).getSubclass());
            }
        }).create();
        SubType1 target = ((SubType1)(gson.fromJson(json, MyBase.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,target.field1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonTypeFieldBasedDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTypeFieldBasedDeserialization");
        String json = "foo";
        Gson gson = new GsonBuilder().registerTypeAdapter(MyBase.class, new JsonDeserializer<MyBase>() {
            public MyBase deserialize(JsonElement json, Type pojoType, JsonDeserializationContext context) throws JsonParseException {
                String type = json.getAsJsonObject().get(MyBase.TYPE_ACCESS).getAsString();
                return context.deserialize(json, SubTypes.valueOf(type).getSubclass());
            }
        }).create();
        SubType1 target = ((SubType1)(gson.fromJson(json, MyBase.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,target.field1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonTypeFieldBasedDeserialization_remove837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonTypeFieldBasedDeserialization_remove837");
        String json = "{field1:\'abc\',field2:\'def\',__type__:\'SUB_TYPE1\'}";
        Gson gson = new GsonBuilder().registerTypeAdapter(MyBase.class, new JsonDeserializer<MyBase>() {
            public MyBase deserialize(JsonElement json, Type pojoType, JsonDeserializationContext context) throws JsonParseException {
                String type = json.getAsJsonObject().get(MyBase.TYPE_ACCESS).getAsString();
                return context.deserialize(json, SubTypes.valueOf(type).getSubclass());
            }
        }).create();
        SubType1 target = ((SubType1)(gson.fromJson(json, MyBase.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,target.field1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class MyBase {
        static final String TYPE_ACCESS = "__type__";
    }

    private enum SubTypes {
SUB_TYPE1(com.google.gson.functional.CustomDeserializerTest.SubType1.class), SUB_TYPE2(com.google.gson.functional.CustomDeserializerTest.SubType2.class);
        private final Type subClass;
        private SubTypes(Type subClass) {
            this.subClass = subClass;
        }
        public Type getSubclass() {
            return subClass;
        }
    }

    private static class SubType1 extends MyBase {
        String field1;
    }

    private static class SubType2 extends MyBase {
        @SuppressWarnings(value = "unused")
        String field2;
    }

    @Test(timeout = 1000)
    public void testCustomDeserializerReturnsNullForTopLevelObject_add1010() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForTopLevelObject_add1010");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "{baseName:\'Base\',subName:\'SubRevised\'}";
        TestTypes.Base target = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomDeserializerReturnsNullForTopLevelObject() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForTopLevelObject");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "foo";
        TestTypes.Base target = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializerReturnsNullForTopLevelObject_remove836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForTopLevelObject_remove836");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "{baseName:\'Base\',subName:\'SubRevised\'}";
        TestTypes.Base target = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializerReturnsNull_add1007() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNull_add1007");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "{base:{baseName:\'Base\',subName:\'SubRevised\'}}";
        TestTypes.ClassWithBaseField target = gson.fromJson(json, TestTypes.ClassWithBaseField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,target.base);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomDeserializerReturnsNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNull");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "foo";
        TestTypes.ClassWithBaseField target = gson.fromJson(json, TestTypes.ClassWithBaseField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,target.base);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializerReturnsNull_remove833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNull_remove833");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "{base:{baseName:\'Base\',subName:\'SubRevised\'}}";
        TestTypes.ClassWithBaseField target = gson.fromJson(json, TestTypes.ClassWithBaseField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,target.base);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializerReturnsNullForArrayElements_add1008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForArrayElements_add1008");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "[{baseName:\'Base\'},{baseName:\'Base\'}]";
        TestTypes.Base[] target = gson.fromJson(json, TestTypes.Base[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1079,target[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomDeserializerReturnsNullForArrayElements() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForArrayElements");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "foo";
        TestTypes.Base[] target = gson.fromJson(json, TestTypes.Base[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1079,target[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializerReturnsNullForArrayElements_remove834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForArrayElements_remove834");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "[{baseName:\'Base\'},{baseName:\'Base\'}]";
        TestTypes.Base[] target = gson.fromJson(json, TestTypes.Base[].class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1079,target[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializerReturnsNullForArrayElementsForArrayField_add1009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForArrayElementsForArrayField_add1009");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "{bases:[{baseName:\'Base\'},{baseName:\'Base\'}]}";
        ClassWithBaseArray target = gson.fromJson(json, ClassWithBaseArray.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,target.bases[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1077,target.bases[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomDeserializerReturnsNullForArrayElementsForArrayField() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForArrayElementsForArrayField");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "foo";
        ClassWithBaseArray target = gson.fromJson(json, ClassWithBaseArray.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,target.bases[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1077,target.bases[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializerReturnsNullForArrayElementsForArrayField_remove835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerReturnsNullForArrayElementsForArrayField_remove835");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new JsonDeserializer<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return null;
            }
        }).create();
        String json = "{bases:[{baseName:\'Base\'},{baseName:\'Base\'}]}";
        ClassWithBaseArray target = gson.fromJson(json, ClassWithBaseArray.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,target.bases[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1077,target.bases[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithBaseArray {
        TestTypes.Base[] bases;
    }
}

