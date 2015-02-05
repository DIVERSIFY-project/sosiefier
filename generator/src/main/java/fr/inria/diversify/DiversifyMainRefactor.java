package fr.inria.diversify;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.ant.AntBuilder;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.coverage.CoverageReport;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.MultiCoverageReport;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.diversification.*;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.statistic.CVLMetric;
import fr.inria.diversify.statistic.StatisticDiversification;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.query.*;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.visu.Visu;
import javassist.NotFoundException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import spoon.Launcher;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Main class for the sosie generator.
 * <p/>
 * User: Simon
 * Date: 9/11/13
 * Time: 11:41 AM
 */
public class DiversifyMainRefactor {

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

    public DiversifyMainRefactor(String propertiesFile) throws Exception, InvalidSdkException {

        inputConfiguration = new InputConfiguration(propertiesFile);

        initLogLevel();
        initDependency();
        initInputProgram();
        initSpoon();
        TransformationQuery query = initTransformationQuery();

        AbstractDiversify runner = initRunner();
        runner.setTransformationQuery(query);
        AbstractBuilder builder = initBuilder(runner.getTmpDir());
        runner.setBuilder(builder);

        try {
            int n = Integer.parseInt(inputConfiguration.getProperty("nbRun"));
            runner.run(n);
        } finally {
            writeResult(runner);
            runner.deleteTmpFiles();
        }

        if (inputConfiguration.getProperty("stat").equals("true")) {
            computeStatistic();
        }
    }

    protected void initDependency() throws Exception, InvalidSdkException {
        MavenDependencyResolver t = new MavenDependencyResolver();
        String builder = inputConfiguration.getProperty("builder");

        if (builder.equals("maven")) {
            File pom = new File(inputConfiguration.getProperty("project") + "/pom.xml");
            File originalPom = new File(inputConfiguration.getProperty("project") + "/_originalPom.xml");
            FileUtils.copyFile(pom, originalPom);

            String dependencyPom = inputConfiguration.getProperty("dependencyPom");
            if(dependencyPom != null) {
                FileUtils.copyFile(new File(inputConfiguration.getProperty("project") + "/" +dependencyPom), pom);
            }

            t.DependencyResolver(inputConfiguration.getProperty("project") + "/pom.xml");

            FileUtils.copyFile(originalPom, pom);
            FileUtils.forceDelete(originalPom);
        }

        String androidSdk = inputConfiguration.getProperty("AndroidSdk");
        if(androidSdk != null) {
            t.resolveAndroidDependencies(androidSdk);
        }
    }

    protected AbstractDiversify initRunner() throws Exception {
        AbstractDiversify abstractDiversify = null;
        String runner = inputConfiguration.getProperty("runner", "simple");
        String projet = inputConfiguration.getProperty("project");
        String src = inputConfiguration.getProperty("src");
        String testSrcDir = inputConfiguration.getProperty("testSrc", null);
        String sosieDir = inputConfiguration.getProperty("copy.sosie.sources.to", "");
        String resultDir = inputConfiguration.getProperty("result");

        switch (runner) {
            case "simple":
                abstractDiversify = new SinglePointDiversify(inputConfiguration, projet, src);
                break;
            case "multi": {
                int multiTransformationSize = Integer.parseInt(inputConfiguration.getProperty("multiTransformation.size"));
                abstractDiversify = new MultiSosieGenerator(inputConfiguration, projet, src);
                ((MultiSosieGenerator) abstractDiversify).setTransformationSize(multiTransformationSize);
                break;
            }
            case "fse": {
                DiversifyAndCompare dac = new DiversifyAndCompare(inputConfiguration, projet, src, testSrcDir);
                dac.setAmplifiedTestDir(inputConfiguration.getProperty("amplifiedTestDir"));
                dac.setOriginalLogDir(inputConfiguration.getProperty("compare.originalLog"));
                dac.setFilterFile(inputConfiguration.getProperty("compare.filter"));
                abstractDiversify = dac;
                break;
            }
            case "android": {
                abstractDiversify = new DiversifyAndCompare(inputConfiguration, projet, src, testSrcDir);
                abstractDiversify.setAndroid(true);
                break;
            }

        }


      abstractDiversify.init(projet, inputConfiguration.getProperty("tmpDir"));
        abstractDiversify.setSosieSourcesDir(sosieDir);
//        abstractDiversify.setBuilder(initBuilder(tmpDir));
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

//            String pomFile = inputConfiguration.getProperty("newPomFile");
//            if (!pomFile.equals("")) {
//                rb.initPom(pomFile);
//            }
//
//            rb.copyClasses(inputConfiguration.getProperty("classes"));
//            rb.initTimeOut();
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

    /**
     * Initializes the InputProgram dataset
     */
    protected void  initInputProgram() throws IOException, InterruptedException {
        inputProgram = new InputProgram();
        inputConfiguration.setInputProgram(inputProgram);
        inputProgram.setProgramDir(inputConfiguration.getProperty("project"));
        inputProgram.setRelativeSourceCodeDir(inputConfiguration.getRelativeSourceCodeDir());

        if(inputConfiguration.getProperty("externalSrc") != null) {
            List<String> list = Arrays.asList(inputConfiguration.getProperty("externalSrc").split(System.getProperty("path.separator")));
            String sourcesDir = list.stream()
                                    .map(src -> inputProgram.getProgramDir() + "/" + src)
                                    .collect(Collectors.joining(System.getProperty("path.separator")));
            inputProgram.setExternalSourceCodeDir(sourcesDir);
        }
        inputProgram.setCoverageReport(initCoverageReport());

        inputProgram.setTransformationPerRun(
                Integer.parseInt(inputConfiguration.getProperty("transformation.size", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(
                inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(inputConfiguration.getProperty("project") + "/" +
                                           inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));
    }

    protected TransformationQuery initTransformationQuery() throws ClassNotFoundException, NotFoundException, TransformationParserException {
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
                return new ASTTransformationQuery(inputProgram, cl, subType, false);
            }
            case "adrstupid": {
                Class cl = Class.forName(inputConfiguration.getProperty("CodeFragmentClass"));
                return new ASTTransformationQuery(inputProgram, cl, subType, true);
            }
            case "fromlist": {
                FromListQuery query = new FromListQuery(inputProgram);
                query.setShuffle(true);
                return query;
            }
            case "fse":{
                Class cl = Class.forName(inputConfiguration.getProperty("CodeFragmentClass"));
                return new ASTTransformationQuery(inputProgram, cl, subType, false);
            }
            case "issta": {

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

    protected ICoverageReport initCoverageReport() {
        String jacocoFile = inputConfiguration.getProperty("jacoco");
        String classes = inputConfiguration.getProperty("project") + "/" + inputConfiguration.getProperty("classes");

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


    protected void initSpoon() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String sourcesDir = inputProgram.getAbsoluteSourceCodeDir();
        if(inputProgram.getExternalSourceCodeDir() != null) {
            sourcesDir += System.getProperty("path.separator") + inputProgram.getExternalSourceCodeDir();
        }

        Factory factory = new SpoonMetaFactory().buildNewFactory(
                sourcesDir,
                Integer.parseInt(inputConfiguration.getProperty("javaVersion")));
        inputProgram.setFactory(factory);
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

    protected void computeDiversifyStat(String transDir, String fileName) throws Exception {
        TransformationParser tf = new TransformationParser(true, inputProgram);
//        TransformationOldParser tf = new TransformationOldParser(true);
        Collection<Transformation> transformations = tf.parseDir(transDir);
        TransformationsWriter write = new TransformationsWriter(transformations, fileName);


        Log.debug("all transformation type : {}", getAllTransformationType(transformations));
        write.writeAllTransformation(null);
//        StatisticDiversification sd = new StatisticDiversification(transformations);
//        sd.writeStat(fileName);


        for (String type : getAllTransformationType(transformations))
            write.writeAllTransformation(type);

        write.writeGoodTransformation(null);

        for (String type : getAllTransformationType(transformations))
            write.writeGoodTransformation(type);


        CVLMetric cvlMetric = new CVLMetric(inputProgram);
        cvlMetric.printMetrics(fileName + "_cvlMetric.csv");

//       Visu v = new Visu(fileName + "_visu/visu", inputProgram);
//        v.writeJSON(transformations);

//        FailureMatrix matrix = new FailureMatrix(transformations,inputConfiguration.getProperty("allTestFile"));
//        matrix.printAllMatrix(fileName);
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

    protected void initLogLevel() {
        Launcher.logger.setLevel(Level.OFF);
        int level = Integer.parseInt(inputConfiguration.getProperty("logLevel"));
        Log.set(level);

    }
}
