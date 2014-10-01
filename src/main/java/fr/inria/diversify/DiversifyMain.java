package fr.inria.diversify;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.*;

import fr.inria.diversify.diversification.*;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.statistic.CVLMetric;
import fr.inria.diversify.statistic.StatisticDiversification;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.TransformationsWriter;
import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.ant.AntBuilder;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.transformation.query.*;
import fr.inria.diversify.transformation.query.ASTTransformationQuery;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.visu.Visu;
import javassist.NotFoundException;

import org.apache.log4j.Level;
import spoon.Launcher;
import spoon.reflect.factory.Factory;
import fr.inria.diversify.coverage.CoverageReport;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.MultiCoverageReport;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.ByteCodeTransformationQuery;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;

/**
 * Main class for the sosie generator.
 * <p/>
 * User: Simon
 * Date: 9/11/13
 * Time: 11:41 AM
 */
public class DiversifyMain {

    /**
     * The input program that we are about to sosiefy
     */
    private InputProgram inputProgram;

    /**
     * The input configuration given by the user is parsed by this class which helps other parts of the program to
     * interact with the input parameters
     * s
     */
    private InputConfiguration inputConfiguration;

    public DiversifyMain(String propertiesFile) throws Exception {

        inputConfiguration = new InputConfiguration(propertiesFile);

        new DiversifyProperties(inputConfiguration);
        Launcher.logger.setLevel(Level.OFF);
        initLogLevel();
        if (DiversifyProperties.getProperty("builder").equals("maven")) {
            MavenDependencyResolver t = new MavenDependencyResolver();
            t.DependencyResolver(DiversifyProperties.getProperty("project") + "/pom.xml");
        }
        initSpoon();

        if (DiversifyProperties.getProperty("stat").equals("true")) {
            computeStatistic();
        } else {
           initAndRunBuilder();
        }
    }

    protected void initAndRunBuilder() throws Exception {
        AbstractDiversify abstractDiversify;

        int n = Integer.parseInt(DiversifyProperties.getProperty("nbRun"));

        if(DiversifyProperties.getProperty("transformation.type").equals("issta")) {
            abstractDiversify = initAbstractDiversify();
            ASTTransformationQuery query = new ASTTransformationQuery(inputProgram);

            ((SinglePointDiversify) abstractDiversify).run(query.isstaTransformation(n));
            String repo = DiversifyProperties.getProperty("gitRepository");
            abstractDiversify.printResult(DiversifyProperties.getProperty("result"), repo);
        } else {
            abstractDiversify = initAbstractDiversify();
            TransformationQuery query = initTransformationQuery();

            //Get sizes of incremental sosies that we want
            int max;
            int min;
            String sosieSizes = DiversifyProperties.getProperty("transformation.size.set");
            ArrayList<Integer> intSosieSizes = null;
            if (sosieSizes != null) {
                intSosieSizes = new ArrayList<>();
                for (String s : sosieSizes.split(";")) {
                    intSosieSizes.add(Integer.parseInt(s));
                }
                max = intSosieSizes.size() - 1;
                min = 0;
            } else {
                max = Integer.parseInt(DiversifyProperties.getProperty("transformation.size", "1"));
                min = Integer.parseInt(DiversifyProperties.getProperty("transformation.size.min", Integer.toString(max)));
            }

            for (int i = min; i <= max; i++) {

                if (intSosieSizes != null) {
                    inputProgram.setTransformationPerRun(intSosieSizes.get(i));
                } else {
                    inputProgram.setTransformationPerRun(i);
                }

                abstractDiversify.setTransformationQuery(query);
                abstractDiversify.run(n);


                //Clear the found transformations for the next step to speed up. No needed since the new ones are going
                //to be of different size and therefore different
                //query.clearTransformationFounds();
                String repo = DiversifyProperties.getProperty("gitRepository");
                if (repo.equals("null")) abstractDiversify.printResult(DiversifyProperties.getProperty("result"));
                else abstractDiversify.printResult(DiversifyProperties.getProperty("result"), repo);
            }
        }
        abstractDiversify.deleteTmpFiles();
    }


    protected AbstractDiversify initAbstractDiversify() throws Exception {
        AbstractDiversify ad = null;
        String transformationType = DiversifyProperties.getProperty("transformation.type");
        String projet = DiversifyProperties.getProperty("project");
        String src = DiversifyProperties.getProperty("src");
        String resultDir = DiversifyProperties.getProperty("result");
        String sosieDir = DiversifyProperties.getProperty("copy.sosie.sources.to", "");

        if (transformationType.equals("knownsosies")
                || transformationType.equals("knownmultisosies")
                || transformationType.equals("singleconsecutive")
                || transformationType.equals("specificindexes")) {
            ad = new Diversify(inputConfiguration, projet, src);
            boolean early = DiversifyProperties.getProperty("early.report", "false").equals("true");
            boolean earlySosies = DiversifyProperties.getProperty("early.report.sosies.only", "false").equals("true");
            ((Diversify) ad).setEarlyReportSosiesOnly(earlySosies);
            ((Diversify) ad).setEarlyReport(early);
        }
        else {
            ad = new SinglePointDiversify(inputConfiguration, projet, src);
            boolean withParent = Boolean.parseBoolean(DiversifyProperties.getProperty("transformation.withparent", "false"));
            boolean acceptedError = Boolean.parseBoolean(DiversifyProperties.getProperty("transformation.acceptederror", "false"));
            ((SinglePointDiversify) ad).setWithParent(withParent);
            ((SinglePointDiversify) ad).setAcceptedErrors(acceptedError);
        }

        String tmpDir = ad.init(projet, DiversifyProperties.getProperty("tmpDir"));
        ad.setSocieSourcesDir(sosieDir);
        ad.setBuilder(initBuilder(tmpDir));
        ad.setResultDir(resultDir);

        return ad;
    }


    protected AbstractBuilder initBuilder(String directory) throws Exception {
        AbstractBuilder rb;
        String builder =  DiversifyProperties.getProperty("builder");

        String src = DiversifyProperties.getProperty("src");
        if (builder.equals("maven")) {
            rb = new MavenBuilder(directory, src);
            rb.setPhase(new String[]{"clean", "test"});
        } else {
            rb = new AntBuilder(directory, DiversifyProperties.getProperty("builder.testTarget"));
            rb.setPhase(new String[]{"clean", DiversifyProperties.getProperty("builder.testTarget")});
        }
        int t = Integer.parseInt(DiversifyProperties.getProperty("timeOut").trim());
        if (t == -1) rb.initTimeOut();
        else rb.setTimeOut(t);

        String pomFile = DiversifyProperties.getProperty("newPomFile");
        if (!pomFile.equals("")) rb.initPom(pomFile);

        rb.copyClasses(DiversifyProperties.getProperty("classes"));
        rb.initTimeOut();
        if(builder.equals("maven")) {
            rb.setPhase(new String[]{"test"});
        }

        //Obtain some other builder properties
        boolean saveOutput = Boolean.parseBoolean(DiversifyProperties.getProperty("save.builder.output", "false"));
        boolean useClojure = Boolean.parseBoolean(DiversifyProperties.getProperty("clojure", "false"));
        String results = DiversifyProperties.getProperty("result");
        rb.setSaveOutputDir(results);
        rb.setClojureTest(useClojure);
        rb.setSaveOutputToFile(saveOutput);

        return rb;
    }

    /**
     * Initializes the InputProgram dataset
     */
    protected void initInputProgram(Factory factory) {
        inputProgram = new InputProgram();
        inputProgram.setFactory(factory);

        inputProgram.setCoverageReport(initCoverageReport());

        inputProgram.setTransformationPerRun(
                Integer.parseInt(inputConfiguration.getProperty("transformation.size", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(
                inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(DiversifyProperties.getProperty("project") + "/" +
                inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));


    }

    protected TransformationQuery initTransformationQuery() throws ClassNotFoundException, NotFoundException, TransformationParserException {

        String type = DiversifyProperties.getProperty("transformation.type").toLowerCase();

        switch (type) {
            case "checkreturn":
                return new CheckReturn(inputProgram);
            case "mutation":
                return new MutationQuery(inputProgram);
            case "shuffle":
                return new ShuffleStmtQuery(inputProgram);
            case "other":
                return new OtherQuery(inputProgram);
            case "all":
                return new CompositeQuery(inputProgram);
            case "cvl":
                return new CvlQuery(inputProgram);
            case "bytecode":
                return new ByteCodeTransformationQuery(inputProgram);
            case "mutationtososie": {
                /*
                String jacocoFile = DiversifyProperties.getProperty("jacoco");
                String classes = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes");
                String mutationDirectory = DiversifyProperties.getProperty("transformation.directory");
                */
                return new MutationToSosieQuery(inputProgram);
            }
            case "adr": {
                Class cl = Class.forName(DiversifyProperties.getProperty("CodeFragmentClass"));
                boolean subType = Boolean.parseBoolean(DiversifyProperties.getProperty("transformation.subtype", "false"));
                return new ASTTransformationQuery(inputProgram, cl, subType, false);
            }
            case "adrstupid": {
                Class cl = Class.forName(DiversifyProperties.getProperty("CodeFragmentClass"));
                boolean subType = Boolean.parseBoolean(DiversifyProperties.getProperty("transformation.subtype", "false"));
                return new ASTTransformationQuery(inputProgram, cl, subType, true);
            }
            case "knownsosies":
                //This query benefits from a early processCodeFragments
                inputProgram.processCodeFragments();
                return new KnownSosieQuery(inputProgram);
            case "knownmultisosies":
                //This query benefits from a early processCodeFragments
                inputProgram.processCodeFragments();
                return new KnowMultisosieQuery(inputProgram);
            case "singleconsecutive":
                int startSosieIndex = Integer.parseInt(DiversifyProperties.getProperty("start.sosie.index", "0"));
                inputProgram.processCodeFragments();
                ConsecutiveKnownSosieQuery q = new ConsecutiveKnownSosieQuery(inputProgram);
                q.setCurrentTrial(startSosieIndex);
                return q;
            case "specificindexes":
                ArrayList<Integer> spIndex = new ArrayList<>();
                for ( String s : DiversifyProperties.getProperty("specific.indexes").split(",") ) {
                    spIndex.add(Integer.parseInt(s));
                }
                inputProgram.processCodeFragments();
                SpecificSosiesQuery query = new SpecificSosiesQuery(inputProgram);
                query.setSpecificIndex(spIndex);
                return query;
            default:
                //Try to construct the query from the explicit class
                try {
                    Class[] intArgsClass = new Class[]{InputProgram.class};
                    Class strategyClass = Class.forName(type);
                    Constructor constructor = strategyClass.getConstructor(intArgsClass);
                    return (TransformationQuery) constructor.newInstance(inputProgram);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }

    protected ICoverageReport initCoverageReport() {
        String jacocoFile = DiversifyProperties.getProperty("jacoco");
        String classes = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes");

        ICoverageReport icr = null;
        if (jacocoFile != null) {
            try {
                File file = new File(jacocoFile);
                if (file.isDirectory()) icr = new MultiCoverageReport(classes, file);
                else icr = new CoverageReport(classes, file);
                icr.create();
                return icr;
            } catch (IOException e) {
                Log.warn("Unable to find coverage file or corrupt information: using NullCoverage");
                icr = null;
            }
        } else {
            //Try to use the trace coverage
            String traceDir = DiversifyProperties.getProperty("trace.dirs");
            Boolean binaryTrace = Boolean.parseBoolean(DiversifyProperties.getProperty("binary.trace", "false"));
            if (traceDir != null) {
                String[] dirs = traceDir.split(";");
                ArrayList<File> traceFiles = new ArrayList<>();
                for (String s : dirs) {
                    File f = new File(s);
                    if (f.exists() && f.isDirectory()) {
                        traceFiles.add(f);
                    } else {
                        Log.warn("Invalid trace dir: " + s);
                    }
                }
                if (traceFiles.size() > 0) {
                    try {
                        icr = new MultiCoverageReport(traceFiles, binaryTrace);
                        icr.create();
                        return icr;
                    } catch (IOException e) {
                        Log.warn("Unable to find coverage file or corrupt information: using NullCoverage");
                        icr = null;
                    }
                }
            }
        }
        if (icr == null) {
            icr = new NullCoverageReport();
        }

        return icr;
    }


    protected void initSpoon() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Factory factory = new SpoonMetaFactory().buildNewFactory(
                inputConfiguration.getProperty("project") + "/" +
                        inputConfiguration.getProperty("src"),
                Integer.parseInt(inputConfiguration.getProperty("javaVersion")));
        initInputProgram(factory);
    }

    protected void computeStatistic() throws Exception {
        String out = DiversifyProperties.getProperty("result");
//        computeCodeFragmentStatistic(out);

        String transDir = DiversifyProperties.getProperty("transformation.directory");
        if (transDir != null) {
            computeDiversifyStat(transDir, out);
        }
//        computeOtherStat();
    }

    protected void computeDiversifyStat(String transDir, String fileName) throws Exception {
        TransformationParser tf = new TransformationParser(true, inputProgram);
//        TransformationOldParser tf = new TransformationOldParser(true);
        Collection<Transformation> transformations = tf.parseDir(transDir);
        TransformationsWriter write = new TransformationsWriter(transformations, fileName);


        Log.debug("all transformation type : {}", getAllTransformationType(transformations));
        write.writeAllTransformation(null);
        StatisticDiversification sd = new StatisticDiversification(transformations);
        sd.writeStat(fileName);


        for (String type : getAllTransformationType(transformations))
            write.writeAllTransformation(type);

        write.writeGoodTransformation(null);

        for (String type : getAllTransformationType(transformations))
            write.writeGoodTransformation(type);


        CVLMetric cvlMetric = new CVLMetric(inputProgram);
        cvlMetric.printMetrics(fileName + "_cvlMetric.csv");

        Visu v = new Visu(fileName + "_visu/visu", inputProgram);
        v.writeJSON(transformations);

//        FailureMatrix matrix = new FailureMatrix(transformations,DiversifyProperties.getProperty("allTestFile"));
//        matrix.printAllMatrix(fileName);
    }

    protected Set<String> getAllTransformationType(Collection<Transformation> transformations) {
        Set<String> types = new HashSet<String>();
        for (Transformation t : transformations)
            types.add(t.getType());
        return types;
    }


    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }
}
