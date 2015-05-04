package fr.inria.diversify.testamplification.branchcoverage.load;

import fr.inria.diversify.util.Log;

import java.util.*;

/**
 * User: Simon
 * Date: 24/04/15
 * Time: 10:47
 */
public class Coverage {
    Collection<MethodCoverage> methodCoverages;


    public Coverage(Collection<MethodCoverage> methodCoverages) {
       this.methodCoverages = methodCoverages;
    }

    public double coverage() {
        double allBranch = 0;
        double branch = 0;

        for(MethodCoverage mc : methodCoverages) {
            allBranch += mc.getAllBranch().size();
            branch += mc.getBranchCoverage().size();
        }

        return branch/allBranch;
    }

    public double coverage(Collection<String> classes) {
        double allBranch = 0;
        double branch = 0;

        for(MethodCoverage mc : methodCoverages) {
            if (classes.stream().anyMatch(cl -> mc.getMethodName().startsWith(cl))) {
                allBranch += mc.getAllBranch().size();
                branch += mc.getBranchCoverage().size();
            }
        }

        return branch/allBranch;
    }

    public int distance(Coverage other) {
        int d = 0;
        for(MethodCoverage mc : methodCoverages) {
            d += mc.distance(other.getMethodCoverage(mc.getMethodName()));
        }

        return d;
    }

    public void info() {
        int count = 0;
        for(MethodCoverage mc : methodCoverages) {
            if(mc.coverage() != 0) {
                count++;
                Log.info("{}: {}", mc.getMethodName(), mc.coverage());
            }
        }
        Log.info("count: {}",count);
    }

    protected MethodCoverage getMethodCoverage(String name) {
        return methodCoverages.stream()
                .filter(mc -> mc.getMethodName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public int nbDiffPath(Coverage other) {
        int d = 0;
        for(MethodCoverage mc : methodCoverages) {
            d += mc.nbDiffPath(other.getMethodCoverage(mc.getMethodName()));
        }

        return d;
    }

    public void merge(Coverage other) {
        for(MethodCoverage mc : other.methodCoverages) {
            String name = mc.getMethodName();
            if(getMethodCoverage(name) != null) {
                getMethodCoverage(name).merge(mc);
            } else {
                methodCoverages.add(mc);
            }

        }
    }


    public Set<String> getCoverageBranch() {
        Set<String> set = new HashSet<>();
        for(MethodCoverage mc : methodCoverages) {
            for(String branch : mc.branchCoverage) {
                set.add(mc.getMethodName()+ "." +branch);
            }
        }

        return set;
    }


    public Set<String> getCoverageBranch(Set<String> classes) {
        Set<String> set = new HashSet<>();
        for(MethodCoverage mc : methodCoverages) {
            if (classes.stream().anyMatch(cl -> mc.getMethodName().startsWith(cl))) {
                for (String branch : mc.branchCoverage) {
                    set.add(mc.getMethodName() + "." + branch);
                }
            }
        }

        return set;
    }

    public Set<String> getAllBranch() {
        Set<String> set = new HashSet<>();
        for(MethodCoverage mc : methodCoverages) {
            for(String branch : mc.allBranch) {
                set.add(mc.getMethodName()+ "." +branch);
            }
        }

        return set;
    }

}
