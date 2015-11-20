package fr.inria.diversify.ut;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.ut.diversification.FakeFragmentProcessor;

import java.util.HashMap;

/**
 * Created by marodrig on 12/01/2015.
 */
public class MockInputProgram extends InputProgram {

    /**
     * Fake the list of all the code fragments extracted by Spoon of the input program

    public synchronized CodeFragmentList getCodeFragments() {
        CodeFragmentList cf = new CodeFragmentList();
        cf.add(new FakeCodeFragment("org.MyClass:1", "ctReturn", "return 0"));
        cf.add(new FakeCodeFragment("org.MyOtherClass:10", "ctIf", "if ( int == 0 ) int = 10"));
        cf.add(new FakeCodeFragment("org.MyOtherClass:100", "ctFor", "for ( int == 0; int < 10; int++ ) { int++ }"));
        return cf;
    }*/

    @Override
    public void processCodeFragments() {
        if ( codeFragments == null ) codeFragments = new CodeFragmentList();
        if ( codeFragmentsByClass == null ) codeFragmentsByClass = new HashMap<>();
        if ( codeFragments.size() == 0 ) {
            FakeFragmentProcessor f = new FakeFragmentProcessor();
            for( CodeFragment cf : f.getCodeFragments() ) codeFragments.add(cf);
            codeFragmentsByClass.putAll(f.getCodeFragmentsByClass());
        }
    }
}
