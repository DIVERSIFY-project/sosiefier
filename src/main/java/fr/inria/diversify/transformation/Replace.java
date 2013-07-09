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
 * Time: 10:07 AM
 */
public class Replace extends Transformation {
    protected CodeFragment replacedBy;
    protected Map<String, String> variableMapping;

    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("StatementToReplace", toReplace.toJSONObject());
        object.put("StatementReplacedBy", replacedBy.toJSONObject());
        object.put("VariableMapping", variableMapping);
        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

        return object;
    }


    public void apply(String srcDir) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass();

        System.out.println("cfToReplace:\n " + toReplace);
        System.out.println(toReplace.getCtCodeFragment().getPosition());
        System.out.println("cfReplacedBy\n " + replacedBy);
        Map<String, String> varMapping = toReplace.randomVariableMapping(replacedBy); //tmp
        System.out.println("random variable mapping: " + varMapping);
        replacedBy.replaceVar(toReplace, varMapping);  //tmp

        if(replacedBy.codeFragmentString().equals(toReplace.codeFragmentString()))
            throw new Exception("same statment");

        printJavaFile(srcDir, originalClass);
    }


    protected void printJavaFile(String repository, CtSimpleType<?> type) throws IOException {
        Environment env = type.getFactory().getEnvironment();
        CompilationUnit compileUnit = type.getPosition().getCompilationUnit();
        SourcePosition sp = toReplace.getCtCodeFragment().getPosition();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));
        env.useSourceCodeFragments(true);
        processor.setFactory(type.getFactory());

        int r =sp.getSourceEnd() -sp.getSourceStart();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "//delete", r));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), replacedBy.codeFragmentString(), 0));
        processor.createJavaFile(type);

        compileUnit.getSourceCodeFraments().clear();
        System.out.println("copy file: "+repository+" " +type.getQualifiedName());
    }


    public void setStatementReplacedBy(CodeFragment jsonObject) {
        replacedBy = jsonObject;
    }

    public void setVariableMapping(Map<String, String> varMapping) {
        variableMapping = varMapping;
    }

    public CodeFragment getReplaceBy() {
        return replacedBy;
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() != this.getClass())
            return false;
        Replace t = (Replace)o;

        return toReplace.getCtCodeFragment().getPosition().equals(t.toReplace.getCtCodeFragment().getPosition())
                && replacedBy.id() == t.replacedBy.id() && variableMapping.equals(t.variableMapping);
    }

    @Override
    public int hashCode() {
        return toReplace.id() * toReplace.getCtCodeFragment().getPosition().hashCode() +replacedBy.id() + variableMapping.hashCode();
    }

}
