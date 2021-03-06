package fr.inria.diversify.factories;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import org.apache.commons.io.output.NullWriter;
import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jdt.internal.compiler.batch.FileSystem;
import org.eclipse.jdt.internal.compiler.batch.Main;
import spoon.compiler.Environment;
import spoon.compiler.ModelBuildingException;
import spoon.compiler.builder.*;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.FileSystemFolder;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;
import spoon.support.compiler.jdt.MainCompiler;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;


/**
 * User: Simon
 * Date: 15/10/15
 * Time: 11:39
 */
public class DiversityCompiler extends JDTBasedSpoonCompiler {
    protected DiversifyClassLoader customClassLoader;
    FileSystem environment;


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
//        initInputClassLoader();
        javaCompliance = factory.getEnvironment().getComplianceLevel();

        MainCompiler compiler = new MainCompiler(this, environment);

        final SourceOptions sourcesOptions = new SourceOptions();
        sourcesOptions.sources((new FileSystemFolder(directory).getAllJavaFiles()));


            URL[] urls;
            if(customClassLoader != null) {
                urls = customClassLoader.getURLs();
            } else {
                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                urls = ((URLClassLoader) classLoader).getURLs();

            }
            String[] finalClassPath = new String[urls.length];

        for(int i = 0; i < urls.length; i++) {
            finalClassPath[i] = urls[i].getFile();
        }


        final ClasspathOptions classpathOptions = new ClasspathOptions()
                .encoding(this.getEnvironment().getEncoding().name())
                .classpath(finalClassPath)
                .binaries(getBinaryOutputDirectory());

        final String[] args = new JDTBuilderImpl() //
                .classpathOptions(classpathOptions) //
                .complianceOptions(new ComplianceOptions().compliance(javaCompliance)) //
                .advancedOptions(new AdvancedOptions().preserveUnusedVars().continueExecution().enableJavadoc()) //
                .annotationProcessingOptions(new AnnotationProcessingOptions().compileProcessors()) //
                .sources(sourcesOptions) //
                .build();

        final String[] finalArgs = new String[args.length + 1];
        finalArgs[0] = "-proceedOnError";
        for(int i = 0; i < args.length; i++) {
            finalArgs[i + 1] = args[i];
        }

        if(!withLog) {
            compiler.logger = new Main.Logger(compiler, new PrintWriter(new NullWriter()), new PrintWriter(new NullWriter()));
        }

        compiler.compile(finalArgs);
        environment = compiler.getEnvironment();

        return compiler.globalErrorsCount == 0;
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
        }

    }

}
