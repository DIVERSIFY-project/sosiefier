package fr.inria.diversify.transformation.cvl;

import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtField;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 15:09
 */
public class LinkExistence extends CVLTransformation {

    public LinkExistence() {
        type= "cvl";
        name = "linkExistence";
    }

    @Override
    public void apply(String srcDir) throws Exception {
        if(object instanceof CtField) {
            SourcePosition sp = object.getPosition();
            CompilationUnit compileUnit = sp.getCompilationUnit();

            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/", 0));

            printJavaFile(srcDir);
            removeSourceCode(object);
        }

    }

    @Override
    public void restore(String srcDir) throws Exception {
        removeSourceCode(object);
        printJavaFile(srcDir);
    }
}
