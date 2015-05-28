package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.*;
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
        if(targetedAccess.getTarget() != null && !(targetedAccess.getTarget() instanceof CtThisAccess)) {
            if(targetedAccess.getTarget().getType() == null)
                Log.debug("");
            if(targetedAccess.getTarget().getType() != null && targetedAccess.getTarget().getType().isPrimitive()) {
                Log.debug("");
            }
        }
        if(!targetedAccess.toString().startsWith("super"))
            fields.put(((CtFieldReference)targetedAccess.getVariable()),targetedAccess.toString());

        super.visitCtFieldAccess(targetedAccess);
    }


//    public <T> void visitCtTargetedAccess(CtTargetedAccess<T> targetedAccess) {
//        if(targetedAccess.getTarget() != null && !(targetedAccess.getTarget() instanceof CtThisAccess)) {
//            if(targetedAccess.getTarget().getType() == null)
//                Log.debug("");
//            if(targetedAccess.getTarget().getType() != null && targetedAccess.getTarget().getType().isPrimitive()) {
//                Log.debug("");
//            }
//        }
//        if(!targetedAccess.toString().startsWith("super"))
//            fields.put(((CtFieldReference)targetedAccess.getVariable()),targetedAccess.toString());
//
//        super.visitCtTargetedAccess(targetedAccess);
//    }

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
