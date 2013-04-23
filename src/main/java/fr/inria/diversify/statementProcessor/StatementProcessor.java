package fr.inria.diversify.statementProcessor;

import java.util.LinkedList;
import java.util.List;

import fr.inria.diversify.statement.Statement;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;

public class StatementProcessor extends AbstractProcessor<CtStatement> {
	protected List<Statement> statements;
	private boolean withChildren;
	private ValidStatementVisitor valid;


	public StatementProcessor(boolean withChildren) {
		this.withChildren = withChildren;
		statements = new LinkedList<Statement>();
	
	}

	public void process(CtStatement element) {
		try {
			if(isValidStatement(element)) {
					Statement stmt = new Statement(element);
					statements.add(stmt);
					System.out.println(stmt);
					//System.out.println(element.getPosition());
					System.out.println("-------------------------------\n");
			}	
		} catch (Exception e) {
			System.err.println("erreur");
		}			
	}
	
	public List<Statement> getStatements() {
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

