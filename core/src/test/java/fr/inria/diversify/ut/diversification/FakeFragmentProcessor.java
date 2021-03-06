package fr.inria.diversify.ut.diversification;

import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;
import fr.inria.diversify.ut.FakeCodeFragment;
import spoon.reflect.declaration.CtElement;

/**
 * Created by marodrig on 20/01/2015.
 */
public class FakeFragmentProcessor extends AbstractCodeFragmentProcessor<CtElement> {

    public FakeFragmentProcessor() {
        super();
        addCf(new FakeCodeFragment("org.MyClass:1", "CtReturn", "return 0"));
        addCf(new FakeCodeFragment("org.MyOtherClass:10", "CtIf", "if ( int == 0 ) int = 10"));
        addCf(new FakeCodeFragment("org.MyOtherClass:100", "CtFor", "for ( int == 0; int < 10; int++ ) {\n int++ \n}"));
        addCf(new FakeCodeFragment(
                "org.packageFoo.BarClass:235", "CtWhile", "while ( int == 0; int < 10; int++ ) {\n\r int++ \n\r}"));
    }

    @Override
    public void process(CtElement ctElement) {

    }
}
