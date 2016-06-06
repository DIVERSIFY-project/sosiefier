package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.exception.BuildTransplantException;
import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.CoreFactory;
import spoon.reflect.reference.CtTypeReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by aelie on 30/01/15.
 */
public class CheckReturnTransformation extends ASTReplace {

    protected String exception;
    protected CtTypeReference thrownException = null;

    public CheckReturnTransformation() {
        name = "checkReturn";
        type = "special";
    }

    public CheckReturnTransformation(CodeFragment transplantationPoint, CodeFragment copyTransplant) {
        this.transplantationPoint = transplantationPoint;
        this.transplant = copyTransplant;
        name = "checkReturn";
        type = "special";
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("exception", exception);

        return object;
    }

    @Override
    public CtCodeElement buildReplacementElement() {
        try {
            CodeFragment ifStatement = transplant.clone();
            if (withVarMapping()) {
                if (variableMapping == null) {
                    variableMapping = transplantationPoint.randomVariableMapping(getTransplant(), subType);
                }
            }

            Log.debug("random variable mapping: {}", variableMapping);
            ifStatement.replaceVar(transplantationPoint, variableMapping);
            CoreFactory factory = transplant.getCtCodeFragment().getFactory().Core();
            CtBlock thenBlock = factory.createBlock();
            thenBlock.addStatement((CtStatement) factory.clone(transplantationPoint.getCtCodeFragment()));
            ((CtIf) ifStatement.getCtCodeFragment()).setThenStatement(thenBlock);
            if (((CtIf) ifStatement.getCtCodeFragment()).getElseStatement() == null) {
                CtBlock elseBlock = factory.createBlock();
                CtCodeSnippetStatement elseSnippet = factory.createCodeSnippetStatement();
                elseSnippet.setValue("throw new " + exception + "()");
                elseBlock.addStatement(elseSnippet);
                ((CtIf) ifStatement.getCtCodeFragment()).setElseStatement(elseBlock);
            }
            return ifStatement.getCtCodeFragment();
        } catch (Exception e) {
            throw new RuntimeException(new BuildTransplantException("", e));
        }
    }

    @Override
    public void apply(String srcDir) throws Exception {
        if(exception == null) {
            setException(transplantationPoint.getCtCodeFragment().getParent(CtMethod.class));
        }
        CtMethod method = transplantationPoint.getCtCodeFragment().getParent(CtMethod.class);
        CoreFactory factory = transplant.getCtCodeFragment().getFactory().Core();
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

    protected void setException(CtMethod method) {
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

    @Override
    protected boolean withVarMapping() {
        return true;
    }
}
