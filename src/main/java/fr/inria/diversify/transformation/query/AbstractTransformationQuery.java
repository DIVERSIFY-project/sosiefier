package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.Factory;
import spoon.reflect.declaration.CtElement;

import java.util.Collection;
import java.util.List;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:17 AM
 */
public abstract class AbstractTransformationQuery {
    protected CodeFragmentList codeFragments;
    protected int nbTransformation = 1;
    protected String type = "replace";

    public void setNbTransformation(int n) {
        nbTransformation = n;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Transformation getTransformation() throws Exception {
        if(type.equals("replace"))
            return replace();

        if(type.equals("add"))
            return add();

        if(type.equals("delete"))
            return delete();

//        cfToTransform.clear();
        return null;
    }

    protected abstract Transformation delete() throws Exception ;

    protected abstract Transformation add() throws Exception ;

    protected abstract Transformation replace() throws Exception ;


    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

    protected List<CodeFragment> getAllCodeFragments() {
        return codeFragments.getCodeFragments();
    }

    protected Collection<CodeFragment> getAllUniqueCodeFragments() {
        return codeFragments.getUniqueCodeFragmentList();
    }
}
