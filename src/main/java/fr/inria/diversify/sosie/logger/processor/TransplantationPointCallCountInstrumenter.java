package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by marodrig on 05/08/2014.
 */
public class TransplantationPointCallCountInstrumenter extends AbstractLoggingInstrumenter<CtStatement> {

    protected Set<SourcePosition> sourcePositions;

    public TransplantationPointCallCountInstrumenter(List<Transformation> transformations) {
        super(transformations);

        sourcePositions = new HashSet<>();
        for ( Transformation t : transformations ) {
            if ( t instanceof ASTTransformation ) {
                ASTTransformation ast = (ASTTransformation)t;
                sourcePositions.add(ast.getTransplantationPoint().getCtCodeFragment().getPosition());
            }
        }
    }

    @Override
    public void process(CtStatement ctStatement) {
        if ( sourcePositions.contains(ctStatement.getPosition()) ) {
            CompilationUnit cu = ctStatement.getPosition().getCompilationUnit();
            cu.addSourceCodeFragment(new SourceCodeFragment(ctStatement.getPosition().getSourceStart(),
                    getLogName() + ".countSourcePositionCall(" + ctStatement.getPosition()+")",0));
        }
    }
}
