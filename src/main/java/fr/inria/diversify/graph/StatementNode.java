package fr.inria.diversify.graph;

import edu.uci.ics.jung.graph.Graph;
import fr.inria.diversify.statement.Statement;


public class StatementNode extends Node {
	protected Statement stmt;
    private static int count;


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
		if(stmt.isReplace(node.stmt) && node != this) {
			node.addCall(this);
			this.addCaller(node);
		}
	}

    public void addInGraph(Graph<Node, String> graph) {
        graph.addVertex(this);
        for (Node node : call) {
            count++;
            graph.addEdge(count+"", node, this);
        }
    }

    @Override
    public String toString() {
        return stmt.toString();
    }
}
