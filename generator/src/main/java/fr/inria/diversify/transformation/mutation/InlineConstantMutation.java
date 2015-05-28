package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.transformation.SpoonTransformation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;

/**
 * User: Simon
 * Date: 17/02/14
 * Time: 17:30
 */
@Deprecated
public class InlineConstantMutation extends SpoonTransformation<CtLocalVariable, CtElement> {

    public InlineConstantMutation() {
        name = "inlineConstant";
        type = "mutation";
    }

    @Override
    public void addSourceCode() throws Exception {
        logInfo();
        CtLiteral literal = (CtLiteral)transformationPoint.getDefaultExpression();
        String type = literal.getType().getSimpleName();
        String newLiteral = null;

        if(type.equals("boolean")) {
            newLiteral = !((Boolean)literal.getValue()) + "";
        } else if(type.equals("short")) {
            newLiteral = ((Short)literal.getValue() + 1) + "";
        } else if(type.equals("int")) {
            newLiteral = ((Integer)literal.getValue() + 1) + "";
        } else if(type.equals("long")) {
            newLiteral = ((Long)literal.getValue() + 1) + "";
        } else if(type.equals("byte")) {
            newLiteral = ((Byte)literal.getValue() + 1) + "";
        } else if(type.equals("float")) {
            newLiteral = ((Float)literal.getValue() + 1.0f) + "";
        } else if(type.equals("double")) {
            newLiteral = ((Double)literal.getValue() + 1.0d) + "";
        }

        SourcePosition sp = literal.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+newLiteral, 0));
    }

    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        InlineConstantMutation otherMutation = (InlineConstantMutation)other;

        return status == otherMutation.status &&
                failures.equals(otherMutation.failures) &&
                transformationPoint.equals(otherMutation.transformationPoint) &&
                transformationPoint.getPosition().equals(otherMutation.transformationPoint.getPosition());
    }
}
