package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.transformation.SpoonTransformation;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
/**
 * User: Simon
 * Date: 17/02/14
 * Time: 17:29
 */
public class ReturnValueMutation extends SpoonTransformation<CtReturn, CtElement> {

    public  ReturnValueMutation() {
        type = "mutation";
        name = "returnValue";
    }

    @Override
    public void addSourceCode() throws Exception {
        logInfo();
        CtLiteral literal = (CtLiteral)transformationPoint.getReturnedExpression();
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
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+newLiteral, 0));
    }

}
