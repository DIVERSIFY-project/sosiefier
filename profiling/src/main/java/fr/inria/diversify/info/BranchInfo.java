package fr.inria.diversify.info;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.processor.main.BranchPositionProcessor;
import fr.inria.diversify.util.LoggerUtils;
import spoon.reflect.cu.SourcePosition;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 06/10/15
 * Time: 10:01
 */
public class BranchInfo {
    protected InputProgram inputProgram;
    protected Map<String, SourcePosition> branchPosition;

    public BranchInfo(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public String smallBranchContaining(SourcePosition sourcePosition) {
        List<String> branches = branchPosition.keySet().stream()
                .filter(branch -> include(branchPosition.get(branch), sourcePosition))
                .collect(Collectors.toList());

        if(branches.isEmpty()) {
            return "";
        }
        int minBranchSize = 10000;
        String minBranch = "";
        for (String branch : branches) {
            int size =  branchPosition.get(branch).getEndLine() - branchPosition.get(branch).getLine();
            if(size < minBranchSize) {
                minBranchSize = size;
                minBranch = branch;
            }
        }
        return minBranch;
    }

    public void intBranch() {
        BranchPositionProcessor processor = new BranchPositionProcessor(inputProgram);
        LoggerUtils.applyProcessor(inputProgram.getFactory(), processor);

        branchPosition = processor.getBranchPosition();
    }

    protected boolean include(SourcePosition oThis, SourcePosition oOther) {
        return oThis.getCompilationUnit().getMainType().getQualifiedName().equals(oOther.getCompilationUnit().getMainType().getQualifiedName())
                && oThis.getLine() <= oOther.getLine()
                && oThis.getEndLine() >= oOther.getEndLine();
    }
}
