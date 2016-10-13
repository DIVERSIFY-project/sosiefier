package fr.inria.diversify.transformation.typeTransformation;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.*;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.stream.Collectors;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.POSITION;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.SOURCE_CODE;

/**
 * User: Simon
 * Date: 12/11/15
 * Time: 10:54
 */
public class InstanceTransformation extends Transformation {
    protected Map<CtConstructorCall, Constructor> newClassInstance;
    protected Map<CtElement, CtConstructorCall> newCCtoOldCC;
    protected Set<CtMethod> methodsSwitch;
    protected boolean withSwitch;

    public InstanceTransformation() {
        type = "replaceNew";
        name = "replaceNew";
        newClassInstance = new IdentityHashMap<>();
        newCCtoOldCC = new IdentityHashMap<>();
        methodsSwitch = new HashSet<>();
    }

    @Override
    public void apply(String srcDir) throws Exception {
        List<CtType> classes = new ArrayList<>();

        for(Map.Entry<CtConstructorCall, Constructor> entry : newClassInstance.entrySet()) {
            CtConstructorCall callConstructor = entry.getKey();
            CtElement transplant = getTransplant(callConstructor, entry.getValue());
            Log.debug("replace {} by {} at line {}", callConstructor.toString(), transplant.toString(), callConstructor.getPosition().toString());
            callConstructor.replace(transplant);
            newCCtoOldCC.put(transplant, callConstructor);
            classes.add(callConstructor.getPosition().getCompilationUnit().getMainType());
        }

        printJavaFile(srcDir, classes);

        if(withSwitch) {
            copySwitch(srcDir);
        }
    }

    protected CtElement getTransplant(CtConstructorCall oldCallConstructor, Constructor newConstructor) {
        if(withSwitch) {
            return buildNewConditional(oldCallConstructor, newConstructor);
        }  else {
            return buildNewCallConstructor(newConstructor, oldCallConstructor.getArguments(), oldCallConstructor.getType().getActualTypeArguments());
        }
    }

    protected CtMethod getMethod(CtConstructorCall oldCallConstructor, Constructor newConstructor) {
        String methodName = createMethodName(oldCallConstructor, newConstructor);

        Set<CtMethod<?>> methods = oldCallConstructor.getParent(CtClass.class).getMethods();
        return methods.stream()
                .filter(mth -> methodName.equals(mth.getSimpleName()))
                .findFirst()
                .orElse(buildMethodSwitch(oldCallConstructor, newConstructor));
    }

    protected CtMethod buildMethodSwitch(CtConstructorCall oldCallConstructor, Constructor newConstructor) {
        CtMethod<Object> method = getFactory().Core().createMethod();
        method.setSimpleName(createMethodName(oldCallConstructor, newConstructor));

        StaticTypeFinder staticTypeFinder = new StaticTypeFinder();

        method.setType(buildTypeReference(staticTypeFinder.findStaticType(oldCallConstructor), oldCallConstructor.getType().getActualTypeArguments()));
        method.addModifier(ModifierKind.STATIC);



        List<CtTypeReference<?>> parameters = oldCallConstructor.getExecutable().getParameters();
        method.setFormalTypeParameters(getActualType(oldCallConstructor.getType(), parameters));

        int i[] = {0};
        parameters.stream()
                .forEach(param -> {
                    CtParameter newParam = getFactory().Core().createParameter();
                    newParam.setType(param);
                    newParam.setSimpleName("arg_" + i[0]++);
                    method.addParameter(newParam);
                });

        CtBlock body = getFactory().Core().createBlock();
        method.setBody(body);

        List<CtExpression> paramRefs = method.getParameters().stream()
                .map(param -> getFactory().Code().createCodeSnippetExpression(param.getSimpleName()))
                .collect(Collectors.toList());

        CtIf stmtIf = getFactory().Core().createIf();
        body.addStatement(stmtIf);

        CtFieldReference<Boolean> fieldRef = getFactory().Core().createFieldReference();
        fieldRef.setSimpleName("fr.inria.diversify.transformation.switchsosie.Switch.switchTransformation");
        stmtIf.setCondition(getFactory().Code().createVariableRead(fieldRef, true));

        CtBlock bodyThen = getFactory().Core().createBlock();
        stmtIf.setThenStatement(bodyThen);
        CtReturn returnNew = getFactory().Core().createReturn();
        CtExpression newCallConstructorClone = buildNewCallConstructor(newConstructor, paramRefs, oldCallConstructor.getType().getActualTypeArguments());
        returnNew.setReturnedExpression(newCallConstructorClone);
        bodyThen.addStatement(returnNew);

        CtBlock bodyElse = getFactory().Core().createBlock();
        stmtIf.setElseStatement(bodyElse);
        CtReturn returnOld = getFactory().Core().createReturn();
        CtConstructorCall oldCallConstructorClone = getFactory().Core().clone(oldCallConstructor);
        oldCallConstructorClone.setArguments(paramRefs);
        returnOld.setReturnedExpression(oldCallConstructorClone);
        bodyElse.addStatement(returnOld);

        oldCallConstructor.getParent(CtClass.class).addMethod(method);

        methodsSwitch.add(method);

        return method;
    }

    protected List<CtTypeReference<?>> getActualType(CtTypeReference returnType, List<CtTypeReference<?>> parameters) {
        List<CtTypeReference<?>> list = new ArrayList<>();
        list.addAll(getActualType(returnType));
        parameters.stream()
                .forEach(param -> list.addAll(getActualType(param)));

        return list;
    }

    protected List<CtTypeReference<?>> getActualType(CtTypeReference returnType) {
        List<CtTypeReference<?>> list = new ArrayList<>();
        for(CtTypeReference<?> type : returnType.getActualTypeArguments()) {
            if(!type.getActualTypeArguments().isEmpty()) {
                list.addAll(getActualType(type));
            } else {
                if(type instanceof CtTypeParameterReference) {
                    list.add(type);
                }
            }
        }
        return list;
    }

    protected CtTypeReference buildTypeReference(Class type, List<CtTypeReference<?>> actualTypeArguments) {
        CtTypeReference<Object> returnTypeRef = getFactory().Core().createTypeReference();
        returnTypeRef.setSimpleName(type.getCanonicalName());
        returnTypeRef.setActualTypeArguments(actualTypeArguments);

        return returnTypeRef;
    }

    protected CtConditional buildNewConditional(CtConstructorCall oldCallConstructor, Constructor newConstructor) {
        CtConditional<Object> conditional = getFactory().Core().createConditional();

        CtFieldReference<Boolean> fieldRef = getFactory().Core().createFieldReference();
        fieldRef.setSimpleName("fr.inria.diversify.transformation.switchsosie.Switch.switchTransformation");
        conditional.setCondition(getFactory().Code().createVariableRead(fieldRef, true));

        CtExpression newCallConstructor = buildNewCallConstructor(newConstructor, oldCallConstructor.getArguments(), oldCallConstructor.getType().getActualTypeArguments());
        conditional.setThenExpression(newCallConstructor);

        CtConstructorCall oldCallConstructorClone = getFactory().Core().clone(oldCallConstructor);
        conditional.setElseExpression(oldCallConstructorClone);

        return conditional;
    }

    protected String createMethodName(CtConstructorCall oldCallConstructor, Constructor newConstructor) {
        CtTypeReference oldDynamicType = oldCallConstructor.getType();
        String name = "change_" + oldDynamicType.getSimpleName();

        name += oldDynamicType.getActualTypeArguments().stream()
                    .map(type -> type.getSimpleName())
                    .collect(Collectors.joining("_"));

        name += "_with_";

        List<CtExpression> expressions = oldCallConstructor.getArguments();
        name += expressions.stream()
                    .map(expresion -> expresion.getType().getSimpleName())
                    .collect(Collectors.joining("_"));

        name += "_To_" + newConstructor.getDeclaringClass().getSimpleName();

        return name;
    }


    protected CtExpression buildNewCallConstructor(Constructor newConstructor,  List<CtExpression> arguments,  List<CtTypeReference<?>> geneticType) {
        String geneticTypeString = "";
        if (!geneticType.isEmpty()) {
            geneticTypeString = "<"
                    + geneticType.stream()
                    .map(typeRef -> typeRef.toString())
                    .collect(Collectors.joining(","))
                    + ">";
        }

        String snippet = "new "
                + newConstructor.getDeclaringClass().getCanonicalName()
                + geneticTypeString
                + "("
                + arguments.stream()
                    .map(arg -> arg.toString())
                    .collect(Collectors.joining(","))
                + ")";

        return getFactory().Code().createCodeSnippetExpression(snippet);
    }


    /**
     * Applies the transformation having into consideration the parent transformation
     *
     * @param srcDir Path of the output directory
     * @throws Exception
     */
    @Override
    public void applyWithParent(String srcDir) throws Exception {
        if (parent != null) {
            parent.apply(srcDir);
        }
        apply(srcDir);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            List<CtType> classes = new ArrayList<>();

            for (Map.Entry<CtElement, CtConstructorCall> entry : newCCtoOldCC.entrySet()) {
                entry.getKey().replace(entry.getValue());
                classes.add(entry.getValue().getPosition().getCompilationUnit().getMainType());
            }
            methodsSwitch.stream()
                    .forEach(mth -> ((CtClass) mth.getParent()).removeMethod(mth));

            printJavaFile(srcDir, classes);

            if (withSwitch) {
                deleteSwitch(srcDir);
            }
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }

    @Override
    public List<SourcePosition> getPositions() {
        return newClassInstance.keySet().stream()
                .map(elem -> elem.getPosition())
                .collect(Collectors.toList());
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    public void add(CtConstructorCall constructorCall, Constructor newConstructor) {
        newClassInstance.put(constructorCall, newConstructor);
    }

    public void setWithSwitch(boolean withSwitch) {
        this.withSwitch = withSwitch;

    }

    protected void printJavaFile(String directory, List<CtType> classes) throws IOException {
        Environment env = getFactory().getEnvironment();

        classes.stream()
            .forEach(cl -> {
                Log.debug("print java file: {}",directory + "/" +cl.getQualifiedName().replace(".", "/") + ".java");
                cl.getPosition().getCompilationUnit().getDeclaredTypes().stream()
                        .forEach(cc -> {
                            JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
                            processor.setFactory(getFactory());
                            processor.createJavaFile(cc);
                        });});
    }

    protected Factory getFactory() {
        return newClassInstance.keySet().stream().findFirst().orElse(null).getFactory();
    }

    protected void copySwitch(String copyDirName) throws IOException {
        File srcFile = new File(System.getProperty("user.dir") + "/generator/src/main/java/fr/inria/diversify/transformation/switchsosie/Switch.java");
        File destFile = new File(copyDirName  + "/fr/inria/diversify/transformation/switchsosie/Switch.java");

        FileUtils.copyFile(srcFile, destFile);
    }

    protected void deleteSwitch(String copyDirName) throws IOException {
        File delete = new File(copyDirName  + "/fr/inria/diversify/transformation/switchsosie/Switch.java");

        FileUtils.forceDelete(delete);
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();
        object.put("withSwitch",withSwitch);

        JSONArray array = new JSONArray();
        object.put("newConstructors", array);
        for (CtConstructorCall constructorCall : newClassInstance.keySet()) {
            JSONObject o = new JSONObject();
            array.put(o);
            String position = constructorCall.getPosition().getCompilationUnit().getMainType().getQualifiedName() + ":" + constructorCall.getPosition().getLine();
            o.put(POSITION, position);
            o.put(SOURCE_CODE, constructorCall.toString());

            o.put("newInstance", newClassInstance.get(constructorCall).getDeclaringClass().getCanonicalName());
            o.put("parameterTypes",   newClassInstance.get(constructorCall).getParameterTypes());
        }
        return object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstanceTransformation that = (InstanceTransformation) o;

        if (withSwitch != that.withSwitch) return false;
        return newClassInstance.equals(that.newClassInstance);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + newClassInstance.hashCode();
        result = 31 * result + (withSwitch ? 1 : 0);
        return result;
    }
}
