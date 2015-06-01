package fr.inria.diversify.logger.graph;

/**
 * User: Simon
 * Date: 19/05/15
 * Time: 16:23
 */
public class Edge {
    String value;
    Node target;
    Node origin;

    public Edge(Node origin, Node target, String value) {
        this.origin = origin;
        this.target = target;
        this.value = value;
    }


    public boolean equals(Object other) {
        if(!(other instanceof Edge)) {
            return false;
        }
        return true;
    }

    public String toDot() {
        return origin.hashCode() + " -> " + target.hashCode() + " [label=\"" + value + "\"];";
    }
}
