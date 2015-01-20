package fr.inria.diversify.ut.diversification;

import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;
import fr.inria.diversify.ut.FakeCodeFragment;
import spoon.reflect.declaration.CtElement;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;

/**
 * Created by marodrig on 20/01/2015.
 */
public class FakeFragmentProcessor extends AbstractCodeFragmentProcessor<CtElement> {

    public FakeFragmentProcessor() {
        super();
        addCf(new FakeCodeFragment("org.MyClass:1", "ctReturn", "return 0"));
        addCf(new FakeCodeFragment("org.MyOtherClass:10", "ctIf", "if ( int == 0 ) int = 10"));
        addCf(new FakeCodeFragment("org.MyOtherClass:100", "ctFor", "for ( int == 0; int < 10; int++ ) {\n int++ \n}"));
        addCf(new FakeCodeFragment(
                "org.packageFoo.BarClass:235", "ctWhile", "while ( int == 0; int < 10; int++ ) {\n\r int++ \n\r}"));
    }

    @Override
    public void process(CtElement ctElement) {

    }
}
