package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import spoon.reflect.code.CtAssignment;

import java.util.List;

/**
 * User: Simon
 * Date: 29/06/16
 * Time: 11:12
 */
public class DeleteAffectationQuery extends TransformationQuery {
    List<CtAssignment> affectations;

    public DeleteAffectationQuery(InputProgram inputProgram) {
        super(inputProgram);
        affectations = inputProgram.getAllElement(CtAssignment.class);
    }

    @Override
    public Transformation query() throws QueryException {
        ASTDelete delete = new ASTDelete();
        CtAssignment stmt = affectations.remove(random.nextInt(affectations.size()));
        delete.setTransplantationPoint(new Statement(stmt));

        return delete;
    }

    public boolean hasNextTransformation() {
        return !affectations.isEmpty();
    }
}
