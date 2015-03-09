package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for the {@link com.google.gson.annotations.JsonAdapter} annotation on fields.
 */
public final class JsonAdapterAnnotationOnFieldsTest extends TestCase {
    public void testClassAnnotationAdapterTakesPrecedenceOverDefault() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassAnnotationAdapterTakesPrecedenceOverDefault");
        Gson gson = new Gson();
        String json = gson.toJson(new Computer(new User("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,json);
        Computer computer = gson.fromJson("{\'user\':\'Inderjeet Singh\'}", Computer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,computer.user.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassAnnotationAdapterTakesPrecedenceOverDefault_literalMutation1339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassAnnotationAdapterTakesPrecedenceOverDefault_literalMutation1339");
        Gson gson = new Gson();
        String json = gson.toJson(new Computer(new User("Inderjeet Singh")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1683,json);
        Computer computer = gson.fromJson("foo", Computer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,computer.user.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassAnnotationAdapterFactoryTakesPrecedenceOverDefault() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassAnnotationAdapterFactoryTakesPrecedenceOverDefault");
        Gson gson = new Gson();
        String json = gson.toJson(new Gizmo(new Part("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,json);
        Gizmo computer = gson.fromJson("{\'part\':\'Part\'}", Gizmo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,computer.part.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassAnnotationAdapterFactoryTakesPrecedenceOverDefault_literalMutation1337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassAnnotationAdapterFactoryTakesPrecedenceOverDefault_literalMutation1337");
        Gson gson = new Gson();
        String json = gson.toJson(new Gizmo(new Part("Part")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,json);
        Gizmo computer = gson.fromJson("foo", Gizmo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,computer.part.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegisteredTypeAdapterTakesPrecedenceOverClassAnnotationAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredTypeAdapterTakesPrecedenceOverClassAnnotationAdapter");
        Gson gson = new GsonBuilder().registerTypeAdapter(User.class, new RegisteredUserAdapter()).create();
        String json = gson.toJson(new Computer(new User("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1691,json);
        Computer computer = gson.fromJson("{\'user\':\'Inderjeet Singh\'}", Computer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,computer.user.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegisteredTypeAdapterTakesPrecedenceOverClassAnnotationAdapter_literalMutation1346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisteredTypeAdapterTakesPrecedenceOverClassAnnotationAdapter_literalMutation1346");
        Gson gson = new GsonBuilder().registerTypeAdapter(User.class, new RegisteredUserAdapter()).create();
        String json = gson.toJson(new Computer(new User("Inderjeet Singh")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1691,json);
        Computer computer = gson.fromJson("foo", Computer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,computer.user.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter_add1168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter_add1168");
        Gson gson = new GsonBuilder().registerTypeAdapter(Part.class, new TypeAdapter<Part>() {
            @Override
            public void write(JsonWriter out, Part part) throws IOException {
                throw new java.lang.AssertionError();
            }

            @Override
            public Part read(JsonReader in) throws IOException {
                throw new java.lang.AssertionError();
            }
        }).create();
        String json = gson.toJson(new Gadget(new Part("screen")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1687,json);
        Gadget gadget = gson.fromJson("{\'part\':\'screen\'}", Gadget.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,gadget.part.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter");
        Gson gson = new GsonBuilder().registerTypeAdapter(Part.class, new TypeAdapter<Part>() {
            @Override
            public void write(JsonWriter out, Part part) throws IOException {
                throw new java.lang.AssertionError();
            }

            @Override
            public Part read(JsonReader in) throws IOException {
                throw new java.lang.AssertionError();
            }
        }).create();
        String json = gson.toJson(new Gadget(new Part("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1687,json);
        Gadget gadget = gson.fromJson("{\'part\':\'screen\'}", Gadget.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,gadget.part.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter_literalMutation1343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter_literalMutation1343");
        Gson gson = new GsonBuilder().registerTypeAdapter(Part.class, new TypeAdapter<Part>() {
            @Override
            public void write(JsonWriter out, Part part) throws IOException {
                throw new java.lang.AssertionError();
            }

            @Override
            public Part read(JsonReader in) throws IOException {
                throw new java.lang.AssertionError();
            }
        }).create();
        String json = gson.toJson(new Gadget(new Part("screen")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1687,json);
        Gadget gadget = gson.fromJson("foo", Gadget.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,gadget.part.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter_remove985() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter_remove985");
        Gson gson = new GsonBuilder().registerTypeAdapter(Part.class, new TypeAdapter<Part>() {
            @Override
            public void write(JsonWriter out, Part part) throws IOException {
                throw new java.lang.AssertionError();
            }

            @Override
            public Part read(JsonReader in) throws IOException {
                throw new java.lang.AssertionError();
            }
        }).create();
        String json = gson.toJson(new Gadget(new Part("screen")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1687,json);
        Gadget gadget = gson.fromJson("{\'part\':\'screen\'}", Gadget.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,gadget.part.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFieldAnnotationTakesPrecedenceOverClassAnnotation() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldAnnotationTakesPrecedenceOverClassAnnotation");
        Gson gson = new Gson();
        String json = gson.toJson(new Computer2(new User("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,json);
        Computer2 target = gson.fromJson("{\'user\':\'Interjeet Singh\'}", Computer2.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,target.user.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFieldAnnotationTakesPrecedenceOverClassAnnotation_literalMutation1341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFieldAnnotationTakesPrecedenceOverClassAnnotation_literalMutation1341");
        Gson gson = new Gson();
        String json = gson.toJson(new Computer2(new User("Inderjeet Singh")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,json);
        Computer2 target = gson.fromJson("foo", Computer2.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,target.user.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static final class Gadget {
        @JsonAdapter(value = PartJsonFieldAnnotationAdapter.class)
        final Part part;

        Gadget(Part part) {
            this.part = part;
        }
    }

    private static final class Gizmo {
        @JsonAdapter(value = GizmoPartTypeAdapterFactory.class)
        final Part part;

        Gizmo(Part part) {
            this.part = part;
        }
    }

    private static final class Part {
        final String name;

        public Part(String name) {
            this.name = name;
        }
    }

    private static class PartJsonFieldAnnotationAdapter extends TypeAdapter<Part> {
        @Override
        public void write(JsonWriter out, Part part) throws IOException {
            out.value("PartJsonFieldAnnotationAdapter");
        }

        @Override
        public Part read(JsonReader in) throws IOException {
            in.nextString();
            return new Part("PartJsonFieldAnnotationAdapter");
        }
    }

    private static class GizmoPartTypeAdapterFactory implements TypeAdapterFactory {
        public <T>TypeAdapter<T> create(Gson gson, final TypeToken<T> type) {
            return new TypeAdapter<T>() {
                @Override
                public void write(JsonWriter out, T value) throws IOException {
                    out.value("GizmoPartTypeAdapterFactory");
                }

                @SuppressWarnings(value = "unchecked")
                @Override
                public T read(JsonReader in) throws IOException {
                    in.nextString();
                    return ((T)(new Part("GizmoPartTypeAdapterFactory")));
                }
            };
        }
    }

    private static final class Computer {
        final User user;

        Computer(User user) {
            this.user = user;
        }
    }

    @JsonAdapter(value = UserClassAnnotationAdapter.class)
    private static class User {
        public final String name;

        private User(String name) {
            this.name = name;
        }
    }

    private static class UserClassAnnotationAdapter extends TypeAdapter<User> {
        @Override
        public void write(JsonWriter out, User user) throws IOException {
            out.value("UserClassAnnotationAdapter");
        }

        @Override
        public User read(JsonReader in) throws IOException {
            in.nextString();
            return new User("UserClassAnnotationAdapter");
        }
    }

    private static final class Computer2 {
        @JsonAdapter(value = UserFieldAnnotationAdapter.class)
        final User user;

        Computer2(User user) {
            this.user = user;
        }
    }

    private static final class UserFieldAnnotationAdapter extends TypeAdapter<User> {
        @Override
        public void write(JsonWriter out, User user) throws IOException {
            out.value("UserFieldAnnotationAdapter");
        }

        @Override
        public User read(JsonReader in) throws IOException {
            in.nextString();
            return new User("UserFieldAnnotationAdapter");
        }
    }

    private static final class RegisteredUserAdapter extends TypeAdapter<User> {
        @Override
        public void write(JsonWriter out, User user) throws IOException {
            out.value("RegisteredUserAdapter");
        }

        @Override
        public User read(JsonReader in) throws IOException {
            in.nextString();
            return new User("RegisteredUserAdapter");
        }
    }

    public void testJsonAdapterInvokedOnlyForAnnotatedFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonAdapterInvokedOnlyForAnnotatedFields");
        Gson gson = new Gson();
        String json = "foo";
        GadgetWithTwoParts gadget = gson.fromJson(json, GadgetWithTwoParts.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1689,gadget.part1.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,gadget.part2.name);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static final class GadgetWithTwoParts {
        @JsonAdapter(value = PartJsonFieldAnnotationAdapter.class)
        final Part part1;

        final Part part2;

        @SuppressWarnings(value = "unused")
        GadgetWithTwoParts(Part part1 ,Part part2) {
            this.part1 = part1;
            this.part2 = part2;
        }
    }
}

