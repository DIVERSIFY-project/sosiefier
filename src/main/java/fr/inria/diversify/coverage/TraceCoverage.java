package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtMethod;
import spoon.reflect.declaration.CtElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marodrig on 20/07/2014.
 */
public abstract class TraceCoverage implements ICoverageReport {

    //List containing all method signatures found
    protected List<String> methodSignatures;

    //File or dir containing the trace
    protected File trace;

    public TraceCoverage(File coverageDir) {
        methodSignatures = new ArrayList<>();
        this.trace = trace;
    }

    public TraceCoverage(String trace) throws IOException {
        this(new File(trace));
    }

    @Override
    public int opCodeCoverage(CtMethod method, int indexOpcode) {
        return 0;
    }

    @Override
    public double elementCoverage(CtElement operator) {
        return 0;
    }

    @Override
    public List<Integer> getCoverageDistribution(CodeFragment stmt) {
        ArrayList<Integer> r = new ArrayList<>();
        r.add((int)codeFragmentCoverage(stmt));
        return r;
    }
}
