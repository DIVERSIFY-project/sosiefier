package fr.inria.diversify.logger.branch;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import spoon.reflect.cu.SourcePosition;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
            branch += mc.getCoveredBranchs().size();
        }

        return branch/allBranch;
    }

    public double coverage(Collection<String> classes) {
        double allBranch = 0;
        double branch = 0;

        for(MethodCoverage mc : methodCoverages) {
            if (classes.stream().anyMatch(cl -> mc.getMethodName().startsWith(cl+"_"))) {
                allBranch += mc.getAllBranch().size();
                branch += mc.getCoveredBranchs().size();

                if(!mc.getNotCoveredBranchId().isEmpty()) {
                    Log.debug("{} {} {}", mc.getMethodId(), mc.getMethodName(), mc.getNotCoveredBranchId());
                }
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
            for(Branch branch : mc.coveredBranchs) {
                set.add(mc.getMethodName()+ "." +branch.getId());
            }
        }
        return set;
    }


    public Set<String> getCoverageBranch(Collection<String> classes) {
        Set<String> set = new HashSet<>();
        for(MethodCoverage mc : methodCoverages) {
            if (classes.stream().anyMatch(cl -> mc.getMethodName().startsWith(cl +"_"))) {
                for (Branch branch : mc.coveredBranchs) {
                    set.add(mc.getMethodName() + "." + branch.getId());
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

    public Set<String> allBranchWithout(Coverage other) {
        Set<String> otherBranchs = other.getAllBranch();
        return getAllBranch().stream()
                .filter(b -> !otherBranchs.contains(b))
                .collect(Collectors.toSet());
    }

    public Set<String> getAllBranch(Collection<String> classes) {
        Set<String> set = new HashSet<>();
        for(MethodCoverage mc : methodCoverages) {
            if (classes.stream().anyMatch(cl -> mc.getMethodName().startsWith(cl+"_"))) {
                for (String branch : mc.allBranch) {
                    set.add(mc.getMethodName() + "." + branch);
                }
            }
        }

        return set;
    }


    public void csv(String fileName) throws IOException {
        PrintWriter fileWriter = new PrintWriter(new FileWriter(fileName));
        fileWriter.append("class;method;branch;branchId;deep;nbOfPath\n");

        for (MethodCoverage mc : methodCoverages) {
            for (Branch branch : mc.getCoveredBranchs()) {
                for (int deep : branch.deeps) {

                    fileWriter.append(mc.getDeclaringClass() + ";"
                            + mc.getMethodName() + ";" + branch.getId() + ";"
                            + mc.getMethodName() + "." + branch.getId() + ";"
                            + deep +  ";"
                            + mc.getAllPath().size()
                            +"\n");
                }
            }
        }
        fileWriter.close();
    }

    public Collection<MethodCoverage> getMethodCoverages() {
        return methodCoverages;
    }
}
