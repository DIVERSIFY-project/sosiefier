package fr.inria.diversify.logger.branch;

import fr.inria.diversify.util.Log;

import java.util.*;
import java.util.stream.Collectors;

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
    Set<Branch> coveredBranchs;

    public MethodCoverage(Integer methodId, String methodName, String[] allBranch) {
        this.methodId = methodId;
        this.allBranch = new HashSet<>();
        Collections.addAll(this.allBranch, allBranch);
        this.methodName = methodName;
        allPath = new HashSet<>();
        coveredBranchs = new HashSet<>();
    }

    public MethodCoverage(Integer methodId, String methodName, Set<String> allBranch) {
        this.methodId = methodId;
        this.methodName = methodName;
        this.allBranch = new HashSet<>(allBranch);
        allPath = new HashSet<>();
        coveredBranchs = new HashSet<>();
    }

    public void addPath(int methodDeep, String[] path) {
        List<String> compressPath = new ArrayList<>(path.length);
        for(String p : path) {
            if(!compressPath.contains(p)) {
                compressPath.add(p);
            }
        }
        allPath.add(compressPath);

        for(String id : compressPath) {
            Branch existing = null;
            for(Branch branch : coveredBranchs) {
                if(branch.getId().equals(id)) {
                    existing = branch;
                    break;
                }
            }
            if(existing == null) {
                existing = new Branch(id,methodDeep);
                coveredBranchs.add(existing);
            } else {
                existing.addDeep(methodDeep);
            }
        }
    }

    public double coverage() {
        return ((double) coveredBranchs.size()) / ((double) allBranch.size());
    }

    public Set<String> getNotCoveredBranchId() {
        Set<String> coveredBranchId = coveredBranchs.stream()
                .map(b -> b.getId())
                .collect(Collectors.toSet());

        return allBranch.stream()
                .filter(branchId -> !coveredBranchId.contains(branchId))
                .collect(Collectors.toSet());
    }

    public String getMethodName() {
        return methodName;
    }

    public Set<String> getAllBranchId() {
        return allBranch;
    }

    public Set<String> getAllBranch() {
        return allBranch.stream()
                .map(branch -> methodId +"."+branch)
                .collect(Collectors.toSet());
    }

    public Set<List<String>> getAllPath() {
        return allPath;
    }

    public Set<Branch> getCoveredBranchs() {
        return coveredBranchs;
    }

    public Set<String> getCoveredBranchId() {
        return coveredBranchs.stream()
                .map(b -> b.getId())
                .collect(Collectors.toSet());
    }

    public int distance(MethodCoverage other) {
        int d = 0;
        for(String branch : allBranch) {
            if(getCoveredBranchId().contains(branch) != other.getCoveredBranchId().contains(branch)) {
                d++;
                Log.info("{} {} {}, this {}, other {}",getMethodId(), getMethodName(), branch, getNotCoveredBranchId() ,other.getNotCoveredBranchId());
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
        this.coveredBranchs.addAll(other.coveredBranchs);
    }

    public Integer getMethodId() {
        return methodId;
    }

    public String getDeclaringClass() {
        return methodName.split("_")[0];
    }

    public Branch getBranch(String branchId) {
        return coveredBranchs.stream()
                .filter(branch -> branch.getId().equals(branchId))
                .findFirst()
                .orElse(null);
    }
}
