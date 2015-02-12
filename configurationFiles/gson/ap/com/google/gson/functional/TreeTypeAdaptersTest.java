package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Collection of functional tests for DOM tree based type adapters.
 */
public class TreeTypeAdaptersTest extends TestCase {
    private static final Id<Student> STUDENT1_ID = new Id<Student>("5" , Student.class);

    private static final Id<Student> STUDENT2_ID = new Id<Student>("6" , Student.class);

    private static final Student STUDENT1 = new Student(STUDENT1_ID , "first");

    private static final Student STUDENT2 = new Student(STUDENT2_ID , "second");

    private static final Type TYPE_COURSE_HISTORY = new TypeToken<Course<HistoryCourse>>() {    }.getType();

    private static final Id<Course<HistoryCourse>> COURSE_ID = new Id<Course<HistoryCourse>>("10" , TYPE_COURSE_HISTORY);

    private Gson gson;

    private Course<HistoryCourse> course;

    @Override
    protected void setUp() {
        gson = new GsonBuilder().registerTypeAdapter(Id.class, new IdTreeTypeAdapter()).create();
        course = new Course<HistoryCourse>(COURSE_ID , 4 , new Assignment<HistoryCourse>(null , null) , TreeTypeAdaptersTest.createList(STUDENT1, STUDENT2));
    }

    public void testSerializeId() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeId");
        String json = gson.toJson(course, TYPE_COURSE_HISTORY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2531,json,2530,json.contains(java.lang.String.valueOf(com.google.gson.functional.TreeTypeAdaptersTest.COURSE_ID.getValue())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2533,json,2532,json.contains(java.lang.String.valueOf(com.google.gson.functional.TreeTypeAdaptersTest.STUDENT1_ID.getValue())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2535,json,2534,json.contains(java.lang.String.valueOf(com.google.gson.functional.TreeTypeAdaptersTest.STUDENT2_ID.getValue())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeId() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeId");
        String json = "foo" + "numAssignments:4,assignment:{}}";
        Course<HistoryCourse> target = gson.fromJson(json, TYPE_COURSE_HISTORY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,target.getStudents().get(0).id,2524,target.getStudents().get(0).id.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,target.getStudents().get(1).id,2526,target.getStudents().get(1).id.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2529,target.getId(),2528,target.getId().getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeId_literalMutation2030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeId_literalMutation2030");
        String json = "{courseId:1,students:[{id:1,name:\'first\'},{id:6,name:\'second\'}]," + "foo";
        Course<HistoryCourse> target = gson.fromJson(json, TYPE_COURSE_HISTORY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2525,target.getStudents().get(0).id,2524,target.getStudents().get(0).id.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2527,target.getStudents().get(1).id,2526,target.getStudents().get(1).id.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2529,target.getId(),2528,target.getId().getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static final class Id<R> {
        final String value;

        @SuppressWarnings(value = "unused")
        final Type typeOfId;

        private Id(String value ,Type typeOfId) {
            this.value = value;
            this.typeOfId = typeOfId;
        }

        public String getValue() {
            return value;
        }
    }

    private static final class IdTreeTypeAdapter implements JsonDeserializer<Id<?>> , JsonSerializer<Id<?>> {
        @SuppressWarnings(value = "rawtypes")
        public Id<?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            if (!(typeOfT instanceof ParameterizedType)) {
                throw new JsonParseException(("Id of unknown type: " + typeOfT));
            } 
            ParameterizedType parameterizedType = ((ParameterizedType)(typeOfT));
            Type typeOfId = parameterizedType.getActualTypeArguments()[0];
            return new Id(json.getAsString() , typeOfId);
        }

        public JsonElement serialize(Id<?> src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getValue());
        }
    }

    @SuppressWarnings(value = "unused")
    private static class Student {
        Id<Student> id;

        String name;

        private Student() {
            this(null, null);
        }

        public Student(Id<Student> id ,String name) {
            this.id = id;
            this.name = name;
        }
    }

    @SuppressWarnings(value = "unused")
    private static class Course<T> {
        final List<Student> students;

        private final Id<Course<T>> courseId;

        private final int numAssignments;

        private final Assignment<T> assignment;

        private Course() {
            this(null, 0, null, new java.util.ArrayList<Student>());
        }

        public Course(Id<Course<T>> courseId ,int numAssignments ,Assignment<T> assignment ,List<Student> players) {
            this.courseId = courseId;
            this.numAssignments = numAssignments;
            this.assignment = assignment;
            this.students = players;
        }

        public Id<Course<T>> getId() {
            return courseId;
        }

        List<Student> getStudents() {
            return students;
        }
    }

    @SuppressWarnings(value = "unused")
    private static class Assignment<T> {
        private final Id<Assignment<T>> id;

        private final T data;

        private Assignment() {
            this(null, null);
        }

        public Assignment(Id<Assignment<T>> id ,T data) {
            this.id = id;
            this.data = data;
        }
    }

    @SuppressWarnings(value = "unused")
    private static class HistoryCourse {
        int numClasses;
    }

    private static <T>List<T> createList(T... items) {
        return java.util.Arrays.asList(items);
    }
}

