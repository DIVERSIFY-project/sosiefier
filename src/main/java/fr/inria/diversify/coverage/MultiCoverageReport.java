package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtMethod;
import spoon.reflect.declaration.CtElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 1:21 PM
 */
public class MultiCoverageReport implements ICoverageReport {

    protected List<CoverageReport> coverages;

    protected String classesDir;

    public MultiCoverageReport(String classesDir) {
        coverages = new ArrayList<>();
        this.classesDir = classesDir;
    }

    public MultiCoverageReport(String classesDir, File jacocoDir) {
        coverages = new ArrayList<>();
        for (File file : jacocoDir.listFiles()) {
            if(file.getName().endsWith(".exec"))
                coverages.add(new CoverageReport(classesDir,file));
        }
    }

    public void addJacocoFile(File file) throws IOException {
        CoverageReport cr = new CoverageReport(classesDir, file);
        cr.create();
        coverages.add(cr);
    }

    @Override
    public void create() throws IOException {
        for (CoverageReport cr : coverages)
            cr.create();
    }

    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {
        double ret = 0;
        for (CoverageReport cr : coverages) {
            ret = Math.max(ret, cr.codeFragmentCoverage(stmt));
        }
        return ret;
    }

    @Override
    public int opCodeCoverage(CtMethod method, int indexOpcode) {
        int ret = 0;
        for (CoverageReport cr : coverages) {
            ret = Math.max(ret, cr.opCodeCoverage(method,indexOpcode));
        }
        return ret;
    }

    @Override
    public double elementCoverage(CtElement operator) {
        double ret = 0;
        for (CoverageReport cr : coverages) {
            ret = Math.max(ret, cr.elementCoverage(operator));
        }
        return ret;
    }

    @Override
    public List<Integer> getCoverageDistribution(CodeFragment stmt) {
        ArrayList<Integer> result = new ArrayList<>(coverages.size());
        int i = 0;
        for (CoverageReport cr : coverages) {
            result.set(i, cr.codeFragmentCoverage(stmt) > 0 ? 1 : 0);
            i++;
        }
        return result;
    }
}
