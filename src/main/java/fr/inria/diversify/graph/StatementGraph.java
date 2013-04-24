package fr.inria.diversify.graph;

import java.awt.font.GraphicAttribute;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import edu.uci.ics.jung.graph.*;

import fr.inria.diversify.statement.Statement;

public class StatementGraph {

	protected Set<StatementNode> nodes;
	
	public StatementGraph() {
		nodes = new HashSet<StatementNode>();
	}
	
	public void buildGraph(Collection<Statement> stmts) {
		for (Statement stmt : stmts)
			addStatement(stmt);
		
		buildLink();
	}
	
	protected void buildLink() {
		for (StatementNode node1 : nodes) 
			for (StatementNode node2 : nodes) {
				node1.buildLinkWith(node2);
			}
	}
	
	protected void addStatement(Statement stmt) {
		StatementNode node = new StatementNode(stmt);
		nodes.add(node);
	}
	
	
	public Graph<StatementNode, String> getJungGraph (){
		return  new SparseMultigraph<StatementNode, String>();
	}
}
