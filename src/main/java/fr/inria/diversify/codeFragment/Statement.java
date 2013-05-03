package fr.inria.diversify.codeFragment;


import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import spoon.reflect.code.CtStatement;
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

        if(clOther ==  CtBreakImpl.class || cl == CtBreakImpl.class)
            return false;
        if(clOther ==  CtContinueImpl.class || cl == CtContinueImpl.class)
            return false;
        if((clOther ==  CtLocalVariableImpl.class || cl == CtLocalVariableImpl.class) && cl != clOther)
            return false;
        if(codeFragmentString().contains("super("))
            return false;
        if((clOther ==  CtCaseImpl.class || cl == CtCaseImpl.class) && cl != clOther)
            return false;
        if((clOther ==  CtThrowImpl.class || cl == CtThrowImpl.class) && cl != clOther)
            return false;
        SubStatementVisitor sub = new SubStatementVisitor()  ;
        other.codeFragment.getParent().accept(sub);
        if(sub.getStatements().contains(codeFragment))
            return false;

        return getInputContext().isInclude(other.getInputContext()) && getOuputContext().equals(other.getOuputContext());
    }



}
