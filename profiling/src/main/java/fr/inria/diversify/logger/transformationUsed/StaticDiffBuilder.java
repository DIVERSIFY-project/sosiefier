package fr.inria.diversify.logger.transformationUsed;


import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.*;
import fr.inria.diversify.logger.Comparator;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 08/09/15
 * Time: 11:20
 */
public class StaticDiffBuilder implements Comparator {

    public StaticDiff buildDiff(ASTTransformation transformation, Map<String, Set<String>> branchesUsedByTest) {
        Set<String> branchesUsed = branchesUsedByTest.values().stream()
                .flatMap(branches -> branches.stream())
                .collect(Collectors.toSet());
        branchesUsed.add(transformation.methodLocationName() + ".b");
        return new StaticDiff(branchDiff(transformation, branchesUsed),
                methodDiff(transformation, branchesUsed));
    }


    public Map<String, Set<String>> methodDiff(ASTTransformation transformation, Set<String> branchesUsed) {
        Map<String, Set<String>> methodDiffs = new HashMap<>();
        Map<String, Set<String>> add = getAddMethodCall(transformation);
        Map<String,Set<String>> delete = getDeleteMethodCall(transformation);
        Set<String> newAddExecuted = new HashSet<>();

        for(String branchFullName : branchesUsed) {
            String branch = branchFullName.split("\\.")[1];
            if(add.containsKey(branch)) {
                newAddExecuted.addAll(add.get(branch));
                if(delete.containsKey(branch)) {
                    add.get(branch).remove(delete.get(branch));
                }
                if(!add.get(branch).isEmpty()) {
                    if (!methodDiffs.containsKey("add")) {
                        methodDiffs.put("add", new HashSet<>());
                    }
                    methodDiffs.get("add").addAll(add.get(branch));
                }
            }
        }

        for(String branch : delete.keySet()) {
            delete.get(branch).removeAll(newAddExecuted);
           if(!delete.get(branch).isEmpty()) {
               if(!methodDiffs.containsKey("delete")) {
                   methodDiffs.put("delete", new HashSet<>());
               }
               methodDiffs.get("delete").addAll(delete.get(branch));
           }
        }
        return methodDiffs;
    }

    public Map<String, Set<String>> branchDiff(ASTTransformation transformation, Set<String> branchesUsed) {
        Map<String, Set<String>> branchesDiff = new HashMap<>();
        Map<String, CtStatement> add = getAddBranches(transformation, false);
        Map<String, CtStatement> delete = getDeleteBranches(transformation, false);
        Set<String> newBranchUsed = new HashSet<>();

        if(add.isEmpty() && delete.isEmpty()) {
            return branchesDiff;
        }

        String methodFullName = transformation.classLocationName() + "." + transformation.methodLocationName();
        for(String branchFullName : branchesUsed) {
            String branch = branchFullName.split("\\.")[1];
            if(add.containsKey(branch) && !delete.containsKey(branch)) {
                if(!branchesDiff.containsKey("add") ) {
                    branchesDiff.put("add", new HashSet<>());
                }
                newBranchUsed.add(branch);
                branchesDiff.get("add").add(methodFullName + "." + branch);
            }
        }
        for(String branch : delete.keySet()) {
            if(!newBranchUsed.contains(branch)) {
                if(!branchesDiff.containsKey("delete") ) {
                    branchesDiff.put("delete", new HashSet<>());
                }
                branchesDiff.get("delete").add(methodFullName + "." + branch);
            }
        }

        return branchesDiff;
    }

    protected Map<String, CtStatement> getAddBranches(ASTTransformation transformation, boolean withBody) {
        String name = transformation.getName();
        if(name.equals("add")) {
            return getBranches(transformation.getTransplantationPoint().getCtCodeFragment(), withBody);
        }
        if(name.equals("replace")) {
            ASTReplace replace = (ASTReplace) transformation;
            Map<String, CtStatement> odlBranches = getBranches(transformation.getTransplantationPoint().getCtCodeFragment(), withBody);
            Map<String, CtStatement> newBranches = getBranches(replace.getTransplant().getCtCodeFragment(), withBody);
            newBranches.keySet().stream()
                    .forEach(key -> odlBranches.remove(key));
            return newBranches;
        }
        return new HashMap<>();
    }

    protected Map<String, CtStatement> getDeleteBranches(ASTTransformation transformation, boolean withBody) {
        String name = transformation.getName();
        if(name.equals("delete")) {
            return getBranches(transformation.getTransplantationPoint().getCtCodeFragment(), withBody);
        }
        if(name.equals("replace")) {
            ASTReplace replace = (ASTReplace) transformation;
            Map<String, CtStatement> odlBranches = getBranches(transformation.getTransplantationPoint().getCtCodeFragment(), withBody);
            Map<String, CtStatement> newBranches = getBranches(replace.getTransplant().getCtCodeFragment(), withBody);
            odlBranches.keySet().stream()
                    .forEach(key -> newBranches.remove(key));
            return odlBranches;
        }
        return new HashMap<>();
    }

    protected Map<String, Set<String>> getAddMethodCall(ASTTransformation transformation) {
        Map<String, CtStatement> branches = getAddBranches(transformation, true);
        Map<String, Set<String>> methodsByBranch = new HashMap<>();
        for(String key : branches.keySet()) {
            methodsByBranch.put(key,
                    (Set<String>) Query.getElements(branches.get(key), new TypeFilter(CtInvocation.class)).stream()
                            .map(invocation -> ((CtInvocation) invocation).getExecutable().toString())
                            .collect(Collectors.toSet()));
        }
        return methodsByBranch;
    }

    protected Map<String, Set<String>> getDeleteMethodCall(ASTTransformation transformation) {
        Map<String, CtStatement> branches = getDeleteBranches(transformation, true);
        Map<String, Set<String>> methodsByBranch = new HashMap<>();
        for(String key : branches.keySet()) {
            methodsByBranch.put(key,
                    (Set<String>) Query.getElements(branches.get(key), new TypeFilter(CtInvocation.class)).stream()
                            .map(invocation -> ((CtInvocation) invocation).getExecutable().toString())
                            .collect(Collectors.toSet()));
        }
        return methodsByBranch;
    }

    protected Map<String, CtStatement> getBranches(CtElement stmt, boolean withBody) {
        Map<String, CtStatement> branches = new HashMap<>();

        int count = 0;
        for(Object object : Query.getElements(stmt, new TypeFilter(CtIf.class))) {
            CtIf ctIf = (CtIf) object;
            branches.put("t" + count, ctIf.getThenStatement());
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

        if(withBody) {
            branches.put("b", (CtStatement)stmt);
        }

        return branches;
    }

    @Override
    public void init(InputProgram originalInputProgram, AbstractBuilder originalBuilder) throws Exception {

    }

    @Override
    public Diff compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception {
        if(transformation == null) {
            return getEmptyDiff();
        }
        TransformationUsedReader tu = new TransformationUsedReader(sosieLogDir);
        return buildDiff((ASTTransformation) transformation, tu.load());
    }

    @Override
    public Collection<String> selectTest(SourcePosition position) {
        return new ArrayList<>();
    }

    @Override
    public Diff getEmptyDiff() {
        return new StaticDiff();
    }
}
