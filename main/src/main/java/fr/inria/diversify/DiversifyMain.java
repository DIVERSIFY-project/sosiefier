package fr.inria.diversify;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.ant.AntBuilder;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.coverage.CoverageReport;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.MultiCoverageReport;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.diversification.*;
import fr.inria.diversify.issta2.Compare;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.statistic.CVLMetric;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.query.*;
import fr.inria.diversify.transformatonSelection.TestAndBranchSelection;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.visu.Visu;
import javassist.NotFoundException;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.stream.Collectors;

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

    public DiversifyMain(String propertiesFile) throws Exception, InvalidSdkException {

        inputConfiguration = new InputConfiguration(propertiesFile);

        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initSpoon(inputProgram, false);
        TransformationQuery query = initTransformationQuery();

        AbstractDiversify runner = initRunner();
        runner.setTransformationQuery(query);
        AbstractBuilder builder = initBuilder(runner.getTmpDir());
        inputProgram.setCoverageReport(initCoverageReport(runner.getTmpDir()));
        runner.setBuilder(builder);



        if (inputConfiguration.getProperty("stat").equals("true")) {
            computeStatistic();
        } else {
            int n = Integer.parseInt(inputConfiguration.getProperty("nbRun"));
            runner.run(n);
            writeResult(runner);
            runner.deleteTmpFiles();
        }
    }

    protected AbstractDiversify initRunner() throws Exception {
        AbstractDiversify abstractDiversify = null;
        String runner = inputConfiguration.getProperty("runner", "simple");
        String project = inputConfiguration.getProperty("project");
        String src = inputConfiguration.getProperty("src");
        String testSrcDir = inputConfiguration.getProperty("testSrc", null);
        String sosieDir = inputConfiguration.getProperty("copy.sosie.sources.to", "");
        String resultDir = inputConfiguration.getProperty("result");

        switch (runner) {
            case "simple":
                abstractDiversify = new SinglePointDiversify(inputConfiguration, project, src);
                break;
            case "gh":
                abstractDiversify = new GHDiversify(inputConfiguration, project, src, inputConfiguration.getProperty("testScripBefore"), inputConfiguration.getProperty("testScriptAfter") ,inputConfiguration.getProperty("testProject"));
                break;
//            case "dumpfailure":
//                abstractDiversify = new DumpFailure(inputConfiguration, project, src);
//                break;
            case "multi": {
                int multiTransformationSize = Integer.parseInt(inputConfiguration.getProperty("multiTransformation.size"));
                MultiTransformationGenerator multi = new MultiTransformationGenerator(inputConfiguration, project, src);
                multi.setTransformationSize(multiTransformationSize);
                multi.setOnlySosie(false);
                abstractDiversify = multi;
                break;
            }
            case "multisosie": {
                int multiTransformationSize = Integer.parseInt(inputConfiguration.getProperty("multiTransformation.size"));
                MultiTransformationGenerator multi = new MultiTransformationGenerator(inputConfiguration, project, src);
                multi.setTransformationSize(multiTransformationSize);
                multi.setOnlySosie(true);
                abstractDiversify = multi;
                break;
            }
            case "fse": {
                DiversifyAndCompare dac = new DiversifyAndCompare(inputConfiguration, project, src, testSrcDir, inputConfiguration.getProperty("compare.filter"));
                dac.setAmplifiedTestDir(inputConfiguration.getProperty("amplifiedTestDir"));
                dac.setOriginalLogDir(inputConfiguration.getProperty("compare.originalLog"));
                abstractDiversify = dac;
                break;
            }
            case "compareBranch": {
//                BranchComparator branchComparator = new BranchComparator(inputProgram);
                abstractDiversify = new Compare(inputConfiguration, project, src, null);
                break;
            }
            case "android": {
                abstractDiversify = new SinglePointDiversify(inputConfiguration, project, src);
                abstractDiversify.setAndroid(true);
                break;
            }

        }
        abstractDiversify.setSosieSourcesDir(sosieDir);
        abstractDiversify.init(project, inputConfiguration.getProperty("tmpDir"));

        abstractDiversify.setResultDir(resultDir);

        return abstractDiversify;
    }

    protected AbstractBuilder initBuilder(String directory) throws Exception {
        AbstractBuilder rb;
        String builder =  inputConfiguration.getProperty("builder");

        if(builder.equals("maven")) {
            String[] phases = new String[]{inputConfiguration.getProperty("phase")};
            if(phases[0] == null) {
                phases = new String[]{"clean", "test" };
            }
            rb = new MavenBuilder(directory);

            String androidSdk = inputConfiguration.getProperty("AndroidSdk", "null");
            if(!androidSdk.equals("null") ) {
                rb.stopAndroidEmulation();
                rb.startAndroidEmulation();
            }

            rb.setGoals(phases);

            initTimeOut(rb);

            URL[] URL = new URL[1];
            URL[0] = new File(directory +  "/"+ inputProgram.getClassesDir()).toURI().toURL();
            URLClassLoader child = new URLClassLoader(URL, Thread.currentThread().getContextClassLoader());
            Thread.currentThread().setContextClassLoader(child);

            String pomFile = inputConfiguration.getProperty("newPomFile");
            if (!pomFile.equals("")) {
                rb.initPom(pomFile);
            }

        } else { //builder == ant
            rb = new AntBuilder(directory, inputConfiguration.getProperty("builder.testTarget"));
            rb.setGoals(new String[]{"clean", inputConfiguration.getProperty("builder.testTarget")});

            initTimeOut(rb);
        }
        //Obtain some other builder properties
        boolean saveOutput = Boolean.parseBoolean(inputConfiguration.getProperty("save.builder.output", "false"));
        boolean useClojure = Boolean.parseBoolean(inputConfiguration.getProperty("clojure", "false"));
        String results = inputConfiguration.getProperty("result");
        rb.setSaveOutputDir(results);
        rb.setClojureTest(useClojure);
        rb.setSaveOutputToFile(saveOutput);

        return rb;
    }

    protected void initTimeOut(AbstractBuilder rb) throws InterruptedException {
        int t = Integer.parseInt(inputConfiguration.getProperty("timeOut").trim());
        if (t == -1) {
            rb.initTimeOut();
        } else {
            rb.setTimeOut(t);
        }
    }

    protected TransformationQuery initTransformationQuery() throws ClassNotFoundException, NotFoundException, TransformationParserException, IOException, JSONException {
        String type = inputConfiguration.getProperty("transformation.type").toLowerCase();
        boolean subType = Boolean.parseBoolean(inputConfiguration.getProperty("transformation.subtype", "false"));
        switch (type) {
            case "checkreturnif":
                return new CheckReturnQuery(inputProgram);
            case "checkreturn":
                return new CheckReturn(inputProgram);
            case "shufflecollectionbeforereturn":
                return new ShuffleCollectionBeforeReturnQuery(inputProgram);
            case "subclassreplace":
                return new SubClassReplaceQuery(inputProgram);
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
            case "adr": {
                Class cl = Class.forName(inputConfiguration.getProperty("CodeFragmentClass"));
                return new ADRTransformationQuery(inputProgram, cl, subType, false);
            }
            case "adrstupid": {
                Class cl = Class.forName(inputConfiguration.getProperty("CodeFragmentClass"));
                return new ADRTransformationQuery(inputProgram, cl, subType, true);
            }
            case "fromlist": {
                int rangeMin = Integer.parseInt(inputConfiguration.getProperty("transformation.range.min", "-1"));
                int rangeMax = Integer.parseInt(inputConfiguration.getProperty("transformation.range.max", "-1"));
                FromListQuery query;
                if(rangeMax == -1 || rangeMin == -1) {
                    query = new FromListQuery(inputProgram);
                } else {
                    query = new FromListQuery(inputProgram, rangeMin, rangeMax);
                }
                query.setShuffle(true);
                query.setRemoveAfterQuery(true);
                return query;
            }
            case "ampsosie": {
                AmpSosieQuery query = new AmpSosieQuery(inputProgram);
                query.initDiff(inputConfiguration.getPreviousTransformationPath(), inputConfiguration.getProperty("compare.filter"));
                query.setShuffle(true);
                query.setRemoveAfterQuery(false);
                return query;
            }
            case "fse":{
                Class cl = Class.forName(inputConfiguration.getProperty("CodeFragmentClass"));
                return new ADRTransformationQuery(inputProgram, cl, subType, false);
            }
            case "issta2": {
                Class cl = Class.forName(inputConfiguration.getProperty("CodeFragmentClass"));
                ADRTransformationQuery query = new ADRTransformationQuery(inputProgram, cl, subType, false);
                String branchInformation = inputConfiguration.getProperty("branchInformation");
                TestAndBranchSelection functionEval = new TestAndBranchSelection(branchInformation);
                query.setEvalFunction(functionEval);

                return query;
            }
            default:
                //Try to construct the executeQuery from the explicit class
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

    protected ICoverageReport initCoverageReport(String tmpDir) {
        String jacocoFile = inputConfiguration.getProperty("jacoco");
        String classes = tmpDir + "/" + inputProgram.getClassesDir();

        ICoverageReport icr = null;
        if (jacocoFile != null) {
            try {

                File file = new File(jacocoFile);
                if (file.isDirectory()) {
                    icr = new MultiCoverageReport(classes, file);
                } else {
                    String classToCover = inputConfiguration.getProperty("coverage.class", null);
                    icr = new CoverageReport(classes, file, classToCover);
                }
                icr.create();
                return icr;
            } catch (IOException e) {
                Log.warn("Unable to find coverage file or corrupt information: using NullCoverage");
                icr = null;
            }
        } else {
            //Try to use the trace coverage
            String traceDir = inputConfiguration.getProperty("trace.dirs");
            Boolean binaryTrace = Boolean.parseBoolean(inputConfiguration.getProperty("binary.trace", "false"));
            if (traceDir != null) {
                String[] dirs = traceDir.split(";");
                ArrayList<File> traceFiles = new ArrayList();
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

    protected void computeStatistic() throws Exception {
        String out = inputConfiguration.getProperty("result");
//        computeCodeFragmentStatistic(out);

        String transDir = inputConfiguration.getProperty("transformation.directory");
        if (transDir != null) {
            computeDiversifyStat(transDir, out);
        }
//        computeOtherStat();
    }

    protected void computeDiversifyStat(String transDir, String output) throws Exception {
//        TransformationParser tf = new TransformationParser(true, inputProgram);
//        Collection<Transformation> transformations = tf.parse(transDir);
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
          Collection<Transformation> transformations = loader.load(transDir, false);
//        TransformationsWriter write = new TransformationsWriter(transformations, fileName);
        JsonTransformationWriter writer = new JsonTransformationWriter();
        File out = new File(output);
        if(!out.exists()) {
            out.mkdirs();
        }
        writer.write(transformations, output+".json", inputProgram.getProgramDir() + "/pom.xml");
        Set<Transformation> sosies = transformations.stream()
                .filter(t -> t.isSosie())
                .collect(Collectors.toSet());
        writer.write(sosies, output+"_sosie.json", inputProgram.getProgramDir() + "/pom.xml");

        Log.info("nb transformation: {}", transformations.size());
        Log.info("nb compile: {}", transformations.stream().filter(t -> t.getStatus() >= -1).count());
        Log.info("nb sosie: {}", sosies.size());

        CVLMetric cvlMetric = new CVLMetric(inputProgram);
        cvlMetric.printMetrics(output + "_cvlMetric.csv");

//        visu(sosies);
//        FailureMatrix matrix = new FailureMatrix(transformations,inputConfiguration.getProperty("allTestFile"));
//        matrix.printAllMatrix(fileName);
    }

    protected void visu(Collection<Transformation> transformations) throws Exception {
        String out = inputConfiguration.getProperty("result");

        Set<SingleTransformation> singleTransformation = transformations.stream()
                                                                        .filter(t -> t instanceof SingleTransformation)
                                                                        .map(t -> (SingleTransformation) t)
                                                                        .collect(Collectors.toSet());

        Visu v = new Visu(out + "_visu/visu", inputProgram);
        v.writeJSON(singleTransformation);
    }

    protected Set<String> getAllTransformationType(Collection<Transformation> transformations) {
        Set<String> types = new HashSet<String>();
        for (Transformation t : transformations)
            types.add(t.getType());
        return types;
    }

    protected void writeResult(AbstractDiversify runner) {
        String repo = inputConfiguration.getProperty("gitRepository");

        if (repo.equals("null")) {
            runner.printResult(inputConfiguration.getProperty("result"));
        } else {
            runner.printResultInGitRepo(inputConfiguration.getProperty("result"), repo);
        }
    }
}