package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.transformation.Add;
import fr.inria.diversify.transformation.Delete;
import fr.inria.diversify.transformation.Replace;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.Factory;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtVariableReference;

import java.math.BigInteger;
import java.util.*;

/**
 * User: Simon
 * Date: 5/29/13
 * Time: 2:14 PM
 */
public class Util {
    protected CodeFragmentList codeFragments;


    public Util(CodeFragmentList list) {
        codeFragments = list;
    }

    public long numberOfNotDiversification() {
        long nb = 0;
        for (CodeFragment cf1 : codeFragments.getCodeFragments()) {
            if (findCandidate(cf1).isEmpty()) {
               nb++;
            }
        }
        return nb;
    }

    public BigInteger numberOfDiversification() {
        BigInteger nb = new BigInteger("0");
        for (CodeFragment cf1 : codeFragments.getCodeFragments()) {
            for (CodeFragment cf2 : findCandidate(cf1)) {
                nb = nb.add(getNumberOfVarMapping(cf1,cf2));
            }
        }
        return nb;
    }

    public List<CodeFragment> findCandidate(CodeFragment cf) {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : codeFragments.getUniqueCodeFragmentList())
            if (cf.isReplace(statement) && !statement.equalString().equals(cf.equalString()))
                list.add(statement);

        return list;
    }

    protected BigInteger getNumberOfVarMapping(CodeFragment before, CodeFragment after) {
        BigInteger nb = new BigInteger("1");

        for (CtVariableReference<?> variable : after.getInputContext().getLocalVar()) {
            BigInteger tmp = new BigInteger(before.getInputContext().allCandidate(variable.getType()).size()+"");
            nb = nb.multiply(tmp);
        }
        for (CtFieldAccess<?> variable : after.getInputContext().getField()) {
            BigInteger tmp = new BigInteger(before.getInputContext().allCandidateForFieldAccess(variable.getType()).size()+"");
            nb = nb.multiply(tmp);
        }
        return nb;
    }


    public List<Transformation> getAllReplace() {
        List<Transformation> allReplace = new ArrayList<Transformation>();

        for (CodeFragment cf1 : codeFragments.getCodeFragments()) {
            for (CodeFragment cf2 : findCandidate(cf1)) {
                for (Map<String,String> varMapping : getAllVarMapping(cf1,cf2)) {
                    Replace r = new Replace();
                    CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
                    r.addCodeFragmentToReplace(cf1,new Statement(tmp));
                    r.addVarMapping(cf1,varMapping);
                    allReplace.add(r);
                }
            }
        }

        return allReplace;
    }

    public List<Transformation> getAllDelete() {
        List<Transformation> allReplace = new ArrayList<Transformation>();

        for (CodeFragment cf1 : codeFragments.getCodeFragments()) {
                    Delete r = new Delete();
                    r.addCodeFragmentToTransform(cf1);
                    allReplace.add(r);
        }
        return allReplace;
    }

    public List<Transformation> getAllAdd() {
        List<Transformation> allReplace = new ArrayList<Transformation>();

        for (CodeFragment cf1 : codeFragments.getCodeFragments()) {
            for (CodeFragment cf2 : findCandidate(cf1)) {
                for (Map<String,String> varMapping : getAllVarMapping(cf1,cf2)) {
                    Add r = new Add();
                    CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
                    r.addCodeFragmentToAdd(cf1,new Statement(tmp));
                    r.addVarMapping(cf1,varMapping);
                    allReplace.add(r);
                }
            }
        }
        return allReplace;
    }

    protected List<Map<String, String>> getAllVarMapping(CodeFragment before, CodeFragment after) {
        List<List<String>> vars = new ArrayList<List<String>>();

        for (CtVariableReference<?> variable : after.getInputContext().getLocalVar()) {
            List<String> mapping = new ArrayList<String>();
            vars.add(mapping);
            for (Object candidate : before.getInputContext().allCandidate(variable.getType()))
                    mapping.add(variable.toString()+"==="+candidate.toString() );

        }
        for (CtFieldAccess<?> variable : after.getInputContext().getField()) {
            List<String> mapping = new ArrayList<String>();
            vars.add(mapping);
            for (Object candidate : before.getInputContext().allCandidateForFieldAccess(variable.getType()))
                mapping.add(variable.getVariable().toString()+"==="+candidate.toString() );

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
                    HashMap<String, String> tmp = new HashMap<String, String>(m);
                    if(mapping.length == 0)
                        tmp.put("","");
                    else
                        tmp.put(mapping[0],mapping[1]);
                    map.add(tmp);
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

//    protected Map<?, Long> numberOfDiversificationFor(Map<?, List<CodeFragment>> map) {
//        Map<Object, Long> result =  new HashMap<Object, Long>();
//        for (Object key : map.keySet()) {
//            Long nb = Long.valueOf(0);
//            for (CodeFragment cf1 : map.get(key)) {
//                for (CodeFragment cf2 : findCandidate(cf1)) {
//                    nb = nb + getNumberOfVarMapping(cf1,cf2);
//                }
//            }
//            result.put(key,nb);
//        }
//        return result;
//    }
}
