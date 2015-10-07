package fr.inria.diversify.crossCheckingOracle;

import spoon.reflect.code.*;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 22/09/15
 */
public class CrossCheckingOracleBuilder {

    public CtMethod builder(CtMethod originalTest) {
        Factory factory = originalTest.getFactory();
        CtType<?> declaringClass = originalTest.getDeclaringType();

        List<CtLocalVariable> localVar = findAllVariableDeclaration(originalTest.getBody());
        boolean isOverride = originalTest.getAnnotations().stream()
                .anyMatch(annotation -> !annotation.getSignature().contains("Override"));
        if(localVar.isEmpty() && !isOverride) {
            return null;
        }

        Set<CtTypeReference<? extends Throwable>> thrownTypes = getThrow(originalTest);

        CtMethod runMethod = buildRunMethod(originalTest, thrownTypes, localVar);

        CtBlock<Object> body = factory.Core().createBlock();
        switchToSosie(body, false);
        addLocalListDeclaration(body, "objects1");
        addLocalListDeclaration(body, "objects2");

        body.addStatement(factory.Code().createCodeSnippetStatement(runMethod.getSimpleName() + "(objects1)"));

        addTeardownStatement(originalTest, body);
        addSetUpStatement(originalTest, body);

        body.addStatement(factory.Code().createCodeSnippetStatement(runMethod.getSimpleName() + "(objects2)"));
        addFilter(body, "objects1", "objects2", "filter");

        addTeardownStatement(originalTest, body);
        addSetUpStatement(originalTest, body);

        addLocalListDeclaration(body, "objects3");
        addLocalListDeclaration(body, "objects4");

        body.addStatement(factory.Code().createCodeSnippetStatement(runMethod.getSimpleName() + "(objects3)"));

        addTeardownStatement(originalTest, body);
        addSetUpStatement(originalTest, body);

        switchToSosie(body, true);

        body.addStatement(factory.Code().createCodeSnippetStatement(runMethod.getSimpleName() + "(objects4)"));

        addCompare(body, "objects3", "objects4", "filter");

        CtMethod cloneMethod = factory.Method().create(declaringClass,
                    originalTest.getModifiers(),
                    originalTest.getType(),
                    originalTest.getSimpleName() + "_clone",
                    originalTest.getParameters(),
                    thrownTypes);

        cloneMethod.setAnnotations(getAnnotations(originalTest));
        cloneMethod.setBody(body);

        return cloneMethod;
    }

    protected CtMethod buildRunMethod(CtMethod originalTest,  Set<CtTypeReference<? extends Throwable>> thrownTypes, List<CtLocalVariable> localVar) {
        Factory factory = originalTest.getFactory();
        CtType<?> declaringClass = originalTest.getDeclaringType();

        CtBlock tryBody = factory.Core().clone(originalTest.getBody());
        addCopyObject(tryBody, "_objects_", localVar);

        CtParameter<Object> param = factory.Core().createParameter();
        CtTypeReference typeRef = factory.Core().createTypeReference();
        typeRef.setSimpleName("java.util.ArrayList<Object>");
        param.setType(typeRef);
        param.setSimpleName("_objects_");
        List<CtParameter<?>> params = new ArrayList<>(1);
        params.add(param);

        CtMethod mth = factory.Method().create(declaringClass,
                originalTest.getModifiers(),
                originalTest.getType(),
                originalTest.getSimpleName() + "_run",
                params,
                thrownTypes);

        if(isExceptionTest(originalTest)) {
            mth.setBody(tryBody);
        } else {
            CtTry tryBlock = buildTryBody(tryBody, factory);
            CtBlock bodyMth = factory.Core().createBlock();
            bodyMth.addStatement(tryBlock);
            mth.setBody(bodyMth);
        }

        return mth;
    }

    protected boolean isExceptionTest(CtMethod test) {
        CtAnnotation<? extends Annotation> annotation = test.getAnnotations().stream()
                .filter(anno -> anno.getSignature().contains("Test"))
                .findFirst()
                .orElse(null);

        if(annotation != null) {
            return annotation.getElementValues().containsKey("expected");
        }
        return false;
    }

    protected CtTry buildTryBody(CtBlock tryBody, Factory factory) {
        CtTry tryBlock = factory.Core().createTry();
        tryBlock.setBody(tryBody);
        CtCatch ctCatch = factory.Core().createCatch();
        tryBlock.addCatcher(ctCatch);
        CtCatchVariable catchVar = factory.Core().createCatchVariable();
        catchVar.setSimpleName("eee");
        CtTypeReference typeCatch = factory.Core().createTypeReference();
        typeCatch.setSimpleName("Throwable");
        catchVar.setType(typeCatch);
        ctCatch.setParameter(catchVar);
        ctCatch.setBody(factory.Core().createBlock());

        return tryBlock;
    }

    protected Set<CtTypeReference<? extends Throwable>> getThrow(CtMethod mth) {
        CtType<?> declaringClass = mth.getDeclaringType();
        Set<CtTypeReference<? extends Throwable>> thrownTypes = new HashSet<>(mth.getThrownTypes());

        if(findSetUpMethod(declaringClass) != null) {
            thrownTypes.addAll(findSetUpMethod(declaringClass).getThrownTypes());
        }
        if(findTeardownMethod(declaringClass) != null) {
            thrownTypes.addAll(findTeardownMethod(declaringClass).getThrownTypes());
        }

        return thrownTypes;
    }

    protected List<CtAnnotation<? extends Annotation>> getAnnotations(CtMethod mth) {
        return (List<CtAnnotation<? extends Annotation>>)mth.getAnnotations().stream()
                .filter(annotation -> !annotation.getSignature().contains("Override"))
                .collect(Collectors.toList());
    }

    protected void addFilter(CtBlock<Object> body, String originalsObjects, String sosiesObjects, String filterName) {
        Factory factory = body.getFactory();
        CtCodeSnippetStatement stmt = factory.Code().createCodeSnippetStatement("java.util.List<Boolean> " + filterName
                + " = fr.inria.diversify.crossCheckingOracle.compare.Compare.getSingleton().buildFilter(" + originalsObjects + "," + sosiesObjects + ")");
        body.addStatement(stmt);
    }

    protected void addCompare(CtBlock<Object> body, String originalsObjects, String sosiesObjects, String filter) {
        Factory factory = body.getFactory();
        CtCodeSnippetStatement stmt = factory.Code().createCodeSnippetStatement("org.junit.Assert.assertTrue(fr.inria.diversify.crossCheckingOracle.compare.Compare.getSingleton().compare("
                + originalsObjects + "," + sosiesObjects + ", "+ filter + "))");
        body.addStatement(stmt);
    }

    protected void addLocalListDeclaration( CtBlock body, String varName) {
        Factory factory = body.getFactory();
        CtCodeSnippetStatement newList = factory.Code().createCodeSnippetStatement("java.util.ArrayList<Object> " + varName + " = new java.util.ArrayList<Object>()");
        body.addStatement(newList);
    }

    protected void addCopyObject(CtBlock body, String varName, List<CtLocalVariable> localVariables) {
        Factory factory = body.getFactory();
//        addField(cl, "java.util.List<Object>", fieldName);
//        CtCodeSnippetStatement newList = factory.Code().createCodeSnippetStatement(fieldName + " = new java.util.ArrayList<Object>()");
//        body.addStatement(newList);

        for(CtLocalVariable var : localVariables) {
            CtCodeSnippetStatement addVarStmt = factory.Code().createCodeSnippetStatement(varName + ".add(" + var.getSimpleName() + ")");
            body.addStatement(addVarStmt);
        }
    }

    protected void switchToSosie(CtBlock<Object> body, boolean sosie) {
        Factory factory = body.getFactory();
        body.addStatement(factory.Code().createCodeSnippetStatement("fr.inria.diversify.switchsosie.Switch.switchTransformation = " + sosie));
    }

    protected void addSetUpStatement(CtMethod mth, CtBlock body) {
        if(!mth.getModifiers().contains(ModifierKind.STATIC)) {
            CtCodeSnippetStatement stmt =
                    mth.getFactory().Code().createCodeSnippetStatement("fr.inria.diversify.crossCheckingOracle.compare.TestUtils.runTearDown(this)");
            body.addStatement(stmt);
        }
    }

    protected void addTeardownStatement(CtMethod mth, CtBlock body) {
//        CtMethod teardownMethod = findTeardownMethod(cl);
//        if(teardownMethod != null) {
//            CtCodeSnippetStatement stmt = cl.getFactory().Code().createCodeSnippetStatement(teardownMethod.getSimpleName() + "()");
//            body.addStatement(stmt);
//        }
        if(!mth.getModifiers().contains(ModifierKind.STATIC)) {
            CtCodeSnippetStatement stmt =
                    mth.getFactory().Code().createCodeSnippetStatement("fr.inria.diversify.crossCheckingOracle.compare.TestUtils.runSetUp(this)");
            body.addStatement(stmt);
        }
    }

    protected CtMethod findSetUpMethod(CtType<?> cl) {
        for(CtMethod mth : cl.getMethods()) {
            if(mth.getSimpleName().toLowerCase().equals("setup")
                    || mth.getAnnotations().stream().anyMatch(anno -> anno.getSignature().toLowerCase().contains("before"))) {
                return mth;
            }
        }
        if(cl.getSuperclass() != null
                && cl.getSuperclass().getSimpleName() != "Object"
                && cl.getSuperclass().getDeclaration() != null) {
            return findSetUpMethod(cl.getSuperclass().getDeclaration());
        } else {
            return null;
        }
    }

    protected CtMethod findTeardownMethod(CtType<?> cl) {
        for(CtMethod mth : cl.getMethods()) {
            if(mth.getSimpleName().toLowerCase().equals("teardown")
                    || mth.getAnnotations().stream().anyMatch(anno -> anno.getSignature().toLowerCase().contains("after"))) {
                return mth;
            }
        }
        if(cl.getSuperclass() != null
                && cl.getSuperclass().getSimpleName() != "Object"
                && cl.getSuperclass().getDeclaration() != null) {
            return findTeardownMethod(cl.getSuperclass().getDeclaration());
        } else {
            return null;
        }
    }

    protected List<CtLocalVariable> findAllVariableDeclaration(CtBlock block) {
        return  (List<CtLocalVariable>) Query.getElements(block, new TypeFilter(CtLocalVariable.class)).stream()
                .filter(var -> ((CtLocalVariable)var).getParent().equals(block))
                .collect(Collectors.toList());
    }

    protected CtField<Boolean> addField(CtType<?> cl, String type, String name) {
        Factory factory = cl.getFactory();

        CtTypeReference<Boolean> typeRef = factory.Core().createTypeReference();
        typeRef.setSimpleName(type);

        CtField<Boolean> field = factory.Core().createField();
        field.setType(typeRef);
        field.setSimpleName(name);

        Set<ModifierKind> modifierKinds = new HashSet<>();
        modifierKinds.add(ModifierKind.STATIC);
        field.setModifiers(modifierKinds);

        field.setParent(cl);
        cl.addField(field);

        return field;
    }

}
