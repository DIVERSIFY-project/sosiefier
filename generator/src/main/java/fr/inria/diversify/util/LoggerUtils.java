package fr.inria.diversify.util;

import fr.inria.diversify.runner.InputProgram;
import spoon.processing.ProcessingManager;
import spoon.processing.Processor;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 18/03/15
 * Time: 13:36
 */
public class LoggerUtils {
    public static void copyLoggerPackage(InputProgram inputProgram, String outputDirectory, String loggerPackage) throws IOException {
        copyLoggerPackage(inputProgram.getRelativeSourceCodeDir(), outputDirectory, loggerPackage);
    }

    public static void copyLoggerPackage(String mainSrc, String outputDirectory, String loggerPackage) throws IOException {
        File srcDir = new File(System.getProperty("user.dir") + "/profiling/src/main/java/"  + loggerPackage.replace(".","/"));

        File destDir = new File(outputDirectory + "/" + mainSrc + "/" + loggerPackage.replace(".","/"));
        FileUtils.forceMkdir(destDir);

        FileUtils.copyDirectory(srcDir, destDir);
    }

    public static void applyProcessor(Factory factory, Processor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process(factory.Package().getRootPackage());
    }
}
