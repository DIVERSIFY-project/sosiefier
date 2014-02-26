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
        if(element instanceof CtField) {
            SourcePosition sp = element.getPosition();
            CompilationUnit compileUnit = sp.getCompilationUnit();

            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/", 0));

            printJavaFile(srcDir);
            removeSourceCode(element);
        }

    }

    @Override
    public void restore(String srcDir) throws Exception {
        removeSourceCode(element);
        printJavaFile(srcDir);
    }
}
