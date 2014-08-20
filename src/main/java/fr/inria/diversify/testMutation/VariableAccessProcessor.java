package fr.inria.diversify.testMutation;

import fr.inria.diversify.util.Log;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;

import java.util.Random;

/**
 * Takes numeric values and adds or deletes a random numeric value
 *
 * Created by marodrig on 27/07/2014.
 */
public class VariableAccessProcessor extends AbstractProcessor {

    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        //boolean result = candidate instanceof CtVariableAccess;

        return candidate instanceof CtVariableAccess;
    }

    @Override
    public void process(CtElement ctElement) {

        CtVariableAccess varAccess = (CtVariableAccess)ctElement;
        CtTypeReference typeRef = null;
        try {
            typeRef = varAccess.getType();
            System.out.println("Type:" + typeRef);
        } catch (Exception e ) {
            e.printStackTrace();
            return;
        }

        if ( typeRef == null ) {
            Log.warn("Type Ref is null!");
            return;
        }

        Random r = new Random();
        String subsString = "";
        if ( typeRef.toString().equals("int") ||
                typeRef.toString().equals("float") ||
                typeRef.toString().equals("double") ) {
            String[] signs = {"+", "-"};
            String sing = signs[r.nextInt(1)];
            subsString = "(" + varAccess.toString() + " " + sing + r.nextInt(20) + ")";

            System.out.println(subsString);
        } else if (typeRef.toString().equals("java.lang.Boolean")) {
            subsString = "!" + varAccess.toString();
        }

        if ( !subsString.equals("") ) {
            SourcePosition sp = ctElement.getPosition();
            CompilationUnit cu = sp.getCompilationUnit();
            int sourceLength = sp.getSourceEnd() - sp.getSourceStart();
            cu.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), subsString, sourceLength));
        }
    }
}
