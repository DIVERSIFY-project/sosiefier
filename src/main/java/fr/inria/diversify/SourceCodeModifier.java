package fr.inria.diversify;

import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import spoon.compiler.SpoonCompiler;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A helper class that applies multiple processors to a source tree
 * <p/>
 * <p/>
 * Created by marodrig on 25/07/2014.
 */
public class SourceCodeModifier {

    //Root of the source code
    private String testDirectory;

    //Where the transformed code is going to be stored
    private String outputDirectory;

    //List of processors to apply
    private ArrayList<AbstractProcessor> processors;


    public SourceCodeModifier() {
        processors = new ArrayList<>();
    }

    /**
     * List of processors to apply
     *
     * @return
     */
    public ArrayList<AbstractProcessor> getProcessors() {
        return processors;
    }

    public void setProcessors(ArrayList<AbstractProcessor> processors) {
        this.processors = processors;
    }

    /**
     * Root of the source code
     */
    public String getTestDirectory() {
        return testDirectory;
    }

    public void setTestDirectory(String srcDirectory) {
        this.testDirectory = srcDirectory;
    }

    /**
     * Where the transformed code is going to be stored
     *
     * @return
     */
    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    /**
     * Returns all the .java files in the dir
     * @param dir
     * @return
     */
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

    protected static void applyProcessor(Factory factory, AbstractProcessor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();
    }

    /**
     * Applies the processors over the source code
     */
    public void modify() {
        StandardEnvironment env = new StandardEnvironment();
        env.setComplianceLevel(5);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new FactoryImpl(f, env);
        SpoonCompiler compiler = new JDTBasedSpoonCompiler(factory);
        for (String dir : testDirectory.split(System.getProperty("path.separator")))
            try {
                compiler.addInputSource(new File(dir));
            } catch (IOException e) {
                e.printStackTrace();
            }

        try {
            compiler.build();
        } catch (Exception e) {
            e.printStackTrace();
        }


        for (AbstractProcessor p : processors) {
            applyProcessor(factory, p);
        }


        applyProcessor(factory, new JavaOutputProcessorWithFilter(
                new File(getOutputDirectory()),
                new FragmentDrivenJavaPrettyPrinter(env), allClassesName(new File(testDirectory))));
    }
}
