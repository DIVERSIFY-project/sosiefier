package com.google.gson.functional;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import java.util.List;
import java.util.SortedSet;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.util.TreeSet;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional Test exercising custom serialization only.  When test applies to both
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 * 
 * @author Inderjeet Singh
 */
public class InstanceCreatorTest extends TestCase {
    @Test(timeout = 1000)
    public void testInstanceCreatorReturnsBaseType_add1161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsBaseType_add1161");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Base();
            }
        }).create();
        String json = "{baseName:\'BaseRevised\',subName:\'Sub\'}";
        TestTypes.Base base = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,base.baseName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInstanceCreatorReturnsBaseType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsBaseType");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Base();
            }
        }).create();
        String json = "foo";
        TestTypes.Base base = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,base.baseName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorReturnsBaseType_remove978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsBaseType_remove978");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Base();
            }
        }).create();
        String json = "{baseName:\'BaseRevised\',subName:\'Sub\'}";
        TestTypes.Base base = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,base.baseName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorReturnsSubTypeForTopLevelObject_add1163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsSubTypeForTopLevelObject_add1163");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Sub();
            }
        }).create();
        String json = "{baseName:\'Base\',subName:\'SubRevised\'}";
        TestTypes.Base base = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,(base instanceof com.google.gson.common.TestTypes.Sub));
        TestTypes.Sub sub = ((TestTypes.Sub)(base));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,"SubRevised",1648,"SubRevised".equals(sub.subName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,sub.subName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInstanceCreatorReturnsSubTypeForTopLevelObject() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsSubTypeForTopLevelObject");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Sub();
            }
        }).create();
        String json = "foo";
        TestTypes.Base base = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,(base instanceof com.google.gson.common.TestTypes.Sub));
        TestTypes.Sub sub = ((TestTypes.Sub)(base));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,"SubRevised",1648,"SubRevised".equals(sub.subName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,sub.subName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorReturnsSubTypeForTopLevelObject_remove980() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsSubTypeForTopLevelObject_remove980");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Sub();
            }
        }).create();
        String json = "{baseName:\'Base\',subName:\'SubRevised\'}";
        TestTypes.Base base = gson.fromJson(json, TestTypes.Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,(base instanceof com.google.gson.common.TestTypes.Sub));
        TestTypes.Sub sub = ((TestTypes.Sub)(base));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,"SubRevised",1648,"SubRevised".equals(sub.subName));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1650,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,sub.subName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorReturnsSubTypeForField_add1162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsSubTypeForField_add1162");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Sub();
            }
        }).create();
        String json = "{base:{baseName:\'Base\',subName:\'SubRevised\'}}";
        TestTypes.ClassWithBaseField target = gson.fromJson(json, TestTypes.ClassWithBaseField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,((target.base) instanceof com.google.gson.common.TestTypes.Sub));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,((com.google.gson.common.TestTypes.Sub)(target.base)).subName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInstanceCreatorReturnsSubTypeForField() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsSubTypeForField");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Sub();
            }
        }).create();
        String json = "foo";
        TestTypes.ClassWithBaseField target = gson.fromJson(json, TestTypes.ClassWithBaseField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,((target.base) instanceof com.google.gson.common.TestTypes.Sub));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,((com.google.gson.common.TestTypes.Sub)(target.base)).subName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorReturnsSubTypeForField_remove979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorReturnsSubTypeForField_remove979");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, new InstanceCreator<com.google.gson.common.TestTypes.Base>() {
            public TestTypes.Base createInstance(Type type) {
                return new TestTypes.Sub();
            }
        }).create();
        String json = "{base:{baseName:\'Base\',subName:\'SubRevised\'}}";
        TestTypes.ClassWithBaseField target = gson.fromJson(json, TestTypes.ClassWithBaseField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,((target.base) instanceof com.google.gson.common.TestTypes.Sub));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,com.google.gson.common.TestTypes.Sub.SUB_NAME);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,((com.google.gson.common.TestTypes.Sub)(target.base)).subName);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorForCollectionType_add1155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForCollectionType_add1155");
        @SuppressWarnings(value = "serial")
        class SubArrayList<T> extends ArrayList<T> {        }
        InstanceCreator<java.util.List<java.lang.String>> listCreator = new InstanceCreator<java.util.List<java.lang.String>>() {
            public List<java.lang.String> createInstance(Type type) {
                return new SubArrayList<java.lang.String>();
            }
        };
        Type listOfStringType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfStringType, listCreator).create();
        List<java.lang.String> list = gson.fromJson("[\"a\"]", listOfStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,SubArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,list,1632,list.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorForCollectionType_add1156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForCollectionType_add1156");
        @SuppressWarnings(value = "serial")
        class SubArrayList<T> extends ArrayList<T> {        }
        InstanceCreator<java.util.List<java.lang.String>> listCreator = new InstanceCreator<java.util.List<java.lang.String>>() {
            public List<java.lang.String> createInstance(Type type) {
                return new SubArrayList<java.lang.String>();
            }
        };
        Type listOfStringType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfStringType, listCreator).create();
        List<java.lang.String> list = gson.fromJson("[\"a\"]", listOfStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,SubArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,list,1632,list.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorForCollectionType_add1157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForCollectionType_add1157");
        @SuppressWarnings(value = "serial")
        class SubArrayList<T> extends ArrayList<T> {        }
        InstanceCreator<java.util.List<java.lang.String>> listCreator = new InstanceCreator<java.util.List<java.lang.String>>() {
            public List<java.lang.String> createInstance(Type type) {
                return new SubArrayList<java.lang.String>();
            }
        };
        Type listOfStringType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfStringType, listCreator).create();
        List<java.lang.String> list = gson.fromJson("[\"a\"]", listOfStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,SubArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,list,1632,list.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInstanceCreatorForCollectionType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForCollectionType");
        @SuppressWarnings(value = "serial")
        class SubArrayList<T> extends ArrayList<T> {        }
        InstanceCreator<java.util.List<java.lang.String>> listCreator = new InstanceCreator<java.util.List<java.lang.String>>() {
            public List<java.lang.String> createInstance(Type type) {
                return new SubArrayList<java.lang.String>();
            }
        };
        Type listOfStringType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfStringType, listCreator).create();
        List<java.lang.String> list = gson.fromJson("[\"a\"]", listOfStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,SubArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,list,1632,list.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInstanceCreatorForCollectionType_literalMutation1301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForCollectionType_literalMutation1301");
        @SuppressWarnings(value = "serial")
        class SubArrayList<T> extends ArrayList<T> {        }
        InstanceCreator<java.util.List<java.lang.String>> listCreator = new InstanceCreator<java.util.List<java.lang.String>>() {
            public List<java.lang.String> createInstance(Type type) {
                return new SubArrayList<java.lang.String>();
            }
        };
        Type listOfStringType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfStringType, listCreator).create();
        List<java.lang.String> list = gson.fromJson("foo", listOfStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,SubArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,list,1632,list.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorForCollectionType_remove972() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForCollectionType_remove972");
        @SuppressWarnings(value = "serial")
        class SubArrayList<T> extends ArrayList<T> {        }
        InstanceCreator<java.util.List<java.lang.String>> listCreator = new InstanceCreator<java.util.List<java.lang.String>>() {
            public List<java.lang.String> createInstance(Type type) {
                return new SubArrayList<java.lang.String>();
            }
        };
        Type listOfStringType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfStringType, listCreator).create();
        List<java.lang.String> list = gson.fromJson("[\"a\"]", listOfStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,SubArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,list,1632,list.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorForCollectionType_remove973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForCollectionType_remove973");
        @SuppressWarnings(value = "serial")
        class SubArrayList<T> extends ArrayList<T> {        }
        InstanceCreator<java.util.List<java.lang.String>> listCreator = new InstanceCreator<java.util.List<java.lang.String>>() {
            public List<java.lang.String> createInstance(Type type) {
                return new SubArrayList<java.lang.String>();
            }
        };
        Type listOfStringType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfStringType, listCreator).create();
        List<java.lang.String> list = gson.fromJson("[\"a\"]", listOfStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,SubArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,list,1632,list.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstanceCreatorForCollectionType_remove974() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForCollectionType_remove974");
        @SuppressWarnings(value = "serial")
        class SubArrayList<T> extends ArrayList<T> {        }
        InstanceCreator<java.util.List<java.lang.String>> listCreator = new InstanceCreator<java.util.List<java.lang.String>>() {
            public List<java.lang.String> createInstance(Type type) {
                return new SubArrayList<java.lang.String>();
            }
        };
        Type listOfStringType = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(listOfStringType, listCreator).create();
        List<java.lang.String> list = gson.fromJson("[\"a\"]", listOfStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,SubArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,list,1632,list.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testInstanceCreatorForParametrizedType_add1158() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_add1158");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testInstanceCreatorForParametrizedType_add1159() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_add1159");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testInstanceCreatorForParametrizedType_add1160() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_add1160");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "rawtypes" })
    public void testInstanceCreatorForParametrizedType() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "foo" })
    public void testInstanceCreatorForParametrizedType_literalMutation1303() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_literalMutation1303");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testInstanceCreatorForParametrizedType_literalMutation1304() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_literalMutation1304");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testInstanceCreatorForParametrizedType_literalMutation1305() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_literalMutation1305");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("foo", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testInstanceCreatorForParametrizedType_literalMutation1306() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_literalMutation1306");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("foo", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testInstanceCreatorForParametrizedType_remove975() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_remove975");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testInstanceCreatorForParametrizedType_remove976() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_remove976");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testInstanceCreatorForParametrizedType_remove977() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceCreatorForParametrizedType_remove977");
        @SuppressWarnings(value = "serial")
        class SubTreeSet<T> extends TreeSet<T> {        }
        InstanceCreator<java.util.SortedSet> sortedSetCreator = new InstanceCreator<java.util.SortedSet>() {
            public SortedSet createInstance(Type type) {
                return new SubTreeSet();
            }
        };
        Gson gson = new GsonBuilder().registerTypeAdapter(SortedSet.class, sortedSetCreator).create();
        Type sortedSetType = new TypeToken<java.util.SortedSet<java.lang.String>>() {        }.getType();
        SortedSet<java.lang.String> set = gson.fromJson("[\"a\"]", sortedSetType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,set,1634,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,set,1637,set.getClass());
        set = gson.fromJson("[\"b\"]", SortedSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,set,1639,set.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,SubTreeSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,set,1642,set.getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

