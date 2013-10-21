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
    protected Map<PointSequence,int[][]> divergence;

    protected CodeFragment startPoint;

    public Diff(CodeFragment startPoint) {
        this.diffVar = new HashMap<PointSequence, Set<VariableDiff>>();
        divergence = new HashMap<PointSequence, int[][]>();
        match = new HashMap<PointSequence, PointSequence>();
        this.startPoint = startPoint;
    }

    public void addVarFor(PointSequence original, Set<VariableDiff> var) {
        if(!diffVar.containsKey(original))
            diffVar.put(original,new HashSet<VariableDiff>());

        diffVar.get(original).addAll(var);
    }

    public void addMatch(PointSequence original, PointSequence sosie) {
        match.put(original,sosie);
    }

    public void addDivergence(PointSequence original, int[][] d) {
        divergence.put(original,d);
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

    public boolean sameVar() {

        for (Set<VariableDiff> vars : diffVar.values())
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
                    " (size: " + original.size() + ", startPointIndex: "+ findDiversificationIndex(original) +
                    ") and " + sosie.getName() +
                    " (size: " + sosie.size()+ ", startPointIndex: "+ findDiversificationIndex(sosie) +
                    ")\n\tvar: "+ diffVar.get(original) +"\n";
            }

        return report;
    }

    protected int findDiversificationIndex(PointSequence sequence) {
        int i = 0;
        while (i < sequence.size() && !sequence.get(i).containsInto(startPoint))
            i++;
        return i;
    }

    public void toDot(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);


        bw.write("digraph G {\n");
        for (PointSequence ps : match.keySet())
            bw.write(toDot(ps));

        bw.write("}");
        bw.close();
    }


    protected String toDot( PointSequence original) throws IOException {
        if(match.get(original) == null)
            return "";

        StringBuilder builder = new StringBuilder();
        PointSequence sosie = match.get(original);
        int[][] div = divergence.get(original);
        int i = 0;
        int start1 = 0;
        int start2 = 0;
        boolean toString = false;

        Point precedent = original.get(0);
        builder.append(original.toDot() + "\n");
        builder.append(original.hashCode() + " -> " + precedent.hashCode() + "\n");
        builder.append(precedent.toDot(getVariableDiffFor(original, 0)) + "\n");

        while(i < div.length) {
            Point next = original.get(start1);
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
                Point endBranch = original.get(div[i][0]);
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
            builder.append(branchNext.hashCode() + " -> " + ps.get(i).hashCode() + "\n");
            branchNext = ps.get(i);
            builder.append(branchNext.toDot(new HashSet<VariableDiff>()));
        }
        builder.append(branchNext.hashCode() + " -> " + endBranch.hashCode() + "\n");
    }


    protected Set<VariableDiff> getVariableDiffFor(PointSequence ps, int index) {
        Set<VariableDiff> set = new HashSet<VariableDiff>();
        for (VariableDiff varD : diffVar.get(ps)) {
            if(varD.positionInOriginal == index)
                set.add(varD);
        }
        return set;
    }
}