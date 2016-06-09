package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.Expression;
import fr.inria.diversify.codeFragment.Method;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddParameterCondition;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 08/06/16
 * Time: 16:13
 */
public class AddParameterConditionQuery extends TransformationQuery {
    List<Expression> ifConditions;
    List<CtMethod> methods;
    protected boolean varNameMatching = false;

    public AddParameterConditionQuery(InputProgram inputProgram) {
        super(inputProgram);

        initFindIfStatements();
        initMethods();
    }

    @Override
    public Transformation query() throws QueryException {
        Collections.shuffle(methods);
        Collections.shuffle(ifConditions);

        for(CtMethod mth : methods) {
            for (Expression condition : ifConditions) {
                Method method = new Method(mth);
                if (condition.getInputContext().size() != 0
                        && method.getInputContext().containsAll(condition.getInputContext(), true)
                        && (!varNameMatching || method.getInputContext().getAllVarName().containsAll(condition.getInputContext().getAllVarName()))) {
                    AddParameterCondition transformation = new AddParameterCondition(method, (CtExpression<Boolean>) condition.getCtCodeFragment());
                    transformation.setReturnInThen(random.nextBoolean());
                    return transformation;
                }
            }
        }
        return null;
    }

    protected void initFindIfStatements() {
        List<CtIf> ifs = getInputProgram().getAllElement(CtIf.class);
        ifConditions = ifs.stream()
                .filter(ifStmt -> ifStmt.getPosition().getCompilationUnit().getMainType().equals(ifStmt.getParent(CtType.class)))
                .map(ifStmt -> new Expression(ifStmt.getCondition()))
                .collect(Collectors.toList());
    }

    protected void initMethods() {
        List<CtMethod> mths = getInputProgram().getAllElement(CtMethod.class);
        methods = mths.stream()
                .filter(method -> method.getBody() != null)
                .filter(method -> method.getParameters().size() != 0)
                .collect(Collectors.toList());
    }

    public void setVarNameMatching(boolean varNameMatching) {
        this.varNameMatching = varNameMatching;
    }
}
