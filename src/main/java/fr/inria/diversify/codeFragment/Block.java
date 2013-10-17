package fr.inria.diversify.codeFragment;


import spoon.reflect.code.CtBlock;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:28 PM
 */
public class Block extends CodeFragment {
    public Block(CtBlock element) {
        codeFragment = element;
      init(element);
    }

    public Block() {}

    public void init(Object element) {
        codeFragment = (CtBlock)element;
        init();
    }

    public String codeFragmentString() {
        return codeFragment.toString();
    }

    @Override
    //check if this can be replaced by other
    public boolean isReplace(CodeFragment other) {
        Class<?> cl = codeFragment.getClass();
        Class<?> clOther = other.codeFragment.getClass();

        if(clOther != cl )
            return false;
//
//        SubStatementVisitor sub = new SubStatementVisitor()  ;
//        other.codeFragment.getParent().accept(sub);
//        if(sub.getStatements().contains(codeFragment))
//            return false;

        return getInputContext().isInclude(other.getInputContext()) && getOutputContext().equals(other.getOutputContext());
    }
}
