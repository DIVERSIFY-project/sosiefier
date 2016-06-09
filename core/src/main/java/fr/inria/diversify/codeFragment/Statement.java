package fr.inria.diversify.codeFragment;


import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.*;

public class Statement extends CodeFragment<CtStatement> {

    public Statement(CtStatement stmt) {
        init(stmt);
    }

    public Statement() {}

    //validate if this can be replaced by other
    public boolean isReplaceableBy(CodeFragment other, boolean varNameMatch, boolean subType) {
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

        if (!context.isReplaceableBy(other.context, varNameMatch, subType)) {
            return false;
        }

        if((other.codeFragment instanceof CtReturn || other.codeFragment instanceof CtThrow)
            && !deadCode()) {
            return false;
        }

        //validate for return
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

    protected boolean deadCode() {
        int position = 0;
        CtBlock block = codeFragment.getParent(CtBlock.class);
        if(block.getStatements() == null) {
            return true;
        }
        for(Object stmt: block.getStatements()) {
            position++;
            if(codeFragment == stmt) {
                break;
            }
        }

        return  position == block.getStatements().size();
    }

    protected boolean containsSuper(CtElement cf) {
        try {
            String string = cf.toString();
            return string.contains("super(") || string.contains("super.");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public Statement clone() {
        return new Statement(copyElem(codeFragment));
    }
}
