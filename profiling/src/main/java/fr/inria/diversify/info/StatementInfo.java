package fr.inria.diversify.info;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.runner.InputProgram;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;

import java.util.*;

/**
 * User: Simon
 * Date: 14/08/15
 * Time: 14:30
 */
public class StatementInfo {
    protected InputProgram inputProgram;

    public StatementInfo(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public boolean isTransformable(CodeFragment stmt) {
        return delete(stmt) || replaceOrAdd(stmt);
    }

    public boolean replaceOrAdd(CodeFragment stmt) {
        String cfString = stmt.equalString();
        for(CodeFragment codeFragment : getAllUniqueCodeFragments()) {
            if(stmt.isReplaceableBy(codeFragment, false, true) && !codeFragment.equalString().equals(cfString)) {
                return true;
            }
        }
        return false;
    }

    public boolean delete(CodeFragment stmt) {
        return !(stmt.getCtCodeFragment() instanceof CtReturn
                    || stmt.getCtCodeFragment() instanceof CtLocalVariable);

    }

    protected Collection<CodeFragment> getAllUniqueCodeFragments() {
        return getInputProgram().getCodeFragments().getUniqueCodeFragmentList();
    }

    public InputProgram getInputProgram() {
        return inputProgram;
    }
}
