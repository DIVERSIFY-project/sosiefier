package fr.inria.diversify.codeFragment;

import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import fr.inria.diversify.transformation.ReplaceVariableVisitor;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.Factory;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.support.reflect.code.CtLocalVariableImpl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 3:21 PM
 */
public abstract class CodeFragment {
    protected Context context;
    protected CtCodeElement codeFragment;
    protected String equalString;

    public abstract void init(Object cf);

    public void init() {
        context = new Context(initInputContext(), initOutputContext());
        this.initOutputContext();
        this.initInputContext();
    }


    public CtTypeReference<?> getOutputContext() {
        return context.getOutputContext();
    }


    public InputContext getInputContext() {
        return context.getInputContext();
    }

    protected CtTypeReference<?> initOutputContext() {
        if (codeFragment instanceof CtTypedElement) {
            return ((CtTypedElement<?>) codeFragment).getType();

        } else
            return Factory.getLauchingFactory().Type().createReference(void.class);
    }

    protected InputContext initInputContext() {
        VariableVisitor visitor = new VariableVisitor();
        codeFragment.accept(visitor);
        return visitor.input();
    }


    @Override
    public String toString() {
        String tmp = "Input:" + getInputContext();
        tmp = tmp + "\nOutput: " + getOutputContext() + "\nSource: " + codeFragment;
        return tmp;
    }

    public String codeFragmentString() {
        String string = codeFragment.toString();
//        if(string.trim().endsWith("}"))
            return string;
//        else
//            return string+";";
    }

    public String equalString() {
        if (equalString != null)
            return equalString;
        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(codeFragment.getFactory().getEnvironment());
        codeFragment.accept(pp);
        equalString = pp.toString();
        return equalString;
    }
    //attention !!!!!!!
    public boolean equals(Object other) {
        if(!(other instanceof CodeFragment))
            return  false;

        return equalString().equals(((CodeFragment) other).equalString())
                && positionString().equals(((CodeFragment) other).positionString());
    }
    public  int hashCode() {
        return 1;
    }

    public void replaceVar(CodeFragment other, Map<String,String> varMapping) {
        Log.debug("replace variable");
        Log.debug("avant:");
        Log.debug("{}",codeFragment);
        for (String varName: varMapping.keySet()) {
            Object variable = getInputContext().getVariableOrFieldNamed(varName);
            Object candidate = other.getInputContext().getVariableOrFieldNamed(varMapping.get(varName));
            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            codeFragment.accept(visitor);

        }

        if(codeFragment instanceof CtLocalVariableImpl)
            ((CtLocalVariableImpl)codeFragment).setSimpleName(((CtLocalVariableImpl) other.codeFragment).getSimpleName());

        Log.debug("apres: {}",codeFragment);
    }

    public CodeFragment replace(CodeFragment other, Map<String,String> varMapping) {
        Log.debug("replace");
        Log.debug("avant: {}", codeFragment);
        Log.debug("{}",codeFragment.getParent());
        codeFragment.replace(other.codeFragment);

        CodeFragment newStatement = getNewStatement(other.getCtCodeFragment());

        for (String varName: varMapping.keySet()) {
            Object variable = newStatement.getInputContext().getVariableOrFieldNamed(varName);
            Object candidate = getInputContext().getVariableOrFieldNamed(varMapping.get(varName));
            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            newStatement.codeFragment.accept(visitor);
        }

        if(codeFragment instanceof CtLocalVariableImpl)
            ((CtLocalVariableImpl)newStatement.codeFragment).setSimpleName(((CtLocalVariableImpl) codeFragment).getSimpleName());
        Log.debug("apres: {}",codeFragment.getParent());

        return newStatement;
    }

    protected CodeFragment getNewStatement(CtCodeElement other) {
        Statement newStatement = null;
        SubStatementVisitor sub = new SubStatementVisitor();
        codeFragment.getParent().accept(sub);

        for(CtStatement statement: sub.getStatements())
            if(statement.getPosition().equals(other.getPosition()))
                newStatement = new Statement(statement);
        return newStatement;
    }


    //check if this can be replaced by other
    public abstract  boolean isReplace(CodeFragment other);

    public Map<String,String> randomVariableMapping(CodeFragment other) {
        Map<String,String> varMap = new HashMap<String, String>();
        Random r = new Random();

        for (CtVariableReference<?> variable : other.getInputContext().getLocalVar()) {
            List<Object> list = getInputContext().allCandidate(variable.getType());
            Object candidate = list.get(r.nextInt(list.size()));
            varMap.put(variable.toString(), candidate.toString());
        }
        for (CtFieldAccess<?> variable : other.getInputContext().getField()) {
            List<CtFieldAccess> list = getInputContext().allCandidateForFieldAccess(variable.getType());
            Object candidate = list.get(r.nextInt(list.size()));
            varMap.put(variable.toString(), candidate.toString());
        }
        return varMap;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("Position", positionString());
        object.put("Type", getCodeFragmentType().getSimpleName());
        object.put("InputContext", new JSONArray(getInputContext().inputContextToString()));
        object.put("OutputContext", getOutputContext().toString());
        object.put("SourceCode", equalString());
        return object;
    }

    public String positionString() {
        return getSourcePackage().getQualifiedName()+"."+getSourceClass().getSimpleName()+ ":" +codeFragment.getPosition().getLine();
    }

    public CtTypeReference<?> getMethodReturnType() {
        CtMethod mth = codeFragment.getParent(CtMethod.class);
        if(mth != null)
            return mth.getType();

        return  null;
    }
    protected CtTypeReference<?> hasReturn() {
        SubStatementVisitor sub = new SubStatementVisitor();
        codeFragment.accept(sub);
        for(CtStatement stm : sub.getStatements())
            if(stm instanceof CtReturn)
                return getMethodReturnType();

        return  null;
    }

    public CtCodeElement getCtCodeFragment()  {
        return codeFragment;
    }

    public Context getContext() {
        return context;
    }

    public Class<?> getCodeFragmentType() {
        return codeFragment.getClass();
    }

    public CtSimpleType<?> getSourceClass() {
        return codeFragment.getParent(CtSimpleType.class);
    }

    public int getStartLine() {
//        try {
            return codeFragment.getPosition().getLine();
//        } catch (Exception e) {
//            Log.warn("no position for {}",codeFragment);
//            return Integer.MAX_VALUE;
//        }
    }

    public int getEndLine() {
//        try {
            return codeFragment.getPosition().getEndLine();
//        } catch (Exception e) {
//            Log.warn("no position for {}",codeFragment);
//            return Integer.MAX_VALUE;
//        }
    }

    public CtPackage getSourcePackage() {
        return getSourceClass().getPackage();
    }

    public int id() {
        return equalString().hashCode() + context.hashCode();
    }

    public File getSourceFile() {
        return codeFragment.getPosition().getFile();
    }
    public CompilationUnit getCompilationUnit() {
        return codeFragment.getPosition().getCompilationUnit();
    }

    public Class<?> getCodeFragmentSuperType() {
       if(codeFragment instanceof CtIf
               || codeFragment instanceof CtCase
               || codeFragment instanceof CtLoop
               || codeFragment instanceof CtSynchronized
               || codeFragment instanceof CtTry)
           return CtBlock.class;
//        if(codeFragment instanceof CtExpression)
//            return CtExpression.class;
       return CtStatement.class;
    }
}

