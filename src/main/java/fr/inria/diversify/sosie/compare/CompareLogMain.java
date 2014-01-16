package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;

import fr.inria.diversify.sosie.pointSequence.Point;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.maven.MavenDependencyResolver;
import spoon.compiler.SpoonCompiler;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.JDTCompiler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        if(DiversifyProperties.getProperty("builder").equals("maven")) {
            MavenDependencyResolver t = new MavenDependencyResolver();
            t.DependencyResolver(DiversifyProperties.getProperty("project") + "/pom.xml");
        }

        initSpoon();

         dirOriginal = DiversifyProperties.getProperty("dirOriginal");
         dirSosie = DiversifyProperties.getProperty("dirSosie");
         varToExclude = DiversifyProperties.getProperty("varToExclude");

        if(DiversifyProperties.getProperty("logTrace").equals("same"))
            same();
        else
            diff();
//            if(DiversifyProperties.getProperty("type").equals("var"))
//                diffVar();
//            else {
//                if(DiversifyProperties.getProperty("type").equals("call"))
//                    diffCall();
//                else
//                    diffException();
//            }
    }

    protected void same() throws IOException {
        CompareMultiSequence un = new CompareMultiSequence(dirOriginal,dirSosie);
        un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
        un.findAndWriteDiffVar(varToExclude);
        Log.debug(Point.nbPoint+ " "+Point.error);
    }

//    protected void diffVar() throws Exception {
//        String startPointString = DiversifyProperties.getProperty("startPoint");
//        Set<VariableDiff> diffs = new HashSet<VariableDiff>();
//        int i =0;
//        File file = new File(dirSosie);
//        Log.debug("loading log from dir {}",file.getAbsolutePath());
//        try {
//            File startPoint = new File(file.getAbsolutePath()+"/"+startPointString);
//            TransformationParser parser = new TransformationParser(codeFragments);
//            Log.info("startPoint {}",startPoint.getAbsolutePath());
//
//            CompareMultiLogSequence un = new CompareMultiLogSequence(dirOriginal, file.getAbsolutePath(), cf, varToExclude);
//            un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
//            Diff diff = un.findDiffVar();
//            i++;
//            Log.info("sosie nb: {}",i);
//            Log.info("callDivergence {}, result {}",diff.sameTrace(),diff.sameTraceAndVar());
////            if(!diff.sameTraceAndVar()) {
//                Log.info(file.getName());
//                Log.info(diff.report());
//                if(!diff.sameVar()) {
//                    diffs.addAll(diff.getAllVariableDiff());
////                        diff.toDot(DiversifyProperties.getProperty("result")+"cp_"+f.getName()+".dot");
//                }
////            }
////            else
////                Log.info("same trace");
//        } catch (Exception e) {
//            Log.error("error",e);
//            e.printStackTrace();
//        }
//        writeVarDiff(diffs,DiversifyProperties.getProperty("result")+"/varDiff");
//    }

    protected void diffCall() throws Exception {
        String startPointString = DiversifyProperties.getProperty("startPoint");
        int i = 0;
        for(File f : (new File(dirSosie).listFiles())) {
            Log.debug("loading log from dir {}",f.getAbsolutePath());
            try {
                File startPoint = new File(f.getAbsolutePath()+"/"+startPointString);
                TransformationParser parser = new TransformationParser(codeFragments);
                Log.info("startPoint {}",startPoint.getAbsolutePath());
//                CodeFragment cf = ((ASTTransformation)parser.parseUniqueTransformation(startPoint)).getPosition();

                CompareMultiCallSequence un = new CompareMultiCallSequence(dirOriginal, f.getAbsolutePath(), null);
                un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
                Diff diff = un.findDivergenceCall();
                i++;
                Log.info("sosie nb: {}",i);
                Log.info("callDivergence {}, result {}",diff.sameTrace());

                    Log.info(f.getName());
                    Log.info(diff.callReport());
//                    if(!diff.sameVar()) {
//                        diff.toDot(DiversifyProperties.getProperty("result")+"cp_"+f.getName()+".dot");
//                    }
            } catch (Exception e) {
                Log.error("error",e);
                e.printStackTrace();
            }
        }
//        writeVarDiff(diffs,DiversifyProperties.getProperty("result")+"/varDiff");
    }

    protected void diff() throws Exception {
        String startPointString = DiversifyProperties.getProperty("startPoint");
            Log.debug("loading log from dir {}",dirSosie);
            try {
                File startPoint = new File(dirSosie+"/"+startPointString);
                TransformationParser parser = new TransformationParser(codeFragments);
                Log.info("startPoint {}",startPoint.getAbsolutePath());
                CodeFragment cf = ((ASTTransformation)parser.parseUniqueTransformation(startPoint)).getPosition();

                CompareMultiSequence un = new CompareMultiSequence(dirOriginal, dirSosie, cf ,varToExclude);
                un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
                Diff diff = new Diff(null);
                un.findDivergenceCall(diff);
                 un.findDiffVar(diff);

                Log.info(diff.report());
                Log.info(diff.callReport());
                FileWriter writer = new FileWriter(DiversifyProperties.getProperty("result") + "_compare.json");
                diff.toJson().write(writer);
                writer.close();
            } catch (Exception e) {
                Log.error("error",e);
                e.printStackTrace();
            }
    }

    protected void diffException() throws Exception {
        String startPointString = DiversifyProperties.getProperty("startPoint");
        List<Diff> diffs = new ArrayList<Diff>();
        int i =0;
        for(File f : (new File(dirSosie).listFiles())) {
            try {
                File startPoint = new File(f.getAbsolutePath()+"/"+startPointString);
                TransformationParser parser = new TransformationParser(codeFragments);
                Log.info("startPoint {}",startPoint.getAbsolutePath());
                CodeFragment cf = ((ASTReplace)parser.parseUniqueTransformation(startPoint)).getPosition();

                CompareMultiExceptionSequence un = new CompareMultiExceptionSequence(dirOriginal, f.getAbsolutePath(), cf);
                un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
                Diff diff = un.findDiffException();
                i++;
                Log.info("sosie nb: {}",i);
                Log.info("catchDivergence {}, result {}",diff.sameTrace(),diff.sameTraceAndCatch());
                if(!diff.sameTraceAndCatch()) {
                    Log.info(f.getName());
                    Log.info(diff.report());

                    if(!diff.sameCatch()) {
                        diffs.add(diff);
                        diff.toDotCatch(DiversifyProperties.getProperty("result")+"exception_"+f.getName() + ".dot");
                    }
                }
                else
                    Log.info("same trace");
            } catch (Exception e) {
                Log.error("error",e);
                e.printStackTrace();
            }
        }
    }

    protected void writeVarDiff(Set<VariableDiff> set, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        Set<String> set2 = new HashSet<String>();

        for (VariableDiff s : set)
           set2.add(s.forFile());
        for (String s : set2)
           bw.write(s+"\n");
        bw.close();
        fw.close();
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
        SpoonCompiler c = new JDTCompiler(factory);

        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                c.addInputSource(new File(dir));
            } catch (IOException e) {
                Log.error("error in initSpoon", e);
            }
        try {
            c.build();
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
