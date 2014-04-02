package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.SpoonTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 13/02/14
 * Time: 14:40
 */
public abstract class BinaryOperatorMutation extends SpoonTransformation<CtBinaryOperator, CtElement> {


    public void addSourceCode() {
        logInfo();
        CtElement mutant = getMutantOperator();
        SourcePosition sp = transformationPoint.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+mutant.toString(), 0));
    }

    protected abstract CtElement getMutantOperator();


    @Override
    public String getLevel() {
        return "AST";
    }

    @Override
    public String stmtType() {
        return "BinaryOperator";
    }


    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        BinaryOperatorMutation otherMutation = (BinaryOperatorMutation)other;

        return status == otherMutation.status &&
                failures.equals(otherMutation.failures) &&
                transformationPoint.equals(otherMutation.transformationPoint) &&
                transformationPoint.getPosition().equals(otherMutation.transformationPoint.getPosition());
    }

}
