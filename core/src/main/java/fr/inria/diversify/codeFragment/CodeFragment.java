package fr.inria.diversify.codeFragment;

import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
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


    /**
     * Source code string
     */
    protected String equalString;

    /**
     * Position string <Fully_qualified_name>:<Line_number>
     */
    private String positionString;

    public void init(CtCodeElement cf) {
        codeFragment = cf;
        context = new Context(initInputContext(), initOutputContext());
    }

    /**
     * Returns the simple name of the Code fragment's type
     * @return A string with the name
     */
    public String getCodeFragmentTypeSimpleName() {
        return getCodeFragmentType().getSimpleName();
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
            return getFactory().Type().createReference(void.class);
    }

    protected Factory getFactory() {
        return codeFragment.getFactory();
    }

    protected InputContext initInputContext() {
        VariableVisitor visitor = new VariableVisitor();
        codeFragment.accept(visitor);
        return visitor.input();
    }

    @Override
    public String toString() {
        String tmp =" Source: " + codeFragment;
        tmp += "\nPosition:" + codeFragment.getPosition();
        tmp += "\nInput:" + getInputContext();
        tmp += "\nOutput: " + getOutputContext();
        return tmp;
    }

    public abstract String codeFragmentString();

    public String equalString() {
        if (equalString != null)
            return equalString;
        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(getFactory().getEnvironment());
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
            Log.trace("No replacement where made, varMapping null or zero size");
            return;
        }
        Log.trace("replace variable");
        Log.trace("before: {}", codeFragment);

        for (String varName: varMapping.keySet()) {
            CtVariableReference variable = getInputContext().getVariableOrFieldNamed(varName);
            CtVariableReference candidate = other.getInputContext().getVariableOrFieldNamed(varMapping.get(varName));
            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            codeFragment.accept(visitor);
        }

        if(codeFragment instanceof CtLocalVariableImpl)
            ((CtLocalVariableImpl)codeFragment).setSimpleName(((CtLocalVariableImpl) other.codeFragment).getSimpleName());

        Log.trace("after: {}",codeFragment);
    }

    //validate if this can be replaced by other
    public abstract  boolean isReplaceableBy(CodeFragment other, boolean varNameMatch , boolean subType);

    public Map<String,String> randomVariableMapping(CodeFragment other, boolean subType) {
        return randomVariableMapping(other.getInputContext(), subType);
    }

    public Map<String,String> randomVariableMapping(InputContext otherInputContext, boolean subType) {
        Map<String,String> varMap = new HashMap<>();
        Random r = new Random();

        for (CtVariableReference<?> variable : otherInputContext.getVar()) {
            List<CtVariableReference> list = getInputContext().allCandidate(variable.getType(), subType);
            if ( list.size() > 0 ) {
                CtVariableReference candidate = list.get(r.nextInt(list.size()));
                varMap.put(variable.toString(), candidate.toString());
            }
        }
        return varMap;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("position", positionString());
        object.put("type", getCodeFragmentType().getSimpleName());
        object.put("sourcecode", equalString());
        return object;
    }

    public String positionString() {
        if ( positionString == null ) {
            StringBuilder sb = new StringBuilder();
            sb.append(getSourcePackage().getQualifiedName()).append(".").
                    append(getSourceClass().getSimpleName()).append(":").append(codeFragment.getPosition().getLine());
            positionString = sb.toString();
        }
        return positionString;
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

    public CtType<?> getSourceClass() {
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

    public abstract CodeFragment clone();

    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        try {
            tmp.setParent(elem.getParent());
        } catch (Exception e) {}
        return tmp;
    }
}

