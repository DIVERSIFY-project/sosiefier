package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.pointSequence.Point;
import fr.inria.diversify.sosie.pointSequence.PointSequence;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 10/14/13
 * Time: 2:56 PM
 */
public class Diff {
    protected Map<PointSequence, Set<VariableDiff>> diffVar;
    protected Map<PointSequence,PointSequence> match;
    protected Map<PointSequence,int[][]> conditionalDivergence;
    protected Map<PointSequence,int[][]> catchDivergence;
    protected Map<PointSequence, Set<ExceptionDiff>> diffException;

    protected CodeFragment startPoint;

    public Diff(CodeFragment startPoint) {
        this.diffVar = new HashMap<PointSequence, Set<VariableDiff>>();
        this.diffException = new HashMap<PointSequence, Set<ExceptionDiff>>();
        conditionalDivergence = new HashMap<PointSequence, int[][]>();
        catchDivergence = new HashMap<PointSequence, int[][]>();
        match = new HashMap<PointSequence, PointSequence>();
        this.startPoint = startPoint;
    }

    public void addVarFor(PointSequence original, Set<VariableDiff> var) {
        if(!diffVar.containsKey(original))
            diffVar.put(original,new HashSet<VariableDiff>());

        diffVar.get(original).addAll(var);
    }

    public void addCatchFor(PointSequence original, Set<ExceptionDiff> divergenceCatch) {
        if(!diffException.containsKey(original))
            diffException.put(original,new HashSet<ExceptionDiff>());

        diffException.get(original).addAll(divergenceCatch);
    }

    public void addMatch(PointSequence original, PointSequence sosie) {
        match.put(original,sosie);
    }

    public void addDivergence(PointSequence original, int[][] d) {
        conditionalDivergence.put(original, d);
    }

    public void addCatchDivergence(PointSequence original, int[][] divergence) {
        catchDivergence.put(original, divergence);
    }

    public boolean sameTrace() {
        for(PointSequence sosie : match.values()) {
            if(sosie == null)
                return false;
        }
        return true;
    }

    public boolean sameTraceAndVar() {
        if(!sameTrace())
            return false;

        for (Set<VariableDiff> vars : diffVar.values())
            if (!vars.isEmpty())
                return false;

        return true;
    }

    public boolean sameTraceAndCatch() {
        if(!sameTrace())
            return false;

        return sameCatch();
    }

    public boolean sameVar() {
        for (Set<VariableDiff> vars : diffVar.values())
            if (!vars.isEmpty())
                return false;

        return true;
    }

    public boolean sameCatch() {
        for (Set<ExceptionDiff> vars : diffException.values())
            if (!vars.isEmpty())
                return false;

        return true;
    }

    public boolean hasMatch(PointSequence original) {
        return match.containsKey(original);
    }

    public String report() {
        String report = "startPoint: "+startPoint.getSourceClass().getSimpleName();
        report += "\nsame trace: "+ sameTrace() + " same var: "+sameTraceAndVar()+ "\n";

        for (PointSequence original : diffVar.keySet())
            if(!diffVar.get(original).isEmpty()) {
            PointSequence sosie = match.get(original);
            report += "diff var between "+ original.getName() +
                    " (size: " + original.conditionalSize() + ", startPointIndex: "+ findDiversificationIndex(original) +
                    ") and " + sosie.getName() +
                    " (size: " + sosie.conditionalSize()+ ", startPointIndex: "+ findDiversificationIndex(sosie) +
                    ")\n\tvar: "+ diffVar.get(original) +"\n";
            }

        return report;
    }

    public Set<VariableDiff> getDiffVar() {
        Set<VariableDiff> diff = new HashSet<VariableDiff>();
        for(Set<VariableDiff> d : diffVar.values())
            diff.addAll(d);
        return diff;
    }

    protected int findDiversificationIndex(PointSequence sequence) {
        int i = 0;
        while (i < sequence.conditionalSize() && !sequence.getConditionalPoint(i).containsInto(startPoint))
            i++;
        return i;
    }

    public void toDot(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("digraph G {\n");
        for (PointSequence ps : match.keySet())
            if (!diffVar.get(ps).isEmpty() ) {
            try {
                bw.write(toDot(ps));
            }catch (Exception e) {}
            }

        bw.write("}");
        bw.close();
    }

    public Set<String> getVarTestDiff() {
        Set<String> d = new HashSet<String>();

        for (PointSequence ps : match.keySet())
            if (!diffVar.get(ps).isEmpty())
                if(match.get(ps) != null)
                    d.add(match.get(ps).getName());

        return d;
    }

    public Set<String> getCatchTestDiff() {
        Set<String> d = new HashSet<String>();;
        for (PointSequence ps : match.keySet())
            if (!diffVar.get(ps).isEmpty())
                if(match.get(ps) != null)
                    d.add(match.get(ps).getName());
        return d;
    }

    protected String toDot(PointSequence original) throws IOException {
        if(match.get(original) == null)
            return "";

        StringBuilder builder = new StringBuilder();
        PointSequence sosie = match.get(original);

        int[][] div = conditionalDivergence.get(original);
        int i = 0;
        int start1 = 0;
        int start2 = 0;
        boolean toString = false;

        Point precedent = original.getConditionalPoint(0);
        builder.append(original.toDot() + "\n");
        builder.append(original.hashCode() + " -> " + precedent.hashCode() + "\n");
        builder.append(precedent.toDot(getVariableDiffFor(original, 0)) + "\n");

        while(i < div.length) {
            Point next = original.getConditionalPoint(start1);
            Set<VariableDiff> varD = getVariableDiffFor(original, div[i][0]);
            if(!varD.isEmpty())
                toString = true;

            if(start1 == div[i][0] && start2 == div[i][1]) {
                builder.append(precedent.hashCode() + " -> " + next.hashCode()+"\n");
                precedent = next;
                builder.append(precedent.toDot(varD)+"\n");
                start1++;
                start2++;
                i++;
            }
            else {
                toString = true;
                Point endBranch = original.getConditionalPoint(div[i][0]);
                writeDotBranch(builder,precedent, endBranch,start1,div[i][0], original);
                writeDotBranch(builder,precedent, endBranch,start2,div[i][1], sosie);
                precedent = endBranch;
                builder.append(precedent.toDot(varD));
                i++;
                start1 = div[i][0];
                start2 = div[i][1];
            }
        }
        if(toString)
            return builder.toString();
        return "";
    }

    protected void writeDotBranch(StringBuilder builder, Point branchNext, Point endBranch, int i, int borne,  PointSequence ps) throws IOException {
        for(; i < borne; i++) {
            builder.append(branchNext.hashCode() + " -> " + ps.getConditionalPoint(i).hashCode() + "\n");
            branchNext = ps.getConditionalPoint(i);
            builder.append(branchNext.toDot(new HashSet<VariableDiff>()));
        }
        builder.append(branchNext.hashCode() + " -> " + endBranch.hashCode() + "\n");
    }

    public void toDotCatch(String fileName) throws IOException {

        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("digraph G {\n");
        for (PointSequence ps : match.keySet())
            if (!diffException.get(ps).isEmpty() ) {
                try {
                    bw.write(toDotCatch(ps));
                }catch (Exception e) {}
            }

        bw.write("}");
        bw.close();
    }

    protected String toDotCatch(PointSequence original) throws IOException {
        if(match.get(original) == null)
            return "";

        StringBuilder builder = new StringBuilder();
        PointSequence sosie = match.get(original);

        int[][] div = catchDivergence.get(original);
        int i = 0;
        int start1 = 0;
        int start2 = 0;
        boolean toString = false;

        Point precedent = original.getCatchPoint(0);
        builder.append(original.toDot() + "\n");
        builder.append(original.hashCode() + " -> " + precedent.hashCode() + "\n");
        builder.append(precedent.toDot(getCatchDiffFor(original, 0)) + "\n");

        while(i < div.length) {
            Point next = original.getCatchPoint(start1);
            Set<ExceptionDiff> varD = getCatchDiffFor(original, div[i][0]);
            if(!varD.isEmpty())
                toString = true;

            if(start1 == div[i][0] && start2 == div[i][1]) {
                builder.append(precedent.hashCode() + " -> " + next.hashCode()+"\n");
                precedent = next;
                builder.append(precedent.toDot(varD)+"\n");
                start1++;
                start2++;
                i++;
            }
            else {
                toString = true;
                Point endBranch = original.getCatchPoint(div[i][0]);
                writeDotBranchCatch(builder, precedent, endBranch, start1, div[i][0], original);
                writeDotBranchCatch(builder, precedent, endBranch, start2, div[i][1], sosie);
                precedent = endBranch;
                builder.append(precedent.toDot(varD));
                i++;
                start1 = div[i][0];
                start2 = div[i][1];
            }
        }
        if(toString)
            return builder.toString();
        return "";
    }

    protected void writeDotBranchCatch(StringBuilder builder, Point branchNext, Point endBranch, int i, int borne,  PointSequence ps) throws IOException {
        for(; i < borne; i++) {
            builder.append(branchNext.hashCode() + " -> " + ps.getCatchPoint(i).hashCode() + "\n");
            branchNext = ps.getCatchPoint(i);
            builder.append(branchNext.toDot(new HashSet<VariableDiff>()));
        }
        builder.append(branchNext.hashCode() + " -> " + endBranch.hashCode() + "\n");
    }

    protected Set<ExceptionDiff> getCatchDiffFor(PointSequence ps, int index) {
        Set<ExceptionDiff> set = new HashSet<ExceptionDiff>();
        for (ExceptionDiff varD : diffException.get(ps)) {
            if(varD.positionInOriginal == index)
                set.add(varD);
        }
        return set;
    }

    protected Set<VariableDiff> getVariableDiffFor(PointSequence ps, int index) {
        Set<VariableDiff> set = new HashSet<VariableDiff>();
        for (VariableDiff varD : diffVar.get(ps)) {
            if(varD.positionInOriginal == index)
                set.add(varD);
        }
        return set;
    }

    public Set<VariableDiff> getAllVariableDiff() {
        Set<VariableDiff> diffs = new HashSet<VariableDiff>();
        for(Set<VariableDiff> set : diffVar.values())
            diffs.addAll(set);
        return diffs;
    }

    public Set<ExceptionDiff> getAllExceptionDiff() {
        Set<ExceptionDiff> diffs = new HashSet<ExceptionDiff>();
        for(Set<ExceptionDiff> set : diffException.values())
            diffs.addAll(set);
        return diffs;
    }
}