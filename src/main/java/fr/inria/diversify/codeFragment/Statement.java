package fr.inria.diversify.codeFragment;


import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtStatement;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.*;

public class Statement extends CodeFragment {

    public Statement(CtStatement stmt) {
        init(stmt);
    }

    public Statement() {}

    //check if this can be replaced by other
    public boolean isReplace(CodeFragment other, boolean varNameMatch) {
        Class<?> cl = codeFragment.getClass();
        Class<?> clOther = other.codeFragment.getClass();

        if (clOther == CtBreakImpl.class || cl == CtBreakImpl.class)
            return false;
        if (clOther == CtContinueImpl.class || cl == CtContinueImpl.class)
            return false;
        if ((clOther == CtLocalVariableImpl.class || cl == CtLocalVariableImpl.class) && cl != clOther)
            return false;
        if ((clOther == CtCaseImpl.class || cl == CtCaseImpl.class))
            return false;
        if ((clOther == CtThrowImpl.class || cl == CtThrowImpl.class) && cl != clOther)
            return false;
        if(containsSuper(codeFragment) || containsSuper(other.codeFragment))
            return false;



        SubStatementVisitor sub = new SubStatementVisitor();
        other.codeFragment.accept(sub);
        if (sub.getStatements().contains(codeFragment))  {
            return false;
        }
        if (!context.isReplace(other.context, varNameMatch))
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

    public String codeFragmentString() {
        String string = codeFragment.toString();
        if(string.trim().endsWith("}"))
            return string;
        if(!string.endsWith(";"))
            string = string+";";

        if(!(codeFragment instanceof CtLocalVariableImpl
               || codeFragment instanceof CtReturnImpl))
            return "{\n"+string+"\n}";
        else
            return string;
    }

    protected boolean containsSuper(CtCodeElement cf) {
        String string = cf.toString();
        return string.contains("super(") || string.contains("super.");
    }


//    protected CtStatement getNextStatement() {
//        if(codeFragment.getParent() instanceof CtBlock)
//            toStatementList()
//    }
}
