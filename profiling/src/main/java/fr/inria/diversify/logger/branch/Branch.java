package fr.inria.diversify.logger.branch;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Simon
 * Date: 12/05/15
 * Time: 15:00
 */
public class Branch {
    Set<Integer> deeps;
    String id;

    public Branch(String id, int deep) {
        this.id = id;
        deeps = new HashSet<>();
        deeps.add(deep);
    }

    public String getId() {
        return id;
    }

    public void addDeep(int deep) {
        deeps.add(deep);
    }

    public Set<Integer> getDeeps() {
        return deeps;
    }
}
