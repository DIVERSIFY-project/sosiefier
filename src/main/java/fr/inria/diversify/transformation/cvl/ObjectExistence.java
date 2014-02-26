package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtExpression;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;

import java.io.IOException;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 15:05
 */
public class ObjectExistence extends CVLTransformation {

    public ObjectExistence() {
        type= "cvl";
        name = "objectExistence";
    }

    @Override
    public void apply(String srcDir) throws Exception {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object ({}):\n {}", element.getClass().getSimpleName(), element);
        Log.debug("\npositiom:{}", element.getPosition());
        if(element instanceof CtPackage)
            applyToPackage(srcDir);
        else if(element instanceof CtSimpleType)
            applyToClass(srcDir, element);
        else {

            SourcePosition sp = element.getPosition();
            CompilationUnit compileUnit = sp.getCompilationUnit();

            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
            if(element instanceof CtExpression)
                compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/null", 0));
            else
                compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/", 0));

            printJavaFile(srcDir);
            removeSourceCode(element);
        }

    }

    protected void applyToClass(String srcDir, CtElement cl) throws IOException {

        SourcePosition sp = cl.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/", 0));

        printJavaFile(srcDir);
        removeSourceCode(element);
    }

    protected void applyToPackage(String srcDir) throws IOException {
        for(CtSimpleType<?> cl : ((CtPackage)element).getTypes()) {
            applyToClass(srcDir,cl);
            printJavaFile(srcDir);
            removeSourceCode(cl);
        }
    }

    @Override
    public void restore(String srcDir) throws Exception {
        if(element instanceof CtPackage)
            restorePackage(srcDir);
        else if(element instanceof CtSimpleType)
            restoreClass(srcDir, element);
        else {
            removeSourceCode(element);
            printJavaFile(srcDir);
        }
    }

    protected void restorePackage(String srcDir) throws IOException {
        for(CtSimpleType<?> cl : ((CtPackage)element).getTypes()) {
            restoreClass(srcDir, cl);
            printJavaFile(srcDir);
        }
    }

    protected void restoreClass(String srcDir, CtElement cl) throws IOException {
        printJavaFile(srcDir);
    }
}
