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
public class IntegerInputModification extends LiteralInputModification {

    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        literalTypeToString = "int";
        return super.isToBeProcessed(candidate);
    }

    @Override
    protected void innerProcess( CtElement ctElement, CtTypeReference typeRef, Object valueObj ) {
//        String subsString = "";
//        Random r = new Random();
//        int k = r.nextInt(2);
//        switch (k) {
//            //Max int
//            case 0:
//                subsString = "(" + String.valueOf(((int) valueObj) * -1) + ")";
//                break;
//            //Min int
//            case 1:
//                Integer fVal = (Integer) valueObj;
//                subsString = "(" + String.valueOf(fVal + r.nextInt(6) * (r.nextInt(1) == 0 ? -1: 1)) + ")";
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
