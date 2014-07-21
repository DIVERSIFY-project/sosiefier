package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtMethod;
import spoon.reflect.declaration.CtElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 1:21 PM
 */
public class MultiCoverageReport implements ICoverageReport {

    protected List<ICoverageReport> coverages;

    protected String classesDir;

    public MultiCoverageReport(String classesDir) {
        coverages = new ArrayList<>();
        this.classesDir = classesDir;
    }

    /**
     * Creates a multicoverage report using jacoco files
     *
     * @param classesDir Directory where the build classes are
     * @param jacocoDir Directory with the client jacoco coverage files
     */
    public MultiCoverageReport(String classesDir, File jacocoDir) {
        coverages = new ArrayList<>();
        for (File file : jacocoDir.listFiles()) {
            if (file.getName().endsWith(".exec"))
                coverages.add(new CoverageReport(classesDir, file));
        }
    }

    /**
     * Creates a multicoverage report using Trace coverage report objects
     *
     * @param traces      Trace directories
     * @param binaryTrace Value indicating that the trace is binary
     */

    public MultiCoverageReport(Collection<File> traces, boolean binaryTrace) {
        coverages = new ArrayList<>();
        for (File f : traces) {
            if (binaryTrace) {
                coverages.add(new BinaryTraceCoverageReport(f));
            } else {
                coverages.add(new TextTraceCoverageReport(f));
            }
        }
    }

    public void addJacocoFile(File file) throws IOException {
        CoverageReport cr = new CoverageReport(classesDir, file);
        cr.create();
        coverages.add(cr);
    }

    @Override
    public void create() throws IOException {
        for (ICoverageReport cr : coverages)
            cr.create();
    }

    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {
        double ret = 0;
        for (ICoverageReport cr : coverages) {
            ret = Math.max(ret, cr.codeFragmentCoverage(stmt));
        }
        return ret;
    }

    @Override
    public int opCodeCoverage(CtMethod method, int indexOpcode) {
        int ret = 0;
        for (ICoverageReport cr : coverages) {
            ret = Math.max(ret, cr.opCodeCoverage(method, indexOpcode));
        }
        return ret;
    }

    @Override
    public double elementCoverage(CtElement operator) {
        double ret = 0;
        for (ICoverageReport cr : coverages) {
            ret = Math.max(ret, cr.elementCoverage(operator));
        }
        return ret;
    }

    @Override
    public List<Integer> getCoverageDistribution(CodeFragment stmt) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < coverages.size(); i++) {
            if (coverages.get(i).codeFragmentCoverage(stmt) > 0) {
                result.add(i);
            }
        }
        return result;
    }
}
