package fr.inria.diversify.testamplification.branchcoverage.load;

import fr.inria.diversify.util.Log;

import java.util.Collection;

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
            if(mc.coverage() != 0) {
                allBranch += mc.getAllBranch().size();
                branch += mc.getBranchCoverage().size();
            }
        }

        return branch/allBranch;
    }
       //0.7705314009661836 132
    //0.7753623188405797 132
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
}
