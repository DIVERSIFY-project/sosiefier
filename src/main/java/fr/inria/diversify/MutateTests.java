package fr.inria.diversify;

import fr.inria.diversify.testMutation.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by marodrig on 25/07/2014.
 */
public class MutateTests {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        p.load(new FileInputStream(args[0]));

        SourceCodeModifier processor = new SourceCodeModifier();

        String projectDir = p.getProperty("project");
        String outputDir = p.getProperty("output.directory");
        FileUtils.copyDirectory(new File(projectDir), new File(outputDir));

        processor.setTestDirectory(projectDir + "/" + p.getProperty("test.directory"));
        processor.setOutputDirectory(p.getProperty("output.directory") + "/" + p.getProperty("test.directory") + "/java/");


        processor.getProcessors().add(new AssertionWrapperProcessor());
        processor.getProcessors().add(new IntegerInputModification());
        processor.getProcessors().add(new FloatInputModification());
        processor.getProcessors().add(new DoubleInputModification());
        processor.getProcessors().add(new MathOperatorProcessor());
        processor.getProcessors().add(new ConditionalOperatorProcessor());
        processor.modify();
    }

}
