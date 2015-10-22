package fr.inria.diversify.factories;

import org.eclipse.jdt.core.compiler.CategorizedProblem;
import spoon.compiler.Environment;
import spoon.compiler.ModelBuildingException;
import spoon.compiler.SpoonFile;
import spoon.compiler.SpoonFolder;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.FileSystemFolder;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 15/10/15
 * Time: 11:39
 */
public class DiversityCompiler extends JDTBasedSpoonCompiler {
    /**
     * Default constructor
     *
     * @param factory
     */
    public DiversityCompiler(Factory factory) {
        super(factory);
    }

    public boolean compileFileIn(File directory) {
        Factory factory = getFactory();
        initInputClassLoader();
        factory.getEnvironment().debugMessage(
                "compiling sources: "
                        + factory.CompilationUnit().getMap().keySet());
        long t = System.currentTimeMillis();
        javaCompliance = factory.getEnvironment().getComplianceLevel();

        org.eclipse.jdt.internal.compiler.batch.Main batchCompiler = createBatchCompiler(true);
        List<String> args = new ArrayList<String>();
        args.add("-1." + javaCompliance);
        if (encoding != null) {
            args.add("-encoding");
            args.add(encoding);
        }
        args.add("-preserveAllLocals");
        args.add("-enableJavadoc");
        args.add("-noExit");
        // args.add("-verbose");
        args.add("-proc:none");
        if (getDestinationDirectory() != null) {
            args.add("-d");
            args.add(getDestinationDirectory().getAbsolutePath());
        } else {
            args.add("-d");
            args.add("none");
        }

        // args.add("-d");
        // args.add(getDestinationDirectory().toString());

        String finalClassPath = null;
        if (getSourceClasspath() != null) {
            finalClassPath = computeJdtClassPath();
        } else {
            ClassLoader currentClassLoader = Thread.currentThread()
                    .getContextClassLoader();// ClassLoader.getSystemClassLoader();
            if (currentClassLoader instanceof URLClassLoader) {
                URL[] urls = ((URLClassLoader) currentClassLoader).getURLs();
                if (urls != null && urls.length > 0) {
                    String classpath = ".";
                    for (URL url : urls) {
                        classpath += File.pathSeparator + url.getFile();
                    }
                    if (classpath != null) {
                        finalClassPath = classpath;
                    }
                }
            }
        }

        args.add("-cp");
        args.add(finalClassPath);

        SpoonFolder src = new FileSystemFolder(directory);

        List<String> list = new ArrayList<>();
        for(SpoonFile sf : src.getAllJavaFiles()) {
            list.add(sf.toString());
        }
        args.addAll(list);

        getFactory().getEnvironment().debugMessage("compile args: " + args);

        System.setProperty("jdt.compiler.useSingleThread", "true");

        batchCompiler.compile(args.toArray(new String[0]));

//        reportProblems(factory.getEnvironment());

        factory.getEnvironment().debugMessage(
                "compiled in " + (System.currentTimeMillis() - t) + " ms");
        return getProblems().size() == 0;

    }

    protected void report(Environment environment, CategorizedProblem problem) {
        if (problem == null) {
            throw new IllegalArgumentException("problem cannot be null");
        }

        File file = new File(new String(problem.getOriginatingFileName()));
        String filename = file.getAbsolutePath();

        String message = problem.getMessage() + " at " + filename + ":"
                + problem.getSourceLineNumber();

        if (problem.isError()) {
            if (!environment.getNoClasspath()) {
                // by default, compilation errors are notified as exception
                throw new ModelBuildingException(message);
            }
//            else {
//                // in noclasspath mode, errors are only reported
//                environment.report(
//                        null,
//                        problem.isError()? Severity.ERROR:Severity.WARNING,
//                        message);
//            }
        }

    }

}
