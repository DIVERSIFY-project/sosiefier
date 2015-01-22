package fr.inria.diversify.codeFragment;

import spoon.reflect.declaration.CtSimpleType;

import java.util.*;

/**
 * User: Simon
 * Date: 13/11/13
 * Time: 10:57
 */
public class CodeFragmentList extends LinkedList<CodeFragment> {
    protected Map<Integer,Integer> uniqueCodeFragment;
    protected Map<Integer,CodeFragment> idToCodeFragment;

    public CodeFragmentList(List<CodeFragment> codeFragments) {
        uniqueCodeFragment = new HashMap<Integer, Integer>();
        idToCodeFragment = new HashMap<Integer,CodeFragment>();
        this.addAll(codeFragments);

    }

    public CodeFragmentList() {
        uniqueCodeFragment = new HashMap<Integer, Integer>();
        idToCodeFragment = new HashMap<Integer,CodeFragment>();
    }

    public List<CtSimpleType> getAllClasses() {
        List<CtSimpleType> classes = new ArrayList<CtSimpleType>();

        for(CodeFragment cf: this)
            if(!classes.contains(cf.getSourceClass()))
                classes.add(cf.getSourceClass());
        return classes;
    }

    public Collection<CodeFragment> getUniqueCodeFragmentList() {
        return idToCodeFragment.values();
    }

    public boolean add(CodeFragment cf) {
        addUniqueStatement(cf);

        return super.add(cf);
    }

    public boolean addAll(Collection<? extends CodeFragment> collection) {
        boolean ret = false;
        for (CodeFragment cf : collection)
            ret = ret || add(cf);
        return ret;
    }

    protected void addUniqueStatement(CodeFragment cf) {
        boolean same = false;
        for (Integer otherCfId: uniqueCodeFragment.keySet()) {
            if(otherCfId == cf.id()) {
                same = true;
                uniqueCodeFragment.put(otherCfId, uniqueCodeFragment.get(otherCfId)+1);
                break;
            }
        }
        if(!same) {
            uniqueCodeFragment.put(cf.id(),1);
            idToCodeFragment.put(cf.id(), cf);
        }
    }
}
