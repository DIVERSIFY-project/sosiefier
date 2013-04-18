package fr.inria.replace;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import spoon.reflect.reference.CtVariableReference;

public class Statistics {

	private int numberOfStatements;
	private Set<Set<CtVariableReference<?>>> uniqueInputContext;
	private Set<CtVariableReference<?>> uniqueOutputContext;
	private Set<Statement> uniqueContext;
	private Set<Statement> uniqueStatment;
	
	
	public Statistics(List<Statement> statements) {
		numberOfStatements = statements.size();
		uniqueInputContext = new HashSet<Set<CtVariableReference<?>>>();
		uniqueOutputContext = new HashSet<CtVariableReference<?>>();
		uniqueContext = new HashSet<Statement>();
		uniqueStatment = new HashSet<Statement>();
	}
	
	public void addStatement() {}
	
	protected void addUniqueInputContext(Set<CtVariableReference<?>> inputContext) {}
}	

