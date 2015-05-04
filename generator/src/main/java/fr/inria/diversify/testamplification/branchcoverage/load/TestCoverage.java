package fr.inria.diversify.testamplification.branchcoverage.load;


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
        for(Integer id : idToMethod.keySet()) {
            MethodCoverage mc = idToMethod.get(id);
            if(mc.allPath.size() != 0) {
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
}
