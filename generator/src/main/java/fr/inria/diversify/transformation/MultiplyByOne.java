/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Method;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.exception.BuildTransplantException;
import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

/**
 *
 * @author nicolas
 */
public class MultiplyByOne extends ASTTransformation {
    
    public MultiplyByOne () {
        type = "special";
        name = "multiplyByOne";
    }
    
    public MultiplyByOne(CodeFragment transplantationPoint) {
        type = "special";
        name = "multiplyByOne";
        this.transplantationPoint = transplantationPoint;
    }

    public MultiplyByOne(List<CodeFragment> transplantationPoints) {
        type = "special";
        name = "multiplyByOne";
        this.transplantationPoints = transplantationPoints;
    }

    protected CtExpression<Boolean> multiply;
    private List<CodeFragment> transplantationPoints;
    @Override
    public boolean usedOfSubType() {
        return false;
    } @Override
    protected void applyInfo() {

    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();
        


        if(transplantationPoints != null) {
            int i = 0;
            for(CodeFragment tp : this.transplantationPoints) {
                object.put("transplantationPoint-"+i, tp.toJSONObject());
                i++;
            }
        } else {
            object.put("transplantationPoint", transplantationPoint.toJSONObject());
            JSONObject conditionJSON = new JSONObject();
//        conditionJSON.put("position", multiply.getParent(CtType.class).getQualifiedName() + ":" + multiply.getPosition().getLine());
//        conditionJSON.put("type", multiply.getClass().getSimpleName());
            conditionJSON.put("sourcecode", multiply.toString());
            object.put("multiply",conditionJSON);
        }
        return object;
    }

    public void applyMono(CodeFragment tp) throws Exception {
        transplantationPoint = tp;
        Factory factory = getInputProgram().getFactory();
        CtTypeReference tInt = factory.Type().INTEGER_PRIMITIVE;
        CtLiteral one = factory.Core().createLiteral();
        one.setValue(1);
        CtReturn retStmt = (CtReturn) tp.getCtCodeFragment();

        CtBinaryOperator retExpression = factory.Core().createBinaryOperator();
        retExpression.setKind(BinaryOperatorKind.MUL);
        retExpression.setRightHandOperand(retStmt.getReturnedExpression());
        retExpression.setLeftHandOperand(one);

        multiply = retExpression;
        CtReturn retStmt2 = (CtReturn) factory.Core().clone(tp.getCtCodeFragment());
        retStmt2.setReturnedExpression(retExpression);
        tp.getCtCodeFragment().replace(retStmt2);
    }

    @Override
    public void apply(String srcDir) throws Exception {
        try {
            if(transplantationPoints != null) {
                for(CodeFragment tp : this.transplantationPoints) {
                    applyMono(tp);
                }
            } else {
                applyMono(transplantationPoint);
            }
            printJavaFile(srcDir);
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApplyTransformationException("error in replace", e);
        }
    }

    @Override
    public CtCodeElement buildReplacementElement() throws BuildTransplantException {
        return null;
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        super.restore(srcDir);
    }
    
}
