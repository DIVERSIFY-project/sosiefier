package fr.inria.diversify.transformation.other;

import fr.inria.diversify.transformation.SpoonTransformation;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;

/**
 * Created by Simon on 19/03/14.
 */
public class ReplaceNew extends SpoonTransformation<CtNewClass, CtNewClass> {


    public void restore(String srcDir) throws Exception {
        if(parent != null) {
            parent.removeSourceCode();
            parent.printJavaFile(srcDir);
        }
        removeSourceCode();
        printJavaFile(srcDir);
    }


    public void addSourceCode() {
        logInfo();

        SourcePosition sp = transformationPoint.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+transplant.toString(), 0));
    }

    public void removeSourceCode() {
        CompilationUnit compileUnit = transformationPoint.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFragments().clear();
    }
}

