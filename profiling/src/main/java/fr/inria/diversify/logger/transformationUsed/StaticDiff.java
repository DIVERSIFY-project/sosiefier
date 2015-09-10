package fr.inria.diversify.logger.transformationUsed;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 20/08/15
 * Time: 16:48
 */
public class StaticDiff {
    protected Map<String, SourcePosition> branchPosition;
    Map<String, Set<String>> testsByBranch;

    public StaticDiff(Map<String, SourcePosition> branchPosition, Map<String, Set<String>> testsByBranch) {
        this.branchPosition = branchPosition;
        this.testsByBranch = testsByBranch;
    }

    public boolean isDiff(Transformation trans, boolean transformationCovered) {
        if(trans instanceof  ASTAdd) {
            return isDiff((ASTAdd) trans, transformationCovered);
        }
        if(trans instanceof  ASTDelete) {
            return isDiff((ASTDelete) trans);
        }
        if(trans instanceof  ASTReplace) {
            return isDiff((ASTReplace) trans, transformationCovered);
        }

        return false;
    }

    protected boolean isDiff(ASTDelete trans) {
        CtCodeElement codeFragment = trans.getTransplantationPoint().getCtCodeFragment();

        if(codeFragment instanceof CtInvocation) {
            return true;
        }

        if(codeFragment instanceof CtReturn || codeFragment instanceof CtAssignment) {
            return !Query.getElements(codeFragment, new TypeFilter(CtInvocation.class)).isEmpty();
        }


        for(CtStatement block : getAllStmtBlock(codeFragment)) {
            if(!coveredTests(block.getPosition()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    protected boolean isDiff(ASTReplace trans, boolean used) {
        CtCodeElement transplantationPoint = trans.getTransplantationPoint().getCtCodeFragment();
        CtCodeElement transplant = trans.getTransplant().getCtCodeFragment();
        //ajout d'un nouveau appel de methode

        if(used) {
            Set<String> previousCall = getAllExecutableIn(transplantationPoint);
            if (transplant instanceof CtInvocation) {
                return !previousCall.contains(((CtInvocation) transplant).getExecutable().getSimpleName());

            }
            if (transplant instanceof CtReturn || transplant instanceof CtLoop || transplant instanceof CtAssignment) {
                for (Object call : Query.getElements(transplant, new TypeFilter(CtInvocation.class))) {
                    if (!previousCall.contains(((CtInvocation) call).getExecutable().getSimpleName())) {
                        return true;
                    }
                }
            }
        }

        Set<String> transplantBranches = getAllBranch(transplant);
        Set<String> transplantationPointBranches = getAllBranch(transplantationPoint);
        if(!used) {
            if(!transplantBranches.equals(transplantationPointBranches)) {
                return true;
            }
        } else {
            if(transplantationPointBranches.isEmpty() && !transplantBranches.isEmpty()) {
                return true;
            }
        }

        ////
        //delete d'un appel de methode
        Set<String> newCall;
        if(used) {
            newCall = getAllExecutableIn(transplant);
        } else {
            newCall = new HashSet<>();
        }
        if(transplantationPoint instanceof CtInvocation) {
            return !newCall.contains(((CtInvocation) transplantationPoint).getExecutable().getSimpleName());
        }

        if(transplantationPoint instanceof CtReturn || transplant instanceof CtLoop || transplant instanceof CtAssignment) {
            for(Object call :Query.getElements(transplantationPoint, new TypeFilter(CtInvocation.class))) {
                if(!newCall.contains(((CtInvocation) call).getExecutable().getSimpleName())) {
                    return true;
                }
            }
        }
        return false;
    }


    protected boolean isDiff(ASTAdd trans, boolean transformationCovered) {
        if(transformationCovered) {
            CtCodeElement transplantationPoint = trans.getTransplantationPoint().getCtCodeFragment();
            CtCodeElement transplant = trans.getTransplant().getCtCodeFragment();

            if (!getAllBranch(transplant).isEmpty()) {
                return true;
            }

            //ajout d'un nouveau appel de methode
            Set<String> previousCall = getAllExecutableIn(transplantationPoint);

            for (Object call : Query.getElements(transplant, new TypeFilter(CtInvocation.class))) {
                if (!previousCall.contains(((CtInvocation) call).getExecutable().getSimpleName())) {
                    return true;
                }
            }
        }
        return false;
    }

    protected Set<String> getAllExecutableIn(CtCodeElement codeElement) {
        return (Set<String>)Query.getElements(codeElement, new TypeFilter(CtInvocation.class))
                .stream()
                .map(call -> ((CtInvocation) call).getExecutable().getSimpleName())
                .collect(Collectors.toSet());
    }

    protected String smallBranchContaining(SourcePosition sourcePosition) {
        List<String> branches = branchPosition.keySet().stream()
                .filter(branch -> include(branchPosition.get(branch), sourcePosition))
//                .filter(branch -> testsByBranch.containsKey(branch))
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

    //true if oThis include in oOther
    protected boolean include(SourcePosition oThis, SourcePosition oOther) {
        return oThis.getCompilationUnit().getMainType().getQualifiedName().equals(oOther.getCompilationUnit().getMainType().getQualifiedName())
                && oThis.getLine() <= oOther.getLine()
                && oThis.getEndLine() >= oOther.getEndLine();

    }

    protected Collection<String> coveredTests(SourcePosition sourcePosition) {
        String branch = smallBranchContaining(sourcePosition);

        if(testsByBranch.containsKey(branch)) {
            return testsByBranch.get(branch);
        } else {
            return new LinkedList<>();
        }
    }

    protected Set<String> getAllBranch(CtCodeElement codeFragment) {
        Set<String> branch = new HashSet<>();

        branch.add("if" + Query.getElements(codeFragment, new TypeFilter(CtIf.class)).size());
        branch.add("loop" + Query.getElements(codeFragment, new TypeFilter(CtLoop.class)).size());
        branch.add("catch" + Query.getElements(codeFragment, new TypeFilter(CtCatch.class)).size());

        return branch;
    }

    protected Set<CtStatement> getAllStmtBlock(CtCodeElement codeFragment) {
        Set<CtStatement> blocks = new HashSet<>();
        Query.getElements(codeFragment, new TypeFilter(CtIf.class))
                .stream()
                .forEach(elem -> {
                    blocks.add(((CtIf) elem).getThenStatement());
                    if (((CtIf) elem).getElseStatement() != null) {
                        blocks.add(((CtIf) elem).getElseStatement());
                    }
                });

        Query.getElements(codeFragment, new TypeFilter(CtLoop.class))
                .stream()
                .forEach(elem -> blocks.add(((CtLoop) elem).getBody()));

        Query.getElements(codeFragment, new TypeFilter(CtCatch.class))
                .stream()
                .forEach(elem -> blocks.add(((CtCatch) elem).getBody()));

        return blocks;
    }


}
