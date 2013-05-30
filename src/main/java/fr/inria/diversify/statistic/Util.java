package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.List;

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

    public long numberOfDiversification() {
        long nb = 0;
        for (CodeFragment cf1 : codeFragments.getCodeFragments()) {
            for (CodeFragment cf2 : findCandidate(cf1)) {
            nb = nb + getNumberOfVarMapping(cf1,cf2);
            }
        }
        return nb;
    }

    protected List<CodeFragment> findCandidate(CodeFragment cf) {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : codeFragments.getUniqueCodeFragmentList())
            if (cf.isReplace(statement) && !statement.equalString().equals(cf.equalString()))
                list.add(statement);

        return list;
    }

    protected int getNumberOfVarMapping(CodeFragment before, CodeFragment after) {
        int nb = 1;
        for (CtVariableReference<?> variable : after.getInputContext().getLocalVar()) {
            nb = nb * before.getInputContext().allCandidate(variable.getType()).size();
        }
        for (CtFieldAccess<?> variable : after.getInputContext().getField()) {
            nb = nb *  before.getInputContext().allCandidateForFieldAccess(variable.getType()).size();
        }
        return nb;
    }
}
