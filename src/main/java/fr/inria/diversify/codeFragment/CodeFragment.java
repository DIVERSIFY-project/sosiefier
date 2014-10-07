package fr.inria.diversify.codeFragment;

import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import fr.inria.diversify.transformation.ReplaceVariableVisitor;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.support.reflect.code.CtLocalVariableImpl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * The code fragment is the basic unit of diversification. Also known as "Reaction"
 *
 * User: Simon
 * Date: 5/3/13
 * Time: 3:21 PM
 */
public abstract class CodeFragment {

    /**
     * Context of the Code fragment, see article by Baudry, et. al "Tailored Source Code Transformations to Synthesize
     * Computationally Diverse Program Variants" 2013
     */
    protected Context context;

    /**
     * An Spoon code fragment
     */
    protected CtCodeElement codeFragment;


    protected String equalString;

    public void init(CtCodeElement cf) {
        codeFragment = cf;
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
            return FactoryImpl.getLauchingFactory().Type().createReference(void.class);
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

    public abstract String codeFragmentString();

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

        CodeFragment otherCf =  (CodeFragment) other;

        return equalString().equals(otherCf.equalString())
                && positionString().equals(otherCf.positionString());
    }
    public  int hashCode() {
        return 1;
    }

    public void replaceVar(CodeFragment other, Map<String,String> varMapping) {
        if ( varMapping == null || varMapping.size() == 0 ) {
            Log.debug("No replacement where made, varMapping null or zero size");
            return;
        }
        Log.debug("replace variable");
        Log.debug("avant:");
        Log.debug("{}",codeFragment);
        for (String varName: varMapping.keySet()) {
            CtVariableReference variable = getInputContext().getVariableOrFieldNamed(varName);
            CtVariableReference candidate = other.getInputContext().getVariableOrFieldNamed(varMapping.get(varName));
            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            codeFragment.accept(visitor);
        }

        if(codeFragment instanceof CtLocalVariableImpl)
            ((CtLocalVariableImpl)codeFragment).setSimpleName(((CtLocalVariableImpl) other.codeFragment).getSimpleName());

        Log.debug("apres: {}",codeFragment);
    }

    //check if this can be replaced by other
    public abstract  boolean isReplaceableBy(CodeFragment other, boolean varNameMatch , boolean subType);

    public Map<String,String> randomVariableMapping(CodeFragment other, boolean subType) {
        Map<String,String> varMap = new HashMap<>();
        Random r = new Random();

        for (CtVariableReference<?> variable : other.getInputContext().getVar()) {
            List<CtVariableReference> list = getInputContext().allCandidate(variable.getType(), subType);
            CtVariableReference candidate = list.get(r.nextInt(list.size()));
            varMap.put(variable.toString(), candidate.toString());
        }
        return varMap;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("position", positionString());
        object.put("type", getCodeFragmentType().getSimpleName());
//        object.put("inputContext", new JSONArray(getInputContext().inputContextToString()));
//        object.put("outputContext", getOutputContext().toString());
//        object.put("sourceCode", equalString());
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
        return getCompilationUnit().getMainType();
    }

    public int getStartLine() {
        return codeFragment.getPosition().getLine();
    }

    public int getEndLine() {
        return codeFragment.getPosition().getEndLine();
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

