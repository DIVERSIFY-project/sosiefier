package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.ast.*;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtVariableReference;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 5/29/13
 * Time: 2:14 PM
 */
public class ASTTransformationSearchSpace {
    protected List<CodeFragment> codeFragments;

    protected boolean subType;

    public ASTTransformationSearchSpace(CodeFragmentList list, ICoverageReport coverageReport) {
        codeFragments = list.stream()
            .filter(fragment -> coverageReport.codeFragmentCoverage(fragment) != 0)
            .collect(Collectors.toList());
    }

    public Map<CodeFragment, Long> getSearchSpace() {
        Map<CodeFragment, Long> searchSpace = new HashMap<>();
        codeFragments.parallelStream()
                .forEach(cf -> {
                    try {
                        long count = nbAllReplaceOrAdd(cf) * 2 + nbAllDelete(cf);
                        searchSpace.put(cf,count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        return searchSpace;
    }

    public Set<ASTTransformation> getAllASTTransformationFor(CodeFragment codeFragment) throws InterruptedException {
        Set<ASTTransformation> transformations = new HashSet<>();

        transformations.addAll(getAllReplace(codeFragment));
        transformations.addAll(getAllAdd(codeFragment));
        transformations.addAll(getAllDelete(codeFragment));

        return transformations;
    }

    public Set<ASTTransformation> getAllReplace(CodeFragment codeFragment) throws InterruptedException {
        Set<ASTTransformation> allReplace = new HashSet<>();

        for (CodeFragment cf2 : findCandidate(codeFragment, false, subType)) {
            for (Map<String, String> varMapping : getAllVarMapping(codeFragment, cf2)) {
                ASTReplace r = new ASTReplace();
                CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
                r.setTransplantationPoint(codeFragment);
                r.setTransplant(new Statement(tmp));
                r.setVarMapping(varMapping);
                allReplace.add(r);
            }
        }

        return allReplace;
    }

    public Set<ASTTransformation> getAllDelete(CodeFragment codeFragment) {
        Set<ASTTransformation> allDelete = new HashSet<>();

        if (!(codeFragment.getCtCodeFragment() instanceof CtReturn)
                && !(codeFragment.getCtCodeFragment() instanceof CtLocalVariable)) {
            ASTDelete delete = new ASTDelete();
            delete.setTransplantationPoint(codeFragment);
            allDelete.add(delete);
        }

        return allDelete;
    }

    public Set<ASTTransformation> getAllAdd(CodeFragment codeFragment) throws InterruptedException {
        Set<ASTTransformation> allAdd = new HashSet<>();

        for (CodeFragment cf2 : findCandidate(codeFragment, false, subType)) {
            for (Map<String,String> varMapping : getAllVarMapping(codeFragment,cf2)) {
                ASTAdd r = new ASTAdd();
                CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
                r.setTransplantationPoint(codeFragment);
                r.setTransplant(new Statement(tmp));
                r.setVarMapping(varMapping);
                allAdd.add(r);
            }
        }

        return allAdd;
    }

    protected List<CodeFragment> findCandidate(CodeFragment cf, boolean varNameMatch, boolean subType) {
        List<CodeFragment> list = new ArrayList<>();
        for (CodeFragment statement : codeFragments) {
            if (cf.isReplaceableBy(statement, varNameMatch, subType) && !statement.equalString().equals(cf.equalString())) {
                list.add(statement);
            }
        }
        return list;
    }

    protected List<Map<String, String>> getAllVarMapping(CodeFragment before, CodeFragment after) {
        List<List<String>> vars = new ArrayList<>();

        for (CtVariableReference<?> variable : after.getInputContext().getVar()) {
            List<String> mapping = new ArrayList<>();
            vars.add(mapping);
            for (Object candidate : before.getInputContext().allCandidate(variable.getType(), subType))
                    mapping.add(variable.toString()+"==="+candidate.toString() );

        }
        return computeVarMapping(vars);
    }

    public long nbAllReplaceOrAdd(CodeFragment codeFragment) throws InterruptedException {
        long count = 0;
        for (CodeFragment cf2 : findCandidate(codeFragment, false, subType)) {
            count += nbAllVarMapping(codeFragment, cf2);
        }

        return count;
    }

    public int nbAllDelete(CodeFragment codeFragment) {

        if (!(codeFragment.getCtCodeFragment() instanceof CtReturn)
                && !(codeFragment.getCtCodeFragment() instanceof CtLocalVariable)) {
           return 1;
        } else {
            return 0;
        }
    }

    protected long nbAllVarMapping(CodeFragment before, CodeFragment after) {
        long nb = 1;
        for (CtVariableReference<?> variable : after.getInputContext().getVar()) {
            nb = nb * before.getInputContext().allCandidate(variable.getType(), subType).size();
        }
        return nb;
    }

    protected long d_nbAllVarMapping(CodeFragment before, CodeFragment after) {
        long nb = 1;
        for (CtVariableReference<?> variable : after.getInputContext().getVar()) {
            Log.debug("{}: {} = {} * {}",variable,  (nb * before.getInputContext().allCandidate(variable.getType(), subType).size()), nb , before.getInputContext().allCandidate(variable.getType(), subType).size());
            nb = nb * before.getInputContext().allCandidate(variable.getType(), subType).size();
        }
        return nb;
    }

    protected List<Map<String, String>> computeVarMapping(List<List<String>> vars) {
        List<Map<String, String>> map = new ArrayList<>();
        if(vars.isEmpty())
            return map;
        if(vars.size() == 1) {
            for(String var : vars.get(0)) {
                String[] mapping = var.split("===");
                if(mapping.length == 2) {
                    Map<String,String> tmp = new HashMap<>();
                    tmp.put(mapping[0],mapping[1]);
                    map.add(tmp);
                }
            }
        }
        else {
            List<String> currentVar = vars.get(0);
            vars.remove(currentVar);
            List<Map<String, String>> currentMapping = computeVarMapping(vars);
            for(String var : currentVar) {
                String[] mapping = var.split("===");
                for (Map<String,String> m : currentMapping) {
                    try {
                        HashMap<String, String> tmp = new HashMap<>(m);
                        if(mapping.length == 0)
                            tmp.put("","");
                        else
                            tmp.put(mapping[0],mapping[1]);
                        map.add(tmp);
                    } catch (Exception e) {}

                }
            }
            return map;
        }
        return map;
    }

    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }
}
