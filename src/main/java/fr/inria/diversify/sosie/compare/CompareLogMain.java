package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;
import fr.inria.diversify.sosie.pointSequence.PointSequence;
import fr.inria.diversify.transformation.ITransformation;
import fr.inria.diversify.transformation.TransformationsWriter;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 10/3/13
 * Time: 3:00 PM
 */
public class CompareLogMain {

    private CodeFragmentList codeFragments;
    private String dirOriginal;
    private String varToExclude;
    private String dirSosie;

    public static void main(String[] args) throws Exception {
        new DiversifyProperties(args[0]);
        CompareLogMain clm = new CompareLogMain();
        clm.init();
    }

    protected void init() throws Exception {
        initLogLevel();
        initSpoon();

         dirOriginal = DiversifyProperties.getProperty("dirOriginal");
         dirSosie = DiversifyProperties.getProperty("dirSosie");
         varToExclude = DiversifyProperties.getProperty("varToExclude");

        if(DiversifyProperties.getProperty("logTrace").equals("same"))
            same();
        else
            if(DiversifyProperties.getProperty("conditionalPoint").equals("true"))
                diff();
            else
                diffException();
    }

    protected void same() throws IOException {
        CompareMultiLogSequence un = new CompareMultiLogSequence(dirOriginal,dirSosie);
        un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
        un.findAndWriteDiffVar(varToExclude);
    }

    protected void diff() throws Exception {
        List<ITransformation> trans = new ArrayList<ITransformation>();
        String startPointString = DiversifyProperties.getProperty("startPoint");
        int count = 0;
        int i =0;
        for(File f : (new File(dirSosie).listFiles())) {
            i++;
            Log.info("sosie nb: {}",i);
            try {
//            Log.info("log files {}",f);
            File startPoint = new File(f.getAbsolutePath()+"/"+startPointString);
            TransformationParser parser = new TransformationParser(codeFragments);
            Log.info("startPoint {}",startPoint.getAbsolutePath());
            CodeFragment cf = ((ASTReplace)parser.parseUniqueTransformation(startPoint)).getPosition();

            CompareMultiLogSequence un = new CompareMultiLogSequence(dirOriginal, f.getAbsolutePath(), cf, varToExclude);
            un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
            Diff diff = un.findDiffVar();

            Log.info("callDivergence {}, result {}",diff.sameTrace(),diff.sameTraceAndVar());
            if(!diff.sameTraceAndVar()) {
                Log.info(f.getName());
                Log.info(diff.report());

                if(!diff.sameVar()) {
                    trans.add(parser.parseUniqueTransformation(startPoint));
                    diff.toDot(DiversifyProperties.getProperty("result")+"cp_"+f.getName()+".dot");
                    count++;
                Log.info("i: "+count);
                }
            }
            else
                Log.info("same trace");
            } catch (Exception e) {
                Log.error("error",e);
                e.printStackTrace();
            }

            TransformationsWriter write = new TransformationsWriter(trans,DiversifyProperties.getProperty("result") + "/sosie/sosie");
            write.writeAllTransformation(null);
        }
    }

    protected void diffException() throws Exception {
        List<ITransformation> trans = new ArrayList<ITransformation>();
        String startPointString = DiversifyProperties.getProperty("startPoint");
        int count = 0;
        int i =0;
        for(File f : (new File(dirSosie).listFiles())) {
            i++;
            Log.info("sosie nb: {}",i);
            try {
                File startPoint = new File(f.getAbsolutePath()+"/"+startPointString);
                TransformationParser parser = new TransformationParser(codeFragments);
                Log.info("startPoint {}",startPoint.getAbsolutePath());
                CodeFragment cf = ((ASTReplace)parser.parseUniqueTransformation(startPoint)).getPosition();

                CompareMultiExceptionSequence un = new CompareMultiExceptionSequence(dirOriginal, f.getAbsolutePath(), cf);
                un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
                Diff diff = un.findDiffException();

                Log.info("catchDivergence {}, result {}",diff.sameTrace(),diff.sameTraceAndCatch());
                if(!diff.sameTraceAndCatch()) {
                    Log.info(f.getName());
                    Log.info(diff.report());

                    if(!diff.sameCatch()) {
                        trans.add(parser.parseUniqueTransformation(startPoint));
                        diff.toDotCatch(DiversifyProperties.getProperty("result")+"exception_"+f.getName() + ".dot");
                        count++;
                        Log.info("i: "+count);
                    }
                }
                else
                    Log.info("same trace");
            } catch (Exception e) {
                Log.error("error",e);
                e.printStackTrace();
            }
        }

        Log.info("max exception: "+ PointSequence.getMaxSizeException());

        TransformationsWriter write = new TransformationsWriter(trans,DiversifyProperties.getProperty("result") + "/sosie/sosieE");
        write.writeAllTransformation(null);
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
