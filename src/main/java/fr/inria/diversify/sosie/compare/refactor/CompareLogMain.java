package fr.inria.diversify.sosie.compare.refactor;

import fr.inria.diversify.codeFragment.CodeFragment;

import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.maven.MavenDependencyResolver;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.SpoonCompiler;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.io.IOException;
import java.util.Set;

/**
 * User: Simon
 * Date: 10/3/13
 * Time: 3:00 PM
 */
public class CompareLogMain {
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
        CompareMultiSequence un = new CompareMultiSequence(dirOriginal,dirSosie, ExceptionPointSequence.class);
        un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
        un.findAndWriteDiff(varToExclude);
    }

    protected void diff() throws Exception {
        String startPointString = DiversifyProperties.getProperty("startPoint");
            Log.debug("loading log from dir {}",dirSosie);
            try {
                File startPoint = new File(dirSosie+"/"+startPointString);
                TransformationParser parser = new TransformationParser(true);
                Log.info("startPoint {}",startPoint.getAbsolutePath());
                CodeFragment cf = null;
                try {
                    cf = ((ASTTransformation)parser.parseUniqueTransformation(startPoint)).getTransplantationPoint();
                } catch (Exception e) {}

                CompareMultiSequence un = new CompareMultiSequence(dirOriginal, dirSosie, cf ,varToExclude, ExceptionPointSequence.class);
                un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));

                 un.findDiff();
                Set<Diff> diff = un.getDiffs();
                Log.info(""+diff.size());

//                writeResult(diff,cf);
            } catch (Exception e) {
                Log.error("error",e);
                e.printStackTrace();
            }
    }
//
//    protected void writeResult(Diff diff, CodeFragment cf) throws IOException, JSONException {
//        FileWriter writer = new FileWriter(DiversifyProperties.getProperty("result") + "compare"+System.currentTimeMillis()+".json");
//       JSONObject o =  diff.toJson();
//        o.put("dirSosie", dirSosie);
//        o.put("dirOriginal", dirOriginal);
//        try {
//            JSONObject cfJSON = cf.toJSONObject();
//            o.put("startingPoint",cfJSON);
//        } catch (Exception e) {}
//
//        o.write(writer);
//        writer.close();
//    }


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
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }
}
