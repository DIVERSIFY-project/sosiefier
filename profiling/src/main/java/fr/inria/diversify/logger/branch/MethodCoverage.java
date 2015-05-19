package fr.inria.diversify.logger.branch;

import java.util.*;

/**
 * User: Simon
 * Date: 22/04/15
 * Time: 15:49
 */
public class MethodCoverage {
    final Integer methodId;
    final String methodName;
    final Set<String> allBranch;
    Set<List<String>> allPath;
    Set<Branch> branchCoverage;

    public MethodCoverage(Integer methodId, String methodName, String[] allBranch) {
        this.methodId = methodId;
        this.allBranch = new HashSet<>();
        Collections.addAll( this.allBranch, allBranch);
        this.methodName = methodName;
        allPath = new HashSet<>();
        branchCoverage = new HashSet<>();
    }

    public MethodCoverage(Integer methodId, String methodName, Set<String> allBranch) {
        this.methodId = methodId;
        this.methodName = methodName;
        this.allBranch = new HashSet<>(allBranch);
        allPath = new HashSet<>();
        branchCoverage = new HashSet<>();
    }

    public void addPath(int methodDeep, String[] path) {
        List<String> compressPath = new ArrayList<>();
        for(String p : path) {
            if(!compressPath.contains(p)) {
                compressPath.add(p);
            }
        }
        allPath.add(compressPath);

        for(String id : compressPath) {
            Branch existing = null;
            for(Branch branch : branchCoverage) {
                if(branch.getId().equals(id)) {
                    existing = branch;
                    break;
                }
            }
            if(existing == null) {
                existing = new Branch(id,methodDeep);
                branchCoverage.add(existing);
            } else {
                existing.addDeep(methodDeep);
            }
        }
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

    public Set<Branch> getBranchCoverage() {
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

    public Integer getMethodId() {
        return methodId;
    }


    public String getDeclaringClass() {
        return methodName.split("_")[0];
    }
}
