package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
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



    public void addSourceCode() {
        Log.debug("transformation: {}, {}",type,name);
        Log.debug("operator:\n {}", operator);
        Log.debug("--------------------\npostion:\n{}",operator.getPosition());
        CtElement mutant = getMutantOperator();
        SourcePosition sp = operator.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+mutant.toString(), 0));
    }


    public void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = operator.getPosition().getCompilationUnit().getMainType();
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public void removeSourceCode() {
        CompilationUnit compileUnit = operator.getPosition().getCompilationUnit();
        if(compileUnit.getSourceCodeFraments() != null)
            compileUnit.getSourceCodeFraments().clear();
    }


    protected abstract CtElement getMutantOperator();


    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("position", operator.getParent(CtPackage.class).getQualifiedName()
                + "." + operator.getParent(CtSimpleType.class).getSimpleName() + ":" + operator.getPosition().getLine());

        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(operator.getFactory().getEnvironment());
        operator.accept(pp);
        object.put("binaryOperator", pp.toString());

        return object;
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
    public String getLevel() {
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

    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        BinaryOperatorMutation otherMutation = (BinaryOperatorMutation)other;

        return status == otherMutation.status &&
                failures.equals(otherMutation.failures) &&
               operator.equals(otherMutation.operator) &&
               operator.getPosition().equals(otherMutation.operator.getPosition());
    }

    public  int hashCode() {
        return super.hashCode() * operator.getPosition().hashCode() *
                operator.getPosition().getLine();
    }

    public CtBinaryOperator<?> getOperator() {
        return operator;
    }

    public void setOperator(CtBinaryOperator<?> operator) {
        this.operator = operator;
    }

    @Override
    public String getTransformationString() throws Exception {
        return getTransformationString(operator);
    }
}
