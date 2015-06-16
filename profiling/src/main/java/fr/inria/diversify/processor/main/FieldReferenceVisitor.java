package fr.inria.diversify.processor.main;

import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtReturn;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.visitor.CtScanner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Simon on 16/10/14.
 */
public class FieldReferenceVisitor extends CtScanner {

    protected Map<CtFieldReference,String> fields;
    protected Set<CtFieldReference> after;

    public FieldReferenceVisitor() {
        fields = new HashMap<>();
        after = new HashSet<>();
    }

    public <T, A extends T> void visitCtAssignment(CtAssignment<T, A> assignement) {
        if(assignement.getAssigned() instanceof CtFieldAccess)
            after.add(((CtFieldAccess) assignement.getAssigned()).getVariable());

        super.visitCtAssignment(assignement);
    }

    @Override
    public <T> void visitCtFieldAccess(CtFieldAccess<T> targetedAccess) {
        if(!targetedAccess.toString().startsWith("super")) {
            fields.put(((CtFieldReference) targetedAccess.getVariable()), targetedAccess.toString());
        }

        super.visitCtFieldAccess(targetedAccess);
    }

    public <R> void visitCtReturn(CtReturn<R> returnStatement) {
        super.visitCtReturn(returnStatement);
        after.clear();
    }

    public Map<CtFieldReference, String> getFields() {
        return fields;
    }

    public Set<CtFieldReference> getAfter() {
        return after;
    }
}
