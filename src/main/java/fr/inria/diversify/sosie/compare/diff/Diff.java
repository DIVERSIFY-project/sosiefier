package fr.inria.diversify.sosie.compare.diff;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Simon on 23/04/14.
 */
public abstract class Diff {
    protected StackTraceElement diffStart;

    public StackTraceElement getDiffStart() {
        return diffStart;
    }

    public abstract void write(FileWriter writer) throws IOException;
}
