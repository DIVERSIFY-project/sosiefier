package fr.inria.diversify.statementProcessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.CtScanner;

public class SubStatementVisitor extends CtScanner {
	List<CtStatement> statements;
	
	public SubStatementVisitor() {
		statements = new ArrayList<CtStatement>();
	}
	
	public Collection<CtStatement> getStatements() {
		return statements;
	}
	@Override
	protected void enter(CtElement e) {
		if(e instanceof CtStatement)
		statements.add((CtStatement)e);
		super.enter(e);
	}

}
