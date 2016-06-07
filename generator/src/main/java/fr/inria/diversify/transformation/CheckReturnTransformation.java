package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.exception.BuildTransplantException;
import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.CoreFactory;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;

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
    protected CtTypeReference thrownException = null;
    protected Map<String, String> variableMapping;
    protected boolean withVariableMapping = true;

    public CheckReturnTransformation(CodeFragment transplantationPoint, CtExpression<Boolean> condition, boolean returnInThen, boolean withVariableMapping) {
        name = "checkReturn";
        type = "special";

        this.transplantationPoint = transplantationPoint;
        this.condition = condition;
        this.returnInThen = returnInThen;
        this.withVariableMapping = withVariableMapping;
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

        if(withVariableMapping) {
            object.put("variableMap", variableMapping);
        }

        object.put("exception", exception);
        object.put("returnInThen", returnInThen);

        return object;
    }

    @Override
    public CtCodeElement buildReplacementElement() {
        try {
            Factory factory = getInputProgram().getFactory();
            CtIf ifStmt = factory.Core().createIf();
            ifStmt.setCondition(factory.Core().clone(condition));
            CodeFragment ifStatement = new Statement(ifStmt);

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
            CtCodeSnippetStatement elseSnippet = factory.Code().createCodeSnippetStatement("throw new " + exception + "()");
            throwBlock.addStatement(elseSnippet);

            if(returnInThen) {
                ifStmt.setThenStatement(returnBlock);
                ifStmt.setElseStatement(throwBlock);
            } else {
                ifStmt.setThenStatement(throwBlock);
                ifStmt.setElseStatement(returnBlock);
            }

            return ifStatement.getCtCodeFragment();
        } catch (Exception e) {
            throw new RuntimeException(new BuildTransplantException("", e));
        }
    }

    @Override
    public void apply(String srcDir) throws Exception {
        if(exception == null) {
            findException(transplantationPoint.getCtCodeFragment().getParent(CtMethod.class));
        }
        CtMethod method = transplantationPoint.getCtCodeFragment().getParent(CtMethod.class);
        CoreFactory factory = getInputProgram().getFactory().Core();
        boolean exceptionAlreadyPresent = false;
        for(Object thrownTypes : method.getThrownTypes()) {
            if(((CtTypeReference)thrownTypes).getQualifiedName().equalsIgnoreCase(exception)) {
                exceptionAlreadyPresent = true;
                break;
            }
        }
        if(!exceptionAlreadyPresent) {
            thrownException = factory.createTypeReference();
            thrownException.setSimpleName(exception);
            method.addThrownType(thrownException);
        }
        super.apply(srcDir);
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
        CtMethod method = transplantationPoint.getCtCodeFragment().getParent(CtMethod.class);
        if(thrownException != null) {
            method.removeThrownType(thrownException);
        }
        super.restore(srcDir);
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

    @Override
    public void updateStatementList() {

    }

    public void setVarMapping(Map<String,String> variableMapping) {
        this.variableMapping = variableMapping;
    }
}
