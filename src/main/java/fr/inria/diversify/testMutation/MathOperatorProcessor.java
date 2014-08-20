package fr.inria.diversify.testMutation;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtStatement;
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
public class MathOperatorProcessor extends AbstractProcessor {

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
        if(kind.equals(BinaryOperatorKind.PLUS))
            mutant.setKind(BinaryOperatorKind.MINUS);
        if(kind.equals(BinaryOperatorKind.MINUS))
            mutant.setKind(BinaryOperatorKind.PLUS);

        if(kind.equals(BinaryOperatorKind.MUL))
            mutant.setKind(BinaryOperatorKind.DIV);
        if(kind.equals(BinaryOperatorKind.DIV))
            mutant.setKind(BinaryOperatorKind.MUL);

        if(kind.equals(BinaryOperatorKind.MOD))
            mutant.setKind(BinaryOperatorKind.MUL);

        if(kind.equals(BinaryOperatorKind.BITAND))
            mutant.setKind(BinaryOperatorKind.BITOR);
        if(kind.equals(BinaryOperatorKind.BITOR))
            mutant.setKind(BinaryOperatorKind.BITAND);

        if(kind.equals(BinaryOperatorKind.SL))
            mutant.setKind(BinaryOperatorKind.SR);
        if(kind.equals(BinaryOperatorKind.SR))
            mutant.setKind(BinaryOperatorKind.SL);

        if(kind.equals(BinaryOperatorKind.USR))
            mutant.setKind(BinaryOperatorKind.SL);

        if ( !mutant.getKind().equals(op.getKind()) ) {
            SourcePosition sp = op.getPosition();
            CompilationUnit compileUnit = sp.getCompilationUnit();
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
            try {
                compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd() + 1, "**/" + mutant.toString(), 0));
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
