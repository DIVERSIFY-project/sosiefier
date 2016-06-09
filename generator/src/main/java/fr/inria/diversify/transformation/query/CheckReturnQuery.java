package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Expression;
import fr.inria.diversify.codeFragment.InputContext;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.CheckReturnTransformation;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
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
    protected List<CodeFragment> ifConditions;

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

    protected boolean isReturnVariable(CtElement stmt) {
        if (stmt instanceof CtReturn) {
            CtReturn ret = (CtReturn) stmt;
            if (ret.getReturnedExpression() instanceof CtVariableReference ||
                    ret.getReturnedExpression() instanceof CtVariableAccess) {
                return true;
            }
        }
        return false;
    }

    protected void initFindIfStatements() {
        List<CtIf> ifs = getInputProgram().getAllElement(CtIf.class);
        ifConditions = ifs.stream()
                .filter(ifStmt -> ifStmt.getPosition().getCompilationUnit().getMainType().equals(ifStmt.getParent(CtType.class)))
                .map(ifStmt -> new Expression(ifStmt.getCondition()))
                .collect(Collectors.toList());
    }

    @Override
    public Transformation query() throws QueryException {
        CheckReturnTransformation result;
        Random random = new Random();
        CodeFragment transplant = null;
        CodeFragment transplantationPoint = null;

        Collections.shuffle(ifConditions, random);
        Collections.shuffle(ifConditions);

        int counter = ifConditions.size();
        while(transplant == null && counter-- > 0) {
            transplantationPoint = returnStatementList.get(random.nextInt(returnStatementList.size() - 1));
            for (CodeFragment ifCodeFragment : ifConditions) {
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
