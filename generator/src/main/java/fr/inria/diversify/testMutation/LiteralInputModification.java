package fr.inria.diversify.testMutation;

import fr.inria.diversify.util.Log;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtLiteral;;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;

import java.util.Random;

/**
 * Created by marodrig on 25/07/2014.
 */
public abstract class LiteralInputModification extends AbstractProcessor {

    protected String literalTypeToString = "";

    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (candidate instanceof CtLiteral) {
            CtLiteral literal = (CtLiteral) candidate;
            return literal.getType() != null && literal.getType().toString().equals(literalTypeToString);
        }
        return false;
    }

    protected abstract void innerProcess(CtElement ctElement, CtTypeReference typeRef, Object valueObj);

    @Override
    public void process(CtElement ctElement) {

        CtLiteral literal = (CtLiteral) ctElement;
        CtTypeReference typeRef = null;
        Object valueObj = null;
        try {
            typeRef = literal.getType();
            System.out.println("Type:" + typeRef);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }


        try {
            valueObj = literal.getValue();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        if (typeRef == null) {
            Log.warn("Type Ref is null!");
            return;
        }

        innerProcess(ctElement, typeRef, valueObj);
        /*
         } else if (typeRef.toString().equals("java.lang.Stri      /*
            char[] cs = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', '1', '0', '1', '-'};
            String v = (String)valueObj;
            v.replace("\n", " ");
            v.replace("\r", " ");
            StringBuilder sb = new StringBuilder(v);

            int length = Math.min(r.nextInt(3), sb.length());
            for (int i = 0; i < length; i++) {

                sb.setCharAt(r.nextInt(sb.length()), cs[r.nextInt(cs.length)]);
            }
            subsString = "\"" + sb.toSing();
        } else if (typeRef.toString().equals("java.lang.Boolean")) {
            //subsString = (Boolean) valueObj ? "false" : "true";
        }*/


        //cu.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd() + 2, " } catch (AssertionError e) { e.printStackTrace() }", 0));
    }
}
