package fr.inria.diversify.logger.branch;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 28/04/15
 * Time: 14:17
 */
public class TestCoverage {
    String testName;
    Coverage coverage;


    public TestCoverage(String testName, Map<Integer, MethodCoverage> idToMethod) {
        this.testName = testName;
        List<MethodCoverage> list = new ArrayList<>();
        for (Integer id : idToMethod.keySet()) {
            MethodCoverage mc = idToMethod.get(id);
            if (mc.allPath.size() != 0) {
                list.add(mc);
            }
        }
        coverage = new Coverage(list);
    }

    public void merge(TestCoverage find) {
        coverage.merge(find.coverage);
    }

    public boolean containsAllBranch(TestCoverage other) {
        return coverage.getCoverageBranch().containsAll(other.coverage.getCoverageBranch());
    }

    public String getTestName() {
        return testName;
    }

    public Coverage getCoverage() {
        return coverage;
    }

    public void csv(PrintWriter fileWriter) throws IOException {

        for (MethodCoverage mc : coverage.getMethodCoverages()) {
            for (Branch branch : mc.getBranchCoverage()) {
                for (int deep : branch.deeps) {
                    fileWriter.append(testName + ";" + mc.getDeclaringClass() + ";" + mc.getMethodName() + ";" + branch.getId() + ";" + mc.getMethodId() + "." + branch.getId() + ";" + deep + "\n");

                }
            }
        }
    }
}
