package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;

import fr.inria.diversify.sosie.pointSequence.CallPoint;
import fr.inria.diversify.sosie.pointSequence.ConditionalPoint;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.maven.MavenDependencyResolver;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.SpoonCompiler;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.io.FileWriter;
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
        try {
        if(DiversifyProperties.getProperty("builder").equals("maven")) {
            MavenDependencyResolver t = new MavenDependencyResolver();
            t.DependencyResolver(DiversifyProperties.getProperty("project") + "/pom.xml");
        }
        } catch (Exception e) {}

        initSpoon();

         dirOriginal = DiversifyProperties.getProperty("dirOriginal");
         dirSosie = DiversifyProperties.getProperty("dirSosie");
         varToExclude = DiversifyProperties.getProperty("varToExclude");

        if(DiversifyProperties.getProperty("logTrace").equals("same"))
            same();
        else
            diff();
    }

    protected void same() throws IOException {
        CompareMultiSequence un = new CompareMultiSequence(dirOriginal,dirSosie);
        un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
        un.findAndWriteDiffVar(varToExclude);

    }

    protected void diff() throws Exception {
        String startPointString = DiversifyProperties.getProperty("startPoint");
            Log.debug("loading log from dir {}",dirSosie);
            try {
                File startPoint = new File(dirSosie+"/"+startPointString);
                TransformationParser parser = new TransformationParser(codeFragments);
                Log.info("startPoint {}",startPoint.getAbsolutePath());
                CodeFragment cf = null;
                try {
                    cf = ((ASTTransformation)parser.parseUniqueTransformation(startPoint)).getPosition();
                } catch (Exception e) {}

                CompareMultiSequence un = new CompareMultiSequence(dirOriginal, dirSosie, cf ,varToExclude);
                un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
                Diff diff = new Diff(null);
                un.findDivergenceCall(diff);
                 un.findDiffVar(diff);

                Log.info(diff.report());
                Log.info(diff.callReport());
                writeResult(diff,cf);
            } catch (Exception e) {
                Log.error("error",e);
                e.printStackTrace();
            }
        Log.debug(CallPoint.nbCallPoint+ " "+ ConditionalPoint.nbVarPoint);
    }

    protected void writeResult(Diff diff, CodeFragment cf) throws IOException, JSONException {
        FileWriter writer = new FileWriter(DiversifyProperties.getProperty("result") + "compare"+System.currentTimeMillis()+".json");
       JSONObject o =  diff.toJson();
        o.put("dirSosie", dirSosie);
        o.put("dirOriginal", dirOriginal);
        try {
            JSONObject cfJSON = cf.toJSONObject();
            o.put("startingPoint",cfJSON);
        } catch (Exception e) {}

        o.write(writer);
        writer.close();
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

    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String srcDirectory = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new FactoryImpl(f, env);
        SpoonCompiler c = new JDTBasedSpoonCompiler(factory);

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
