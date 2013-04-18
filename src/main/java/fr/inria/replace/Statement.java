package fr.inria.replace;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import spoon.reflect.Factory;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.support.reflect.code.CtLocalVariableImpl;
import spoon.support.reflect.reference.CtTypeReferenceImpl;

public class Statement {
	protected Set<CtVariableReference<?>> inputContext;
	protected CtReference ouputContext;
	protected CtStatement stmt;
	
	
	public Statement(CtStatement stmt) {
		this.stmt = stmt;
		this.initOutputContext();
		this.initInputContext();
		
		
	}
	
	public CtReference getOuputContext() {	
		return ouputContext;
	}
	
	
	public Set<CtVariableReference<?>> getInputContext() {
		return inputContext;
	} 
	
	protected void initOutputContext(){
		if(stmt instanceof CtTypedElement) {
			ouputContext = ((CtTypedElement<?>)stmt).getType();
			if(ouputContext == null)
				System.out.println();
		}
		else
			ouputContext =Factory.getLauchingFactory().Type().createReference(Void.class) ;
	}

	protected void initInputContext(){
		VariableVisitor visitor = new VariableVisitor();
		stmt.accept(visitor);
		inputContext = visitor.input();
	}
	
	
	@Override
	public String toString() {
		String tmp = "Input: [";
		for (CtVariableReference<?> ref : inputContext) {
			tmp = tmp + ref.getType().getSimpleName()+" "; 
		}
		tmp = tmp + "]\nOutput: "+ouputContext+"\nSource: "+stmt;
		return tmp;
	}
	
	
	public String toString2() {
	
		String tmp = "Input: [";
		for (CtVariableReference<?> ref : inputContext) {
			tmp = tmp + ref.getType().getSimpleName()+" "; 
			ref.setSimpleName(ref.getType().toString());
		}
			
		tmp = tmp + "]\nOutput: "+ouputContext+"\nSource: "+stmt;
		return tmp;
	}
	
	public void replace(Statement other) throws CloneNotSupportedException{
		System.out.println("\navant: "+stmt.getPosition());
		System.out.println(stmt.getParent());
	
		for (CtVariableReference<?> variable : other.getInputContext()) {
			System.out.println("replace: "+variable+ " by "+candidate(variable));
			variable.setSimpleName(candidate(variable).getSimpleName());
			
		}
		stmt.replace(other.stmt);
		System.out.println("\napres: ");
		System.out.println(stmt.getParent());
	
	}
	
	//check if this can be replaced by other
	public boolean isReplace(Statement other){
		boolean isReplace = true;
		for (CtVariableReference<?> variable : other.getInputContext()) {
			isReplace = isReplace && hasCandidate(variable);
		}
		return isReplace && ouputContext.equals(other.ouputContext);
	}
	
	
	protected boolean hasCandidate(CtVariableReference<?> variable) {
		return candidate(variable) != null;
	}
	
	protected CtVariableReference<?> candidate(CtVariableReference<?> variable){
		CtVariableReference<?> canditate = null;
		for (CtVariableReference<?> var : inputContext) {
			if(var.getType().equals(variable.getType())) {
				canditate = var;
				break;
			}
		}
		return canditate;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		Statement stmtObj = (Statement)obj;
		return stmt.toString().equals(stmtObj.stmt.toString()) && 
				inputContext.equals(stmtObj.inputContext) &&
				ouputContext.equals(stmtObj.ouputContext);
	}
	
	@Override
	public int hashCode() {
		return stmt.toString().hashCode()*inputContext.hashCode() + ouputContext.hashCode();
	}
	
	
	public boolean sameInputContext(Set<CtVariableReference<?>> otherInputContext) {
		boolean same = true;
		Set<CtVariableReference<?>> set = new HashSet<CtVariableReference<?>>(otherInputContext);
		
		for (CtVariableReference<?> var : inputContext) {
			CtVariableReference<?> candidate = null;
			for (CtVariableReference<?> var2 : set) {
				if(var.getType().equals(var2.getType())) {
					candidate = var;
					break;
				}
			}
			if(candidate != null) 
				set.remove(candidate);
			else {
				same = false;
				break;
			}				
		}
		return same && set.isEmpty();
	}
}
