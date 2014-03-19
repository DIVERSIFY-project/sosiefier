package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.transformation.AbstractTransformation;
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
public abstract class CVLTransformation extends AbstractTransformation {
    protected CtElement object;

    public void printJavaFile(String directory) throws IOException {
        printJavaFile(directory, null);
    }

    protected void printJavaFile(String directory, CtSimpleType<?> cl) throws IOException {
        CtSimpleType<?> type;
        if(cl == null)
            type = getOriginalClass(object);
        else
            type = cl;
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

    public void removeSourceCode(CtElement e) {
        CompilationUnit compileUnit = e.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFraments().clear();
    }

    public void removeSourceCode() {
        removeSourceCode(object);
    }

    public void setObject(CtElement object) {
        this.object = object;
    }

    public CtElement getObject() {
        return object;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = super.toJSONObject();

        json.put("objectPosition", object.getParent(CtPackage.class).getQualifiedName()
                + "." + object.getPosition().getCompilationUnit().getMainType().getSimpleName() + ":" + object.getPosition().getLine());

        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(object.getFactory().getEnvironment());
        object.accept(pp);
//        json.put("object", pp.toString());
        json.put("nodeType", stmtType());

        return json;
    }
}
