package fr.inria.diversify.codeFragment;

import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputContext {
	protected Set<CtVariableReference<?>> localVariableReferences;
	protected Integer hashCode = null;

	public InputContext(Set<CtVariableReference<?>> inputContext) {
		this.localVariableReferences = inputContext;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof InputContext))
			return false;
		return this.hashCode() == obj.hashCode();
	}
	
	protected Set<String> inputContextToString() {
		//todo set ou list ?????
        Set<String> set = new HashSet<String>();
		for (CtVariableReference<?> var : localVariableReferences)
			set.add(var.getType().toString());
		return set;
	}
	
	public Object candidate(CtTypeReference<?> type){
        Object candidate =  candidateForLocalVar(type);;
        return candidate;
	}

    public List<Object> allCandidate(CtTypeReference<?> type){
        List<Object> candidate = new ArrayList<Object>();
        candidate.addAll(allCandidateForLocalVar(type));

        return candidate;
    }

    public List<CtVariableReference> allCandidateForLocalVar(CtTypeReference<?> type){
        List<CtVariableReference> candidate = new ArrayList<CtVariableReference>();

        for (CtVariableReference<?> var : localVariableReferences)
            if(var.getType().equals(type)  && var.getType().getActualTypeArguments().equals(type.getActualTypeArguments())) {
                candidate.add(var);
            }

        return candidate;
    }


    public CtVariableReference<?> candidateForLocalVar(CtTypeReference<?> type){
        CtVariableReference<?> candidate = null;
        for (CtVariableReference<?> var : localVariableReferences) {
            CtTypeReference<?> varType = var.getType();
            if(varType.equals(type) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
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
        return isReplace;
	}

    public Object getVariableOrFieldNamed(String name) {
        Object o = null;
        for(Object vf : getVar())
            if(vf.toString().equals(name)) {
                o = vf;
                break;
            }
        if(o == null && name.endsWith(")"))
            return getVariableOrFieldNamed(name.substring(1,name.length()-1));
        return o;
    }

	protected boolean hasCandidate(CtTypeReference<?> type) {
		return candidate(type) != null;
	}

	public Set<CtVariableReference<?>> getVar() {
		return localVariableReferences;
	}

	public String equalString() {
		return inputContextToString().toString();
	}
	
	@Override
	public String toString() {
		return getVar().toString();
	}
	
	@Override
	public int hashCode() {
		if(hashCode == null)
			hashCode = inputContextToString().hashCode();
		return hashCode;
	}

	public int size() {
		return localVariableReferences.size();
	}

    public List<CtTypeReference<?>> getTypes() {
        List<CtTypeReference<?>> types = new ArrayList<CtTypeReference<?>>();

        for (CtVariableReference var: localVariableReferences) {
               types.add(var.getType());
        }
        return types;
    }

    public boolean hasOnlyPrimitive() {
        boolean test = true;
        for(CtTypeReference type : getTypes()) {
            test = test && type.isPrimitive();
        }
        return test;
    }
}
