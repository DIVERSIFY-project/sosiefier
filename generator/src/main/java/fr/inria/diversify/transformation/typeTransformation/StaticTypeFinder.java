package fr.inria.diversify.transformation.typeTransformation;

import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtAbstractVisitor;

import java.util.Set;

/**
 * User: Simon
 * Date: 12/11/15
 * Time: 13:43
 */
public class StaticTypeFinder extends CtAbstractVisitor {
    protected Class staticType;
    protected CtElement element;

    public Class findStaticType(CtElement element) {
        this.element = element;
        element.getParent().accept(this);

        return staticType;
    }

    @Override
    public <T> void visitCtInvocation(CtInvocation<T> invocation) {
        int[] idx = {0};
        staticType = invocation.getArguments().stream()
                .filter(arg -> {
                    idx[0]++;
                    return arg.equals(element);
                })
                .map(arg -> getActualClass(arg.getType()))
                .findAny()
                .orElse(null);
        try {
            staticType = invocation.getExecutable().getActualMethod().getParameters()[idx[0] - 1].getType();
        } catch (Exception e) {
        }
    }

    @Override
    public <T> void visitCtConstructorCall(CtConstructorCall<T> constructorCall) {
        staticType = constructorCall.getArguments().stream()
                .filter(arg -> arg.equals(element))
                .map(arg -> getActualClass(arg.getType()))
                .findAny()
                .orElse(null);
    }

    @Override
    public <T> void visitCtReturn(CtReturn<T> r) {
        staticType = getActualClass(r.getParent(CtMethod.class).getType());
    }

    @Override
    public <T> void visitCtVariableWrite(CtVariableWrite<T> variableWrite) {
        staticType = getActualClass(variableWrite.getType());
    }

    @Override
    public <T, A extends T> void visitCtAssignment(CtAssignment<T, A> assignement) {
        staticType = getActualClass(assignement.getAssigned().getType());
    }

    @Override
    public <T> void visitCtLocalVariable(CtLocalVariable<T> variable) {
        staticType = getActualClass(variable.getType());
    }

    @Override
    public <T> void visitCtField(CtField<T> field) {
        staticType = getActualClass(field.getType());
    }

    @Override
    public void visitCtThrow(CtThrow throwStatement) {
        Class throwType = throwStatement.getThrownExpression().getType().getActualClass();

        if(RuntimeException.class.isAssignableFrom(throwType)) {
            staticType = RuntimeException.class;
        }  else {
            Set<CtTypeReference> thrownTypes = throwStatement.getParent(CtExecutable.class).getThrownTypes();
            staticType = thrownTypes.stream()
                    .map(type -> getActualClass(type))
                    .filter(type -> type != null)
                    .filter(type -> type.isAssignableFrom(throwType))
                    .findFirst()
                    .orElse(null);
        }
    }

    @Override
    public <T> void visitCtConditional(CtConditional<T> conditional) {
        conditional.getParent().accept(this);
    }

    protected Class getActualClass(CtTypeReference typeReference) {
        if(typeReference == null) {
            return null;
        } else {
            return typeReference.getActualClass();
        }
    }
}
