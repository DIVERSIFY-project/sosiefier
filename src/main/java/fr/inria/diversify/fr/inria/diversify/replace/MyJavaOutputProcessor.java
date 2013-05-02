package fr.inria.diversify.fr.inria.diversify.replace;

import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.PrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 3:03 PM
 */


/**
 * A processor that generates compilable Java source files from the meta-model.
 */
public class MyJavaOutputProcessor extends JavaOutputProcessor {


    List<File> printedFiles = new ArrayList<File>();

    boolean writePackageAnnotationFile = true;

    /**
     * Creates a new processor for generating Java source files.
     *
     * @param outputDirectory
     *            the root output directory
     */
    public MyJavaOutputProcessor(File outputDirectory) {
        super(outputDirectory);

    }

    public List<File> getCreatedFiles() {
        return printedFiles;
    }



    Map<String, Map<Integer, Integer>> lineNumberMappings = new HashMap<String, Map<Integer, Integer>>();

    /**
     * Creates the Java file associated to the given element.
     */
    public void createJavaFile(CtSimpleType<?> element) {
        CompilationUnit cu = null;
        if (element.getPosition() != null)
            cu = element.getPosition().getCompilationUnit();

//        // skip non-main types
//        if (cu != null && cu.getMainType() != element)
//            return;

//        System.out.println("print class in "+directory+":\n"+element);

        for (CtSimpleType<?> t : cu.getDeclaredTypes()) {
            String name = cu.getFile().getName();
            name = name.substring(0, name.lastIndexOf("."));
            if (t.getSimpleName().equals(name)) {
                cu.getDeclaredTypes().remove(t);
                cu.getDeclaredTypes().add((CtSimpleType)element);
                break;
            }
        }


        List<CtSimpleType<?>> toBePrinted = new ArrayList<CtSimpleType<?>>();

        if (cu == null) {
            toBePrinted.add(element);
        } else {
            toBePrinted.addAll(cu.getDeclaredTypes());
        }

        PrettyPrinter printer = null;

//        if (getEnvironment().isUsingSourceCodeFragments()) {
//            try {
//                printer = new FragmentDrivenJavaPrettyPrinter(getEnvironment(),
//                        element.getPosition().getCompilationUnit());
//            } catch (Exception e) {
//                e.printStackTrace();
//                printer = null;
//            }
//        }
//        if (printer == null) {
            printer = new DefaultJavaPrettyPrinter(getEnvironment());
            printer.calculate(cu,toBePrinted);
//        }

        CtPackage pack = element.getPackage();
        PrintStream stream = null;

        // Check output directory
        if (getOutputDirectory() == null)
            throw new RuntimeException(
                    "You should set output directory before printing");
        // Create spooned dir
        if (getOutputDirectory().isFile())
            throw new RuntimeException("Output must be a directory");
        if (!getOutputDirectory().exists()) {
            if (!getOutputDirectory().mkdirs())
                throw new RuntimeException("Error creating output directory");
        }

        // create package directory
        File packageDir;
        if (pack.getQualifiedName().equals(CtPackage.TOP_LEVEL_PACKAGE_NAME)) {
            packageDir = new File(getOutputDirectory().getAbsolutePath());
        } else {
            // Create current package dir
            packageDir = new File(getOutputDirectory().getAbsolutePath()
                    + File.separatorChar
                    + pack.getQualifiedName().replace('.', File.separatorChar));
        }
        if (!packageDir.exists()) {
            if (!packageDir.mkdirs())
                throw new RuntimeException("Error creating output directory");
        }

//        // Create package annotation file
//        if (writePackageAnnotationFile
//                && element.getPackage().getAnnotations().size() > 0) {
//            File packageAnnot = new File(packageDir.getAbsolutePath()
//                    + File.separatorChar
//                    + DefaultJavaPrettyPrinter.JAVA_PACKAGE_DECLARATION);
//            if (!printedFiles.contains(packageAnnot))
//                printedFiles.add(packageAnnot);
//            try {
//                stream = new PrintStream(packageAnnot);
//                stream.println(printer.getPackageDeclaration());
//                stream.close();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } finally {
//                if (stream != null)
//                    stream.close();
//            }
//        }

        // print type
        try {
            File file = new File(packageDir.getAbsolutePath()
                    + File.separatorChar + element.getSimpleName()
                    + DefaultJavaPrettyPrinter.JAVA_FILE_EXTENSION);
            file.createNewFile();
            if (!printedFiles.contains(file)) {
                printedFiles.add(file);
            }
            stream = new PrintStream(file);
            stream.print(printer.getResult());
            for (CtSimpleType<?> t : toBePrinted) {
                lineNumberMappings.put(t.getQualifiedName(), printer
                        .getLineNumberMapping());
            }
            stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (stream != null)
                stream.close();
        }

    }
}
