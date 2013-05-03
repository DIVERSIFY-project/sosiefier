package fr.inria.diversify.statementProcessor;

import fr.inria.diversify.statement.Statement;
import fr.inria.diversify.statement.StatementList;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;

public class StatementProcessor extends AbstractProcessor<CtStatement> {
	protected StatementList statements;
	private ValidStatementVisitor valid;


	public StatementProcessor() {
		statements = new StatementList();
	}

	public void process(CtStatement element) {
		try {
			if(isValidStatement(element)) {
				Statement stmt = new Statement(element);
				statements.add(stmt);
//				System.out.println(stmt.toJSONObject());
//				System.out.println(stmt.getInputContext().equalString());
//				System.out.println("-------------------------------\n");
			}
		} catch (Exception e) {
			System.err.println("erreur ici");
		}
	}
	
	public StatementList getStatements() {
		return statements;
	}
	
//	protected boolean isValid(CtStatement element) {
//		return isValidStatement(element) && (withChildren || !isChildren(element));
//	}
//	
	protected boolean isValidStatement(CtStatement element) {
		 valid = new ValidStatementVisitor(element); 
		element.accept(valid);
		return !valid.inExperession(element) && valid.isValid();
	}
	
//	protected boolean isChildren(CtStatement element) {
//		CtStatement parent = (CtStatement)element.getParent(CtStatement.class); 
//		if(parent == null)
//			return false;
//		if(isValidStatement(parent))
//			return true;
//		
//		return isChildren(parent);
//	}
	
}

