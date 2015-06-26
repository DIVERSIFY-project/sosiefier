package fr.inria.diversify.logger.graph;

import fr.inria.diversify.logger.Diff;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 24/06/15
 * Time: 11:09
 */
public class GraphsDiff implements Diff {
    Map<String, Set<String>> nodeDiff;
    Map<String, Set<String>> edgeDiff;

    public GraphsDiff() {
        nodeDiff = new HashMap<>();
        edgeDiff = new HashMap<>();
    }
    @Override
    public void filter(Diff filter) {
        GraphsDiff gDiff = (GraphsDiff) filter;

        for(String test : gDiff.nodeDiff.keySet()) {
            if(nodeDiff.containsKey(test)) {
                nodeDiff.get(test).removeAll(gDiff.nodeDiff.get(test));
                if(nodeDiff.get(test).isEmpty()) {
                    nodeDiff.remove(test);
                }
            }
        }
        for(String test : gDiff.edgeDiff.keySet()) {
            if(edgeDiff.containsKey(test)) {
                edgeDiff.get(test).removeAll(gDiff.edgeDiff.get(test));
                if(edgeDiff.get(test).isEmpty()) {
                    edgeDiff.remove(test);
                }
            }
        }
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }

    @Override
    public int size() {
        return nodeDiff.size()
                + edgeDiff.size();
    }

    @Override
    public void parse(JSONObject jsonObject) {

    }

    @Override
    public void merge(Diff other) {
        GraphsDiff gDiff = (GraphsDiff) other;

        for(String test : gDiff.nodeDiff.keySet()) {
            if(nodeDiff.containsKey(test)) {
                nodeDiff.get(test).addAll(gDiff.nodeDiff.get(test));
            } else {
                nodeDiff.put(test, gDiff.nodeDiff.get(test));
            }
        }

        for(String test : gDiff.edgeDiff.keySet()) {
            if (edgeDiff.containsKey(test)) {
                edgeDiff.get(test).addAll(gDiff.edgeDiff.get(test));
            } else {
                edgeDiff.put(test, gDiff.edgeDiff.get(test));
            }
        }
    }

    public void addNode(String testName, String nodeName) {
        if(!nodeDiff.containsKey(testName)) {
            nodeDiff.put(testName, new HashSet<>());
        }

        nodeDiff.get(testName).add(nodeName);
    }

    public void addAllEdge(String testName, Set<String> edges) {
        if(!edgeDiff.containsKey(testName)) {
            edgeDiff.put(testName, new HashSet<>());
        }

        edgeDiff.get(testName).addAll(edges);
    }
}
