package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.DiversifyEnvironment;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import spoon.processing.ProcessingManager;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.util.Collection;
import java.util.Random;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:17 AM
 */
public abstract class AbstractTransformationQuery extends TransformationQuery {
    protected CodeFragmentList codeFragments;
    protected String type = "replace";

    public void setType(String type) {
        this.type = type;
    }

    public ASTTransformation getTransformation() throws Exception {
        String type = this.type;
        if(type == null || type.equals("multi")) {
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

        return null;
    }

    public abstract ASTTransformation delete() throws Exception ;

    public abstract ASTTransformation add() throws Exception ;

    public abstract ASTTransformation replace() throws Exception ;


    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

    protected void init() {
        codeFragments = DiversifyEnvironment.getCodeFragments();
    }

    protected Collection<CodeFragment> getAllUniqueCodeFragments() {
        return codeFragments.getUniqueCodeFragmentList();
    }
}
