package fr.inria.diversify.logger.graph;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 10:16
 */
public class Graph {
    String name;
    Map<String, Node> nodes;

    public Graph(String name) {
        this.name = name;
        nodes = new HashMap<>();
    }

    public void addCall(String caller, String call) {
        getNodeOrBuild(caller).addCall(getNodeOrBuild(call));
    }

    protected Node getNodeOrBuild(String name) {
        if(!nodes.containsKey(name)) {
            nodes.put(name, new Node(name));
        }
        return nodes.get(name);
    }

    protected Map<String, Set<String>> callMinus(Graph graph,  Map<String, Set<String>> diff) throws Exception {
        for(String nodeName : nodes.keySet()) {
            Node node = nodes.get(nodeName);
            Node other;
            if(!graph.nodes.containsKey(nodeName)) {
                other = new Node(nodeName);
                diff.put(nodeName, node.callMinus(other));
            } else {
                other = graph.nodes.get(nodeName);
                Set<String> set = node.callMinus(other);
                if(!set.isEmpty()) {
                    diff.put(nodeName, node.callMinus(other));
                }
            }
        }
        return diff;
    }

    public Map<String, Set<String>> diff(Graph graph) throws Exception {
        Map<String, Set<String>> diff = new HashMap<>();

        this.callMinus(graph, diff);
        graph.callMinus(this, diff);

        return diff;
    }

    public void addNode(String name) {
        getNodeOrBuild(name);
    }

    public void toDot(String fileName) throws IOException {
        Writer writer = new FileWriter(fileName);

        writer.append("digraph g {\n");
        for (Node node : nodes.values()) {
            node.toDot(writer);
        }
        writer.append("\n}");
        writer.close();
    }

    public String getName() {
        return name;
    }
}
