package fr.inria.diversify.issta2;

import fr.inria.diversify.Profiling;
import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Comparator;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import spoon.reflect.cu.SourcePosition;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 14:29
 */
public class SosieComparator {
    InputProgram inputProgram;
    AbstractBuilder originalBuilder;
    String tmpSosieDir;

    Set<Comparator> comparators;
    Map<Class, Diff> filter;
    Set<String> filterForTest;

    public SosieComparator(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
        comparators = new HashSet<>();
        filterForTest = new HashSet<>();
        filter = new HashMap<>();
    }

    public void init(String tmpDir) throws Exception {
        String dir = tmpDir + "_original";
        copyDir(inputProgram.getProgramDir(), dir);
        instru(dir);
        originalBuilder = new MavenBuilder(dir);

        for(Comparator comparator : comparators) {
            comparator.init(inputProgram, originalBuilder);
            filter.put(comparator.getClass(), comparator.getEmptyDiff());
        }


        tmpSosieDir = tmpDir + "_sosie";
    }

    public Set<Diff> compare(SingleTransformation trans) throws Exception {
        try {
            Collection<String> testToRun = selectTest(trans.getPosition());
            updateFilter(testToRun);

            copyDir(tmpSosieDir.substring(0, tmpSosieDir.length() - 6), tmpSosieDir);
            trans.applyWithParent(tmpSosieDir + "/" + inputProgram.getRelativeSourceCodeDir());
            instru(tmpSosieDir);
            AbstractBuilder sosieBuilder = new MavenBuilder(tmpSosieDir);

            return runAndCompare(sosieBuilder, trans, testToRun);
        } finally {
            trans.restore(tmpSosieDir);
        }
    }

    protected void updateFilter(Collection<String> testToRun) throws Exception {
        Set<String> tests = testToRun.stream()
                .filter(test -> !filterForTest.contains(test))
                .collect(Collectors.toSet());

        if(!tests.isEmpty()) {
            Log.debug("update filter for tests: {}", tests);
            run(originalBuilder, tests);

            File oldLog = new File(originalBuilder.getDirectory() + "/oldLog/");
            File currentLog = new File(originalBuilder.getDirectory() + "/log/");
            FileUtils.copyDirectory(currentLog, oldLog);

            run(originalBuilder, tests);

            for(Comparator comparator : comparators) {
                Diff diff = comparator.compare(null, originalBuilder.getDirectory() + "/oldLog/", originalBuilder.getDirectory() + "/log/");
                filter.get(comparator.getClass()).merge(diff);
            }
           FileUtils.forceDelete(oldLog);
        }
        filterForTest.addAll(tests);
    }

    protected Collection<String> selectTest(SourcePosition position) {
        return comparators.stream()
                .flatMap(comparator -> comparator.selectTest(position).stream())
                .collect(Collectors.toSet());
    }

    protected Set<Diff> runAndCompare(AbstractBuilder sosieBuilder, SingleTransformation trans, Collection<String> testToRun) throws Exception {
        Set<Diff> diffs = new HashSet<>();

        run(sosieBuilder, testToRun);
        run(originalBuilder, testToRun);

        for(Comparator comparator : comparators) {
            Diff diff = comparator.compare(trans, tmpSosieDir + "/log", originalBuilder.getDirectory() + "/log");
            diff.filter(filter.get(comparator.getClass()));
            if(diff.size() != 0) {
                Log.info("{} diff", comparator.getClass().toString());
                diffs.add(diff);
            }
        }
        return diffs;
    }

    protected int run(AbstractBuilder builder, Collection<String> testToRun) throws InterruptedException, IOException {
        String goals = "test -Dmaven.compiler.useIncrementalCompilation=false -Dmaven.test.useIncrementalCompilation=false -Dtest="
                + testToRun.stream()
                .collect(Collectors.joining(","));

        File logDir = new File(builder.getDirectory() + "/log");
        for(File file : logDir.listFiles()) {
            if(file.getName().startsWith("log")) {
                FileUtils.forceDelete(file);
            }
        }

        builder.runGoals(new String[]{goals}, false);
        return builder.getStatus();
    }

    protected void copyDir(String src, String dest) throws IOException {
        File dir = new File(dest);
        if(dir.exists()) {
            FileUtils.forceDelete(dir);
        }
        dir.mkdirs();
        FileUtils.copyDirectory(new File(src), dir);
    }

    protected void instru(String outputDirectory) throws Exception {
        Properties properties = new Properties();
        properties.put("profiling.main.field", "true");
        properties.put("profiling.main.branch", "true");
        properties.put("profiling.main.branch.addBodyBranch", "true");
        properties.put("profiling.main.catch", "true");
        properties.put("profiling.main.throw", "true");
        properties.put("profiling.main.methodCall", "true");
        properties.put("profiling.test.logTest", "true");

        Profiling profiling = new Profiling(inputProgram, outputDirectory, "fr.inria.diversify.logger.logger", properties);
        profiling.apply();
    }

    public void addComparator(Comparator comparator) {
        comparators.add(comparator);
    }
}
