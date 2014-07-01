package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;

import java.util.Map;

/**
 * A class to read stack elements from a file
 *
 * Created by marodrig on 01/07/2014.
 */
public abstract class StackElementReader {

    private Map<Integer, String> idMap;

    /**
     * Reads the next StackElement in the log
     * @return
     */
    public abstract StackTraceElement next();

    public Map<Integer, String> getIdMap() {
        return null;
    }
}
