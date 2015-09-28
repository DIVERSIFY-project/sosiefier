package fr.inria.diversify.clone;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 22/09/15
 */
public class CloneTestBuilder {

    public CtMethod builder(CtMethod originalTest) {
        Factory factory = originalTest.getFactory();
        CtType<?> declaringClass = originalTest.getDeclaringType();

        Set<CtTypeReference<? extends Throwable>> thrownTypes = new HashSet<>(originalTest.getThrownTypes());
        if(findSetUpMethod(declaringClass) != null) {
            thrownTypes.addAll(findSetUpMethod(declaringClass).getThrownTypes());
        }
        if(findTeardownMethod(declaringClass) != null) {
            thrownTypes.addAll(findTeardownMethod(declaringClass).getThrownTypes());
        }

        CtMethod cloneMethod = factory.Method().create(declaringClass,
                originalTest.getModifiers(),
                originalTest.getType(),
                originalTest.getSimpleName() + "_clone",
                originalTest.getParameters(),
                thrownTypes);

        CtBlock<Object> body = factory.Core().createBlock();

        CtBlock bodyClone = factory.Core().clone(originalTest.getBody());
        body.addStatement(bodyClone);
        addCopyObject(declaringClass, bodyClone, "originalsObjects");
//        body.addStatement(switchToSosie());
        addTeardownStatement(declaringClass, body);
        addSetUpStatement(declaringClass, body);

        bodyClone = factory.Core().clone(originalTest.getBody());
        body.addStatement(bodyClone);
        addCopyObject(declaringClass, bodyClone, "sosiesObjects");

        addCompare(body, "originalsObjects", "sosiesObjects");

        cloneMethod.setBody(body);
        return cloneMethod;
    }

    protected void addCompare(CtBlock<Object> body, String originalsObjects, String sosiesObjects) {
        Factory factory = body.getFactory();
        CtCodeSnippetStatement stmt = factory.Code().createCodeSnippetStatement("org.junit.Assert.assertTrue(fr.inria.diversify.clone.compare.Compare.getSingleton().compare("
                + originalsObjects + "," + sosiesObjects + "))");
        body.addStatement(stmt);
    }

    protected void addCopyObject(CtType<?> cl, CtBlock body, String fieldName) {
        Factory factory = body.getFactory();
        addField(cl, "java.util.List<Object>", fieldName);
        CtCodeSnippetStatement newList = factory.Code().createCodeSnippetStatement(fieldName + " = new java.util.ArrayList<Object>()");
        body.addStatement(newList);

        for(CtLocalVariable var : findAllVariableDeclaration(body)) {
            CtCodeSnippetStatement addVarStmt = factory.Code().createCodeSnippetStatement(fieldName + ".add(" + var.getSimpleName() + ")");
            body.addStatement(addVarStmt);
        }
    }

    protected CtStatement switchToSosie() {
        return null;
    }

    protected void addSetUpStatement(CtType<?> cl, CtBlock body) {
        CtMethod setUpMethod = findSetUpMethod(cl);
        if(setUpMethod != null) {
            CtCodeSnippetStatement stmt = cl.getFactory().Code().createCodeSnippetStatement(setUpMethod.getSimpleName() + "()");
            body.addStatement(stmt);
        }
    }

    protected void addTeardownStatement(CtType<?> cl, CtBlock body) {
        CtMethod teardownMethod = findTeardownMethod(cl);
        if(teardownMethod != null) {
            CtCodeSnippetStatement stmt = cl.getFactory().Code().createCodeSnippetStatement(teardownMethod.getSimpleName() + "()");
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
        return null;
    }

    protected CtMethod findTeardownMethod(CtType<?> cl) {
        for(CtMethod mth : cl.getMethods()) {
            if(mth.getSimpleName().toLowerCase().equals("teardown")
                    || mth.getAnnotations().stream().anyMatch(anno -> anno.getSignature().toLowerCase().contains("after"))) {
                return mth;
            }
        }
        return null;
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

        field.setParent(cl);
        cl.addField(field);

        return field;
    }

}
