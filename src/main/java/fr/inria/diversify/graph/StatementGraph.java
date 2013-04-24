package fr.inria.diversify.graph;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import fr.inria.diversify.statement.Statement;

import javax.swing.*;
import java.awt.*;
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
        Graph<Node, String> graph = new SparseMultigraph<Node, String>();

        for(StatementNode node: nodes) {
         node.addInGraph(graph);
        }

        return graph;
	}


    public void displayGraph() {

        Layout<StatementNode, String> layout = new CircleLayout(getJungGraph());
        layout.setSize(new Dimension(300,300)); // sets the initial size of the space
// The BasicVisualizationServer<V,E> is parameterized by the edge types
        BasicVisualizationServer<StatementNode,String> vv =
                new BasicVisualizationServer<StatementNode,String>(layout);
        vv.setPreferredSize(new Dimension(350,350)); //Sets the viewing area size
        JFrame frame = new JFrame("Simple Graph View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }
}
