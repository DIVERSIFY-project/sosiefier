package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtElement;

import java.util.HashMap;

/**
 * User: Simon
 * Date: 9/23/13
 * Time: 2:23 PM
 */
public abstract class AbstractCodeFragmentProcessor<E extends CtElement> extends AbstractProcessor<E> {

    //We should deprecate this in favor of more rapid ways of fetching the fragments
    protected CodeFragmentList codeFragments;

    protected HashMap<String, CodeFragmentList> fragmentsByClass;


    public AbstractCodeFragmentProcessor() {
        super();
        codeFragments = new CodeFragmentList();
        fragmentsByClass = new HashMap<>();
    }

    protected void addCf(CodeFragment cf) {
        codeFragments.add(cf);

        String[] pos = cf.positionString().split(":");
        if ( !fragmentsByClass.containsKey(pos[0]) )  {
            fragmentsByClass.put(pos[0], new CodeFragmentList());
        }
        fragmentsByClass.get(pos[0]).add(cf);
    }

    public CodeFragmentList getCodeFragments() {
        return codeFragments;
    }

    /**
     * Returns a list of code fragments belonging to a particular class

     * @return
     */
    public HashMap<String, CodeFragmentList> getCodeFragmentsByClass(){
        return fragmentsByClass;
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
