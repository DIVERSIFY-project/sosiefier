package fr.inria.diversify.codeFragment;

import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputContext {
	protected Set<CtVariableReference<?>> variableReferences;
	protected Integer hashCode = null;

	public InputContext(Set<CtVariableReference<?>> inputContext) {
		this.variableReferences = inputContext;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof InputContext))
			return false;
		return this.hashCode() == obj.hashCode();
	}
	
	protected Set<String> inputContextToString() {
		//todo set ou list ?????
        Set<String> set = new HashSet<>();
		for (CtVariableReference<?> var : variableReferences)
			set.add(var.getType().toString());
		return set;
	}


    public List<CtVariableReference> allCandidate(CtTypeReference<?> type, boolean subType){
        List<CtVariableReference> candidate = new ArrayList<>();

        for (CtVariableReference<?> var : variableReferences) {
            CtTypeReference<?> varType = var.getType();
            if (subType) {
                if (type.isSubtypeOf(varType) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
                    candidate.add(var);
                }
            } else {
                if (varType.equals(type) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
                    candidate.add(var);
                }
            }
        }
        return candidate;
    }

    public CtVariableReference<?> candidate(CtTypeReference<?> type, boolean subType){
        for (CtVariableReference<?> var : variableReferences) {
            CtTypeReference<?> varType = var.getType();
            if(subType) {
                if(type.isSubtypeOf(varType) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
                    return var;
                }
            } else {
                if(varType.equals(type) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
                    return var;
                }
            }
        }
        return null;
        }
	
	public boolean containsAll(InputContext other, boolean subType){
		for (CtVariableReference<?> variable : other.variableReferences) {
            if(!hasCandidate(variable.getType(), subType)) {
                return false;
            }
        }
        return true;
	}

    public CtVariableReference getVariableOrFieldNamed(String name) {
        CtVariableReference o = null;
        for(CtVariableReference vf : getVar())
            if(vf.toString().equals(name)) {
                o = vf;
                break;
            }
        if(o == null && name.endsWith(")"))
            return getVariableOrFieldNamed(name.substring(1,name.length()-1));
        return o;
    }

    public Set<String> getAllVarName() {
        Set<String> set = new HashSet<>();
        for (CtVariableReference<?> var : variableReferences)
            set.add(var.getSimpleName());

        return set;
    }

	protected boolean hasCandidate(CtTypeReference<?> type, boolean subType) {
		return candidate(type, subType) != null;
	}

	public Set<CtVariableReference<?>> getVar() {
		return variableReferences;
	}

	public String equalString() {
        //todo set ou list ?????
        Set<String> set = new HashSet<>();
        for (CtVariableReference<?> var : variableReferences)
            set.add(var.getType().toString()+": "+var);
        return set.toString();
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
		return variableReferences.size();
	}

    public List<CtTypeReference<?>> getTypes() {
        List<CtTypeReference<?>> types = new ArrayList<>();

        for (CtVariableReference var: variableReferences) {
               types.add(var.getType());
        }
        return types;
    }
}
