package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.cu.CompilationUnit;
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
 * Date: 25/02/14
 * Time: 15:36
 */
public abstract class CVLTransformation extends AbstractTransformation {
    protected CtElement element;

    protected void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = getOriginalClass(element);
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public CtSimpleType<?> getOriginalClass(CtElement cf) {
        return element.getPosition().getCompilationUnit().getMainType();
    }

    public String classLocationName() {
        CtSimpleType c = element.getParent(CtSimpleType.class);
        if(c == null && element instanceof CtSimpleType)
            c = (CtSimpleType)element;
        if(c == null)
            return "null";

        return c.getQualifiedName();
    }
    public String packageLocationName() {
        CtPackage p = element.getParent(CtPackage.class);
        if(p == null && element instanceof CtPackage)
            p = (CtPackage)element;

        return p.getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = element.getParent(CtExecutable.class);
        if(elem != null)
            return elem.getSimpleName();

        return "null";
    }


    @Override
    public String getLevel() {
        return "AST";
    }

    @Override
    public String stmtType() {
        return element.getClass().getSimpleName();
    }

    @Override
    public int line() {
        return element.getPosition().getLine();
    }

    protected void removeSourceCode(CtElement e) {

        CompilationUnit compileUnit = e.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFraments().clear();
    }

    public void setObject(CtElement object) {
        this.element = object;
    }

    public CtElement getObject() {
        return element;
    }
}
