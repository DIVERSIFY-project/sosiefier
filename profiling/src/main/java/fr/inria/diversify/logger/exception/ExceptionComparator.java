package fr.inria.diversify.logger.exception;

import com.google.common.collect.Sets;
import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Comparator;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.transformation.SingleTransformation;
import spoon.reflect.cu.SourcePosition;

import java.util.*;

/**
 * User: Simon
 * Date: 26/06/15
 * Time: 16:12
 */
public class ExceptionComparator implements Comparator {

    @Override
    public void init(InputProgram originalInputProgram, AbstractBuilder originalBuilder) throws Exception {

    }

    @Override
    public Diff compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception {
        ExceptionReader originalBuilder = new ExceptionReader(originalLogDir);
        Collection<ExceptionPosition> originalExceptions = originalBuilder.load();

        if(originalExceptions.size() == 0) {
            return getEmptyDiff();
        }

        ExceptionReader sosieBuilder = new ExceptionReader(sosieLogDir);
        Collection<ExceptionPosition> sosieExceptions = sosieBuilder.load();

        ExceptionDiff diff = new ExceptionDiff();
        for(ExceptionPosition oException : originalExceptions) {
            ExceptionPosition sException = sosieExceptions.stream()
                    .filter(g -> g.getName().equals(oException.getName()))
                    .findFirst()
                    .get();
            ExceptionDiff gDiff = oException.diff(sException);
            if(gDiff.size() != 0) {
                diff.merge(gDiff);
            }
        }

        if(diff.size() != 0) {
            //by test, methods only presnet in original traces xor sosie traces
            Map<String, Set<String>> filter = diff(originalBuilder.methodCallByTest, sosieBuilder.methodCallByTest);

            //keeping only diff found in methods present in original traces and sosie traces
            for(String key : filter.keySet()) {
                if(diff.throwsByTest.containsKey(key)) {
                    diff.throwsByTest.get(key).removeAll(filter.get(key));
                }
                if(diff.catchByTest.containsKey(key)) {
                    diff.catchByTest.get(key).removeAll(filter.get(key));
                }
            }
        }

        return diff;
    }

    // {1,2,3} {2,3,4} -> {1,4}
    protected Map<String,Set<String>> diff(Map<String, Set<String>> map1, Map<String, Set<String>> map2) {
        Map<String,Set<String>> map = new HashMap<>();

        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        for(String key : keys) {
            if(map1.containsKey(key) && map2.containsKey(key)) {
                Set<String> set1 = map1.get(key);
                Set<String> set2 = map2.get(key);

                Set<String> diff1 = new HashSet<>();
                diff1.addAll(set1);
                diff1.removeAll(set2);

                Set<String> diff2 = new HashSet<>();
                diff2.addAll(set2);
                diff2.removeAll(set1);

                if (!diff1.isEmpty() || !diff2.isEmpty()) {
                    map.put(key, diff1);
                    diff1.addAll(diff2);
                }
            }
        }

        return map;
    }

    @Override
    public Collection<String> selectTest(SourcePosition position) {
        return new LinkedList<>();
    }

    @Override
    public Diff getEmptyDiff() {
        return new ExceptionDiff();
    }
}
