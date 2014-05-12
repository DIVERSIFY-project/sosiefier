package fr.inria.diversify.sosie.stackTraceCompare.diff;

import fr.inria.diversify.sosie.stackTraceCompare.stackElement.StackTraceElement;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Simon on 23/04/14.
 */
public abstract class Diff {
    protected StackTraceElement diffStart;

    public abstract void write(FileWriter writer) throws IOException;
}
