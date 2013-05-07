package fr.inria.diversify.codeFragment;

import spoon.reflect.reference.CtTypeReference;

import java.util.*;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 10:08 AM
 */
public class CodeFragmentList {
    protected List<CodeFragment> codeFragments;

    protected Map<InputContext,Integer> uniqueInputContext;
    protected Map<CtTypeReference<?>,Integer> uniqueOutputContext;
    protected Map<Context,Integer> uniqueContext;
    protected Map<Integer,Integer> uniqueCodeFragment;
    protected Map<Integer,CodeFragment> idToCodeFragment;

    public CodeFragmentList(List<CodeFragment> codeFragments) {
        init();
        this.codeFragments = codeFragments;
        for (CodeFragment statement : codeFragments)
            add(statement);
    }

    public CodeFragmentList() {
        init();
    }

    protected void init() {
        codeFragments = new LinkedList<CodeFragment>();
        uniqueInputContext = new HashMap<InputContext, Integer>();
        uniqueOutputContext = new HashMap<CtTypeReference<?>, Integer>();
        uniqueContext = new HashMap<Context, Integer>();
        uniqueCodeFragment = new HashMap<Integer, Integer>();
        idToCodeFragment = new HashMap<Integer,CodeFragment>();
    }

    public void add(CodeFragment stmt) {
        try {
            codeFragments.add(stmt);
            addUniqueInputContext(stmt.getInputContext());
            addUniqueOutputContext(stmt.getOuputContext());
            addUniqueContext(stmt.getContext());
            addUniqueStatement(stmt);
        } catch (Exception e) {
            System.err.println("erreur la");
        }

    }



    protected void addUniqueStatement(CodeFragment stmt) {
        boolean same = false;
        for (Integer otherStmtId: uniqueCodeFragment.keySet()) {
            if(otherStmtId == stmt.id()) {
                same = true;
                uniqueCodeFragment.put(otherStmtId, uniqueCodeFragment.get(otherStmtId)+1);
                break;
            }
        }
        if(!same) {
            uniqueCodeFragment.put(stmt.id(),1);
            idToCodeFragment.put(stmt.id(), stmt);
        }
    }

    protected void addUniqueContext(Context context) {
        boolean same = false;
        for (Context othercontext: uniqueContext.keySet()) {
            if(context.equals(othercontext)) {
                same = true;
                uniqueContext.put(othercontext, uniqueContext.get(othercontext)+1);
                break;
            }
        }
        if(!same)
            uniqueContext.put(context,1);
    }

    protected void addUniqueInputContext(InputContext otherInputContext) {
        boolean same = false;
        for (InputContext inputContext: uniqueInputContext.keySet()) {
            if(inputContext.equals(otherInputContext)) {
                uniqueInputContext.put(inputContext, uniqueInputContext.get(inputContext)+1);
                same = true;
                break;
            }
        }
        if(!same)
            uniqueInputContext.put(otherInputContext,1);
    }

    protected void addUniqueOutputContext(CtTypeReference<?> output){
        boolean same = false;
        for (CtTypeReference<?> otherOuput: uniqueOutputContext.keySet()) {
            if(output.equals(otherOuput)) {
                uniqueOutputContext.put(otherOuput, uniqueOutputContext.get(otherOuput)+1);
                same = true;
                break;
            }
        }
        if(!same)
            uniqueOutputContext.put(output,1);
    }

    public int size() {
        return codeFragments.size();
    }
    public Map<Context, Integer> getUniqueContext() {
        return uniqueContext;
    }
    public Map<InputContext, Integer> getUniqueInputContext() {
        return uniqueInputContext;
    }
    public Map<CtTypeReference<?>, Integer> getUniqueOutputContext() {
        return uniqueOutputContext;
    }
    public Map<Integer, Integer> getUniqueCodeFragments() {
        return uniqueCodeFragment;
    }

    public Collection<CodeFragment> getUniqueCodeFragmentList() {
        return idToCodeFragment.values();
    }

    public List<CodeFragment> getCodeFragments() {
        return  codeFragments;
    }
}
