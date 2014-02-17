package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.transformation.AbstractTransformation;
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
public abstract class BinaryOperatorMutation extends AbstractTransformation {
    CtBinaryOperator<?> operator;


    @Override
    public void apply(String srcDir) throws Exception {
        addSourceCode();
        printJavaFile(srcDir);
        removeSourceCode();
    }

    protected void addSourceCode() {
        Log.debug("conditional boundary mutation");
        Log.debug("operator:\n {}", operator);
        Log.debug("--------------------\npostion:\n{}",operator.getPosition());
        CtElement mutant = getMutantOperator();
        SourcePosition sp = operator.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+mutant.toString(), 0));
    }

    public void restore(String srcDir) throws Exception {
        printJavaFile(srcDir);
    }

    protected void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = operator.getPosition().getCompilationUnit().getMainType();
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    protected void removeSourceCode() {
        CompilationUnit compileUnit = operator.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFraments().clear();
    }


    protected abstract CtElement getMutantOperator();


    @Override
    public JSONObject toJSONObject() throws JSONException {
        return null;
    }


    public String classLocationName() {
        return operator.getParent(CtSimpleType.class).getQualifiedName();
    }
    public String packageLocationName() {
        return operator.getParent(CtPackage.class).getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = operator.getParent(CtExecutable.class);
        if(elem != null)
            return elem.getSimpleName();
        return "field";
    }


    @Override
    public String level() {
        return "AST";
    }

    @Override
    public String stmtType() {
        return "BinaryOperator";
    }

    @Override
    public int line() {
        return operator.getPosition().getLine();
    }


    public CtBinaryOperator<?> getOperator() {
        return operator;
    }

    public void setOperator(CtBinaryOperator<?> operator) {
        this.operator = operator;
    }
}
