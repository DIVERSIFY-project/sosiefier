package fr.inria.diversify.logger.branch;


import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.cu.SourcePosition;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

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

    public void csv(PrintWriter fileWriter, Collection<Transformation> transformations, Map<String, SourcePosition> positions, Map<String, String> conditionsType) throws IOException {

        for (MethodCoverage mc : coverage.getMethodCoverages()) {
            for (Branch branch : mc.getCoveredBranchs()) {
                for (int deep : branch.deeps) {
                    String branchId = mc.getMethodId() + "." + branch.getId();
                    Set<Transformation> trans = transformationForThisBranch(branchId, transformations , positions);
                    long sosie = trans.stream()
                            .filter(t -> t.isSosie())
                            .count();
                    long compile = trans.stream()
                            .filter(t -> t.getStatus() >= -1)
                            .count();
                    fileWriter.append(testName + ";"
                            + mc.getDeclaringClass() + ";"
                            + mc.getMethodName() + ";" + branch.getId() + ";"
                            + mc.getMethodName() + "." + branch.getId() + ";"
                            + deep + ";"
                            + trans.size()  + ";"
                            + sosie  + ";"
                            + compile + ";"
                            + conditionTypeForThisBranch(branchId, conditionsType) + "\n");

                }
            }
        }
    }

    protected String conditionTypeForThisBranch(String branchId, Map<String, String> conditionsType) {
        return conditionsType.getOrDefault(branchId, "none");

    }

    protected Set<Transformation> transformationForThisBranch(String branchId, Collection<Transformation> transformations, Map<String, SourcePosition> positions) {
        SourcePosition branchPosition = positions.get(branchId);
        if(branchPosition == null) {
            return new HashSet<>();
        }
        return transformations.parallelStream()
                .filter(transformation -> {
                    SourcePosition transPosition = transformation.getPosition();
                    return branchPosition.getCompilationUnit().equals(transPosition.getCompilationUnit())
                            && branchPosition.getSourceStart() <= transPosition.getSourceStart()
                            && branchPosition.getSourceEnd() >= transPosition.getSourceEnd();
                })
                .collect(Collectors.toSet());
    }

    public Set<String> getAllBranch() {
        Set<String> branchs = new HashSet<>();

        for (MethodCoverage mc : coverage.getMethodCoverages()) {
            for (Branch branch : mc.getCoveredBranchs()) {
                branchs.add(mc.getMethodId() + "." + branch.getId());
            }
        }
        return branchs;
    }

    public Set<String> getCoveredBranchId() {
        Set<String> branchs = new HashSet<>();

        for (MethodCoverage mc : coverage.getMethodCoverages()) {
            for (String branch : mc.getAllBranch()) {
                branchs.add(mc.getMethodId() + "." + branch);
            }
        }
        return branchs;
    }
}
