package fr.inria.diversify.logger.transformationUsed;


import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 08/09/15
 * Time: 11:20
 */
public class StaticDiffBuilder {
    protected Map<String, SourcePosition> branchPosition;
    protected Map<String, Set<String>> testsByBranch;

    public StaticDiffBuilder(Map<String, SourcePosition> branchPosition, Map<String, Set<String>> testsByBranch) {
        this.branchPosition = branchPosition;
        this.testsByBranch = testsByBranch;
    }

    public StaticDiff buildDiff(ASTTransformation transformation, Map<String, Set<String>> branchesUsedByTest) {
        return new StaticDiff(branchDiff(transformation, branchesUsedByTest),
                methodDiff(transformation, branchesUsedByTest));
    }


    public Map<String, Set<String>> methodDiff(ASTTransformation transformation, Map<String, Set<String>> branchesUsedByTest) {
        Map<String, Set<String>> methodDiffs = new HashMap<>();
        Map<String, CtStatement> add = getAddBranches(transformation);
        Map<String, CtStatement> delete = getDeleteBranches(transformation);

//        Query.getElements(transformation.getTransplantationPoint().getCtCodeFragment(), new TypeFilter(CtInvocation.class));

        for(String test : branchesUsedByTest.keySet()) {
            for(String branch : branchesUsedByTest.get(test)) {
                if(add.containsKey(branch)) {
                    if(!methodDiffs.containsKey(test)) {
                        methodDiffs.put(test, new HashSet<>());
                    }
                    methodDiffs.get(test).add(branch);
                }
                if(delete.containsKey(branch)) {
                    if(!methodDiffs.containsKey(test)) {
                        methodDiffs.put(test, new HashSet<>());
                    }
                    methodDiffs.get(test).add(branch);
                }
            }
        }
        return methodDiffs;
    }

    public Map<String, Set<String>> branchDiff(ASTTransformation transformation, Map<String, Set<String>> branchesUsedByTest) {
        Map<String, Set<String>> branchesDiff = new HashMap<>();
        Map<String, CtStatement> add = getAddBranches(transformation);
        add.remove("b");
        Map<String, CtStatement> delete = getDeleteBranches(transformation);
        delete.remove("b");

        if(add.isEmpty() && delete.isEmpty()) {
            return branchesDiff;
        }

        for(String test : branchesUsedByTest.keySet()) {
            for(String branch : branchesUsedByTest.get(test)) {
                if(add.containsKey(branch)) {
                    if(!branchesDiff.containsKey(test)) {
                        branchesDiff.put(test, new HashSet<>());
                    }
                    branchesDiff.get(test).add(branch);
                }
                if(delete.containsKey(branch)) {
                    if(!branchesDiff.containsKey(test)) {
                        branchesDiff.put(test, new HashSet<>());
                    }
                    branchesDiff.get(test).add(branch);
                }
            }
        }
        return branchesDiff;
    }

    protected Map<String, CtStatement> getAddBranches(ASTTransformation transformation) {
        String name = transformation.getName();
        if(name.equals("add")) {
            return getBranches(transformation.getTransplantationPoint().getCtCodeFragment());
        }
        if(name.equals("replace")) {
            ASTReplace replace = (ASTReplace) transformation;
            Map<String, CtStatement> odlBranches = getBranches(transformation.getTransplantationPoint().getCtCodeFragment());
            Map<String, CtStatement> newBranches = getBranches(replace.getTransplant().getCtCodeFragment());
            newBranches.keySet().stream()
                    .forEach(key -> odlBranches.remove(key));
            return newBranches;
        }
        return new HashMap<>();
    }

    protected Map<String, CtStatement> getDeleteBranches(ASTTransformation transformation) {
        String name = transformation.getName();
        if(name.equals("delete")) {
            return getBranches(transformation.getTransplantationPoint().getCtCodeFragment());
        }
        if(name.equals("replace")) {
            ASTReplace replace = (ASTReplace) transformation;
            Map<String, CtStatement> odlBranches = getBranches(transformation.getTransplantationPoint().getCtCodeFragment());
            Map<String, CtStatement> newBranches = getBranches(replace.getTransplant().getCtCodeFragment());
            odlBranches.keySet().stream()
                    .forEach(key -> newBranches.remove(key));
            return odlBranches;
        }
        return new HashMap<>();
    }

    protected Set<CtInvocation> getAddMethodCall(ASTTransformation transformation) {
        Map<String, CtStatement> branches = getAddBranches(transformation);
        return (Set<CtInvocation>) branches.values().stream()
                .flatMap(stmt ->  Query.getElements(stmt, new TypeFilter(CtInvocation.class)).stream())
                .collect(Collectors.toSet());
    }

    protected Set<CtInvocation> getDeleteMethodCall(ASTTransformation transformation) {
        Map<String, CtStatement> branches = getDeleteBranches(transformation);
        return (Set<CtInvocation>) branches.values().stream()
                .flatMap(stmt ->  Query.getElements(stmt, new TypeFilter(CtInvocation.class)).stream())
                .collect(Collectors.toSet());
    }

    protected Map<String, CtStatement> getBranches(CtElement stmt) {
        Map<String, CtStatement> branches = new HashMap<>();

        int count = 0;
        for(Object object : Query.getElements(stmt, new TypeFilter(CtIf.class))) {
            CtIf ctIf = (CtIf) object;
            branches.put("t" + count, ctIf.getElseStatement());
            count++;
            if (ctIf.getElseStatement() != null) {
                branches.put("e" + count, ctIf.getElseStatement());
                count++;
            }
        }

        for(Object object : Query.getElements(stmt, new TypeFilter(CtLoop.class))) {
            CtLoop loop = (CtLoop) object;
            branches.put("l" + count, loop.getBody());
            count++;
        }

        for(Object object : Query.getElements(stmt, new TypeFilter(CtCatch.class))) {
            CtCatch ctCatch = (CtCatch) object;
            branches.put("c" + count, ctCatch.getBody());
            count++;
        }

        if(count == 0) {
            branches.put("b", (CtStatement)stmt);
        }

        return branches;
    }

}
