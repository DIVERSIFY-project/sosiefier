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
    protected CtElement object;

    protected void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = getOriginalClass(object);
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public CtSimpleType<?> getOriginalClass(CtElement cf) {
        return object.getPosition().getCompilationUnit().getMainType();
    }

    public String classLocationName() {
        CtSimpleType c = object.getParent(CtSimpleType.class);
        if(c == null && object instanceof CtSimpleType)
            c = (CtSimpleType) object;
        if(c == null)
            return "null";

        return c.getQualifiedName();
    }
    public String packageLocationName() {
        CtPackage p = object.getParent(CtPackage.class);
        if(p == null && object instanceof CtPackage)
            p = (CtPackage) object;

        return p.getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = object.getParent(CtExecutable.class);
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
        return object.getClass().getSimpleName();
    }

    @Override
    public int line() {
        return object.getPosition().getLine();
    }

    protected void removeSourceCode(CtElement e) {

        CompilationUnit compileUnit = e.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFraments().clear();
    }

    public void setObject(CtElement object) {
        this.object = object;
    }

    public CtElement getObject() {
        return object;
    }
}
