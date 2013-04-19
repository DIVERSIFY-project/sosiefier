package fr.inria.diversify.statementProcessor;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import fr.inria.diversify.statement.Statement;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.support.reflect.eval.VisitorPartialEvaluator;

public class StatementProcessor extends AbstractProcessor<CtStatement> {
	protected List<Statement> statements;


	public StatementProcessor() {
		statements = new LinkedList<Statement>();
	
	}

	public void process(CtStatement element) {
		Statement stmt;
		if(isStatement(element)) {
			stmt = new Statement(element);
			statements.add(stmt);
			System.out.println(stmt);
			System.out.println(element.getPosition());
			System.out.println(stmt.equalString());
			System.out.println("-------------------------------\n");
			}
	}
	
	
	public List<Statement> getStatements() {
		return statements;
	}
	
	protected boolean isStatement(CtStatement element) {
		ValidStatementVisitor valid = new ValidStatementVisitor(); 
		element.accept(valid);
		
		return valid.isValid();
		
	}
}
