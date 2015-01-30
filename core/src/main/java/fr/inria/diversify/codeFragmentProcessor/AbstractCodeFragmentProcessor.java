package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtElement;

/**
 * User: Simon
 * Date: 9/23/13
 * Time: 2:23 PM
 */
public abstract class AbstractCodeFragmentProcessor<E extends CtElement> extends AbstractProcessor<E> {
    protected CodeFragmentList codeFragments;


    public AbstractCodeFragmentProcessor() {
        super();
        codeFragments = new CodeFragmentList();
    }

    protected void addCf(CodeFragment cf) {
        codeFragments.add(cf);
    }

    public CodeFragmentList getCodeFragments() {
        return codeFragments;
    }


    /**
     * Listener to know the advance in the process.
     */
    private ProcessListener processListener;

    public ProcessListener getProcessListener() {
        return processListener;
    }

    public void setProcessListener(ProcessListener processListener) {
        this.processListener = processListener;
    }
}
