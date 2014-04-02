package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.SpoonTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 15:36
 */
public abstract class CVLTransformation<P extends CtElement, T extends CtElement> extends SpoonTransformation<P, T> {


    @Override
    public String getLevel() {
        return "AST";
    }

    @Override
    public String stmtType() {
        return transformationPoint.getClass().getSimpleName();
    }
}
