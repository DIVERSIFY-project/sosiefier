package fr.inria.diversify.coverage;

import org.jacoco.core.analysis.*;
import org.jacoco.core.tools.ExecFileLoader;
import spoon.reflect.declaration.CtElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 *
 * A coverage report to simply check if a element is at least partially covered
 *
 * Created by marodrig on 11/07/2014.
 */
public class SimpleCoverageReport extends CoverageReport {

    private List<Set<CoverageSourcePosition>> simpleCoverage;

    public SimpleCoverageReport(String classesDir, String jacocoFile) {
        super(classesDir, new File(jacocoFile));
    }

    public SimpleCoverageReport(String classesDir, File jacocoFile) {
        super(classesDir, jacocoFile);
    }

    /**
     * Converts the coverage data from an exec file into a more potable data structure for the transformation query
     *
     * @return A list of CoverageSourcePosition instances
     */
    public List<CoverageSourcePosition> convert() throws IOException {

        ArrayList<CoverageSourcePosition> result = new ArrayList<>();

        Collection<IClassCoverage> clss = coverageBuilder.getClasses();
        for (IClassCoverage c : clss) {
            for (IMethodCoverage m : c.getMethods()) {
                for (int i = m.getFirstLine(); i <= m.getLastLine(); i++) {
                    ILine line = m.getLine(i);
                    if (line.getStatus() > ICounter.NOT_COVERED) {
                        result.add(new CoverageSourcePosition(c.getPackageName() + "." + c.getName(), i));
                    }
                }
            }
        }
        return result;
    }


    /**
     * Returns the simple coverage value. From a list of coverage data of several clients we extract how many clients
     * executes a code element
     * @param e Code element to execute
     * @return
     */
    public int simpleCoverageValue(CtElement e) {
        int result = 0;
        for ( Set<CoverageSourcePosition> s : simpleCoverage ) {
            CoverageSourcePosition cv = new CoverageSourcePosition(e.getClass().toString(), e.getPosition().getLine());
            if ( s.contains(cv) ) {
                result++;
            }
        }
        return result;
    }


    /**
     * Gets the simple coverage data, the simple coverage information only checks if an statement is partially covered
     *
     * @return
     */
    public List<Set<CoverageSourcePosition>> getSimpleCoverageData() {
        return simpleCoverage;
    }
}
