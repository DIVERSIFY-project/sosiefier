package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;

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

    public MultiCoverageReport(String classesDir, File jacocoDir) {
        coverages = new ArrayList<CoverageReport>();
        for (File file : jacocoDir.listFiles()) {
            if(file.getName().endsWith(".exec"))
                coverages.add(new CoverageReport(classesDir,file));
        }
    }

    @Override
    public void create() throws IOException {
        for (CoverageReport cr : coverages)
            cr.create();
    }

    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {
        System.out.println("MultiCoverage");
        double ret = 1;
        for (CoverageReport cr : coverages) {
//            System.out.println(cr.getFileName()+": "+cr.codeFragmentCoverage(stmt));
            ret = Math.min(ret, cr.codeFragmentCoverage(stmt));
        }
        return ret;
    }
}
