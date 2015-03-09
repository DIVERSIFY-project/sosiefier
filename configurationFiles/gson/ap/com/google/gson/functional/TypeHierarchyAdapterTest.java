package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;

/** 
 * Test that the hierarchy adapter works when subtypes are used.
 */
public final class TypeHierarchyAdapterTest extends TestCase {
    public void testTypeHierarchy() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy");
        Manager andy = new Manager();
        andy.userid = "foo";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2058");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2004;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2059");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("foo" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2060");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2008) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2061");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("foo" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2062");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2005) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2063");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("foo" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2064");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2005) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2065");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "foo";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2066");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2000;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2067() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2067");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("foo" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2068");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2007);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2069() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2069");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("foo" , 1998) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2070");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1999) , new Employee("sergey" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2071");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("foo" , 1998) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeHierarchy_literalMutation2072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeHierarchy_literalMutation2072");
        Manager andy = new Manager();
        andy.userid = "andy";
        andy.startDate = 2005;
        andy.minions = new Employee[]{ new Employee("inder" , 2007) , new Employee("joel" , 2006) , new Employee("jesse" , 2006) };
        CEO eric = new CEO();
        eric.userid = "eric";
        eric.startDate = 2001;
        eric.assistant = new Employee("jerome" , 2006);
        eric.minions = new Employee[]{ new Employee("larry" , 1998) , new Employee("sergey" , 1997) , andy };
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).setPrettyPrinting().create();
        Company company = new Company();
        company.ceo = eric;
        String json = gson.toJson(company, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2563,("{\n" + ("  \"ceo\": {\n" + ("    \"userid\": \"eric\",\n" + ("    \"startDate\": 2001,\n" + ("    \"minions\": [\n" + ("      {\n" + ("        \"userid\": \"larry\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"sergey\",\n" + ("        \"startDate\": 1998\n" + ("      },\n" + ("      {\n" + ("        \"userid\": \"andy\",\n" + ("        \"startDate\": 2005,\n" + ("        \"minions\": [\n" + ("          {\n" + ("            \"userid\": \"inder\",\n" + ("            \"startDate\": 2007\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"joel\",\n" + ("            \"startDate\": 2006\n" + ("          },\n" + ("          {\n" + ("            \"userid\": \"jesse\",\n" + ("            \"startDate\": 2006\n" + ("          }\n" + ("        ]\n" + ("      }\n" + ("    ],\n" + ("    \"assistant\": {\n" + ("      \"userid\": \"jerome\",\n" + ("      \"startDate\": 2006\n" + ("    }\n" + ("  }\n" + "}"))))))))))))))))))))))))))))))))))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,json);
        Company copied = gson.fromJson(json, Company.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2565,gson,2564,gson.toJson(copied, com.google.gson.functional.TypeHierarchyAdapterTest.Company.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,copied.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,company.ceo.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2568,copied.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,company.ceo.assistant.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,copied.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2571,company.ceo.minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,copied.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2573,company.ceo.minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,copied.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,company.ceo.minions[2].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2576,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[0].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(copied.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2579,((com.google.gson.functional.TypeHierarchyAdapterTest.Manager)(company.ceo.minions[2])).minions[1].userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegisterSuperTypeFirst() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisterSuperTypeFirst");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).registerTypeHierarchyAdapter(Manager.class, new ManagerAdapter()).create();
        Manager manager = new Manager();
        manager.userid = "foo";
        String json = gson.toJson(manager, Manager.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,json);
        Manager copied = gson.fromJson(json, Manager.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2561,manager.userid);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,copied.userid);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This behaviour changed in Gson 2.1; it used to throw.
     */
@Test(timeout = 1000)
    public void testRegisterSubTypeFirstAllowed() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisterSubTypeFirstAllowed");
        new GsonBuilder().registerTypeHierarchyAdapter(Manager.class, new ManagerAdapter()).registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).create();
        new GsonBuilder().registerTypeHierarchyAdapter(Manager.class, new ManagerAdapter()).registerTypeHierarchyAdapter(Employee.class, new EmployeeAdapter()).create();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This behaviour changed in Gson 2.1; it used to throw.
     */
@Test(timeout = 1000)
    public void testRegisterSubTypeFirstAllowed_remove1197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisterSubTypeFirstAllowed_remove1197");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class ManagerAdapter implements JsonDeserializer<Manager> , JsonSerializer<Manager> {
        public Manager deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
            Manager result = new Manager();
            result.userid = json.getAsString();
            return result;
        }

        public JsonElement serialize(Manager src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.userid);
        }
    }

    static class EmployeeAdapter implements JsonDeserializer<Employee> , JsonSerializer<Employee> {
        public JsonElement serialize(Employee employee, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject result = new JsonObject();
            result.add("userid", context.serialize(employee.userid, String.class));
            result.add("startDate", context.serialize(employee.startDate, long.class));
            if (employee instanceof Manager) {
                result.add("minions", context.serialize(((Manager)(employee)).minions, Employee[].class));
                if (employee instanceof CEO) {
                    result.add("assistant", context.serialize(((CEO)(employee)).assistant, Employee.class));
                } 
            } 
            return result;
        }

        public Employee deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject object = json.getAsJsonObject();
            Employee result = null;
            JsonElement assistant = object.get("assistant");
            if (assistant != null) {
                result = new CEO();
                ((CEO)(result)).assistant = context.deserialize(assistant, Employee.class);
            } 
            JsonElement minons = object.get("minions");
            if (minons != null) {
                if (result == null) {
                    result = new Manager();
                } 
                ((Manager)(result)).minions = context.deserialize(minons, Employee[].class);
            } 
            if (result == null) {
                result = new Employee();
            } 
            result.userid = context.deserialize(object.get("userid"), String.class);
            result.startDate = context.<java.lang.Long>deserialize(object.get("startDate"), long.class);
            return result;
        }
    }

    static class Employee {
        String userid;

        long startDate;

        Employee(String userid ,long startDate) {
            this.userid = userid;
            this.startDate = startDate;
        }

        Employee() {
        }
    }

    static class Manager extends Employee {
        Employee[] minions;
    }

    static class CEO extends Manager {
        Employee assistant;
    }

    static class Company {
        CEO ceo;
    }
}

