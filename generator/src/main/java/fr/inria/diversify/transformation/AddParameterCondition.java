package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.Method;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.*;
import java.util.*;

/**
 * User: Simon
 * Date: 08/06/16
 * Time: 16:14
 */
public class AddParameterCondition extends SingleTransformation {

    protected CtExpression<Boolean> condition;
    protected Method method;
    protected CtMethod copyMethod;

    protected Map<String, String> variableMapping;
    protected boolean withVariableMapping = true;
    protected boolean returnInThen = true;
    protected String exception;
    protected boolean throwBranchCoverage = false;

    public AddParameterCondition(Method method, CtExpression<Boolean> condition) {
        type = "special";
        name = "addParameterCondition";
        this.method = method;
        this.condition = condition;
        findException();
    }

    public AddParameterCondition() {
        type = "special";
        name = "addParameterCondition";
    }

    @Override
    public String classLocationName() {
        return getPosition().getCompilationUnit().getMainType().getQualifiedName();
    }

    @Override
    public String packageLocationName() {
        CtPackage p = method.getCtCodeFragment().getParent(CtPackage.class);
        return p.getQualifiedName();
    }

    @Override
    public String methodLocationName() {
        return method.getCtCodeFragment().getSimpleName();
    }

    @Override
    public SourcePosition getPosition() {
        return method.getCtCodeFragment().getPosition();
    }

    @Override
    public int line() {
        return getPosition().getLine();
    }

    @Override
    public void printJavaFile(String directory) throws IOException {
        CtType<?> type = getPosition().getCompilationUnit().getMainType();
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("write type {} in directory {}", type.getQualifiedName(), directory);
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public void apply(String srcDir) throws Exception {
        Factory factory = method.getCtCodeFragment().getFactory();
        copyMethod = factory.Core().clone(method.getCtCodeFragment());

        CtIf ctIf = factory.Core().createIf();
        ctIf.setCondition(factory.Core().clone(condition));
        Statement ifStmt = new Statement(ctIf);

        if (withVariableMapping && variableMapping == null) {
            variableMapping = method.randomVariableMapping(ifStmt, true);
        }
        if(withVariableMapping) {
            Log.debug("random variable mapping: {}", variableMapping);
            ifStmt.replaceVar(method, variableMapping);
        }

        CtBlock oldBody = factory.Core().createBlock();
        oldBody.addStatement(factory.Core().clone(method.getCtCodeFragment().getBody()));

        CtBlock throwBlock = factory.Core().createBlock();
        throwBlock.addStatement(logSnippet(factory, srcDir));
        CtCodeSnippetStatement elseSnippet = factory.Code().createCodeSnippetStatement("throw new " + exception + "()");
        throwBlock.addStatement(elseSnippet);

        if(returnInThen) {
            ctIf.setThenStatement(oldBody);
            ctIf.setElseStatement(throwBlock);
        } else {
            ctIf.setThenStatement(throwBlock);
            ctIf.setElseStatement(oldBody);
        }

        CtBlock<Object> newBody = factory.Core().createBlock();
        newBody.addStatement(ctIf);
        method.getCtCodeFragment().setBody(newBody);

        printJavaFile(srcDir);
    }


    public CtCodeSnippetStatement logSnippet(Factory factory, String srcDir) {
        File scrFile = new File(srcDir);
        String snippet = "try {\n"
                + "java.io.PrintWriter p = new java.io.PrintWriter(\"" + scrFile.getAbsolutePath() + "/logThrowBranch\");\n"
                + "p.write(\"b\");\n"
                + "p.close();\n"
                + "} catch (java.io.FileNotFoundException e) {}";

        return factory.Code().createCodeSnippetStatement(snippet);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            loadThrowBranchCoverage(srcDir);
        } catch (IOException e) {
        }
        try {
            method.getCtCodeFragment().replace(copyMethod);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }

    protected void loadThrowBranchCoverage(String srcDir) throws IOException {
        File scrFile = new File(srcDir);
        File logBranch = new File(scrFile.getAbsolutePath() + "/logThrowBranch");
        if(logBranch.exists()) {
            throwBranchCoverage = true;
            FileUtils.forceDelete(logBranch);
        }
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("method", method.toJSONObject());

        JSONObject conditionJSON = new JSONObject();
        conditionJSON.put("position", condition.getParent(CtType.class).getQualifiedName() + ":" + condition.getPosition().getLine());
        conditionJSON.put("type", condition.getClass().getSimpleName());
        conditionJSON.put("sourcecode", condition.toString());
        object.put("condition",conditionJSON);
        object.put("throwBranchCoverage", throwBranchCoverage);

        if(withVariableMapping) {
            object.put("variableMap", variableMapping);
        }

        object.put("exception", exception);
        object.put("returnInThen", returnInThen);

        return object;
    }

    protected void findException() {
        if(method.getCtCodeFragment().getThrownTypes().isEmpty()) {
            exception = "java.lang.RuntimeException";
        } else {
            Random r = new Random();
            List<CtTypeReference> exceptions = new ArrayList<>(method.getCtCodeFragment().getThrownTypes());
            exception = exceptions.get(r.nextInt(exceptions.size())).getQualifiedName();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddParameterCondition that = (AddParameterCondition) o;

        if (returnInThen != that.returnInThen) return false;
        if (withVariableMapping != that.withVariableMapping) return false;
        if (throwBranchCoverage != that.throwBranchCoverage) return false;
        if (!method.equals(that.method)) return false;
        if (!condition.equals(that.condition)) return false;
        if (!exception.equals(that.exception)) return false;
        return variableMapping != null ? variableMapping.equals(that.variableMapping) : that.variableMapping == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + condition.hashCode();
        result = 31 * result + (returnInThen ? 1 : 0);
        result = 31 * result + exception.hashCode();
        result = 31 * result + method.hashCode();
        result = 31 * result + (variableMapping != null ? variableMapping.hashCode() : 0);
        result = 31 * result + (withVariableMapping ? 1 : 0);
        result = 31 * result + (throwBranchCoverage ? 1 : 0);
        return result;
    }

    public void setReturnInThen(boolean returnInThen) {
        this.returnInThen = returnInThen;
    }

    public void setVariableMapping(Map<String, String> variableMapping) {
        this.variableMapping = variableMapping;
    }

    public void setWithVariableMapping(boolean withVariableMapping) {
        this.withVariableMapping = withVariableMapping;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public void setCondition(CtExpression<Boolean> condition) {
        this.condition = condition;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public void setThrowBranchCoverage(boolean throwBranchCoverage) {
        this.throwBranchCoverage = throwBranchCoverage;
    }
}
