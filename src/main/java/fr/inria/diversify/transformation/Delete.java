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

/**
 * User: Simon
 * Date: 7/9/13
 * Time: 4:12 PM
 */
public class Delete extends Transformation {

    @Override
    public void apply(String srcDir) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass();

        System.out.println("cfToDelete:\n " + toReplace);
        System.out.println(toReplace.getCtCodeFragment().getPosition());

//        printJavaFile(srcDir, originalClass);
        printJavaFile("/Users/Simon/Documents/code/diversify-statements/tmp", originalClass);

    }


    protected void printJavaFile(String repository, CtSimpleType<?> type) throws IOException {
        Environment env = type.getFactory().getEnvironment();
        CompilationUnit compileUnit = type.getPosition().getCompilationUnit();
        SourcePosition sp = toReplace.getCtCodeFragment().getPosition();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));
        env.useSourceCodeFragments(true);
        processor.setFactory(type.getFactory());

        int r = sp.getSourceEnd() - sp.getSourceStart();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "//delete", r));
        processor.createJavaFile(type);

        compileUnit.getSourceCodeFraments().clear();
        System.out.println("copy file: "+repository+" " +type.getQualifiedName());
    }


    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("CodeFragmentDelete", toReplace.toJSONObject());
        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

        return object;
    }

    public void setCodeFragmentToDelete(CodeFragment codeFragmentToDelete) {
        this.toReplace = codeFragmentToDelete;
    }
}
