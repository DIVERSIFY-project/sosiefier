package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.transformation.ITransformation;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.Factory;
import spoon.reflect.declaration.CtElement;

import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:17 AM
 */
public abstract class AbstractTransformationQuery implements ITransformationQuery{
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
        String type = this.type;
        if(type == null) {
            Random r = new Random();
            int i = r.nextInt(3);
            if(i == 0)
                type = "replace";
            if(i == 1)
                type = "delete";
            if(i == 2)
                type = "add";
        }

        if(type.equals("replace"))
            return replace();

        if(type.equals("add"))
            return add();

        if(type.equals("delete"))
            return delete();

//        cfToTransform.clear();
        return null;
    }

    public abstract Transformation delete() throws Exception ;

    public abstract Transformation add() throws Exception ;

    public abstract Transformation replace() throws Exception ;


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
