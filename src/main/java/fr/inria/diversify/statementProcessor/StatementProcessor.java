package fr.inria.diversify.statementProcessor;

import java.util.LinkedList;
import java.util.List;

import fr.inria.diversify.statement.Statement;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;

public class StatementProcessor extends AbstractProcessor<CtStatement> {
	protected List<Statement> statements;
	private boolean withChildren;


	public StatementProcessor(boolean withChildren) {
		this.withChildren = withChildren;
		statements = new LinkedList<Statement>();
	
	}

	public void process(CtStatement element) {
		if(isValid(element)) {
			try {
				Statement stmt = new Statement(element);
				statements.add(stmt);
			//	System.out.println(element);
				//System.out.println(element.getPosition());
			//	System.out.println(isValid(element)+ "  "+element.getClass().getSimpleName()+"  "+element.getParent().getClass().getSimpleName());
			//	System.out.println("-------------------------------\n");
			} catch (Exception e) {
				System.err.println("erreur");
			}
			}
	}
	
	public List<Statement> getStatements() {
		return statements;
	}
	
	protected boolean isValid(CtStatement element) {
		return isValidStatement(element)  && (withChildren || !isChildren(element));
	}
	
	protected boolean isValidStatement(CtStatement element) {
		ValidStatementVisitor valid = new ValidStatementVisitor(element); 
		element.accept(valid);
		return valid.isValid();
	}
	
	protected boolean isChildren(CtStatement element) {
		CtStatement parent = (CtStatement)element.getParent(CtStatement.class); 
		if(parent == null)
			return false;
		if(isValidStatement(parent))
			return true;
		
		return isChildren(parent);
	}
	
}

