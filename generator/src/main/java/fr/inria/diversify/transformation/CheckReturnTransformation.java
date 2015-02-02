package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.factory.CoreFactory;

/**
 * Created by aelie on 30/01/15.
 */
public class CheckReturnTransformation extends ASTReplace {

    public CheckReturnTransformation(CodeFragment transplantationPoint, CodeFragment copyTransplant) {
        this.transplantationPoint = transplantationPoint;
        this.transplant = copyTransplant;
        name = "checkReturn";
        type = "insertion";
    }

    protected CtCodeElement buildReplacementElement() {
        try {
            CodeFragment ifStatement = transplant.clone();
            if (withVarMapping()) {
                if (variableMapping == null) {
                    variableMapping = transplantationPoint.randomVariableMapping(getTransplant(), subType);
                }
            }
            Log.debug("random variable mapping: {}", variableMapping);
            ifStatement.replaceVar(transplantationPoint, variableMapping);
            CoreFactory factory = transplant.getCtCodeFragment().getFactory().Core();
            CtBlock thenBlock = factory.createBlock();
            thenBlock.addStatement((CtStatement) factory.clone(transplantationPoint.getCtCodeFragment()));
            ((CtIf) ifStatement.getCtCodeFragment()).setThenStatement(thenBlock);
            return ifStatement.getCtCodeFragment();
        } catch (Exception e) {
            throw new RuntimeException(new BuildTransplantException("", e));
        }
    }

    protected boolean withVarMapping() {
        return true;
    }
}
