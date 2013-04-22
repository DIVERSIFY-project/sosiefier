package fr.inria.diversify.statement;

import java.util.HashSet;
import java.util.Set;

import spoon.reflect.reference.CtVariableReference;

public class InputContext {
	protected Set<CtVariableReference<?>> inputContext;
	protected Integer hashCode = null;
	
	public InputContext(Set<CtVariableReference<?>> inputContext) {
		this.inputContext = inputContext;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof InputContext))
			return false;
		
		//InputContext other = (InputContext)obj;
		//return inputContextToString(inputContext).equals(inputContextToString(other.inputContext));
		return this.hashCode() == obj.hashCode();
	}
	
	protected Set<String> inputContextToString(Set<CtVariableReference<?>> inputContext) {
		Set<String> set = new HashSet<String>();
		for (CtVariableReference<?> var : inputContext) 
			set.add(var.getType().toString());
		return set;
	}
	
	public CtVariableReference<?> candidate(CtVariableReference<?> variable){
		CtVariableReference<?> canditate = null;
		for (CtVariableReference<?> var : inputContext) {
			if(var.getType().equals(variable.getType())) {
				canditate = var;
				break;
			}
		}
		return canditate;
	}
	
	public boolean isInclude(InputContext other){
		boolean isReplace = true;
		for (CtVariableReference<?> variable : other.inputContext) {
			isReplace = isReplace && hasCandidate(variable);
		}
		return isReplace;
	}
	
	protected boolean hasCandidate(CtVariableReference<?> variable) {
		return candidate(variable) != null;
	}

	public Set<CtVariableReference<?>> getContext() {
		return inputContext;
	}

	public String equalString() {
		// TODO Auto-generated method stub
		return inputContextToString(inputContext).toString();
	}
	
	@Override
	public String toString() {
		return inputContext.toString();
	}
	
	@Override
	public int hashCode() {
		if(hashCode == null)
			hashCode = inputContextToString(inputContext).hashCode();
		return hashCode;
	}

	public int size() {
		return inputContext.size();
	}
	
}
