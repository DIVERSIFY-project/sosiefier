package fr.inria.diversify.factories;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import org.apache.commons.io.output.NullWriter;
import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jdt.internal.compiler.batch.Main;
import spoon.compiler.Environment;
import spoon.compiler.ModelBuildingException;
import spoon.compiler.SpoonFile;
import spoon.compiler.SpoonFolder;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.FileSystemFolder;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.io.PrintWriter;
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
    protected DiversifyClassLoader customClassLoader;

    /**
     * Default constructor
     *
     * @param factory
     */
    public DiversityCompiler(Factory factory) {
        super(factory);
    }

    public void setCustomClassLoader(DiversifyClassLoader customClassLoader) {
        this.customClassLoader = customClassLoader;
    }

    public boolean compileFileIn(File directory, boolean withLog) {
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
        if (getBinaryOutputDirectory() != null) {
            args.add("-d");
            args.add(getBinaryOutputDirectory().getAbsolutePath());
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
            URL[] urls;
            if(customClassLoader != null) {
                urls = customClassLoader.getURLs();
            } else {
                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                urls = ((URLClassLoader) classLoader).getURLs();

            }
            if (urls != null && urls.length > 0) {
                String classpath = ".";
                for (URL url : urls) {
                    classpath += File.pathSeparator + url.getFile();
                }
                if (classpath != null) {
                    finalClassPath = classpath;
                }
//            if (classLoader instanceof URLClassLoader) {
//                URL[] urls = ((URLClassLoader) classLoader).getURLs();
//                if (urls != null && urls.length > 0) {
//                    String classpath = ".";
//                    for (URL url : urls) {
//                        classpath += File.pathSeparator + url.getFile();
//                    }
//                    if (classpath != null) {
//                        finalClassPath = classpath;
//                    }
//                }
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

        args.add("-proceedOnError");
        if(!withLog) {
            batchCompiler.logger = new Main.Logger(batchCompiler, new PrintWriter(new NullWriter()), new PrintWriter(new NullWriter()));
        }
        batchCompiler.compile(args.toArray(new String[0]));

//        reportProblems(factory.getEnvironment());

        factory.getEnvironment().debugMessage(
                "compiled in " + (System.currentTimeMillis() - t) + " ms");
        return batchCompiler.globalErrorsCount == 0;
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
