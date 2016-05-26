package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.CheckReturnTransformation;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.*;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by aelie on 30/01/15.
 */
public class CheckReturnQuery extends TransformationQuery {
    protected List<CodeFragment> returnStatementList;
    protected List<CodeFragment> ifStatementList;

    public CheckReturnQuery(InputProgram inputProgram) {
        super(inputProgram);
        initFindReturnStatements();
        initFindIfStatements();
    }

    protected void initFindReturnStatements() {
        returnStatementList = new ArrayList<>();

        for (CodeFragment cf : getInputProgram().getCodeFragments()) {
            if (isReturnVariable(cf.getCtCodeFragment())) {
                returnStatementList.add(cf);
            }
        }
        Collections.shuffle(returnStatementList);
    }

    protected boolean isReturnVariable(CtCodeElement stmt) {
        if (stmt instanceof CtReturn) {
            CtReturn ret = (CtReturn) stmt;
            if (ret.getReturnedExpression() instanceof CtVariableReference ||
                    ret.getReturnedExpression() instanceof CtVariableAccess) {
                return true;
            }
        }
        return false;
    }

    protected boolean isThrowStatement(CtCodeElement stmt) {
        return stmt instanceof CtThrow;
    }

    protected void initFindIfStatements() {
        ifStatementList = new ArrayList<>();
        List<CodeFragment> uniqueCodeFragmentsList = new ArrayList<>(getInputProgram().getCodeFragments().getUniqueCodeFragmentList());
        for (CodeFragment codeFragment : uniqueCodeFragmentsList) {
            try {
                CtCodeElement codeElement = codeFragment.getCtCodeFragment();
                if (codeElement instanceof CtIf) {
                    ifStatementList.add(codeFragment);
                }
            } catch (Exception e) {
            }
        }
        Collections.shuffle(ifStatementList);
    }

    @Override
    public Transformation query() throws QueryException {
        Transformation result;
        Random random = new Random();
        CodeFragment transplant = null;
        CodeFragment transplantationPoint = null;
        Collections.shuffle(ifStatementList, random);
        int counter = ifStatementList.size();
        while(transplant == null && counter-- > 0) {
            transplantationPoint = returnStatementList.get(random.nextInt(returnStatementList.size() - 1));
            for (CodeFragment ifCodeFragment : ifStatementList) {
                if (transplantationPoint.getContext().getInputContext().containsAll(ifCodeFragment.getInputContext(), true)) {
                    transplant = ifCodeFragment;
                }
            }
        }
        result = new CheckReturnTransformation(transplantationPoint, transplant);
        result.setInputProgram(getInputProgram());

        return result;
    }

    protected CodeFragment findRandomReturnToReplace(boolean withCoverage) {
        Random r = new Random();
        int size = returnStatementList.size();
        CodeFragment stmt = returnStatementList.get(r.nextInt(size));

        while (withCoverage && getInputProgram().getCoverageReport().codeFragmentCoverage(stmt) == 0)
            stmt = returnStatementList.get(r.nextInt(size));
        return stmt;
    }
}
