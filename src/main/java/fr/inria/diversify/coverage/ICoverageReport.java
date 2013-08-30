package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;

import java.io.IOException;

/**
 * User: Simon
 * Date: 6/7/13
 * Time: 10:12 AM
 */
public interface ICoverageReport {

    public void create() throws IOException;

    public double codeFragmentCoverage(CodeFragment stmt);
}
