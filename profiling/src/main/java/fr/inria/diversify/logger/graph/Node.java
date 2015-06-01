package fr.inria.diversify.logger.graph;


/**
 * User: Simon
 * Date: 19/05/15
 * Time: 16:23
 */
public class Node {
    TypeNode type;
    Object value;

    public Node(TypeNode type, Object value) {
        this.type = type;
        this.value = value;
    }

    public boolean equals(Object other) {
        if(!(other instanceof Node)) {
            return false;
        }
        Node otherNode = (Node) other;
        return type == otherNode.type && value.equals(otherNode.value);
    }


    public String toDot() {
        return hashCode() + " [label=\"" + type +": " + value + "\"];";
    }
}
