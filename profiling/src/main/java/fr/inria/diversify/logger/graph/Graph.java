package fr.inria.diversify.logger.graph;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 20/05/15
 * Time: 12:50
 */
public class Graph {
    String name;
    Collection<Node> nodes;
    Collection<Edge> edges;



    public Graph(String name, Collection<Node> nodes, Collection<Edge> edges) {
        this.name = name;
        this.nodes = new ArrayList<>(nodes);
        this.edges = new ArrayList<>(edges);
    }

    public void toDot(String file) throws IOException {
        PrintWriter fileWriter = new PrintWriter(new FileWriter(file));

        fileWriter.write("digraph g {\n");

        for(Node node : nodes) {
            fileWriter.write(node.toDot() + "\n");
        }

        for(Edge edge : edges) {
            fileWriter.write(edge.toDot() + "\n");
        }

        fileWriter.write("}");
        fileWriter.close();
    }


    public  boolean isEmpty() {
        return nodes.isEmpty();
    }

    public Graph intersection(Graph other) {
        List<Node> interNode = nodes.stream()
                .filter(node -> other.nodes.contains(node))
                .collect(Collectors.toList());

        List<Edge> interEdge = edges.stream()
                .filter(edge -> interNode.contains(edge.origin) && interNode.contains(edge.target))
                .collect(Collectors.toList());

        return new Graph("intersection", interNode,interEdge);
    }
}
