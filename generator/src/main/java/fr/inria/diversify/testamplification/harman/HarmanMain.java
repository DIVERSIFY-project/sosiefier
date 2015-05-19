package fr.inria.diversify.testamplification.harman;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.util.*;
import org.apache.commons.io.FileUtils;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;

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
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        factory = InitUtils.initSpoon(inputProgram, false);

        transform();
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        new HarmanMain(args[0]);
    }

    protected void transform() throws IOException, InterruptedException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        String src = inputProgram.getAbsoluteSourceCodeDir();
        String test = inputProgram.getAbsoluteTestSourceCodeDir();

        tmpDir = initDirectory();
        File fileFrom = new File(src);
        File out = new File(tmpDir + "/" + inputProgram.getRelativeSourceCodeDir());
        //ecriture des classes d'application formatées par spoon
        LoggerUtils.writeJavaClass(factory, out, fileFrom);

        fileFrom = new File(test);
        out = new File(tmpDir + "/" + inputProgram.getRelativeTestSourceCodeDir());
        //ecriture des classes test formatées par spoon
        LoggerUtils.writeJavaClass(factory, out, fileFrom);


        new SpoonMetaFactory().buildNewFactory(tmpDir + "/" + inputProgram.getRelativeSourceCodeDir() + ":" + tmpDir + "/" + inputProgram.getRelativeTestSourceCodeDir(),
                inputProgram.getJavaVersion());

        Harman harman = new Harman(inputConfiguration);

        harman.init(tmpDir);
        harman.run();

        LoggerUtils.writeJavaClass(factory, out, fileFrom);
    }

    public String initDirectory() throws IOException, InterruptedException {
        tmpDir = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();
        File dir = new File(tmpDir);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);

        return tmpDir;
    }

}
