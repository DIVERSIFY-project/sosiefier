package fr.inria.diversify.transformation.typeTransformation;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.QueryException;
import fr.inria.diversify.transformation.query.TransformationQuery;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.reference.CtTypeReference;

import java.lang.reflect.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 12/11/15
 * Time: 10:54
 */
public class InstanceTransformationQuery extends TransformationQuery {
    protected Reflections reflections;
    protected List<CtConstructorCall> constructorCalls;
    protected List<Set<Class>> staticTypes;
    protected List<Set<Class>> originalDynamicTypes;
    protected List<Set<Class>> newDynamicTypes;
    protected boolean all;
    protected boolean withSwitch;

    public InstanceTransformationQuery(InputProgram inputProgram, String typeConfiguration, boolean all, boolean withSwitch) {
        super(inputProgram);

        try {
            initReflections();
        } catch (Exception e) {
            e.printStackTrace();
        }

        parseTypeConfiguration(typeConfiguration);

        this.all = all;
        this.withSwitch = withSwitch;
    }

    protected void initReflections() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        reflections = new Reflections(new ConfigurationBuilder()
                .setUrls(MavenDependencyResolver.dependencyResolver().getDirectDependenciesURL())
                .setScanners(new SubTypesScanner(false))
                .filterInputsBy(new FilterBuilder().includePackage(".*")));

        reflections.merge(new Reflections(ConfigurationBuilder.build()
                .setUrls(sun.misc.Launcher.getBootstrapClassPath().getURLs())
                .setScanners(new SubTypesScanner(false))
                .filterInputsBy(new FilterBuilder().includePackage("java..*"))));
    }

    protected void parseTypeConfiguration(String typeConfiguration) {
        Set<Class> allType = getAllType();

        staticTypes = new ArrayList<>();
        originalDynamicTypes = new ArrayList<>();
        newDynamicTypes = new ArrayList<>();

        for(String conf : typeConfiguration.split(";")) {
            String[] types = conf.split(":");

            Pattern staticTypePattern = Pattern.compile(types[0]);
            Set<Class> staticType = allType.stream()
                    .filter(cl -> staticTypePattern.matcher(cl.getCanonicalName()).matches())
                    .collect(Collectors.toSet());
            staticTypes.add(staticType);

            Pattern originalDynamicTypePattern = Pattern.compile(types[1]);
            originalDynamicTypes.add(allType.stream()
                    .filter(cl -> originalDynamicTypePattern.matcher(cl.getCanonicalName()).matches())
                    .filter(cl -> staticType.stream()
                            .anyMatch(st -> st.isAssignableFrom(cl)))
                    .collect(Collectors.toSet()));

            Pattern newDynamicTypePattern = Pattern.compile(types[2]);
            newDynamicTypes.add(allType.stream()
                    .filter(cl -> newDynamicTypePattern.matcher(cl.getCanonicalName()).matches())
                    .filter(cl -> staticType.stream()
                            .anyMatch(st -> st.isAssignableFrom(cl)))
                    .collect(Collectors.toSet()));
        }
    }


    protected Set<Class> getAllType() {
        return reflections.getAllTypes().stream()
                .filter(className -> !className.contains("$"))
                .map(className -> {
                    try {
                        return Thread.currentThread().getContextClassLoader().loadClass(className);
                    } catch (Throwable e) {
                        return null;
                    }})
                .filter(cl -> cl != null)
                .filter(cl -> !cl.isAnonymousClass())
                .filter(cl -> !cl.isMemberClass())
                .collect(Collectors.toSet());
    }

    @Override
    public Transformation query() throws QueryException {
        Random random = new Random();

        while (true) {
            int index = random.nextInt(staticTypes.size());

            List<CtConstructorCall> constructorCallDynamicType = findAllConstructorCallWithDynamicType(getConstructorCall(), originalDynamicTypes.get(index));
            List<CtConstructorCall> constructorCallStaticType = findAllConstructorCallWithStaticType(constructorCallDynamicType, staticTypes.get(index));

            if (!constructorCallStaticType.isEmpty()) {
                CtConstructorCall candidate = constructorCallStaticType.get(random.nextInt(constructorCallStaticType.size()));
                List<Constructor> newConstructor = findAllNewConstructors(candidate, newDynamicTypes.get(index));
                if (!newConstructor.isEmpty()) {
                    InstanceTransformation transformation = new InstanceTransformation();
                    transformation.setWithSwitch(withSwitch);
                    if (all) {
                        buildMultiPointTransformation(transformation, constructorCallStaticType, candidate, newConstructor.get(random.nextInt(newConstructor.size())));
                    } else {
                        buildSinglePointTransformation(transformation, candidate, newConstructor.get(random.nextInt(newConstructor.size())));
                    }
                    return transformation;
                }
            }
        }
    }

    protected void buildMultiPointTransformation(InstanceTransformation transformation, List<CtConstructorCall> constructorCalls,
                                                 CtConstructorCall candidate, Constructor newConstructor) {
        StaticTypeFinder staticTypeFinder = new StaticTypeFinder();

        Constructor model = candidate.getExecutable().getActualConstructor();
        constructorCalls.stream()
                .filter(constructorCall -> constructorCall.getExecutable() != null
                        && constructorCall.getExecutable().getActualConstructor() != null)
                .filter(constructorCall -> model.equals(constructorCall.getExecutable().getActualConstructor()))
                .filter(constructorCall -> staticTypeFinder.findStaticType(constructorCall).isAssignableFrom(newConstructor.getDeclaringClass()))
                .forEach(constructorCall -> transformation.add(constructorCall, newConstructor));
    }

    protected void buildSinglePointTransformation(InstanceTransformation transformation, CtConstructorCall candidate, Constructor newConstructor) {
        transformation.add(candidate, newConstructor);
    }

    protected List<Constructor> findAllNewConstructors(CtConstructorCall constructorCall, Set<Class> newDynamicType) {
        Class staticType = findStaticType(constructorCall);
        Set<Class> subTypes = findAssignableTypeFor(staticType).stream()
                .filter(type -> newDynamicType.contains(type))
                .collect(Collectors.toSet());

        List<Constructor> candidate = findCandidate(constructorCall, subTypes);
        candidate.remove(constructorCall.getExecutable().getActualConstructor());

        return candidate.stream()
                .filter(c -> !Modifier.isAbstract(c.getDeclaringClass().getModifiers()))
                .filter(c -> newDynamicType.stream()
                        .anyMatch(dt -> dt == c.getDeclaringClass() || dt.isAssignableFrom(c.getDeclaringClass())))
                .collect(Collectors.toList());

    }

    protected List<CtConstructorCall> findAllConstructorCallWithStaticType(List<CtConstructorCall> constructorCalls, Set<Class> staticType) {
        return constructorCalls.stream()
                .filter(constructorCall -> {
                    Class type = findStaticType(constructorCall);
                    return type != null
                            && staticType.stream()
                                .anyMatch(st -> st.isAssignableFrom(type));
                })
                .collect(Collectors.toList());
    }

    protected List<CtConstructorCall> findAllConstructorCallWithDynamicType(List<CtConstructorCall> constructorCalls, Set<Class> dynamicType) {
        return constructorCalls.parallelStream()
                .filter(constructorCall -> {
                    try {
                        CtTypeReference typeRef = constructorCall.getType();
                        if (typeRef != null) {
                            Class cl = typeRef.getActualClass();
                            return dynamicType.stream()
                                    .anyMatch(dt -> dt.isAssignableFrom(cl));
                        }
                    } catch (Exception e) {}
                    return false;
                })
                .collect(Collectors.toList());
    }

    protected Class findStaticType(CtConstructorCall ctConstructorCall) {
        StaticTypeFinder staticTypeFinder = new StaticTypeFinder();
        Class cl = staticTypeFinder.findStaticType(ctConstructorCall);

        return cl;
    }

    protected Set<Class> findAssignableTypeFor(Class staticType) {
        Set<Class> classes = reflections.getSubTypesOf(staticType);

        return classes.stream()
                .filter(cl -> Modifier.isPublic(cl.getModifiers()))
                .filter(cl -> !cl.isAnonymousClass())
                .filter(cl -> !cl.isMemberClass())
                .collect(Collectors.toSet());
    }

    protected List<Constructor> findCandidate(CtConstructorCall constructorCall, Set<Class> classes) {
        return classes.stream()
                .map(cl -> findEquivalentConstructor(constructorCall, cl))
                .filter(constructor -> constructor != null)
                .collect(Collectors.toList());
    }

    protected Constructor findEquivalentConstructor(CtConstructorCall constructorCall, Class cl) {
        try {
            Class[] types = constructorCall.getExecutable().getActualConstructor().getParameterTypes();
            return cl.getConstructor(types);
        } catch (Exception e) {
            return null;
        }
    }

    protected  List<CtConstructorCall> getConstructorCall() {
        if (constructorCalls == null) {
            List<CtConstructorCall> allConstructorCall = getInputProgram().getAllElement(CtConstructorCall.class);
            constructorCalls = allConstructorCall.parallelStream()
                    .filter(elem -> elem.getPosition() != null)
                    .filter(elem -> getInputProgram().getCoverageReport().elementCoverage(elem) != 0)
                    .filter(elem -> elem.getPosition().toString().contains(inputProgram.getRelativeSourceCodeDir()))
                    .collect(Collectors.toList());
        }
        return constructorCalls;
    }
}
