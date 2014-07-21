package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtMethod;
import spoon.reflect.declaration.CtElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by marodrig on 20/07/2014.
 */
public abstract class TraceCoverageReport implements ICoverageReport {

    //List containing all method signatures found
    protected Set<String> methodSignatures;

    //File or dir containing the trace
    protected File trace;

    public TraceCoverageReport(File trace) {
        methodSignatures = new HashSet<>();
        this.trace = trace;
    }

    public TraceCoverageReport(String trace) throws IOException {
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

    public Set<String> getMethodSignatures() {
        return methodSignatures;
    }
}
