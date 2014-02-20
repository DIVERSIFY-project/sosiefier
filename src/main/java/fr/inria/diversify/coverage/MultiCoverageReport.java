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
        coverages = new ArrayList<CoverageReport>();
        this.classesDir = classesDir;
    }

    public MultiCoverageReport(String classesDir, File jacocoDir) {
        coverages = new ArrayList<CoverageReport>();
        for (File file : jacocoDir.listFiles()) {
            if(file.getName().endsWith(".exec"))
                coverages.add(new CoverageReport(classesDir,file));
        }
    }

    public void addJacocoFile(File file) {
        coverages.add(new CoverageReport(classesDir,file));
    }

    @Override
    public void create() throws IOException {
        for (CoverageReport cr : coverages)
            cr.create();
    }

    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {
        double ret = 1;
        for (CoverageReport cr : coverages) {
            ret = Math.min(ret, cr.codeFragmentCoverage(stmt));
        }
        return ret;
    }

    @Override
    public int opCodeCoverage(CtMethod method, int indexOpcode) {
        int ret = 1;
        for (CoverageReport cr : coverages) {
            ret = Math.min(ret, cr.opCodeCoverage(method,indexOpcode));
        }
        return ret;
    }

    @Override
    public double elementCoverage(CtElement operator) {
        double ret = 1;
        for (CoverageReport cr : coverages) {
            ret = Math.min(ret, cr.elementCoverage(operator));
        }
        return ret;
    }
}
