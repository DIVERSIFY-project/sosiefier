package fr.inria.diversify.statement;

import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputContext {
	protected Set<CtVariableReference<?>> localVariableReferences;
    protected Set<CtFieldAccess<?>> fieldReferences = new HashSet<CtFieldAccess<?>>();
	protected Integer hashCode = null;

	public InputContext(Set<CtVariableReference<?>> inputContext, Set<CtFieldAccess<?>> fieldReferences) {
		this.localVariableReferences = inputContext;
        this.fieldReferences = fieldReferences;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof InputContext))
			return false;
		return this.hashCode() == obj.hashCode();
	}
	
	protected Set<String> inputContextToString() {
		Set<String> set = new HashSet<String>();
		for (CtVariableReference<?> var : localVariableReferences)
			set.add(var.getType().toString());
        for (CtFieldAccess<?> var : fieldReferences)
            set.add(var.getVariable().getType().toString());
		return set;
	}
	
	public Object candidate(CtTypeReference<?> type){
        Object candidate =  candidateForLocalVar(type);
        if(candidate == null)
            candidate = candidateForFieldAccess(type);
        return candidate;
	}

    public List<Object> allCandidate(CtTypeReference<?> type){
        List<Object> candidate = new ArrayList<Object>();
       candidate.addAll(allCandidateForFieldAccess(type));
        candidate.addAll(allCandidateForLocalVar(type));

        return candidate;
    }
    public List<CtFieldAccess> allCandidateForFieldAccess(CtTypeReference<?> type){
        List<CtFieldAccess> candidate = new ArrayList<CtFieldAccess>();
        for (CtFieldAccess<?> var : fieldReferences)
            if(var.getVariable().getType().equals(type))
                candidate.add(var);

        return candidate;
    }

    public List<CtVariableReference> allCandidateForLocalVar(CtTypeReference<?> type){
        List<CtVariableReference> candidate = new ArrayList<CtVariableReference>();

        for (CtVariableReference<?> var : localVariableReferences)
            if(var.getType().equals(type))
                candidate.add(var);

        return candidate;
    }
    public CtFieldAccess<?> candidateForFieldAccess(CtTypeReference<?> type){
        CtFieldAccess<?> candidate = null;
        for (CtFieldAccess<?> var : fieldReferences) {
            if(var.getVariable().getType().equals(type)) {
                candidate = var;
                break;
            }
        }
        return candidate;
    }

    public CtVariableReference<?> candidateForLocalVar(CtTypeReference<?> type){
        CtVariableReference<?> candidate = null;
        for (CtVariableReference<?> var : localVariableReferences) {
            if(var.getType().equals(type)) {
                candidate = var;
                break;
            }
        }
        return candidate;
        }
	
	public boolean isInclude(InputContext other){
		boolean isReplace = true;
		for (CtVariableReference<?> variable : other.localVariableReferences)
			isReplace = isReplace && hasCandidate(variable.getType());

        for (CtFieldAccess<?> field : other.fieldReferences)
            isReplace = isReplace && hasCandidateForFieldAccess(field.getVariable().getType());
		return isReplace;
	}

    protected boolean hasCandidateForLocalVar(CtTypeReference<?> type) {
        return candidateForLocalVar(type) != null;
    }
    protected boolean hasCandidateForFieldAccess(CtTypeReference<?> type) {
        return candidateForFieldAccess(type) != null;
    }

	protected boolean hasCandidate(CtTypeReference<?> type) {
		return candidate(type) != null;
	}

	public Set<CtVariableReference<?>> getLocalVar() {
		return localVariableReferences;
	}

    public Set<CtFieldAccess<?>> getField() {
        return fieldReferences;
    }
    public Set<Object> getVarAndField() {
        Set<Object> list = new HashSet<Object>();
        list.addAll(localVariableReferences);
        list.addAll(fieldReferences);
        return list;
    }
	public String equalString() {
		return inputContextToString().toString();
	}
	
	@Override
	public String toString() {
		return getVarAndField().toString();
	}
	
	@Override
	public int hashCode() {
		if(hashCode == null)
			hashCode = inputContextToString().hashCode();
		return hashCode;
	}

	public int size() {
		return localVariableReferences.size() + fieldReferences.size();
	}
	
}
