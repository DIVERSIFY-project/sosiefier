package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.reference.CtVariableReference;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 25/05/16
 * Time: 14:31
 */
public class HashCodeQuery extends TransformationQuery {
    protected List<Transformation> hashCodeTransformations;
    protected boolean subType;
    protected int index;

    public HashCodeQuery(InputProgram inputProgram) {
        super(inputProgram);
        hashCodeTransformations = allHashCodeTransformation(true);
        Collections.shuffle(hashCodeTransformations);
    }

    @Override
    public Transformation query() throws QueryException {
        return hashCodeTransformations.get(index++);
    }

    public boolean hasNextTransformation() {
        return index < hashCodeTransformations.size();
    }

    protected List<Transformation> allHashCodeTransformation(boolean withCoverage) {
        List<Transformation> hashCodeTransformation = new ArrayList<>();

        for(CodeFragment stmt : allCodeFragmentInHasCode(withCoverage)) {
            for(CodeFragment stmt2: findCandidate(stmt)) {
                for(Map<String, String> varMapping : getAllVarMapping(stmt, stmt2)) {
                    ASTAdd add = new ASTAdd();
                    add.setTransplantationPoint(stmt);
                    add.setTransplant(stmt2);
                    add.setVarMapping(varMapping);
                    hashCodeTransformation.add(add);

                    ASTReplace replace = new ASTReplace();
                    replace.setTransplantationPoint(stmt);
                    replace.setTransplant(stmt2);
                    replace.setVarMapping(varMapping);
                    hashCodeTransformation.add(replace);
                }
            }
            if(!(stmt.getCtCodeFragment() instanceof CtReturn)
                    && !(stmt.getCtCodeFragment() instanceof CtLocalVariable)) {
                ASTDelete delete = new ASTDelete();
                delete.setTransplantationPoint(stmt);
                hashCodeTransformation.add(delete);
            }
        }
        return hashCodeTransformation;
    }

    protected List<CodeFragment> allCodeFragmentInHasCode(boolean withCoverage) {
        return getInputProgram().getCodeFragments().stream()
                .filter(stmt -> !withCoverage || getInputProgram().getCoverageReport().codeFragmentCoverage(stmt) != 0)
                .filter(stmt -> {
                    CtMethod parent = stmt.getCtCodeFragment().getParent(CtMethod.class);
                    return parent != null && parent.getSimpleName().equals("hashCode");
                })
                .collect(Collectors.toList());
    }

    protected List<CodeFragment> findCandidate(CodeFragment cf) {
        List<CodeFragment> list = new ArrayList<>();
        for (CodeFragment statement : getInputProgram().getCodeFragments()) {
            if (cf.isReplaceableBy(statement, false, subType) && !statement.equalString().equals(cf.equalString())) {
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

}
