package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtStatement;

public class StatementProcessor extends AbstractCodeFragmentProcessor<CtStatement> {
    private ValidStatementVisitor valid;

    //int stmtCount = 0;

    public void process(CtStatement element) {
        try {
            if (isValidStatement(element)) {
                Statement stmt = new Statement(element);
                addCf(stmt);
            }
        } catch (Exception e) {
            Log.debug("error in StatementProcessor.process with the statement: " + element, e);
        }
    }


    protected boolean isValidStatement(CtStatement element) {
        valid = new ValidStatementVisitor(element, false);
        element.getParent().accept(valid);
        return !valid.inExpression(element) && valid.isValid();
    }

}

