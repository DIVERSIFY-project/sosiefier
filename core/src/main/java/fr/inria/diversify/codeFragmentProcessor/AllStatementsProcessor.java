package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Statement;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;

/**
 * Created by marodrig on 20/01/2015.
 */
public class AllStatementsProcessor extends AbstractCodeFragmentProcessor<CtStatement> {
    @Override
    public void process(CtStatement ctElement) {
        if ( codeFragments == null ) codeFragments = new CodeFragmentList();

        if ( ctElement instanceof CtStatement) {
            Statement stmt = new Statement((CtStatement) ctElement);
            addCf(stmt);
        }
    }
}
