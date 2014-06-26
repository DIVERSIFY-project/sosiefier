package fr.inria.diversify.sosie.compare.diff;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Simon on 23/04/14.
 */
public class CallDiff extends Diff {
    protected int maxStackDiff;


    public CallDiff(StackTraceCall diffStart, int maxStackDiff) {
        this.diffStart = diffStart;
        this.maxStackDiff = maxStackDiff;
    }

    public CallDiff(String line) {
        String[] tmp = line.split(";");
        diffStart = new StackTraceCall(tmp[1], Integer.parseInt(tmp[2]));
        maxStackDiff = Integer.parseInt(tmp[3]);
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

    public void setMaxStackDiff(int x) {
        maxStackDiff = x;
    }

    public int getMaxStackDiff() {
        return maxStackDiff;
    }

}