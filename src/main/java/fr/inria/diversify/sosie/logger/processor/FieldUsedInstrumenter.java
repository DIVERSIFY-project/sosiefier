package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.ModifierKind;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Simon on 16/07/14.
 */
public class FieldUsedInstrumenter extends AbstractLoggingInstrumenter<CtExpression> {


    public FieldUsedInstrumenter(List<Transformation> transformations) {
        super(transformations);
    }

    @Override
    public void process(CtExpression expression) {
        if(expression instanceof CtAssignment) {
            CtAssignment assignment = (CtAssignment) expression;

            if (isField(assignment.getAssigned())) {
                CtVariableAccess var = (CtVariableAccess) assignment.getAssigned();
                instruField(expression, (CtField) var.getVariable().getDeclaration(), false);
            }
        }
        if(expression instanceof CtInvocation) {
            CtInvocation invocation = (CtInvocation) expression;
            if(isField(invocation.getTarget())) {
                CtVariableAccess var = (CtVariableAccess) invocation.getTarget();
                instruField(expression, (CtField) var.getVariable().getDeclaration(), true);
            }
        }
    }

    protected void instruField(CtExpression expression, CtField field, boolean before) {
        boolean isStaticVar = field.getModifiers().contains(ModifierKind.STATIC);

        if (!isStaticVar && getMethod(expression) != null) {
            String id = idFor(getClass(expression).getQualifiedName() + "." + getMethod(expression).getSignature());

            String snippet = "\n\t"+ getLogName() + ".writeVar(" + getCount(expression) +",Thread.currentThread(),\"" + id + "\",\"" +idFor(field.getSimpleName()) + "\"," + field.getSimpleName() + ");";

            SourcePosition sp = expression.getPosition();
            CompilationUnit compileUnit = sp.getCompilationUnit();
            int index;
            if(before) {
                index = compileUnit.beginOfLineIndex(sp.getSourceEnd());
            } else {
                index = compileUnit.nextLineIndex(sp.getSourceEnd());
            }
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
        }
    }

    protected boolean isField(CtExpression expression) {
        if (expression instanceof CtVariableAccess) {
            CtVariableAccess var = (CtVariableAccess) expression;
            if (var.getVariable().getDeclaration() instanceof CtField) {
                return true;
            }
        }
        return false;
    }
}
