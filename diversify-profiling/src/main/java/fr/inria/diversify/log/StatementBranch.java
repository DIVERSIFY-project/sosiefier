package fr.inria.diversify.log;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 05/07/16
 * Time: 11:44
 */
public class StatementBranch {
    Map<Integer, Integer> blockIds;

    public StatementBranch() {
        blockIds = new HashMap<>();
    }



    protected int idBranch(int methodId) {
        if(!blockIds.containsKey(methodId)) {
            blockIds.put(methodId, 0);
        }
        blockIds.put(methodId, blockIds.get(methodId) + 1);
        return blockIds.get(methodId);
    }
}
