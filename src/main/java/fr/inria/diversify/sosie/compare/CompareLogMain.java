package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.codeFragment.CodeFragment;

import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.maven.MavenDependencyResolver;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.SpoonCompiler;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.*;
import java.util.HashSet;
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
    private Set<Diff> allDiff;
    private int nbDivergenceAssert;
    private int nbDivergenceException;

    public static void main(String[] args) throws Exception {
        new DiversifyProperties(args[0]);
        CompareLogMain clm = new CompareLogMain();
        clm.init();
    }

    protected void init() throws Exception {
        allDiff = new HashSet<Diff>();
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
        CompareMultiSequence un = new CompareMultiSequence(dirOriginal,dirSosie,getType());
        un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));
        un.findAndWriteDiff(varToExclude);
    }

    protected void diff() throws Exception {
        String startPointString = "diversificationPoint";
        File startPoint = new File(dirSosie+"/../"+startPointString);
//        TransformationParser parser = new TransformationParser(true);
        Log.info("startPoint {}",startPoint.getAbsolutePath());
        JSONObject cf = null;
        try {
            cf = getObject(startPoint);
        } catch (Exception e) {}

        String type = DiversifyProperties.getProperty("type");
        if(type.equals("assert") || type.equals("all")) {
            diff(AssertPointSequence.class, null);
            nbDivergenceAssert = CompareSingleSequence.getDivergence();
            CompareSingleSequence.reset();
        }
        if(type.equals("exception") || type.equals("all")){
            diff(ExceptionPointSequence.class, null);
            nbDivergenceException = CompareSingleSequence.getDivergence();
        }

        writeResult(allDiff, cf);
    }

    protected void diff(Class type,  CodeFragment cf) throws Exception {
        Log.debug("loading log from dir {}",dirSosie);
        try {
            CompareMultiSequence un = new CompareMultiSequence(dirOriginal, dirSosie, cf ,varToExclude, type);
            un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));

            un.findDiff();
            allDiff.addAll(un.getDiffs());

        } catch (Exception e) {
            Log.error("error",e);
            e.printStackTrace();
        }
    }

    protected void writeResult(Set<Diff> diffs, JSONObject cf) throws IOException, JSONException {
        FileWriter writer = new FileWriter(DiversifyProperties.getProperty("result") + "compare"+System.currentTimeMillis()+".json");
        JSONArray array = new JSONArray();


        JSONObject nbDivergence = new JSONObject();
        nbDivergence.put("nbDivergence", nbDivergenceAssert);
        nbDivergence.put("type", "assert");
        array.put(nbDivergence);

        nbDivergence = new JSONObject();
        nbDivergence.put("nbDivergence", nbDivergenceException);
        nbDivergence.put("type", "Exception");
        array.put(nbDivergence);

        for(Diff diff : diffs) {
            JSONObject o =  diff.toJSON();
            o.put("dirSosie", dirSosie);
            o.put("dirOriginal", dirOriginal);
            try {
                o.put("startingPoint",cf);
            } catch (Exception e) {}
            array.put(o);
        }

        array.write(writer);
        writer.close();
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
    }

    protected Class getType() {
        if(DiversifyProperties.getProperty("type").equals("assert"))
            return AssertPointSequence.class;
        if(DiversifyProperties.getProperty("type").equals("exception"))
            return ExceptionPointSequence.class;
        return null;
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }


    protected JSONObject getObject(File file) throws IOException, JSONException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        if (sb.length() == 0)
            return null;
        return new JSONObject(sb.toString());
    }
}
