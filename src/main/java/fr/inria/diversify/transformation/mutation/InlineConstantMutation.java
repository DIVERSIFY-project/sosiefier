package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtLocalVariable;
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
 * Time: 17:30
 */
public class InlineConstantMutation extends AbstractTransformation {
    private CtLocalVariable inlineConstant;

    public void setInlineConstant(CtLocalVariable inlineConstant) {
        this.inlineConstant = inlineConstant;
    }

    public InlineConstantMutation() {
        name = "inlineConstant";
        type = "mutation";
    }

    @Override
    public void addSourceCode() throws Exception {
        Log.debug("transformation: {}, {}",type,name);
        Log.debug("statement:\n {}", inlineConstant);
        Log.debug("--------------------\npostion:\n{}", inlineConstant.getPosition());
        CtLiteral literal = (CtLiteral)inlineConstant.getDefaultExpression();
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
        CtSimpleType<?> type = inlineConstant.getPosition().getCompilationUnit().getMainType();
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public void removeSourceCode() {
        CompilationUnit compileUnit = inlineConstant.getPosition().getCompilationUnit();
        if(compileUnit.getSourceCodeFraments() != null)
            compileUnit.getSourceCodeFraments().clear();
    }



    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("position", inlineConstant.getParent(CtPackage.class).getQualifiedName()
                + "." + inlineConstant.getParent(CtSimpleType.class).getSimpleName() + ":" + inlineConstant.getPosition().getLine());

        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(inlineConstant.getFactory().getEnvironment());
        inlineConstant.accept(pp);
        object.put("inlineConstant", pp.toString());

        return object;
    }

    public String classLocationName() {
        return inlineConstant.getParent(CtSimpleType.class).getQualifiedName();
    }
    public String packageLocationName() {
        return inlineConstant.getParent(CtPackage.class).getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = inlineConstant.getParent(CtExecutable.class);
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
        return "LocalVariable";
    }

    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        InlineConstantMutation otherMutation = (InlineConstantMutation)other;

        return status == otherMutation.status &&
                failures.equals(otherMutation.failures) &&
                inlineConstant.equals(otherMutation.inlineConstant) &&
                inlineConstant.getPosition().equals(otherMutation.inlineConstant.getPosition());
    }

    @Override
    public int line() {
        return inlineConstant.getPosition().getLine();
    }

    public  int hashCode() {
        return super.hashCode() * inlineConstant.getPosition().hashCode() *
                line();
    }
}
