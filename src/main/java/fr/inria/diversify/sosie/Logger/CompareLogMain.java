package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.DiversifyMain;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;
import fr.inria.diversify.transformation.Replace;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;
import java.util.Set;

/**
 * User: Simon
 * Date: 10/3/13
 * Time: 3:00 PM
 */
public class CompareLogMain {

    private CodeFragmentList codeFragments;

    public static void main(String[] args) throws Exception {
        new DiversifyProperties(args[0]);
        CompareLogMain clm = new CompareLogMain();
        clm.init();
    }

    protected void init() throws Exception {
        initLogLevel();
        initSpoon();

        String dirOriginal = DiversifyProperties.getProperty("dirOriginal");
        String dirSosie = DiversifyProperties.getProperty("dirSosie");
        String varToExclude = DiversifyProperties.getProperty("varToExclude");

        if(DiversifyProperties.getProperty("logTrace").equals("same")) {
            CompareMultiLogSequence un = new CompareMultiLogSequence(dirOriginal,dirSosie);
            un.findAndWriteDiffVar(varToExclude);
        } else {

            String startPointString = DiversifyProperties.getProperty("startPoint");
            for(File f : (new File(dirSosie).listFiles())) {
                Log.info("log files {}",f);
                File startPoint = new File(f.getAbsolutePath()+"/"+startPointString);
                TransformationParser parser = new TransformationParser(codeFragments);
                CodeFragment cf = ((Replace)parser.parseUniqueTransformation(startPoint)).getPosition();

                CompareMultiLogSequence un = new CompareMultiLogSequence(dirOriginal, f.getAbsolutePath(), cf, varToExclude);

                Set<String> result = un.findDiffVar();
                if(!result.isEmpty())
                    Log.info("same trace: {}",result);
            }
        }

    }

    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String srcDirectory = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new Factory(f, env);
        SpoonBuildingManager builder = new SpoonBuildingManager(factory);

        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                builder.addInputSource(new File(dir));
            } catch (IOException e) {
                Log.error("error in initSpoon", e);
            }
        try {
            builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ProcessingManager pm = new QueueProcessingManager(factory);
        Class classz = Class.forName(DiversifyProperties.getProperty("processor"));
        AbstractCodeFragmentProcessor processor =  (AbstractCodeFragmentProcessor)classz.newInstance();
        pm.addProcessor(processor);
        pm.process();

        codeFragments = processor.getCodeFragments();
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }
}
