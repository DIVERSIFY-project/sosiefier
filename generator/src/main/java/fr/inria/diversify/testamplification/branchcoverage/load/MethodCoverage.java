package fr.inria.diversify.testamplification.branchcoverage.load;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * User: Simon
 * Date: 22/04/15
 * Time: 15:49
 */
public class MethodCoverage {
    final String methodName;
    final Set<String> allBranch;
    Set<String[]> allPath;
    Set<String> branchCoverage;

    public MethodCoverage(String methodName, String[] allBranch) {
        this.allBranch = new HashSet<>();
        Collections.addAll( this.allBranch, allBranch);
        this.methodName = methodName;
        allPath = new HashSet<>();
        branchCoverage = new HashSet<>();
    }

    public void addPath(String[] path) {
        allPath.add(path);
        Collections.addAll(branchCoverage, path);
    }


    public double coverage() {
        return ((double) branchCoverage.size()) / ((double) allBranch.size());
    }

    public String getMethodName() {
        return methodName;
    }

    public Set<String> getAllBranch() {
        return allBranch;
    }

    public Set<String> getBranchCoverage() {
        return branchCoverage;
    }

    public int distance(MethodCoverage other) {
        int d = 0;
        for(String branch : allBranch) {
            if(branchCoverage.contains(branch) != other.branchCoverage.contains(branch)) {
                d++;
            }
        }
        return d;
    }
}
