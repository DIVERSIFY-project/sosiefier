package fr.inria.diversify.transformatonSelection;

import fr.inria.diversify.transformation.Transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.ToDoubleFunction;

/**
 * User: Simon
 * Date: 12/06/15
 * Time: 14:08
 */
public class TestAndBranchSelection implements ToDoubleFunction<Transformation> {
    Map<String, Set<String>> classPositionToBranch;
    Map<String, Integer> lineBegin;
    Map<String, Integer> lineEnd;
    Map<String, Integer> branchDeepMax;
    Map<String, Double> branchDeepMean;
    Map<String, Integer> branchNbTest;

    public TestAndBranchSelection(String coverageInfo) throws IOException {
        classPositionToBranch = new HashMap<>();
        lineEnd = new HashMap<>();
        lineBegin = new HashMap<>();
        branchDeepMax = new HashMap<>();
        branchDeepMean = new HashMap<>();
        branchNbTest = new HashMap<>();

        parse(coverageInfo);
    }

    protected void parse(String coverageInfo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(coverageInfo));

        String line = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] split = line.split(";");
            String branch = split[0];
            branchNbTest.put(branch, Integer.parseInt(split[1]));
            branchDeepMax.put(branch, Integer.parseInt(split[2]));
            branchDeepMean.put(branch, Double.parseDouble(split[3]));

            if(!classPositionToBranch.containsKey(split[4])) {
                classPositionToBranch.put(split[4], new HashSet<>());
            }
            classPositionToBranch.get(split[4]).add(branch);
            lineBegin.put(branch, Integer.parseInt(split[5]));
            lineEnd.put(branch, Integer.parseInt(split[6]));
        }
    }


    @Override
    public double applyAsDouble(Transformation transformation) {
        String tClassPosition = transformation.getPosition().getCompilationUnit().getMainType().getQualifiedName();
        int tLineBegin = transformation.getPosition().getLine();
        int tLineEnd = transformation.getPosition().getEndLine();

        String branch = classPositionToBranch.get(tClassPosition).stream()
                .filter(b -> lineBegin.get(b) >= tLineBegin)
                .filter(b -> lineEnd.get(b) <= tLineEnd)
                .findFirst()
                .orElse(null);

        if(branch != null) {
            return branchDeepMean.get(branch) * branchNbTest.get(branch);
        } else {
            return 0d;
        }
    }
}
