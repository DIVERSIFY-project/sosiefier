package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.other.ShuffleCollectionBeforeReturn;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtVariableReference;

import java.util.*;

/**
 * Created by Simon on 04/02/15.
 */
public class ShuffleCollectionBeforeReturnQuery extends TransformationQuery {
    protected List<CodeFragment> returnsCollection;
    protected List<CodeFragment> returnsArray;

    public ShuffleCollectionBeforeReturnQuery(InputProgram inputProgram) {
        super(inputProgram);
        initReturn();
    }

    protected void initReturn() {
        returnsCollection = new LinkedList<>();
        returnsArray = new LinkedList<>();

        for (CodeFragment cf : getInputProgram().getCodeFragments()) {
            if (isReturnCollection(cf.getCtCodeFragment()) ) {
                returnsCollection.add(cf);
            }
            if (isReturnArray(cf.getCtCodeFragment()) ) {
                returnsArray.add(cf);
            }
        }
    }

    protected boolean isReturnCollection(CtCodeElement stmt) {
        Class cl = null;
        try {


            if (stmt instanceof CtReturn) {
                Object ret = ((CtReturn) stmt).getReturnedExpression();
                if (ret instanceof CtVariableReference) {
                    CtVariableReference var = (CtVariableReference) ret;
                    cl = var.getType().getActualClass();
                }
                if (ret instanceof CtVariableAccess) {
                    CtVariableAccess var = (CtVariableAccess) ret;
                    cl = var.getType().getActualClass();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.debug("");
        }
        return cl != null && instanceOfCollection(cl);
    }

    protected boolean isReturnArray(CtCodeElement stmt) {
        Class cl = null;
        try {


        if (stmt instanceof CtReturn) {
            Object ret = ((CtReturn) stmt).getReturnedExpression();
            if (ret instanceof CtVariableReference) {
                CtVariableReference var = (CtVariableReference) ret;
                cl = var.getType().getActualClass();
            }
            if(ret instanceof CtVariableAccess) {
                CtVariableAccess var = (CtVariableAccess) ret;
                cl = var.getType().getActualClass();
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
            Log.debug("");
        }
        return cl != null && instanceOfArray(cl);
    }

    protected boolean instanceOfCollection(Class cl) {
        return Collection.class.isAssignableFrom(cl);
    }

    protected boolean instanceOfArray(Class cl) {
        return cl.isArray();
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public Transformation query() throws QueryException {
        ShuffleCollectionBeforeReturn transformation = new ShuffleCollectionBeforeReturn();
        CodeFragment transplantationPoint;

        Random random = new Random();
        CtCodeSnippetStatement snippet = inputProgram.getFactory().Core().createCodeSnippetStatement();
        CodeFragment transplant = new Statement(snippet);
        if(random.nextBoolean()) {
            transplantationPoint = returnsCollection.get(random.nextInt(returnsCollection.size()));
            String transplantationPointString = transplantationPoint.getCtCodeFragment().toString();
            String varName = varName(transplantationPoint);
            snippet.setValue("java.util.Collections.shuffle(" + varName + ");\n" +
                             transplantationPointString);
        } else {
            transplantationPoint = returnsArray.get(random.nextInt(returnsArray.size()));
            String transplantationPointString = transplantationPoint.getCtCodeFragment().toString();
            String varName = varName(transplantationPoint);
            snippet.setValue( "java.util.Random rnd = new java.util.Random();\n" +
                                     "for (int i = " + varName + ".length - 1; i > 0; i--){\n" +
                                     "  int index = rnd.nextInt(i + 1);\n" +
                                     "  "+ getArrayType(transplantationPoint) +" a = " + varName + "[index];\n" +
                                     "  " + varName + "[index] = " + varName + "[i];\n" +
                                     "  " + varName + "[i] = a;\n" +
                                     "}\n" +
                                      transplantationPointString);
        }

        snippet.setParent(transplantationPoint.getCtCodeFragment().getParent());
        transformation.setTransplantationPoint(transplantationPoint);
        transformation.setTransplant(transplant);

        return transformation;
    }

    private String getArrayType(CodeFragment stmt) {
        Object ret = ((CtReturn) stmt.getCtCodeFragment()).getReturnedExpression();
        if (ret instanceof CtVariableReference) {
            CtVariableReference var = (CtVariableReference) ret;
            return ((CtArrayTypeReference)var.getType()).getComponentType().toString();
        } else {
            CtVariableAccess var = (CtVariableAccess) ret;
            return  ((CtArrayTypeReference) var.getType()).getComponentType().toString();
        }
    }


    protected String varName(CodeFragment stmt) {
        Object ret = ((CtReturn) stmt.getCtCodeFragment()).getReturnedExpression();
        if (ret instanceof CtVariableReference) {
            CtVariableReference var = (CtVariableReference) ret;
            return var.getSimpleName();
        } else {
            CtVariableAccess var = (CtVariableAccess) ret;
            return var.getVariable().getSimpleName();
        }

    }
}
