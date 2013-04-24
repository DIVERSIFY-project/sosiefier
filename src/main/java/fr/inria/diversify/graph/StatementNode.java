package fr.inria.diversify.graph;

import fr.inria.diversify.statement.Statement;


public class StatementNode extends Node {
	protected Statement stmt;
	
	
	public StatementNode(Statement stmt) {
		super();
		this.stmt = stmt;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof StatementNode))
			return false;
		
		return ((StatementNode)obj).stmt == stmt;
	}
	
	@Override
	public int hashCode() {
		
		return stmt.hashCode() * (stmt.hashCode() % 42);
	}

	public void buildLinkWith(StatementNode node) {
		if(stmt.isReplace(node.stmt)) {
			node.addCall(this);
			this.addCaller(node);
		}
	}
}
