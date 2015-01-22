package fr.inria.diversify.ut;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;
import fr.inria.diversify.ut.FakeCodeFragment;
import spoon.reflect.declaration.CtElement;

/**
 * Created by marodrig on 12/01/2015.
 */
public class FakeStatementProcessor extends AbstractCodeFragmentProcessor<CtElement> {

    public FakeStatementProcessor() {
        super();
        codeFragments = new CodeFragmentList();
        addCf(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        addCf(new FakeCodeFragment("org.class:2", "CtIf", "if ( int == 0 ) return"));
    }

    @Override
    public void process(CtElement ctElement) {
        //Do Nothing
    }
}
