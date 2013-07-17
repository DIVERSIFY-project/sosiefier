package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.runtest.ICoverageReport;
import fr.inria.diversify.runtest.NullCoverageReport;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.json.JSONArray;
import org.json.JSONException;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 6/24/13
 * Time: 11:53 AM
 */
public class RunStat {

    protected CodeFragmentList statements;

    public static void main(String[] args) throws Exception {
        RunStat app = new RunStat(args);
    }

    public RunStat(String[] args) throws Exception {
        CommandLineParser parser = new GnuParser();
        CommandLine cmd = parser.parse( commandLineOption(), args);

        String project =  cmd.getOptionValue("project");
        String classes = "target/classes";
        if(cmd.getOptionValue("classes") != null)
            classes = cmd.getOptionValue("classes");

        String src =  "src/main/java";
        if(cmd.getOptionValue("src") != null)
            src = cmd.getOptionValue("src");

        initSpoon(project+"/"+src);

        computeStatistic(cmd.getOptionValue("out"));
        System.out.println("number of statement: " + statements.size());

        computeDiversifyStat( cmd.getOptionValue("transformation"), cmd.getOptionValue("out"));

//        computeOtherStat();
    }


    protected void initSpoon(String directory) {
        StandardEnvironment env = new StandardEnvironment();
        env.setComplianceLevel(5);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new Factory(f, env);
        SpoonBuildingManager builder = new SpoonBuildingManager(factory);
        for(String dir : directory.split(System.getProperty("path.separator")))
            try {
                builder.addInputSource(new File(dir));
                builder.build();
            } catch (Exception e) {
                e.printStackTrace();
            }
        ProcessingManager pm = new QueueProcessingManager(factory);
        StatementProcessor processor = new StatementProcessor();
        pm.addProcessor(processor);
        pm.process();

        statements = processor.getStatements();
    }

    protected ICoverageReport getCoverageReport(String jacocoFile, String classes) throws IOException {
        ICoverageReport icr;

        if(jacocoFile != null)
            icr = new CoverageReport(classes,jacocoFile);
        else
            icr = new NullCoverageReport();

        System.out.println("jacoco " + icr.getClass());
        icr.create();
        return  icr;
    }

    protected void computeDiversifyStat(String dir, String fileName) throws IOException, JSONException {
        TransformationParser tf = new TransformationParser(statements);
        List<Transformation> list = tf.parseDir(dir);
        System.out.println("nb transformation: "+list.size());
        List<Transformation> listF = new ArrayList<Transformation>();
        for(Transformation trans : list) {
                    listF.add(trans);
        }
        writeGoodTransformation(fileName+"_goodTransformation.json",list);
        StatisticDiversification sd = new StatisticDiversification(listF, statements);
        sd.writeStat(fileName);
    }

    protected void computeOtherStat() {
        Util stat = new Util(statements);
        System.out.println("number of possible code fragment diversification: "+stat.numberOfDiversification());
        System.out.println("number of not possible code fragment diversification: "+stat.numberOfNotDiversification());

    }

    protected void computeStatistic(String output) {
        StatisticCodeFragment stat = new StatisticCodeFragment(statements);

        try {
            stat.writeStatistic(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void writeGoodTransformation(String FileName, List<Transformation> transformations) throws IOException, JSONException {
        List<Transformation> goodTransformation = new ArrayList<Transformation>();
        for(Transformation transformation : transformations) {
            if(transformation.numberOfFailure() == 0) {
                goodTransformation.add(transformation);
            }
        }
        writeTransformation(FileName, goodTransformation);
    }

    protected void writeTransformation(String FileName, List<Transformation> transformations) throws IOException, JSONException {

        BufferedWriter out = new BufferedWriter(new FileWriter(FileName));
        JSONArray obj = new JSONArray();
        for (int i = 0; i < transformations.size(); i++) {
            try {
                obj.put(transformations.get(i).toJSONObject());
            } catch (Exception e) {}
        }
        out.write(obj.toString());
        out.newLine();
        out.close();
    }

    protected Options commandLineOption() {
        Options options = new Options();
        options.addOption("project", true, "the project directory");
        options.addOption("src", true, "sources directory");
        options.addOption("classes", true, "classes directory");
        options.addOption("transformation", true, "transformation directory");
        options.addOption("jacoco", true, "jacoco file for test coverage");
        options.addOption("out", true, "prefix for output files");
        return  options;
    }
}
