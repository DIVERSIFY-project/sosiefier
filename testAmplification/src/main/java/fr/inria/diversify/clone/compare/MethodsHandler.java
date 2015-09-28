package fr.inria.diversify.clone.compare;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;


public class MethodsHandler {

    protected Map<Class<?>, List<Method>> cache;
    protected Random random;
    protected static final Map<String, Object> ignoredMethods;
    protected boolean onlyPublicMethod;
    protected boolean onlyNotStaticMethod;

    static {
        Object o = new Object();
        ignoredMethods = new HashMap<String, Object>();
        ignoredMethods.put("equals", o);
        ignoredMethods.put("hashCode", o);
        ignoredMethods.put("notify", o);
        ignoredMethods.put("notifyAll", o);
        ignoredMethods.put("wait", o);
        ignoredMethods.put("getClass", o);
        ignoredMethods.put("toString", o);
        ignoredMethods.put("display", o);
    }

    public MethodsHandler(Random random, boolean onlyPublicMethod, boolean onlyNotStaticMethod) {
        this.cache = new HashMap<Class<?>, List<Method>>();
        this.random = random;
        this.onlyNotStaticMethod = onlyNotStaticMethod;
        this.onlyPublicMethod = onlyPublicMethod;
    }

    public MethodsHandler(boolean onlyPublicMethod, boolean onlyNotStaticMethod) {
        this.cache = new HashMap<Class<?>, List<Method>>();
        this.random = new Random();
        this.onlyNotStaticMethod = onlyNotStaticMethod;
        this.onlyPublicMethod = onlyPublicMethod;
    }

    public List<Method> getRandomMethods(Object o, int nbMethod) {
        if (!cache.containsKey(o.getClass())) {
            findMethods(o);
        }

        List<Method> objectMethods = new LinkedList<Method>(cache.get(o.getClass()));
        List<Method> randomMethods = new ArrayList<Method>(nbMethod);
        if (objectMethods.isEmpty()) {
            return null;
        }
        while (randomMethods.size() < nbMethod && !objectMethods.isEmpty()) {
            int randomIndex = random.nextInt(objectMethods.size());
            Method m = objectMethods.get(randomIndex);
            m.setAccessible(true);
            randomMethods.add(m);
        }
        return randomMethods;

    }

    protected void findMethods(Object o) {
        List<Method> methodsList = new ArrayList<Method>();
        for (Method m : o.getClass().getMethods()) {
            if (ignoredMethods.get(m.getName()) == null && isValidMethod(m)) {
                methodsList.add(m);
            }
        }
        cache.put(o.getClass(), methodsList);
    }

    protected boolean isValidMethod(Method m) {
        if ((onlyPublicMethod && !Modifier.isPublic(m.getModifiers()))
                || (onlyNotStaticMethod && Modifier.isStatic(m.getModifiers()))
                || isVoid(m.getReturnType())) {
            return false;
        }
        Class<?>[] parameterTypes = m.getParameterTypes();
        if (parameterTypes.length != 0) { // we only consider methods that take no parameters
            return false;
        }
        return true;
    }

    protected boolean isVoid(Class<?> type) {
        return !type.equals(Void.class) && !type.equals(void.class);
    }

}
