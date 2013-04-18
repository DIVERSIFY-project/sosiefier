package fr.inria.replace;

import java.util.HashSet;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.support.reflect.eval.VisitorPartialEvaluator;

public class StatementProcessor extends AbstractProcessor<CtStatement> {
	protected HashSet<Statement> statements;



	public StatementProcessor() {
		statements = new HashSet<Statement>();
	}

	public void process(CtStatement element) {
		Statement stmt;
		if(isStatement(element)) {
			stmt = new Statement(element);
			statements.add(stmt);
			System.out.println(stmt);
			System.out.println(stmt.toString2());
			System.out.println("-------------------------------\n");
			}
	}
	
	
	public HashSet<Statement> getStatements() {
		return statements;
	}
	
	protected boolean isStatement(CtStatement element) {
		ValidStatementVisitor valid = new ValidStatementVisitor(); 
		element.accept(valid);
		
		return valid.isValid();
		
	}
}
