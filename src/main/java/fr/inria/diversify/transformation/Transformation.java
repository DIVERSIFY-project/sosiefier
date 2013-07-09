package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.declaration.CtSimpleType;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 11:05 AM
 */
public abstract class Transformation {
    protected CodeFragment toReplace;
    protected Integer failures;

    public abstract JSONObject toJSONObject() throws JSONException;
    public abstract void apply(String srcDir) throws Exception;

    public void restore(String srcDir) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass();
        String fileToCopy = originalClass.getPosition().getFile().toString();
        String destination = srcDir+ "/"+originalClass.getQualifiedName().replace('.', '/') + ".java";
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("cp " + fileToCopy + " " + destination);

        System.out.println("restore file: " + fileToCopy + " -> " + destination);
        p.waitFor();
    }

    public void setStatementToReplace(CodeFragment jsonObject) {
        toReplace = jsonObject;
    }

    public void setJUnitResult(Integer result) {
        failures = result;
    }

    public CtSimpleType getSourceClass() {
        return toReplace.getSourceClass();
    }

    public Class geCodeFragmentType() {
        return toReplace.getCodeFragmentType();
    }

    public int numberOfFailure() {
        return failures;
    }

    public CodeFragment getToReplace() {
        return toReplace;
    }

    public CtSimpleType<?> getOriginalClass() {
        return toReplace.getCompilationUnit().getMainType();
    }

}
