package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtMethod;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;

import java.io.IOException;
import java.util.List;

/**
 * User: Simon
 * Date: 6/7/13
 * Time: 10:12 AM
 */
public interface ICoverageReport {

    public void create() throws IOException;

    public double codeFragmentCoverage(CodeFragment stmt);

    public int opCodeCoverage(CtMethod method, int indexOpcode);

    public double elementCoverage(CtElement operator);

    /**
     * This method returns for a given code fragment, its distribution along several coverage data files.
     * Each client coverage data is represented by a jacoco file, to whom an index has been assigned.
     * @param stmt CodeFragment for which we want to know distribution
     * @return A list of integers containing the index of the files in which this statement was covered.
     */
    public List<Integer> getCoverageDistribution(CodeFragment stmt);

    public double positionCoverage(SourcePosition position);
}
