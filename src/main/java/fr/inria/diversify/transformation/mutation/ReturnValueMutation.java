package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.codeFragmentProcessor.ReturnProcessor;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
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
 * Date: 17/02/14
 * Time: 17:29
 */
public class ReturnValueMutation extends AbstractTransformation {
    protected CtReturn ret;


    public  ReturnValueMutation() {
        type = "mutation";
        name = "returnValue";
    }

    public void setReturn(CtReturn ret) {
        this.ret = ret;
    }

    @Override
    public void addSourceCode() throws Exception {
        Log.debug("transformation: {}, {}",type,name);
        Log.debug("return:\n {}", ret);
        Log.debug("--------------------\npostion:\n{}", ret.getPosition()); 
        CtLiteral literal = (CtLiteral)ret.getReturnedExpression();
        String type = literal.getType().getSimpleName();
        String newLiteral = null;

        if(type.equals("boolean")) {
            newLiteral = !((Boolean)literal.getValue()) + "";
        } else if(type.equals("short")) {
            newLiteral = ((Short)literal.getValue() + 1) + "";
        } else if(type.equals("int")) {
            newLiteral = ((Integer)literal.getValue() + 1) + "";
        } else if(type.equals("long")) {
            newLiteral = ((Long)literal.getValue() + 1) + "";
        } else if(type.equals("byte")) {
            newLiteral = ((Byte)literal.getValue() + 1) + "";
        } else if(type.equals("float")) {
            newLiteral = ((Float)literal.getValue() + 1.0f) + "";
        } else if(type.equals("double")) {
            newLiteral = ((Double)literal.getValue() + 1.0d) + "";
        }

        SourcePosition sp = literal.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+newLiteral, 0));
    }

    public void restore(String srcDir) throws Exception {
        removeSourceCode();
        printJavaFile(srcDir);
    }

    public void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = ret.getPosition().getCompilationUnit().getMainType();
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public void removeSourceCode() {
        CompilationUnit compileUnit = ret.getPosition().getCompilationUnit();
        if(compileUnit.getSourceCodeFraments() != null)
            compileUnit.getSourceCodeFraments().clear();
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("position", ret.getParent(CtPackage.class).getQualifiedName()
                + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine());

        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(ret.getFactory().getEnvironment());
        ret.accept(pp);
        object.put("return", pp.toString());

        return object;
    }

    public String classLocationName() {
        return ret.getParent(CtSimpleType.class).getQualifiedName();
    }
    public String packageLocationName() {
        return ret.getParent(CtPackage.class).getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = ret.getParent(CtExecutable.class);
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
        return "Return";
    }

    @Override
    public int line() {
        return ret.getPosition().getLine();
    }

    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        ReturnValueMutation otherMutation = (ReturnValueMutation)other;

        return status == otherMutation.status &&
                failures.equals(otherMutation.failures) &&
                ret.equals(otherMutation.ret);
    }

}
