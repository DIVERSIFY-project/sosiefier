package fr.inria.diversify.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	protected List<Node> call;
	protected List<Node> caller;
	
	
	public Node() {
		call = new ArrayList<Node>();
		caller = new ArrayList<Node>();
	}
	
	
}
