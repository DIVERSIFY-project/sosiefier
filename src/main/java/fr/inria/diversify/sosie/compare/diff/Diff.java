package fr.inria.diversify.sosie.compare.diff;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Simon on 23/04/14.
 */
public abstract class Diff {
    protected StackTraceCall diffStart;

    public StackTraceCall getDiffStart() {
        return diffStart;
    }

    public abstract void write(FileWriter writer) throws IOException;
}
