package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.RemoveParameterCondition;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.factory.Factory;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 27/05/16
 */
public class RemoveParameterConditionQuery extends TransformationQuery {
    List<CtIf> ifStmt;
    public RemoveParameterConditionQuery(InputProgram inputProgram) {
        super(inputProgram);
        ifStmt = init();
        Collections.shuffle(ifStmt);
    }

    @Override
    public Transformation query() throws QueryException {
        CtIf stmtIf = ifStmt.remove(random.nextInt(ifStmt.size()));

        RemoveParameterCondition trans = new RemoveParameterCondition();
        trans.setTransplantationPoint(stmtIf);
        trans.setTransplant(getReplaceStmt(stmtIf));
        return trans;
    }

    protected List<CtIf> init() {
        List<CtMethod> mths = getInputProgram().getAllElement(CtMethod.class);
        return mths.stream()
                .filter(mth -> !mth.getParameters().isEmpty())
                .filter(mth -> mth.getBody() != null)
                .filter(mth -> !mth.getBody().getStatements().isEmpty())
                .filter(mth -> mth.getBody().getStatement(0) instanceof CtIf)
                .filter(mth -> {
                    CtIf ifStmt = (CtIf) mth.getBody().getStatement(0);
                    String condition = ifStmt.getCondition().toString();
                    boolean testOnParameter = mth.getParameters().stream()
                            .anyMatch(param -> condition.contains(((CtParameter)param).getSimpleName()));

                    if(testOnParameter) {
                        if (mth.getBody().getStatements().size() == 1 && ifStmt.getElseStatement() != null) {
                            return containsOnlyReturn(ifStmt.getThenStatement()) ||
                                    containsOnlyReturn(ifStmt.getElseStatement());
                        } else {
                            return containsOnlyReturn(ifStmt.getThenStatement());
                        }
                    }
                    return false;
                })
                .map(mth -> (CtIf) mth.getBody().getStatement(0))
                .collect(Collectors.toList());

    }

    protected CtIf getReplaceStmt(CtIf stmt) {
        Factory factory = getInputProgram().getFactory();
        CtIf clone = factory.Core().clone(stmt);

        if(stmt.getElseStatement() == null) {
            clone.setCondition(factory.Code().createLiteral(false));
        } else {
            if(containsOnlyReturn(stmt.getThenStatement())) {
                clone.setCondition(factory.Code().createLiteral(false));
            } else {
                clone.setCondition(factory.Code().createLiteral(true));
            }
        }
        return clone;
    }

    protected boolean containsOnlyReturn(CtStatement stmt) {
        if(stmt instanceof CtStatementList) {
            CtStatementList list = (CtStatementList) stmt;
            return list.getStatements().size() == 1 && list.getStatements().get(0) instanceof CtReturn;
        } else {
            return stmt instanceof CtReturn;
        }
    }

    public boolean hasNextTransformation() {
        return !ifStmt.isEmpty();
    }
}
