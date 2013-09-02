package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.processing.Environment;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.CtSimpleType;
import spoon.support.JavaOutputProcessor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:15 PM
 */
public abstract class Transformation {
    protected List<CodeFragment> transforms;
    protected Integer failures;
    protected List<Transformation> parents;

    public Transformation() {
        transforms = new ArrayList<CodeFragment>();
        parents = new ArrayList<Transformation>();
    }

    public abstract void writeHead(BufferedWriter sb, char separator) throws IOException;
    public abstract void write(StringBuffer sb, char separator);
    public abstract JSONObject toJSONObject() throws JSONException;

    public void apply(String srcDir) throws Exception {
        for(CodeFragment trans : transforms)
            addSourceCode(trans);

        for(CodeFragment trans : transforms)  {
            printJavaFile(srcDir, getOriginalClass(trans));
//            printJavaFile("/Users/Simon/Documents/code/diversify-statements/tmp",  getOriginalClass(trans));
        }

        for(CodeFragment trans : transforms)
            removeSourceCode(getOriginalClass(trans));
    }

    protected abstract void addSourceCode(CodeFragment cf) throws Exception;

    public void restore(String srcDir) throws Exception {
        for (CodeFragment cf : transforms) {
            restore(srcDir, getOriginalClass(cf));
        }
    }

    protected void printJavaFile(String repository, CtSimpleType<?> type) throws IOException {
        Environment env = type.getFactory().getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));
        env.useSourceCodeFragments(true);
        processor.setFactory(type.getFactory());

        processor.createJavaFile(type);
        System.out.println("copy file: "+repository+" " +type.getQualifiedName());
    }

    protected void removeSourceCode(CtSimpleType<?> type) {
        CompilationUnit compileUnit = type.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFraments().clear();
    }

    protected void restore(String srcDir,CtSimpleType<?> originalClass) throws Exception {
        String fileToCopy = originalClass.getPosition().getFile().toString();
        String destination = srcDir+ "/"+originalClass.getQualifiedName().replace('.', '/') + ".java";
//        Runtime r = Runtime.getRuntime();
//        Process p = r.exec("cp " + fileToCopy + " " + destination);
        System.out.println("restore file: " + fileToCopy + " -> " + destination);
        FileUtils.copyFile(originalClass.getPosition().getFile(), new File(destination));
//        p.waitFor();
//        Thread.sleep(1000);
    }

    public CtSimpleType<?> getOriginalClass(CodeFragment cf) {
        return cf.getCompilationUnit().getMainType();
    }

    public void addCodeFragmentToTransform(CodeFragment cf) {
        transforms.add(cf);
    }

    public void addParent(Transformation p) {
        parents.add(p);
    }

    public List<CodeFragment> getTransformation() {
        return transforms;
    }

    public void setJUnitResult(Integer result) {
        failures = result;
    }

    public int numberOfFailure() {
        return failures;
    }

    public abstract Replace toReplace() throws Exception;
    public abstract Add toAdd() throws Exception;
    public abstract Delete toDelete() throws Exception;

    public abstract void add(Transformation replace);

    public String positionString() {
        String ret = "";
        for(CodeFragment cf : transforms) {
            ret = ret + cf.positionString() + "\n";
        }
        return ret;
    }
}
