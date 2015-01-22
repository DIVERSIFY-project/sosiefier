package fr.inria.diversify.testMutation;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;

/**
 * Created by marodrig on 25/07/2014.
 */
public class AssertionWrapperProcessor extends AbstractProcessor {

    int i = 0;

    private int exceptionID = 0;

    @Override
    public boolean isToBeProcessed(CtElement candidate) {

        if ( candidate instanceof CtInvocation) {
            i++;
            //System.out.println(i);
            String signature = "";
            try {
                signature = candidate.getSignature();
            } catch (Exception e) {
                //e.printStackTrace();
                return false;
            }
            return signature.contains("assert");
        }
        return false;
    }

    @Override
    public void process(CtElement ctElement) {
        SourcePosition sp = ctElement.getPosition();
        CompilationUnit cu = sp.getCompilationUnit();
        exceptionID++;
        String exceptionName = "e" + exceptionID;
        cu.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart() - 1, " try {", 0));

        cu.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd() + 2, " } catch (AssertionError "
                + exceptionName + ") { /*Fail silently*/ }", 0));
    }
}
