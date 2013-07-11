package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.processing.Environment;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtSimpleType;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * User: Simon
 * Date: 7/9/13
 * Time: 5:13 PM
 */
public class Add extends Transformation {
    protected CodeFragment cfToAdd;
    protected Map<String, String> variableMapping;
    protected boolean before = true;

    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("CodeFragmentPosition", toReplace.toJSONObject());
        object.put("CodeFragmentToAdd", cfToAdd.toJSONObject());
        object.put("VariableMapping", variableMapping);
        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

        return object;
    }


    public void apply(String srcDir) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass();

        System.out.println("cfPosition:\n " + toReplace);
        System.out.println(toReplace.getCtCodeFragment().getPosition());
        System.out.println("cfToAdd\n " + cfToAdd);
        Map<String, String> varMapping = toReplace.randomVariableMapping(cfToAdd); //tmp
        System.out.println("random variable mapping: " + varMapping);
        cfToAdd.replaceVar(toReplace, varMapping);  //tmp

        printJavaFile(srcDir, originalClass);
    }


    protected void printJavaFile(String repository, CtSimpleType<?> type) throws IOException {
        Environment env = type.getFactory().getEnvironment();
        CompilationUnit compileUnit = type.getPosition().getCompilationUnit();
        SourcePosition sp = toReplace.getCtCodeFragment().getPosition();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));
        env.useSourceCodeFragments(true);
        processor.setFactory(type.getFactory());

        int index  = 0;
        if(before)
            index = sp.getSourceStart();
        else
            index = sp.getSourceEnd();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, cfToAdd.codeFragmentString(), 0));
        processor.createJavaFile(type);

        compileUnit.getSourceCodeFraments().clear();
        System.out.println("copy file: "+repository+" " +type.getQualifiedName());
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() != this.getClass())
            return false;
        Replace t = (Replace)o;

        return toReplace.getCtCodeFragment().getPosition().equals(t.toReplace.getCtCodeFragment().getPosition())
                && cfToAdd.id() == t.replacedBy.id() && variableMapping.equals(t.variableMapping);
    }

    @Override
    public int hashCode() {
        return toReplace.id() * toReplace.getCtCodeFragment().getPosition().hashCode() + cfToAdd.id() + variableMapping.hashCode();
    }

    public void setStatementToAdd(CodeFragment statementToAdd) {
        this.cfToAdd = statementToAdd;
    }
}
