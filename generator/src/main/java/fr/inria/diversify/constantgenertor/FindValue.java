package fr.inria.diversify.constantgenertor;

import fr.inria.diversify.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * User: Simon
 * Date: 31/03/15
 * Time: 11:01
 */
public class FindValue {
    protected int MAX_OBJECT_CREATION_BY_CLASS = 100;
    protected int MAX_OBJECT_CREATION_BY_VALUES = 10;
    protected int MAX_OBJECT_CREATION_SIZE = 10;
    protected Map<Object, Set<ObjectCreation>> valuesToObjectCreation;

    protected Map<Class, Set<ObjectCreation>> typeToObjectCreation;
    protected Map<Constructor, Set<Class>> typeNeedC;
    protected Map<Method, Set<Class>> typeNeedM;
    protected Queue<Object> executableToProcess;
    protected Set<Integer> alreadySee;

    private Set<Method> methodFilter;


    public FindValue() throws NoSuchMethodException {
        initMethodFilter();
        typeNeedC = new HashMap<>();
        typeNeedM = new HashMap<>();
        executableToProcess = new ArrayDeque<>();
        typeToObjectCreation = new HashMap<>();
        valuesToObjectCreation = new HashMap<>();
        alreadySee = new HashSet<>();
    }

    public void init(Set<Class<?>> classes) {
        for(Class cl : classes) {
            for (Constructor constructor : cl.getConstructors()) {
                if(!Modifier.isAbstract(constructor.getDeclaringClass().getModifiers())) {
                    Set<Class> types = new HashSet<>();
                    Collections.addAll(types, constructor.getParameterTypes());
                    typeNeedC.put(constructor, types);
                    executableToProcess.add(constructor);
                }
            }
        }
    }

    public void foo() {
        while(!executableToProcess.isEmpty()) {
            Object exe = executableToProcess.poll();
            if(exe instanceof Constructor) {
                findNewNew((Constructor) exe);
            } else {
                findNewValue((ObjectCreation) exe);
            }
        }
    }


    protected void info() {
        Log.info("queue size: {}, nb type of object: {}", executableToProcess.size(), typeToObjectCreation.size());
    }

    public void infoEnd() {
        Log.info("infoEnd");
        Log.info("queue size: {}, nb type of object: {}", executableToProcess.size(), typeToObjectCreation.size());
        for(Object key : valuesToObjectCreation.keySet()) {
            if(valuesToObjectCreation.get(key) != null) {
                if (key != null) {
                    Log.info("type: {}, value: {}:, nb: {}", key.getClass().getSimpleName(), key, valuesToObjectCreation.get(key).size());
                } else {
                    Log.info("value: {}:, nb: {}", key, valuesToObjectCreation.get(key).size());
                }
            }
        }
        valuesToObjectCreation.keySet().stream()
                .forEach(key -> Log.info("type: {}, value: {}:, nb: {}",key, key.getClass(), valuesToObjectCreation.get(key).size()));
    }

    protected void findNewValue(ObjectCreation objectCreation) {
        for (Method method : objectCreation.getMethods()) {
            if (Modifier.isPublic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && !methodFilter.contains(method)) {
                MethodCall methodCall = buildMethod(objectCreation.getDynamicType(), method);

                if (methodCall != null && addNewValue(methodCall)) {
                    try {
                        Log.debug("{} : {}", methodCall, methodCall.buildObject());
                    } catch (Throwable e) {}
                    updateExecutableToProcess(methodCall);
                    info();
                }
            }
        }
    }

    protected boolean addNewValue(ObjectCreation objectCreation) {
        try {
            Class dynamicType = objectCreation.getDynamicType();
            if (objectCreation.size() < MAX_OBJECT_CREATION_SIZE
                    && !alreadySee.contains(objectCreation.hashCode())
                    && objectCreation.buildWithoutException()) {
                alreadySee.add(objectCreation.hashCode());
                if (!typeToObjectCreation.containsKey(dynamicType)) {
                    typeToObjectCreation.put(dynamicType, new HashSet<>());
                }
                Set<ObjectCreation> types = typeToObjectCreation.get(dynamicType);

                if (!valuesToObjectCreation.containsKey(objectCreation.getValue())) {
                    valuesToObjectCreation.put(objectCreation.getValue(), new HashSet<>());
                }
                Set<ObjectCreation> values = valuesToObjectCreation.get(objectCreation.getValue());

                if (MAX_OBJECT_CREATION_BY_VALUES < values.size()) {
                    return false;
                } else {
                    values.add(objectCreation);
                    if (MAX_OBJECT_CREATION_BY_CLASS < types.size()) {
                        types.remove(randomPick(types));
                    }
                    return types.add(objectCreation);
                }
            } else {
                alreadySee.add(objectCreation.hashCode());
                return false;
            }
        } catch (Exception e) {
            alreadySee.add(objectCreation.hashCode());
            return false;
        }
    }

    protected MethodCall buildMethod(Class targetType, Method method) {
        ObjectCreation[] args = new ObjectCreation[method.getParameterCount()];

        if(typeToObjectCreation.containsKey(targetType) ) {
            ObjectCreation target = randomPick(typeToObjectCreation.get(targetType));

            MethodCall methodCall = new MethodCall(target, method, args);
            int i = 0;
            for (; i < method.getParameterCount(); i++) {
                Class type = method.getParameterTypes()[i];
                Set<ObjectCreation> set = typeToObjectCreation.get(type);
                if (set != null && !set.isEmpty()) {
                    args[i] = randomPick(set);
                } else {
                    break;
                }
            }
            if (i == args.length) {
                return methodCall;
            }
        }
        return null;
    }

    protected void findNewNew(Constructor constructor) {
        ObjectCreation newCall = buildConstructor(constructor);

        if(newCall != null && addNewValue(newCall))  {
            try {
                Log.debug("{} : {}", newCall, newCall.buildObject());
            } catch (Throwable e) {}
            updateExecutableToProcess(newCall);
            info();
        }
    }

    protected NewCall buildConstructor(Constructor constructor) {
        ObjectCreation[] args = new ObjectCreation[constructor.getParameterCount()];
        int i = 0;
        NewCall newCall = new NewCall(constructor, args);
        for(; i < constructor.getParameterCount(); i++) {
            Class type = constructor.getParameterTypes()[i];
            Set<ObjectCreation> set = typeToObjectCreation.get(type);
            if(set != null && !set.isEmpty()) {
                args[i] = randomPick(set);
            } else {
                break;
            }
        }
        if(i == args.length)  {
            return newCall;
        }
        return null;
    }

    protected void updateExecutableToProcess(ObjectCreation objectCreation) {
        Class dynamicType = objectCreation.getDynamicType();
        for(Constructor constructor : typeNeedC.keySet()) {
            if(typeNeedC.get(constructor).contains(dynamicType)) {
                executableToProcess.add(constructor);
            }
        }

        for (Method method : dynamicType.getMethods()) {
            if(Modifier.isPublic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && !methodFilter.contains(method)) {
                Set<Class> types = new HashSet<>();
                types.add(dynamicType);
                Collections.addAll(types, method.getParameterTypes());
                typeNeedM.put(method, types);
            }
        }

        if(!(dynamicType.equals(void.class) || dynamicType.equals(Void.class))
                && Modifier.isPublic(dynamicType.getModifiers())) {
            executableToProcess.add(objectCreation);
        }
    }

    protected void initMethodFilter() throws NoSuchMethodException {
        methodFilter = new HashSet<>();
        methodFilter.add(Object.class.getMethod("hashCode"));
//        Collections.addAll(methodFilter, Object.class.getMethods());
    }

    protected ObjectCreation randomPick(Set<ObjectCreation> objectCreations) {
        return objectCreations.stream().findFirst().orElse(null);
    }
}
