package fr.inria.diversify.testamplification.branchcoverage.load;

import java.util.*;

/**
 * User: Simon
 * Date: 22/04/15
 * Time: 15:49
 */
public class MethodCoverage {
    final String methodName;
    final Set<String> allBranch;
    Set<List<String>> allPath;
    Set<String> branchCoverage;

    public MethodCoverage(String methodName, String[] allBranch) {
        this.allBranch = new HashSet<>();
        Collections.addAll( this.allBranch, allBranch);
        this.methodName = methodName;
        allPath = new HashSet<>();
        branchCoverage = new HashSet<>();
    }

    public MethodCoverage(String methodName, Set<String> allBranch) {
        this.methodName = methodName;
        this.allBranch = new HashSet<>(allBranch);
        allPath = new HashSet<>();
        branchCoverage = new HashSet<>();
    }

    public void addPath(String[] path) {
        List<String> compressPath = new ArrayList<>();
        for(String p : path) {
            if(!compressPath.contains(p)) {
                compressPath.add(p);
            }
        }
        allPath.add(compressPath);
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

    public int nbDiffPath(MethodCoverage other) {
        int count = 0;

        for(List<String> path : allPath) {
            if(!other.allPath.contains(path)) {
                count++;
            }
        }

        for(List<String> path : other.allPath) {
            if(!allPath.contains(path)) {
                count++;
            }
        }

        return count++;
    }

    public void merge(MethodCoverage other) {
        this.allPath.addAll(other.allPath);
        this.branchCoverage.addAll(other.branchCoverage);
    }
}
