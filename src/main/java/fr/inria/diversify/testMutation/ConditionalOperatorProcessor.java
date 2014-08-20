package fr.inria.diversify.testMutation;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;

/**
 * Mutate math operations
 *
 * Created by marodrig on 25/07/2014.
 */
public class ConditionalOperatorProcessor extends AbstractProcessor {

    int i = 0;

    private int exceptionID = 0;

    private CtBinaryOperator op;

    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        boolean result = candidate instanceof CtBinaryOperator;
        if ( result ) {
            op = (CtBinaryOperator)candidate;
            try {
                result = !op.getLeftHandOperand().getType().toString().equals("java.lang.String");
            } catch (NullPointerException e) {
                op = null;
                return false;
            }
        }
        return result;
    }

    @Override
    public void process(CtElement ctElement) {

        if ( op == null ) { op = (CtBinaryOperator) ctElement; }

        Factory factory = op.getFactory();
        CtBinaryOperator mutant = factory.Code().createBinaryOperator(op.getLeftHandOperand(), op.getRightHandOperand(), op.getKind());

        mutant.setParent(op.getParent());

        BinaryOperatorKind kind = op.getKind();
        if(kind.equals(BinaryOperatorKind.EQ))
            mutant.setKind(BinaryOperatorKind.NE);
        if(kind.equals(BinaryOperatorKind.NE))
            mutant.setKind(BinaryOperatorKind.EQ);

        if(kind.equals(BinaryOperatorKind.LE))
            mutant.setKind(BinaryOperatorKind.GT);
        if(kind.equals(BinaryOperatorKind.GE))
            mutant.setKind(BinaryOperatorKind.LT);

        if(kind.equals(BinaryOperatorKind.LT))
            mutant.setKind(BinaryOperatorKind.GE);
        if(kind.equals(BinaryOperatorKind.GT))
            mutant.setKind(BinaryOperatorKind.LE);

        if ( !mutant.getKind().equals(op.getKind()) ) {
            SourcePosition sp = op.getPosition();
            CompilationUnit compileUnit = sp.getCompilationUnit();

            //String s = mutant.getLeftHandOperand().toString() + " " + mutant.getKind().toString() + " " + mutant.toString();

            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
            try {
                compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd() + 1, "**/" + mutant.toString(), 0));
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
