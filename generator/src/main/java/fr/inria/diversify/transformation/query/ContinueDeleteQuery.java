package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import spoon.reflect.code.CtContinue;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 25/05/16
 * Time: 11:15
 */
public class ContinueDeleteQuery extends TransformationQuery {
    protected List<CodeFragment> allContinues;
    protected int index;

    public ContinueDeleteQuery(InputProgram inputProgram) {
        super(inputProgram);
        allContinues = findAllContinues(true);
    }

    @Override
    public Transformation query() throws QueryException {
        ASTDelete delete = new ASTDelete();
        delete.setTransplantationPoint(allContinues.get(index));
        index++;
        return delete;
    }

    public boolean hasNextTransformation() {
        return index < allContinues.size();
    }

    protected List<CodeFragment> findAllContinues(boolean withCoverage) {
        return getInputProgram().getCodeFragments().stream()
                .filter(stmt -> !withCoverage || getInputProgram().getCoverageReport().codeFragmentCoverage(stmt) != 0)
                .filter(stmt -> CtContinue.class.isInstance(stmt.getCtCodeFragment()))
                .collect(Collectors.toList());
    }
}
