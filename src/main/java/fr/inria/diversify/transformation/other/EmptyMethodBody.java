package fr.inria.diversify.transformation.other;

import fr.inria.diversify.transformation.SpoonTransformation;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

/**
 * Created by Simon on 09/04/14.
 */
public class EmptyMethodBody extends SpoonTransformation<CtMethod, CtElement> {

    @Override
    public void addSourceCode() throws Exception {
        logInfo();

        SourcePosition sp = transformationPoint.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**", 0));
        sp = transformationPoint.getBody().getPosition();
        compileUnit = sp.getCompilationUnit();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n"+newMethod().toString()+"\n", 0));
    }

    protected CtMethod newMethod() {
        Factory factory = transformationPoint.getFactory();
        CtMethod newMethod = factory.Core().clone(transformationPoint);

        newMethod.setAnnotations(new ArrayList<CtAnnotation<? extends Annotation>>());

        CtBlock body = factory.Core().createBlock();
        body.setParent(newMethod);

        String type = newMethod.getType().getSimpleName();
        if(!(type.equals("void") || type.equals("Void"))) {
            CtReturn ret = factory.Core().createReturn();
            ret.setParent(body);
            body.addStatement(ret);

            CtCodeSnippetExpression<Object> voidValue = factory.Core().createCodeSnippetExpression();
            voidValue.setValue("null");

            ret.setReturnedExpression(voidValue);

        }
        newMethod.setBody(body);

        return newMethod;
    }
}
