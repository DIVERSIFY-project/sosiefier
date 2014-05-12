package fr.inria.diversify.sosie.stackTraceCompare.diff;

import fr.inria.diversify.sosie.stackTraceCompare.stackElement.StackTraceElement;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Simon on 23/04/14.
 */
public class CallDiff extends Diff {
    protected int maxStackDiff;


    public CallDiff(StackTraceElement diffStart, int maxStackDiff) {
        this.diffStart = diffStart;
        this.maxStackDiff = maxStackDiff;
    }

    public CallDiff(String line) {
        String[] tmp = line.split(";");
        maxStackDiff = Integer.parseInt(tmp[2]);
    }

    public boolean equals(Object other) {
        if(!(other instanceof CallDiff))
            return false;

        CallDiff cDiff = (CallDiff) other;

        return maxStackDiff == cDiff.maxStackDiff &&
                diffStart.equals(cDiff.diffStart);
    }

    public int hashCode() {
        return maxStackDiff * diffStart.hashCode();
    }

    public String toString() {
        return diffStart + ":" + maxStackDiff;
    }

    public void write(FileWriter writer) throws IOException {
        writer.write("C;"+diffStart+";"+maxStackDiff);
    }
}