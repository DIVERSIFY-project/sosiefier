package fr.inria.diversify.transformation.mutation;


import fr.inria.diversify.transformation.SpoonTransformation;

import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;

/**
 * User: Simon
 * Date: 13/02/14
 * Time: 14:40
 */
public abstract class BinaryOperatorMutation extends SpoonTransformation<CtBinaryOperator, CtElement> {


    public void addSourceCode() {
        logInfo();
        CtElement mutant = getMutantOperator();
        SourcePosition sp = transformationPoint.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+mutant.toString(), 0));
    }

    protected abstract CtElement getMutantOperator();

    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        BinaryOperatorMutation otherMutation = (BinaryOperatorMutation)other;

        return status == otherMutation.status &&
                failures.equals(otherMutation.failures) &&
                transformationPoint.equals(otherMutation.transformationPoint) &&
                transformationPoint.getPosition().equals(otherMutation.transformationPoint.getPosition());
    }

}
