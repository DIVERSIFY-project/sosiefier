package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import spoon.reflect.code.CtBreak;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 25/05/16
 * Time: 11:15
 */
public class BreakDeleteQuery extends TransformationQuery {
    protected List<CodeFragment> allBreaks;
    protected int index;

    public BreakDeleteQuery(InputProgram inputProgram) {
        super(inputProgram);
        allBreaks = findAllBreaks(true);
    }

    @Override
    public Transformation query() throws QueryException {
        ASTDelete delete = new ASTDelete();
        delete.setTransplantationPoint(allBreaks.get(index));
        index++;
        return delete;
    }

    public boolean hasNextTransformation() {
        return index < allBreaks.size();
    }

    protected List<CodeFragment> findAllBreaks(boolean withCoverage) {
        return getInputProgram().getCodeFragments().stream()
                .filter(stmt -> !withCoverage || getInputProgram().getCoverageReport().codeFragmentCoverage(stmt) != 0)
                .filter(stmt -> CtBreak.class.isInstance(stmt.getCtCodeFragment()))
                .collect(Collectors.toList());
    }

}
