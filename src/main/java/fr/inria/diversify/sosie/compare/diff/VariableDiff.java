package fr.inria.diversify.sosie.compare.diff;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;

import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by Simon on 23/04/14.
 */
public class VariableDiff extends Diff {

    protected String varDiff;

    public VariableDiff(StackTraceCall stackTraceElement, String varDiff) {
        this.diffStart = stackTraceElement;
        if(varDiff == null) {
            this.varDiff = "null";
        } else {
            this.varDiff = varDiff;
        }
    }

    public VariableDiff(String line) {
        String[] tmp = line.split(";");
        diffStart = new StackTraceCall(tmp[1], Integer.parseInt(tmp[2]));
        varDiff = tmp[3];
    }

    public String getVarDiff() {
        return varDiff;
    }

    public boolean equals(Object other) {
        if(other instanceof VariableDiff) {
            VariableDiff v = (VariableDiff) other;
            return varDiff.equals(v.varDiff);
        }
        return false;
    }

    public int hashCode() {
        return varDiff.hashCode()*4 + 1;
    }

    public String toString() {
        return varDiff;
    }

    public void write(FileWriter writer) throws IOException {
        writer.write("V;"+diffStart+";"+varDiff);
    }
}
