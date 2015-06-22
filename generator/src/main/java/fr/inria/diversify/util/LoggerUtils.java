package fr.inria.diversify.util;

import fr.inria.diversify.diversification.InputProgram;
import org.apache.commons.io.FileUtils;
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
 * Date: 18/03/15
 * Time: 13:36
 */
public class LoggerUtils {

    public static List<String> allClassesName(File dir) {
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

    @Deprecated
    public static void copyLogger(InputProgram inputProgram, String outputDirectory, Class classLogger) throws IOException {
        File dir = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir() + "/fr/inria/diversify/testamplification/logger");
        FileUtils.forceMkdir(dir);

        String packagePath = System.getProperty("user.dir") + "/profiling/src/main/java/fr/inria/diversify/testamplification/logger/";
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.Logger.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.ShutdownHookLog.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.LogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + classLogger.getSimpleName() + ".java"),dir);
    }

    public static void copyLoggerFile(InputProgram inputProgram, String outputDirectory, String loggerPackage) throws IOException {
        copyLoggerFile(inputProgram.getRelativeSourceCodeDir(), outputDirectory, loggerPackage);
    }

    public static void copyLoggerFile(String mainSrc, String outputDirectory, String loggerPackage) throws IOException {
        File srcDir = new File(System.getProperty("user.dir") + "/profiling/src/main/java/"  + loggerPackage.replace(".","/"));

        File destDir = new File(outputDirectory + "/" + mainSrc + "/" + loggerPackage.replace(".","/"));
        FileUtils.forceMkdir(destDir);

        FileUtils.copyDirectory(srcDir, destDir);
    }

    public static void applyProcessor(Factory factory, Processor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();
    }

    public static void writeJavaClass(Factory factory, File out, File fileFrom) {
        Environment env = factory.getEnvironment();
        Processor processor = new JavaOutputProcessorWithFilter(out, new DefaultJavaPrettyPrinter(env), allClassesName(fileFrom));
        try {
            applyProcessor(factory, processor);
        } catch (Exception e) {
            e.printStackTrace();
            Log.debug("");
        }
    }

    public static void printJavaFile(File directory, CtType type) throws IOException {
        try {
            Factory factory = type.getFactory();
            Environment env = factory.getEnvironment();

            JavaOutputProcessor processor = new JavaOutputProcessor(directory, new DefaultJavaPrettyPrinter(env));
            processor.setFactory(factory);

            processor.createJavaFile(type);
            Log.debug("write type {} in directory {}", type.getQualifiedName(), directory);
        }catch (Exception e) {
            Log.debug("");
        }
    }
}
