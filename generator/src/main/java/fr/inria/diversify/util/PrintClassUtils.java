package fr.inria.diversify.util;

import spoon.compiler.Environment;
import spoon.processing.ProcessingManager;
import spoon.processing.Processor;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 11/02/16
 * Time: 16:45
 */
public class PrintClassUtils {

    public static void printAllClasses(Factory factory, File out, File fileFrom) {
        Environment env = factory.getEnvironment();
        Processor processor = new JavaOutputProcessorWithFilter(out, new DefaultJavaPrettyPrinter(env), allClassesName(fileFrom));
        try {
            ProcessingManager pm = new QueueProcessingManager(factory);
            pm.addProcessor(processor);
            pm.process(factory.Package().getRootPackage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected static List<String> allClassesName(File dir) {
        List<String> list = new ArrayList<>();

        for(File file : dir.listFiles())
            if(file.isDirectory())
                list.addAll(allClassesName(file));
            else {
                String name = file.getName();
                if(name.endsWith(".java")) {
                    String[] tmp = name.substring(0, name.length() - 5).split("/");
                    list.add(tmp[tmp.length - 1]);
                }
            }
        return list;
    }

    public static void printJavaFile(File directory, CtType type) throws IOException {
        try {
            Factory factory = type.getFactory();
            Environment env = factory.getEnvironment();

            JavaOutputProcessor processor = new JavaOutputProcessor(directory, new DefaultJavaPrettyPrinter(env));
            processor.setFactory(factory);

            processor.createJavaFile(type);
            Log.trace("write type {} in directory {}", type.getQualifiedName(), directory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
