package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * A class to read stack elements from a file
 *
 * Created by marodrig on 01/07/2014.
 */
public abstract class StackElementReader {

    private Map<Integer, String> idMap;

    /**
     *
     * @param dir Directory where the logs are.
     * @param recursive Indicates if we must load all the logs recursively in the directory
     * @return A list of StackTraces from the directory
     */
    public abstract List<StackTrace> loadLog(String dir, boolean recursive) throws IOException;
}
