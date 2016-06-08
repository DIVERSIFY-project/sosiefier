package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.reflect.code.CtCodeElement;

/**
 * User: Simon
 * Date: 03/03/15
 * Time: 17:25
 */
public class NullTransformation extends ASTTransformation {
    @Override
    public boolean usedOfSubType() {
        return false;
    }

    @Override
    protected void applyInfo() {

    }

    public void apply(String srcDir) throws Exception {
    }

    @Override
    public CtCodeElement buildReplacementElement() {
        return null;
    }

}
