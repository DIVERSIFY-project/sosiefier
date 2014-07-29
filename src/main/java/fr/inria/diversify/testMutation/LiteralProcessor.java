package fr.inria.diversify.testMutation;

import fr.inria.diversify.util.Log;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;

import java.util.Random;

/**
 * Created by marodrig on 25/07/2014.
 */
public class LiteralProcessor extends AbstractProcessor {

    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        return candidate instanceof CtLiteral;
    }

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

        int sourceLengthOff = 0;

        Random r = new Random();
        String subsString = "";
        if (typeRef.toString().equals("int")) {
            int k = r.nextInt(2);
            switch (k) {
                //Max int
                case 0:
                    subsString = "(" + String.valueOf(((int) valueObj) * -1) + ")";
                    break;
                //Min int
                case 1:
                    Integer fVal = (Integer) valueObj;
                    subsString = "(" + String.valueOf(fVal + r.nextInt(6) * (r.nextInt(1) == 0 ? -1: 1)) + ")";
                    break;
            }
            //if ( ctElement.toString().length() == 1 ) { sourceLengthOff = 1; }
        } else if (typeRef.toString().equals("float")) {
            /*
            int k = r.nextInt(4);
            switch (k) {
                //Max int
                case 0:
                    subsString = String.valueOf(1000.0);
                    break;
                //Min int
                case 1:
                    subsString = String.valueOf(1000.0);
                    break;
                //Negative
                case 2:
                    sourceLengthOff = 1;
                    if ( !ctElement.toString().toLowerCase().endsWith("f") ) {
                        subsString = "(" + String.valueOf(((float) valueObj) * -1) + "f)";
                    } else {
                        subsString = "(" + String.valueOf(((float) valueObj) * -1) + ")";
                    }
                    break;
                //Random
                case 3:
                    Float fVal = (Float) valueObj;
                    subsString = String.valueOf(fVal * r.nextDouble() * 10);
                    break;
            }
            if ( !ctElement.toString().toLowerCase().endsWith("f") ) subsString += "f";
            */
        } else if (typeRef.toString().equals("double")) {
            /*
            int k = r.nextInt(4);
            switch (k) {
                //Max int
                case 0:
                    subsString = String.valueOf(1000.0);
                    break;
                //Min int
                case 1:
                    subsString = String.valueOf(1000.0);
                    break;
                //Negative
                case 2:
                    sourceLengthOff = 1;
                    if ( !ctElement.toString().toLowerCase().endsWith("d") ) {
                        subsString = "(" + String.valueOf(((double) valueObj) * -1) + "d)";
                    } else {
                        subsString = "(" + String.valueOf(((double) valueObj) * -1) + ")";
                    }
                    break;
                //Random
                case 3:
                    Double fVal = (Double) valueObj;
                    subsString = String.valueOf(fVal * r.nextFloat() * 10);
                    if ( !ctElement.toString().toLowerCase().endsWith("d") ) { subsString += "d"; }
                    break;
            }
            */
        } else if (typeRef.toString().equals("java.lang.String")) {

            /*
            char[] cs = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', '1', '0', '1', '-'};
            String v = (String)valueObj;
            v.replace("\n", " ");
            v.replace("\r", " ");
            StringBuilder sb = new StringBuilder(v);

            int length = Math.min(r.nextInt(3), sb.length());
            for (int i = 0; i < length; i++) {

                sb.setCharAt(r.nextInt(sb.length()), cs[r.nextInt(cs.length)]);
            }
            subsString = "\"" + sb.toString();*/
        } else if (typeRef.toString().equals("java.lang.Boolean")) {
            //subsString = (Boolean) valueObj ? "false" : "true";
        }

        if (valueObj == null) {
            Log.info("Value: null Changed to " + subsString);
        } else {
            Log.info("Value: " + valueObj.toString() + " Changed to " + subsString);
        }

        if (!subsString.equals("")) {
            SourcePosition sp = ctElement.getPosition();
            CompilationUnit cu = sp.getCompilationUnit();

            int sourceLength = sp.getSourceEnd() - sp.getSourceStart() + 1;
            //sourceLength += sourceLengthOff;
            cu.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), subsString, sourceLength));
        }
        //cu.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd() + 2, " } catch (AssertionError e) { e.printStackTrace() }", 0));
    }
}
