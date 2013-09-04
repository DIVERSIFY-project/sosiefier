package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.util.Log;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;

public class StatementProcessor extends AbstractProcessor<CtStatement> {
	protected CodeFragmentList statements;
	private ValidStatementVisitor valid;


	public StatementProcessor() {
		statements = new CodeFragmentList();
	}

	public void process(CtStatement element) {
		try {
			if(isValidStatement(element)) {
				Statement stmt = new Statement(element);
				statements.add(stmt);
//				System.out.println(stmt);
//				System.out.println(stmt.equalString());
//				System.out.println("-------------------------------\n");
			}
		} catch (Exception e) {
            Log.debug("error in StatementProcessor.process with the statement: "+element, e);
		}
	}
	
	public CodeFragmentList getStatements() {
		return statements;
	}

	protected boolean isValidStatement(CtStatement element) {
		 valid = new ValidStatementVisitor(element, false);
		element.accept(valid);
		return !valid.inExpression(element) && valid.isValid();
	}
}

