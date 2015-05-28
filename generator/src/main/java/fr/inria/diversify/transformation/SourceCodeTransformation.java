package fr.inria.diversify.transformation;

import spoon.compiler.Environment;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Simon on 30/10/14.
 */
@Deprecated
public abstract class SourceCodeTransformation extends SingleTransformation {


    /**
     * Applies the transformations and saves into the destination directory.
     *
     * @param destinationDir The parent directory to store the transformation. The transformation
     *                       will try maintain the project structure. For example if we try to
     *                       apply an transformation over org.pack.myclass, destination dir
     *                       could be 'modified/src/main/java' and the file will be save in
     *                       'modified/src/main/java/org/pack/myclass.java'
     * @throws Exception
     */
    public void apply(String destinationDir) throws Exception {

        addSourceCode();

        printJavaFile(destinationDir);
        removeSourceCode();
    }

    /**
     * Restores the original code and stores it in the destination directory
     *
     * @param destinationDir The parent directory to store the transformation. The transformation
     *                       will try maintain the project structure. For example if we try to
     *                       apply an transformation over org.pack.myclass, destination dir
     *                       could be 'modified/src/main/java' and the file will be save in
     *                       'modified/src/main/java/org/pack/myclass.java'
     * @throws Exception
     */
    public void restore(String destinationDir) throws Exception {
        if(parent != null) {
            parent.restore(destinationDir);
        }
        removeSourceCode();
        printJavaFile(destinationDir);
    }

    public abstract void addSourceCode() throws Exception;

    public abstract void removeSourceCode();

    public void applyWithParent(String srcDir) throws Exception {
        addSourceCode();

        printJavaFile(srcDir);

        if (parent != null) {
            parent.apply(srcDir);

        }
        removeSourceCode();
    }

    protected String getTransformationString(CtElement transplantPoint) throws Exception {
//        CtElement parentMethod = getParentMethod(transplantPoint);
//        SourcePosition sp = parentMethod.getPosition();
//        CompilationUnit compileUnit = sp.getCompilationUnit();
//        Environment env = compileUnit.getFactory().getEnvironment();
//        addSourceCode();
//
//        FragmentDrivenJavaPrettyPrinter printer = new FragmentDrivenJavaPrettyPrinter(env);
//        printer.calculate(compileUnit,null);
//        String[] code = printer.getResult().split("\n");
//        removeSourceCode();
//
//        int begin = sp.getLine() - 1;
//        int end = getLineEnd(parentMethod) + code.length - printer.getResult().split("\n").length;
//
//        return Arrays.stream(code, begin, end)
//                     .collect(Collectors.joining("\n"));
        return null;
    }

}
