package fr.inria.diversify.sosie.logger;

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

/**
 * User: Simon
 * Date: 10/3/13
 * Time: 3:00 PM
 */
public class CompareLogMain {

    private CodeFragmentList codeFragments;

    public static void main(String[] args) throws IOException, JSONException {


    }

    protected void init() throws IOException, JSONException {
        String dirOriginal = DiversifyProperties.getProperty("dirOriginal");
        String dirSosie = DiversifyProperties.getProperty("dirSosie");
        String varToExclude = DiversifyProperties.getProperty("varToExclude");

        if(DiversifyProperties.getProperty("logTrace").equals("same")) {
            CompareMultiLogSequence un = new CompareMultiLogSequence(dirOriginal,dirSosie);
            un.findAndWriteDiffVar(varToExclude);
        } else {

            File startPoint = new File(DiversifyProperties.getProperty("startPoint"));
            TransformationParser parser = new TransformationParser(codeFragments);
            CodeFragment cf = ((Replace)parser.parseFile(startPoint).get(0)).getPosition();

            CompareMultiLogSequence un = new CompareMultiLogSequence(dirOriginal, dirSosie, cf, varToExclude);
            un.findDiffVar();

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
