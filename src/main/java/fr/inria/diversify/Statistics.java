package fr.inria.diversify;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.StyleContext.SmallAttributeSet;

import fr.inria.diversify.statement.Context;
import fr.inria.diversify.statement.InputContext;
import fr.inria.diversify.statement.Statement;

import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;

public class Statistics {

	protected int numberOfStatements;
	protected Map<InputContext,Integer> uniqueInputContext;
	protected Map<CtTypeReference<?>,Integer> uniqueOutputContext;
	protected Map<Context,Integer> uniqueContext;
	protected Map<Integer,Integer> uniqueStatment;
	private int count;
	private Map<Integer,Statement> idToStatement;
	
	
	public Statistics(List<Statement> statements) {
		numberOfStatements = statements.size();
		uniqueInputContext = new HashMap<InputContext, Integer>();
		uniqueOutputContext = new HashMap<CtTypeReference<?>, Integer>();
		uniqueContext = new HashMap<Context, Integer>();
		uniqueStatment = new HashMap<Integer, Integer>();
		
		idToStatement = new HashMap<Integer,Statement>();
		
		for (Statement statement : statements) {
			addStatement(statement);
		}
	}
	
	public void addStatement(Statement stmt) {
		count++;
		if(count%100 == 0)
		System.out.println(count+"/"+numberOfStatements + "  "+uniqueStatment.size());
		addUniqueInputContext(stmt.getInputContext());
		addUniqueOutputContext(stmt.getOuputContext());
		addUniqueContext(stmt.getContext());
		addUniqueStatement(stmt);
	}
	
	public void printStat(){
		System.out.println("--------------Statistics--------------");
		System.out.println("number of statements: "+numberOfStatements);
		System.out.println("number of unique inputContext: "+uniqueInputContext.size());
		System.out.println("number of unique outputContext: "+uniqueOutputContext.size());
		System.out.println("number of unique context: "+uniqueContext.size());
		System.out.println("number of unique statement: "+uniqueStatment.size());
		
//		System.out.println("\nOutputContext:");
//		for (InputContext ic : uniqueInputContext.keySet()) 
//			System.out.println(ic.equalString()+ ": "+uniqueInputContext.get(ic));
//		
//		System.out.println("\nInputContext:");
//		for (CtTypeReference<?> ic : uniqueOutputContext.keySet()) 
//			System.out.println(ic+ ": "+uniqueOutputContext.get(ic));
//		
//		
//		System.out.println("\nContext:");
//		for (Context ic : uniqueContext.keySet()) 
//			System.out.println(ic.equalString()+": "+uniqueContext.get(ic));
//		
//		System.out.println("\nStatement:");
//		for (Integer ic : uniqueStatment.keySet()) 
//			System.out.println(idToStatement.get(ic).equalString()+"\n: "+uniqueStatment.get(ic));
	}
	
	protected void addUniqueStatement(Statement stmt) {
		boolean same = false;
		for (Integer otherStmtId: uniqueStatment.keySet()) {
			if(otherStmtId == stmt.id()) {
				same = true;
				uniqueStatment.put(otherStmtId, uniqueStatment.get(otherStmtId)+1);
				break;
			}
		}
		if(!same) {
			uniqueStatment.put(stmt.id(),1);
			idToStatement.put(stmt.id(), stmt);
		}
	}

	protected void addUniqueContext(Context context) {
		boolean same = false;
		for (Context othercontext: uniqueContext.keySet()) {
			if(context.equals(othercontext)) {
				same = true;
				uniqueContext.put(othercontext, uniqueContext.get(othercontext)+1);
				break;
			}
		}
		if(!same)
			uniqueContext.put(context,1);
	}

	protected void addUniqueInputContext(InputContext otherInputContext) {
		boolean same = false;
		for (InputContext inputContext: uniqueInputContext.keySet()) {
			if(inputContext.equals(otherInputContext)) {
				uniqueInputContext.put(inputContext, uniqueInputContext.get(inputContext)+1);
				same = true;
				break;
			}
		}
		if(!same) 
			uniqueInputContext.put(otherInputContext,1);
	}
	
	protected void addUniqueOutputContext(CtTypeReference<?> output){
		boolean same = false;
		for (CtTypeReference<?> otherOuput: uniqueOutputContext.keySet()) {
			if(output.equals(otherOuput)) {
				uniqueOutputContext.put(otherOuput, uniqueOutputContext.get(otherOuput)+1);
				same = true;
				break;
			}
		}
		if(!same)
			uniqueOutputContext.put(output,1);
	}
	

}	

