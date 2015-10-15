package fr.inria.diversify.divers;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.util.Log;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

/**
 * Created by Simon on 26/02/15.
 */
public class CountAbstractVariable {
    private String projectDirectory;
    private String srcDirectory;
    private int javaVersion;

    public CountAbstractVariable(String propertiesFile) throws Exception {
        Log.DEBUG();
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

        //Configuration
        projectDirectory = inputConfiguration.getProperty("project");
        srcDirectory = inputConfiguration.getProperty("src");
        javaVersion = Integer.parseInt(inputConfiguration.getProperty("javaVersion", "5"));

        MavenDependencyResolver t = new MavenDependencyResolver();
        t.resolveDependencies(inputConfiguration.getInputProgram());

      //  countVariable();

        countApi();
    }

    public static void main(String[] args) throws Exception {
        new CountAbstractVariable(args[0]);
    }

    protected void countApi() {
        String src = projectDirectory + "/" + srcDirectory;

        Factory factory = initSpoon(src);

        ApiCountProcessor processor = new ApiCountProcessor();
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();

        Log.info("number of public method: {}", processor.publicCount);
        Log.info("number of protected method: {}", processor.protectedCount);
        Log.info("number of private method: {}", processor.privateCount);

        Log.info("total method: {}", processor.publicCount + processor.protectedCount + processor.privateCount);
    }



    protected void countVariable() {
        String src = projectDirectory + "/" + srcDirectory;

        Factory factory = initSpoon(src);

        AbstractVariableProcessor processor = new AbstractVariableProcessor();
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();

        Log.info("number of local variable: {}", processor.countVariable);
        Log.info("number of abstract local variable: {}", processor.countAbstractVariable);

        Log.info("number of field: {}", processor.countField);
        Log.info("number of abstract field: {}", processor.countAbstractField);

        Log.info("number of parameter: {}", processor.countParameter);
        Log.info("number of abstract parameter: {}", processor.countAbstractParameter);

        Log.info("total: {}", processor.countVariable + processor.countField + processor.countParameter);
        Log.info("total abstract: {}", processor.countAbstractVariable + processor.countAbstractField + processor.countAbstractParameter);
    }


    protected Factory initSpoon(String srcDirectory) {
        try {
            return new SpoonMetaFactory().buildNewFactory(srcDirectory, javaVersion);
        } catch (ClassNotFoundException  | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
