package fr.inria.diversify.sosie.compare;

import java.util.*;

/**
 * User: Simon
 * Date: 28/11/13
 * Time: 10:49
 */
public class DiffStat {
    protected List<Diff> diffs;
    protected List<Diff> same;

    public DiffStat(List<Diff> diffs) {
        this.diffs = diffs;
    }

    public int maxVarDiff() {
        int max = 0;
        for(Diff diff: diffs)
            max = Math.max(max, allVariableDiff(diff).size());
        return max;
    }

    public int minVarDiff() {
        int min = 100;
        for(Diff diff: diffs)
            min = Math.min(min, allVariableDiff(diff).size());
        return min;
    }

    public double meanVarDiff() {
        double mean = 0;
        for(Diff diff: diffs)
            mean = mean + allVariableDiff(diff).size();
        return mean/(double)diffs.size();
    }

    public int maxVarTestDiff() {
        int max = 0;
        for(Diff diff: diffs)
            max = Math.max(max, diff.getVarTestDiff().size());
        return max;
    }

    public int minVarTestDiff() {
        int min = 100;
        for(Diff diff: diffs)
            min = Math.min(min, diff.getVarTestDiff().size());
        return min;
    }

    public double meanVarTestDiff() {
        double mean = 0;
        for(Diff diff: diffs)
            mean = mean + diff.getVarTestDiff().size();
        return mean/(double)diffs.size();
    }

    public int maxCatchTestDiff() {
        int max = 0;
        for(Diff diff: diffs)
            max = Math.max(max, diff.getCatchTestDiff().size());
        return max;
    }

    public int minCatchTestDiff() {
        int min = 100;
        for(Diff diff: diffs)
            min = Math.min(min, diff.getCatchTestDiff().size());
        return min;
    }

    public double meanCatchTestDiff() {
        double mean = 0;
        for(Diff diff: diffs)
            mean = mean + diff.getCatchTestDiff().size();
        return mean/(double)diffs.size();
    }

    public String[][] tableTestDiff() {
        Set<String> allTestDiff  = new HashSet<String>();
        for(Diff diff : diffs) {
            allTestDiff.addAll(diff.getVarTestDiff());
        }
        String[][] table = new String[diffs.size()+1][allTestDiff.size()+1];
        for (int i = 0; i < diffs.size(); i++) {
            Diff diff = diffs.get(i);
            table[i+1][0] = "sosie"+i;
            int j = 0;
            for (String test : allTestDiff) {
                table[0][j+1] = test;

                if(diff.getVarTestDiff().contains(test))
                    table[i+1][j+1] = "1";
                else
                    table[i+1][j+1] = "0";
                j++;
            }
        }
        return table;
    }

    protected Set<String> allVariableDiff(Diff diff) {
        Set<String> set = new HashSet<String>();

        for(VariableDiff d : diff.getAllVariableDiff()) {
            set.add(d.getVarName());
        }
        return set;
    }
}
