package fr.inria.diversify.testMutation;

import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;

import java.util.Random;

/**
 *
 * Created by marodrig on 28/07/2014.
 */
@Deprecated
public class FloatInputModification extends LiteralInputModification {

    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        literalTypeToString = "float";
        return super.isToBeProcessed(candidate);
    }

    @Override
    protected void innerProcess( CtElement ctElement, CtTypeReference typeRef, Object valueObj ) {
//        String subsString = "";
//        Random r = new Random();
//
//        int k = r.nextInt(4);
//        switch (k) {
//            //Max int
//            case 0:
//                subsString = String.valueOf(1000.0) + "f";
//                break;
//            //Min int
//            case 1:
//                subsString = String.valueOf(-1000.0) + "f";
//                break;
//            //Negative
//            case 2:
//                subsString = "(" + String.valueOf((float)valueObj * -1) + "f)";
//                break;
//            //Random
//            case 3:
//                Float fVal = (Float) valueObj;
//                subsString = String.valueOf(fVal * r.nextDouble() * 10) + "f";
//                break;
//        }
//
//        if (!subsString.equals("")) {
//            SourcePosition sp = ctElement.getPosition();
//            CompilationUnit cu = sp.getCompilationUnit();
//            int sourceLength = sp.getSourceEnd() - sp.getSourceStart() + 1;
//            cu.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), subsString, sourceLength));
//        }
    }
}
