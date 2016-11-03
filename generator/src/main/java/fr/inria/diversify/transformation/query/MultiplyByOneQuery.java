/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.MultiplyByOne;
import fr.inria.diversify.transformation.Transformation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtVariableReference;

/**
 *
 * @author nicolas
 */
public class MultiplyByOneQuery extends TransformationQuery {
    protected List<CodeFragment> returnStatementList;

    public MultiplyByOneQuery(InputProgram inputProgram) {
        super(inputProgram);
        initFindReturnStatements();
    }

    protected void initFindReturnStatements() {
        returnStatementList = new ArrayList<>();

        for (CodeFragment cf : getInputProgram().getCodeFragments()) {
            if (isReturnInt(cf.getCtCodeFragment())) {
                returnStatementList.add(cf);
            }
        }
        Collections.shuffle(returnStatementList);
    }

    protected boolean isReturnInt(CtElement stmt) {
        if (stmt instanceof CtReturn) {
            CtReturn ret = (CtReturn) stmt;
            if(ret.getReturnedExpression() != null) {
                try {
                    if (ret.getReturnedExpression().getType().getActualClass() == int.class) return true;
                } catch (Exception e) {

                }
            }

        }
        return false;
    }

    @Override
    public Transformation query() throws QueryException {
        MultiplyByOne result;
        if(!returnStatementList.isEmpty())
            result = new MultiplyByOne(returnStatementList);
        else
            result = new MultiplyByOne();
        result.setInputProgram(getInputProgram());
        
        return result;
    }
    
}
