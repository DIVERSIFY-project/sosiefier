package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
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
//        applyInfo();
//        try {
//            printJavaFile(srcDir);
//        } catch (Exception e) {
//            throw new ApplyTransformationException("", e);
//        }

    }

    @Override
    public CtCodeElement buildReplacementElement() {
        return null;
    }

    @Override
    public void updateStatementList() {

    }
}
