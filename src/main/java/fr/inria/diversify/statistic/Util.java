package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.reference.CtVariableReference;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//            nb = nb * before.getInputContext().allCandidate(variable.getType()).size();
            BigInteger tmp = new BigInteger(before.getInputContext().allCandidate(variable.getType()).size()+"");
            nb = nb.multiply(tmp);
        }
        for (CtFieldAccess<?> variable : after.getInputContext().getField()) {
            BigInteger tmp = new BigInteger(before.getInputContext().allCandidateForFieldAccess(variable.getType()).size()+"");
            nb = nb.multiply(tmp);
        }
        return nb;
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
