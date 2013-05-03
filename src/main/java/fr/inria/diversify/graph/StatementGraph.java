package fr.inria.diversify.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import fr.inria.diversify.codeFragment.Statement;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

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
	
	
	public Graph<Node, String> getJungGraph (){
        Graph<Node, String> graph = new DirectedSparseGraph<Node, String>();

        for(StatementNode node: nodes) {
         node.addInGraph(graph);
        }

        return graph;
	}


    public void displayGraph() {
        Design d = new Design(getJungGraph());
        d.display();
    }
}
