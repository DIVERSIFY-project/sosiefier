package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;

/**
 * User: Simon
 * Date: 13/02/14
 * Time: 14:45
 */
public class RemoveConditionalMutation extends BinaryOperatorMutation {

    public RemoveConditionalMutation() {
        type = "mutation";
        name = "removeConditional";
    }

    @Override
    protected CtLiteral<Boolean> getMutantOperator() {
        Factory factory = operator.getFactory();
        CtLiteral<Boolean> literal = factory.Core().createLiteral();
        literal.setValue(true);
        return literal;
    }


    protected void addSourceCode() {
        Log.debug(getType());
        Log.debug("operator:\n {}", operator);
        Log.debug("--------------------\npostion:\n{}",operator.getPosition());
        SourcePosition sp = operator.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/true", 0));
    }
}
