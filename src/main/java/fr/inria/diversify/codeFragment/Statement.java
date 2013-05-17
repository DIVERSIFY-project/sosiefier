package fr.inria.diversify.codeFragment;


import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.*;


public class Statement extends CodeFragment {

    public Statement(CtStatement stmt) {
        this.codeFragment = stmt;
        init();
    }


    //check if this can be replaced by other
    public boolean isReplace(CodeFragment other) {
        Class<?> cl = codeFragment.getClass();
        Class<?> clOther = other.codeFragment.getClass();

        if (clOther == CtBreakImpl.class || cl == CtBreakImpl.class)
            return false;
        if (clOther == CtContinueImpl.class || cl == CtContinueImpl.class)
            return false;
        if ((clOther == CtLocalVariableImpl.class || cl == CtLocalVariableImpl.class) && cl != clOther)
            return false;
        if (codeFragmentString().contains("super(") || codeFragmentString().contains("super."))
            return false;
        if (other.codeFragmentString().contains("super(") || other.codeFragmentString().contains("super."))
            return false;
        if ((clOther == CtCaseImpl.class || cl == CtCaseImpl.class))
            return false;
        if ((clOther == CtThrowImpl.class || cl == CtThrowImpl.class) && cl != clOther)
            return false;
        SubStatementVisitor sub = new SubStatementVisitor();
        other.codeFragment.getParent().accept(sub);
        if (sub.getStatements().contains(codeFragment))
            return false;


        if (!(getInputContext().isInclude(other.getInputContext()) && getOutputContext().equals(other.getOutputContext())))
            return false;
        //check for return


        CtTypeReference t1 = this.hasReturn();
        CtTypeReference t2 = other.hasReturn();
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null)
            return false;
        return t1.equals(t2);

    }



}
