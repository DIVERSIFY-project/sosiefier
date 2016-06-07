package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Expression;
import fr.inria.diversify.codeFragment.InputContext;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.CheckReturnTransformation;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.*;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by aelie on 30/01/15.
 */
public class CheckReturnQuery extends TransformationQuery {
    protected List<CodeFragment> returnStatementList;
    protected List<CodeFragment> ifStatementList;

    protected boolean varNameMatching;

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
        List<CtIf> ifs = getInputProgram().getAllElement(CtIf.class);
        ifStatementList = ifs.stream()
                .map(ifStmt -> new Expression(ifStmt.getCondition()))
                .collect(Collectors.toList());
    }

    @Override
    public Transformation query() throws QueryException {
        CheckReturnTransformation result;
        Random random = new Random();
        CodeFragment transplant = null;
        CodeFragment transplantationPoint = null;

        Collections.shuffle(ifStatementList, random);
        Collections.shuffle(ifStatementList);

        int counter = ifStatementList.size();
        while(transplant == null && counter-- > 0) {
            transplantationPoint = returnStatementList.get(random.nextInt(returnStatementList.size() - 1));
            for (CodeFragment ifCodeFragment : ifStatementList) {
                InputContext tpIp = transplantationPoint.getInputContext();
                InputContext ifIp = ifCodeFragment.getInputContext();
                if (tpIp.containsAll(ifIp, true)
                        && (!varNameMatching || tpIp.getAllVarName().containsAll(ifIp.getAllVarName()))) {
                    transplant = ifCodeFragment;
                    break;
                }
            }
        }
        result = new CheckReturnTransformation(transplantationPoint, (CtExpression<Boolean>) transplant.getCtCodeFragment(), random.nextBoolean(), !varNameMatching);
        result.setInputProgram(getInputProgram());

        return result;
    }

    public void setVarNameMatching(boolean varNameMatching) {
        this.varNameMatching = varNameMatching;
    }
}
