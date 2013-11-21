package fr.inria.diversify.statistic;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import spoon.reflect.Factory;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 9/13/13
 * Time: 5:03 PM
 */
public class DiversificationMax extends Thread {


    protected CodeFragmentList codeFragments;
    protected CodeFragment codeFragment;

    public DiversificationMax(CodeFragment fragment, CodeFragmentList codeFragments) {
        codeFragment = fragment;
        this.codeFragments = codeFragments;
    }

    public void run() {

    }

    public List<CodeFragment> findCandidate(CodeFragment cf) {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : codeFragments.getUniqueCodeFragmentList())
            if (cf.isReplace(statement, false) && !statement.equalString().equals(cf.equalString()))
                list.add(statement);

        return list;
    }

//    public List<ASTTransformation> getAllReplace() {
//        List<ASTTransformation> allReplace = new ArrayList<ASTTransformation>();
//
//        for (CodeFragment cf1 : codeFragments) {
//            for (CodeFragment cf2 : findCandidate(cf1)) {
//                for (Map<String,String> varMapping : getAllVarMapping(cf1,cf2)) {
//                    ASTReplace r = new ASTReplace();
//                    CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
//                    r.addCodeFragmentToReplace(cf1,new Statement(tmp));
//                    r.addVarMapping(cf1,varMapping);
//                    allReplace.add(r);
//                }
//            }
//        }
//
//        return allReplace;
//    }
//
//    public List<ASTTransformation> getAllDelete() {
//        List<ASTTransformation> allReplace = new ArrayList<ASTTransformation>();
//
//        for (CodeFragment cf1 : codeFragments) {
//            ASTDelete r = new ASTDelete();
//            r.addCodeFragmentToTransform(cf1);
//            allReplace.add(r);
//        }
//        return allReplace;
//    }
//
//    public List<ASTTransformation> getAllAdd() {
//        List<ASTTransformation> allReplace = new ArrayList<ASTTransformation>();
//
//        for (CodeFragment cf1 : codeFragments) {
//            for (CodeFragment cf2 : findCandidate(cf1)) {
//                for (Map<String,String> varMapping : getAllVarMapping(cf1,cf2)) {
//                    ASTAdd r = new ASTAdd();
//                    CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
//                    r.addCodeFragmentToAdd(cf1,new Statement(tmp));
//                    r.addVarMapping(cf1,varMapping);
//                    allReplace.add(r);
//                }
//            }
//        }
//        return allReplace;
//    }

    protected List<Map<String, String>> getAllVarMapping(CodeFragment before, CodeFragment after) {
        List<List<String>> vars = new ArrayList<List<String>>();

        for (CtVariableReference<?> variable : after.getInputContext().getVar()) {
            List<String> mapping = new ArrayList<String>();
            vars.add(mapping);
            for (Object candidate : before.getInputContext().allCandidate(variable.getType()))
                mapping.add(variable.toString()+"==="+candidate.toString() );

        }

        return computeVarMapping(vars);
    }

    protected List<Map<String, String>> computeVarMapping(List<List<String>> vars) {
        List<Map<String, String>> map = new ArrayList<Map<String, String>>();
        if(vars.isEmpty())
            return map;
        if(vars.size() == 1) {
            for(String var : vars.get(0)) {
                String[] mapping = var.split("===");
                if(mapping.length == 2) {
                    Map<String,String> tmp = new HashMap<String, String>();
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
                        HashMap<String, String> tmp = new HashMap<String, String>(m);
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
