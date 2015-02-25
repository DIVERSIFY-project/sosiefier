package fr.inria.diversify.testamplification.harman;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.testamplification.processor.TestProcessor;
import fr.inria.diversify.util.DiversifyPrettyPrinter;
import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import spoon.compiler.Environment;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Simon on 03/12/14.
 */
public class HarmanMain {
    InputConfiguration inputConfiguration;
    InputProgram inputProgram;
    protected Factory factory;
    String tmpDir;


    public HarmanMain(String propertiesFile) throws Exception, InvalidSdkException {
        Log.DEBUG();
        inputConfiguration = new InputConfiguration(propertiesFile);
        initDependency();
        initInputProgram();

        transform();
       Log.info("");
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        new HarmanMain(args[0]);
    }


    protected void transform() throws IOException, InterruptedException {
        String src = inputProgram.getAbsoluteSourceCodeDir();
        String test = inputProgram.getAbsoluteTestSourceCodeDir();

        if ( factory == null ) {
            initSpoon(src+":"+test);
        }

        tmpDir = initDirectory();
        File fileFrom = new File(src);
        File out = new File(tmpDir + "/" + inputProgram.getRelativeSourceCodeDir());
        //ecriture des classes d'application formatées par spoon
        writeJavaClass(factory, out, fileFrom);

        fileFrom = new File(test);
        out = new File(tmpDir + "/" + inputProgram.getRelativeTestSourceCodeDir());
        //ecriture des classes test formatées par spoon
        writeJavaClass(factory, out, fileFrom);


        initSpoon(tmpDir + "/" + inputProgram.getRelativeSourceCodeDir() +":"+tmpDir + "/" + inputProgram.getRelativeTestSourceCodeDir());

        Harman harman = new Harman(inputConfiguration);

        harman.init(tmpDir);
        harman.run();

        writeJavaClass(factory, out, fileFrom);
        Log.info("number of new test: {}", TestProcessor.getCount());
    }

    public String initDirectory() throws IOException, InterruptedException {
        tmpDir = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();
        File dir = new File(tmpDir);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);

        return tmpDir;
    }

    protected void writeJavaClass(Factory factory, File out, File fileFrom) {
        Environment env = factory.getEnvironment();
        AbstractProcessor processor = new JavaOutputProcessorWithFilter(out, new DiversifyPrettyPrinter(env), allClassesName(fileFrom));
        applyProcessor(factory, processor);
    }

    protected void initSpoon(String srcDirectory) {
        try {
            factory = new SpoonMetaFactory().buildNewFactory(srcDirectory, Integer.parseInt(inputConfiguration.getProperty("javaVersion")));
        } catch (ClassNotFoundException  | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }

        inputProgram.setFactory(factory);
    }

    protected void applyProcessor(Factory factory, AbstractProcessor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();
    }

    protected List<String> allClassesName(File dir) {
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

    protected void copyLogger() throws IOException {
        File dir = new File(tmpDir+"/"+inputProgram.getRelativeSourceCodeDir()+ "/fr/inria/diversify/testamplification/logger");
        FileUtils.forceMkdir(dir);

        String packagePath = System.getProperty("user.dir") + "/generator/src/main/java/fr/inria/diversify/testamplification/logger/";
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.Logger.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.ShutdownHookLog.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.LogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.AssertLogWriter.class.getSimpleName() + ".java"),dir);
    }

    protected void writeId() throws IOException {
        TestProcessor.writeIdFile(tmpDir);
    }

    protected void initDependency() throws Exception, InvalidSdkException {
        MavenDependencyResolver t = new MavenDependencyResolver();
        String builder = inputConfiguration.getProperty("builder");

        String dependencyPom = inputConfiguration.getProperty("dependencyPom");
        if (builder.equals("maven") && dependencyPom != null) {
            File pom = new File(inputConfiguration.getProperty("project") + "/pom.xml");
            File originalPom = new File(inputConfiguration.getProperty("project") + "/_originalPom.xml");
            FileUtils.copyFile(pom, originalPom);

            if(dependencyPom != null) {
                FileUtils.copyFile(new File(inputConfiguration.getProperty("project") + "/" +dependencyPom), pom);
            }

            t.DependencyResolver(inputConfiguration.getProperty("project") + "/pom.xml");

            FileUtils.copyFile(originalPom, pom);
            FileUtils.forceDelete(originalPom);
        }

        String androidSdk = inputConfiguration.getProperty("AndroidSdk");
        if(androidSdk != null) {
            t.resolveAndroidDependencies(androidSdk);
        }
    }

    /**
     * Initializes the InputProgram dataset
     */
    protected void  initInputProgram() throws IOException, InterruptedException {
        inputProgram = new InputProgram();
        inputConfiguration.setInputProgram(inputProgram);
        inputProgram.setProgramDir(inputConfiguration.getProperty("project"));
        inputProgram.setRelativeSourceCodeDir(inputConfiguration.getRelativeSourceCodeDir());
        inputProgram.setRelativeTestSourceCodeDir(inputConfiguration.getRelativeTestSourceCodeDir());

        if(inputConfiguration.getProperty("externalSrc") != null) {
            List<String> list = Arrays.asList(inputConfiguration.getProperty("externalSrc")
                                                                .split(System.getProperty("path.separator")));
            String sourcesDir = list.stream()
                                    .map(src -> inputProgram.getProgramDir() + "/" + src)
                                    .collect(Collectors.joining(System.getProperty("path.separator")));
            inputProgram.setExternalSourceCodeDir(sourcesDir);
        }
       // inputProgram.setCoverageReport(initCoverageReport());

        inputProgram.setTransformationPerRun(
                Integer.parseInt(inputConfiguration.getProperty("transformation.size", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(
                inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(inputConfiguration.getProperty("project") + "/" +
                                           inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));
    }
}
