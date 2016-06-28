package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.exception.BuildTransplantException;
import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.CoreFactory;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by aelie on 30/01/15.
 */
public class CheckReturnTransformation extends ASTTransformation {

    protected CtExpression<Boolean> condition;
    protected boolean returnInThen = true;
    protected String exception;
    protected Map<String, String> variableMapping;
    protected boolean withVariableMapping = true;
    protected boolean throwBranchCoverage = false;

    public CheckReturnTransformation(CodeFragment transplantationPoint, CtExpression<Boolean> condition, boolean returnInThen, boolean withVariableMapping) {
        name = "checkReturn";
        type = "special";

        this.transplantationPoint = transplantationPoint;
        this.condition = condition;
        this.returnInThen = returnInThen;
        this.withVariableMapping = withVariableMapping;
        findException(transplantationPoint.getCtCodeFragment().getParent(CtMethod.class));
    }

    public CheckReturnTransformation() {
        name = "checkReturn";
        type = "special";
    }

    @Override
    public boolean usedOfSubType() {
        return true;
    }

    @Override
    protected void applyInfo() {

    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("transplantationPoint", transplantationPoint.toJSONObject());

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


    @Override
    public void apply(String srcDir) throws Exception {
        try {
            Factory factory = getInputProgram().getFactory();
            CtIf ifStmt = factory.Core().createIf();
            ifStmt.setCondition(factory.Core().clone(condition));
            Statement ifStatement = new Statement(ifStmt);

            if (withVariableMapping && variableMapping == null) {
                variableMapping = transplantationPoint.randomVariableMapping(ifStatement, subType);
            }

            if(withVariableMapping) {
                Log.debug("random variable mapping: {}", variableMapping);
                ifStatement.replaceVar(transplantationPoint, variableMapping);
            }
            CtBlock returnBlock = factory.Core().createBlock();
            returnBlock.addStatement((CtStatement) factory.Core().clone(transplantationPoint.getCtCodeFragment()));

            CtBlock throwBlock = factory.Core().createBlock();
            throwBlock.addStatement(logSnippet(factory, srcDir));
            CtCodeSnippetStatement elseSnippet = factory.Code().createCodeSnippetStatement("throw new " + exception + "()");
            throwBlock.addStatement(elseSnippet);

            if(returnInThen) {
                ifStmt.setThenStatement(returnBlock);
                ifStmt.setElseStatement(throwBlock);
            } else {
                ifStmt.setThenStatement(throwBlock);
                ifStmt.setElseStatement(returnBlock);
            }

            copyTransplant = ifStatement.getCtCodeFragment();

            transplantationPoint.getCtCodeFragment().replace(copyTransplant);
            printJavaFile(srcDir);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApplyTransformationException("error in replace", e);
        }
    }

    @Override
    public CtCodeElement buildReplacementElement() throws BuildTransplantException {
        return null;
    }

    protected void findException(CtMethod method) {
        if(method.getThrownTypes().isEmpty()) {
            exception = "java.lang.RuntimeException";
        } else {
            Random r = new Random();
            List<CtTypeReference> exceptions = new ArrayList<>(method.getThrownTypes());
            exception = exceptions.get(r.nextInt(exceptions.size())).getQualifiedName();
        }
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            loadThrowBranchCoverage(srcDir);
        } catch (IOException e) {}
        super.restore(srcDir);
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

    protected void loadThrowBranchCoverage(String srcDir) throws IOException {
        File scrFile = new File(srcDir);
        File logBranch = new File(scrFile.getAbsolutePath() + "/logThrowBranch");
        if(logBranch.exists()) {
            throwBranchCoverage = true;
            FileUtils.forceDelete(logBranch);
        }
    }




    public void setCondition(CtExpression<Boolean> condition) {
        this.condition = condition;
    }

    public void setReturnInThen(boolean returnInThen) {
        this.returnInThen = returnInThen;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public void setWithVariableMapping(boolean withVariableMapping) {
        this.withVariableMapping = withVariableMapping;
    }

    public void setVarMapping(Map<String,String> variableMapping) {
        this.variableMapping = variableMapping;
    }

    public void setThrowBranchCoverage(boolean throwBranchCoverage) {
        this.throwBranchCoverage = throwBranchCoverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckReturnTransformation that = (CheckReturnTransformation) o;

        if (returnInThen != that.returnInThen) return false;
        if (withVariableMapping != that.withVariableMapping) return false;
        if (throwBranchCoverage != that.throwBranchCoverage) return false;
        if (!transplantationPoint.equals(that.transplantationPoint)) return false;
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
        result = 31 * result + transplantationPoint.hashCode();
        result = 31 * result + (variableMapping != null ? variableMapping.hashCode() : 0);
        result = 31 * result + (withVariableMapping ? 1 : 0);
        result = 31 * result + (throwBranchCoverage ? 1 : 0);
        return result;
    }
}
