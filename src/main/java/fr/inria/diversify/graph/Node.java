package fr.inria.diversify.graph;

import java.util.HashSet;
import java.util.Set;

public class Node {
	protected Set<Node> call;
	protected Set<Node> caller;
	
	
	public Node() {
		call = new HashSet<Node>();
		caller = new HashSet<Node>();
	}
	
	public void addCaller(Node n) {
		caller.add(n);
	}
	
	public void addCall(Node n) {
		call.add(n);
	}
}
