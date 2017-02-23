package fr.inria.diversify;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.ant.AntBuilder;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.coverage.CoverageReport;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.MultiCoverageReport;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.runner.*;
import fr.inria.diversify.issta2.Compare;
import fr.inria.diversify.issta2.DiffQuery;
import fr.inria.diversify.issta2.MultiTransformationGenerator;
import fr.inria.diversify.issta2.SosieComparator;
import fr.inria.diversify.logger.branch.BranchComparator;
import fr.inria.diversify.logger.transformationUsed.StaticDiffBuilder;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.statistic.ASTTransformationSearchSpace;
import fr.inria.diversify.statistic.TransformationInfo;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.switchsosie.SwitchQuery;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.query.*;
import fr.inria.diversify.transformation.typeTransformation.InstanceTransformationQuery;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.visu.Visu;
import javassist.NotFoundException;
import org.json.JSONException;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;

import java.io.*;
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
    protected InputProgram inputProgram;

    /**
     * The input configuration given by the user is parsed by this class which helps other parts of the program to
     * interact with the input parameters
     * s
     */
    protected InputConfiguration inputConfiguration;

    public DiversifyMain(String propertiesFile) throws Exception, InvalidSdkException {
        Runtime.getRuntime().traceMethodCalls(true);
        //System.out.println("Cur dir " + System.getProperty("user.dir"));
        inputConfiguration = new InputConfiguration(propertiesFile);

        InitUtils.initLogLevel(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);

//        MavenDependencyResolver2 dependencyResolver = new MavenDependencyResolver2((MavenBuilder) initBuilder(inputProgram.getProgramDir()));
//        dependencyResolver.resolveDependencies(inputProgram);

        InitUtils.initSpoon(inputProgram, false);


        if (inputConfiguration.getProperty("stat").equals("true")) {
            computeStatistic();
        } else if (inputConfiguration.getProperty("printCandidates", "false").equals("true")) {
            int n = Integer.parseInt(inputConfiguration.getProperty("nbRun"));
            AbstractRunner runner = initRunner();

            AbstractBuilder builder = initBuilder(runner.getTmpDir());
            inputProgram.setCoverageReport(initCoverageReport(runner.getTmpDir()));
            TransformationQuery query = initTransformationQuery();

            int maxTransformationPerFile = Integer.parseInt(inputConfiguration.getProperty("maxTransformationPerFile", "100"));

            File outputDir = new File("./" + inputConfiguration.getProperty("transformationsOutput", "transoformationOutput"));
            if(!outputDir.exists()) outputDir.mkdirs();
            JsonTransformationWriter writer = new JsonTransformationWriter();


            int i = 0;
            int j = 0;
            List<Transformation> transformations = new ArrayList<>();
            try {
                if (n > 0) {
                    while ((i < n) && query.hasNextTransformation()) {
                        transformations.add(query.query());
                        if(transformations.size() > maxTransformationPerFile) {

                            writer.write(transformations,
                                    inputConfiguration.getProperty("transformationsOutput", "transoformationOutput") + j + ".json",
                                    inputConfiguration.getInputProgram().getProgramDir() + "/pom.xml");
                            j++;
                            transformations.clear();
                        }
                        i++;
                    }
                } else {
                    while (query.hasNextTransformation()) {
                        transformations.add(query.query());
                        if(transformations.size() > maxTransformationPerFile) {

                            writer.write(transformations,
                                    inputConfiguration.getProperty("transformationsOutput", "transoformationOutput") + j + ".json",
                                    inputConfiguration.getInputProgram().getProgramDir() + "/pom.xml");
                            j++;
                            transformations.clear();
                        }
                    }
                }
            } catch (QueryException e) {
            }

        } else {
            int n = Integer.parseInt(inputConfiguration.getProperty("nbRun"));
            AbstractRunner runner = initRunner();

            AbstractBuilder builder = initBuilder(runner.getTmpDir());
            inputProgram.setCoverageReport(initCoverageReport(runner.getTmpDir()));
            TransformationQuery query = initTransformationQuery();
            runner.setTransformationQuery(query);
            InitUtils.addApplicationClassesToClassPath(inputProgram);
            runner.setBuilder(builder);

            try {
                runner.run(n);
            } finally {
                writeResult(runner);
            }
            runner.deleteTmpFiles();
        }
    }

    protected AbstractRunner initRunner() throws Exception {
        AbstractRunner abstractRunner = null;
        String runner = inputConfiguration.getProperty("runner", "simple");
        String project = inputConfiguration.getProperty("project");
        String src = inputConfiguration.getProperty("src");
        String sosieDir = inputConfiguration.getProperty("copy.sosie.sources.to", "");
        String resultDir = inputConfiguration.getProperty("result");

        switch (runner) {
            case "simple":
                abstractRunner = new SinglePointRunner(inputConfiguration, project, src);
                break;
            case "secondpass":
                abstractRunner = new SecondPassRunner(inputConfiguration, project, src);
                break;
            case "coverage":
                abstractRunner = new CoverageRunner(inputConfiguration, project, src);
                break;
            case "gh":
                abstractRunner = new GHRunner(inputConfiguration, project, src, inputConfiguration.getProperty("testScripBefore"), inputConfiguration.getProperty("testScriptAfter") ,inputConfiguration.getProperty("testProject"));
                break;
//            case "dumpfailure":
//                abstractDiversify = new DumpFailure(inputConfiguration, project, src);
//                break;
            case "multi": {
                int multiTransformationSize = Integer.parseInt(inputConfiguration.getProperty("multiTransformation.size"));
                MultiTransformationGenerator multi = new MultiTransformationGenerator(inputConfiguration, project, src);
                multi.setTransformationSize(multiTransformationSize);
                multi.setOnlySosie(false);
                abstractRunner = multi;
                break;
            }
            case "multisosie": {
                int multiTransformationSize = Integer.parseInt(inputConfiguration.getProperty("multiTransformation.size"));
                MultiTransformationGenerator multi = new MultiTransformationGenerator(inputConfiguration, project, src);
                multi.setTransformationSize(multiTransformationSize);
                multi.setOnlySosie(true);
                abstractRunner = multi;
                break;
            }
            case "compare": {
                SosieComparator comparator = new SosieComparator(inputConfiguration.getInputProgram());
                comparator.addComparator(new BranchComparator());
//                comparator.addComparator(new GraphsComparator());
//                comparator.addComparator(new ExceptionComparator());
//                comparator.addComparator(new LogVariableComparator());
                comparator.addComparator(new StaticDiffBuilder());
                abstractRunner = new Compare(inputConfiguration, project, src, comparator);
                break;
            }
            case "android": {
                abstractRunner = new SinglePointRunner(inputConfiguration, project, src);
                abstractRunner.setAndroid(true);
                break;
            }

        }
        abstractRunner.setSosieSourcesDir(sosieDir);
        abstractRunner.init(project, inputConfiguration.getProperty("tmpDir"));

        abstractRunner.setResultDir(resultDir);

        return abstractRunner;
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

            String builderPath = inputConfiguration.getProperty("maven.home",null);
            rb.setBuilderPath(builderPath);

            String androidSdk = inputConfiguration.getProperty("maven.androidSdk", "null");
            if(!androidSdk.equals("null") ) {
                rb.stopAndroidEmulation();
                rb.startAndroidEmulation();
            }

            String mavenLocalRepository = inputConfiguration.getProperty("maven.localRepository",null);
            if(mavenLocalRepository != null) {
                File m2 = new File(mavenLocalRepository);
                if (!m2.exists()) {
                    m2.mkdirs();
                }
                rb.setSetting(m2);
            }

            rb.setGoals(phases);
            initTimeOut(rb);

            URL[] URL = new URL[1];
            URL[0] = new File(directory +  "/"+ inputProgram.getClassesDir()).toURI().toURL();



            URLClassLoader child = new URLClassLoader(URL, Thread.currentThread().getContextClassLoader());
            Thread.currentThread().setContextClassLoader(child);

            String pomFile = inputConfiguration.getProperty("maven.newPomFile");
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

    protected TransformationQuery initTransformationQuery() throws ClassNotFoundException, NotFoundException, IOException, JSONException {
        String type = inputConfiguration.getProperty("transformation.type").toLowerCase();
        boolean subType = Boolean.parseBoolean(inputConfiguration.getProperty("transformation.subtype", "false"));
        switch (type) {
            case "checkreturnif":
                boolean varNameMatching = Boolean.parseBoolean(inputConfiguration.getProperty("transformation.varNameMatching", "false"));
                CheckReturnQuery returnQuery = new CheckReturnQuery(inputProgram);
                returnQuery.setVarNameMatching(varNameMatching);
                return returnQuery;
            case "addparamtercondition":
                varNameMatching = Boolean.parseBoolean(inputConfiguration.getProperty("transformation.varNameMatching", "false"));
                AddParameterConditionQuery apQuery = new AddParameterConditionQuery(inputProgram);
                apQuery.setVarNameMatching(varNameMatching);
                return apQuery;
            case "deletevaraffectation" :
                return new DeleteAffectationQuery(inputProgram);
            case "removeparamtercondition" :
                return new RemoveParameterConditionQuery(inputProgram);
            case "removeput" :
                return new RemovePutQuery(inputProgram);
            case "hashcode":
                return new HashCodeQuery(inputProgram);
            case "breakdelete":
                return new BreakDeleteQuery(inputProgram);
            case "continuedelete":
                return new ContinueDeleteQuery(inputProgram);
            case "shufflecollectionbeforereturn":
                return new ShuffleCollectionBeforeReturnQuery(inputProgram);
            case "other":
                return new OtherQuery(inputProgram);
            case "bytecode":
                return new ByteCodeTransformationQuery(inputProgram);
            case "x1":
                return new MultiplyByOneQuery(inputProgram);
            case "loopflip":
                return new LoopFlipQuery(inputProgram);
            case "addmi":
                boolean internalMethods = Boolean.parseBoolean(inputConfiguration.getProperty("addmi.internalMethods", "true"));
                boolean externalMethods = Boolean.parseBoolean(inputConfiguration.getProperty("addmi.externalMethods", "false"));
                boolean staticMethods = Boolean.parseBoolean(inputConfiguration.getProperty("addmi.staticMethods", "false"));
                boolean nonstaticMethods = Boolean.parseBoolean(inputConfiguration.getProperty("addmi.nonstaticMethods", "true"));
                boolean dumpMethodsAfterSuccess = Boolean.parseBoolean(inputConfiguration.getProperty("addmi.dumpMethodsAfterSuccess", "false"));
                boolean shuffleCandidate = Boolean.parseBoolean(inputConfiguration.getProperty("addmi.shuffleCandidate", "false"));
                boolean shuffleMethods = Boolean.parseBoolean(inputConfiguration.getProperty("addmi.shuffleMethods", "false"));
                return new AddMethodInvocationQuery(inputProgram, internalMethods, externalMethods,
                        staticMethods, nonstaticMethods, dumpMethodsAfterSuccess, shuffleCandidate,
                        shuffleMethods);
            case "swapsubtype":
                return new SwapSubTypeQuery(inputProgram);
            case "removecheck":
                return new RemoveCheckQuerry(inputProgram);
            case "adr": {
                return new ADRTransformationQuery(inputProgram, subType, false);
            }
            case "pureadr": {
                return new PureADRTransformationQuery(inputProgram, subType, false, inputConfiguration.getProperty("pureMethods", ""));
            }
            case "adrstupid": {
                return new ADRTransformationQuery(inputProgram, subType, true);
            }
            case "fromlist": {
                int rangeMin = Integer.parseInt(inputConfiguration.getProperty("transformation.range.min", "-1"));
                int rangeMax = Integer.parseInt(inputConfiguration.getProperty("transformation.range.max", "-1"));
                boolean onlysosie = Boolean.parseBoolean(inputConfiguration.getProperty("transformation.onlySosie", "false"));
                FromListQuery query;
                if(rangeMax == -1 || rangeMin == -1) {
                    query = new FromListQuery(inputProgram, onlysosie);
                } else {
                    query = new FromListQuery(inputProgram, rangeMin, rangeMax, onlysosie);
                }
                query.setShuffle(true);
                query.setRemoveAfterQuery(true);
                query.setOnlySosie(onlysosie);
                return query;
            }
            case "diffs": {
                DiffQuery query = new DiffQuery(inputProgram);
                query.setShuffle(true);
                query.setRemoveAfterQuery(true);
                return query;
            }

            case "switch": {
                int rangeMin = Integer.parseInt(inputConfiguration.getProperty("transformation.range.min", "-1"));
                int rangeMax = Integer.parseInt(inputConfiguration.getProperty("transformation.range.max", "-1"));
                SwitchQuery query;
                if(rangeMax == -1 || rangeMin == -1) {
                    query = new SwitchQuery(inputProgram);
                } else {
                    query = new SwitchQuery(inputProgram, rangeMin, rangeMax);
                }
                query.setShuffle(true);
                query.setRemoveAfterQuery(true);
                return query;
            }
            case "fse":{
                return new ADRTransformationQuery(inputProgram, subType, false);
            }
            case "replaceconstructor" : {
                return new InstanceTransformationQuery(inputProgram, ".*:.*:.*", true, false);
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

        String transDir = inputConfiguration.getProperty("transformation.directory");
        if (transDir != null) {
            if(inputConfiguration.getProperty("stackTransformations", "false").equalsIgnoreCase("true"))
                stackProduceTransformationFromJSON(transDir, out);
            else if(inputConfiguration.getProperty("pure", "false").equalsIgnoreCase("true"))
                computePureDiversifyStat(transDir, out);
            else
                computeDiversifyStat(transDir, out);
        } else {
            computeSearchSpace(out);
        }
    }

    Set<String> pureMethods = new HashSet<>();
    protected void loadPureMethodList(File f) {
        Scanner sc = null;
        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                pureMethods.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected boolean isPure(ASTTransformation t) {
        CtElement ct = t.getTransplantationPoint().getCtCodeFragment();
        CtExecutable parent = ct.getParent(CtExecutable.class);
        String mName, mSig;

        if(parent instanceof CtConstructor) {
            t.inConstructor = true;
            CtConstructor m = (CtConstructor) parent;
            mName = m.getSimpleName();
            mSig = m.getSignature();
        } else if(parent instanceof CtMethod) {
            CtMethod m = (CtMethod) parent;
            mName = m.getSimpleName();
            mSig = m.getSignature();
            if(mName.substring(0,1).compareTo(mName.substring(0,1).toUpperCase()) == 0) t.inConstructor = true;

        /*} else if(parent instanceof CtConstructor) {
            t.inConstructor = true;
            CtConstructor m = (CtConstructor) parent;
            mName = m.getSimpleName();
            mSig = m.getSignature();*/
        } else {
            return false;
        }
        try {
            String sig = mSig.split("\\(")[1];
            if(sig.split("\\)").length == 0) sig = "";
            else sig = sig.split("\\)")[0];
            String meth = t.classLocationName() + "." + mName + "(" + sig + ")";
            if (pureMethods.contains(meth))
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    protected void computePureDiversifyStat(String transDir, String output) throws Exception {
        if(inputConfiguration.getProperty("pureMethods") != null) {
            loadPureMethodList(new File(inputConfiguration.getProperty("pureMethods")));
            System.out.println("------------------------- Pure Methods OK ? " + (pureMethods != null) + "---------------------");
        }
        ICoverageReport coverage = initCoverageReport(inputProgram.getProgramDir());
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
        Collection<Transformation> transformationsRaw = loader.load(transDir, false);
        Collection<Transformation> transformationsRawSet = new HashSet<>(transformationsRaw);
        Collection<ASTTransformation> transformations = new HashSet<>();
        for(Transformation t : transformationsRawSet) {
            ASTTransformation a = (ASTTransformation) t;
            transformations.add(a);
            if(isPure(a)) a.inPure = true;
        }

        JsonTransformationWriter writer = new JsonTransformationWriter();


        File file = new File(output);
        if(!file.exists()) {
            file.mkdirs();
        }

        transformations = transformations.stream()
                .filter(trans -> trans.getPositions().stream()
                        .anyMatch(position -> coverage.positionCoverage(position) != 0))
                .collect(Collectors.toSet());

        Set<ASTTransformation> sosies = transformations.stream()
                .filter(t -> t.isSosie())
                .collect(Collectors.toSet());

        Log.info("nb transformation: {}", transformations.size());
        Log.info("nb pure transformation: {}", transformations.stream().filter(t -> isPure(t)).count());
        Log.info("nb compile: {}", transformations.stream().filter(t -> t.getStatus() >= -1).count());
        Log.info("nb pure compile: {}", transformations.stream().filter(t -> (t.getStatus() >= -1) && isPure(t)).count());
        Log.info("nb sosie: {}", sosies.size());
        Log.info("nb pure sosie: {}", sosies.stream().filter(t -> isPure(t)).count());



        //writer.write(transformationsRaw, output+".json", inputProgram.getProgramDir() + "/pom.xml");
        //writer.write(sosies, output+"_sosie.json", inputProgram.getProgramDir() + "/pom.xml");

        TransformationInfo transformationInfo = new TransformationInfo(transformationsRawSet);
        transformationInfo.printPurity = true;
        transformationInfo.print(output + "Trial.csv");


    }

    protected void computeDiversifyStat(String transDir, String output) throws Exception {
        ICoverageReport coverage = initCoverageReport(inputProgram.getProgramDir());
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
        Collection<Transformation> transformations = loader.load(transDir, false);

        JsonTransformationWriter writer = new JsonTransformationWriter();

        File file = new File(output);
        if(!file.exists()) {
            file.mkdirs();
        }

        transformations = transformations.stream()
                .filter(trans -> trans.getPositions().stream()
                                .anyMatch(position -> coverage.positionCoverage(position) != 0))
                .collect(Collectors.toSet());

        Set<Transformation> sosies = transformations.stream()
                .filter(t -> t.isSosie())
                .collect(Collectors.toSet());

        Log.info("nb transformation: {}", transformations.size());
        Log.info("nb compile: {}", transformations.stream().filter(t -> t.getStatus() >= -1).count());
        Log.info("nb sosie: {}", sosies.size());



        writer.write(transformations, output+".json", inputProgram.getProgramDir() + "/pom.xml");
        writer.write(sosies, output+"_sosie.json", inputProgram.getProgramDir() + "/pom.xml");

        for(Transformation t : transformations) {t.setInputProgram(inputProgram);}

        TransformationInfo transformationInfo = new TransformationInfo(transformations);
        if(inputConfiguration.getProperty("transformation.type").toLowerCase().equals("addmi")) transformationInfo.isAddMI = true;
        transformationInfo.print(output + "Trial.csv");
    }

    protected void computeSearchSpace(String out) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(out + "_searchSpace.csv"));
        writer.write("position;searchSpaceSize;nodeType\n");

        ASTTransformationSearchSpace tSS = new ASTTransformationSearchSpace(inputProgram.getCodeFragments(), new NullCoverageReport());
        Map<CodeFragment, Long> searchSpace = tSS.getSearchSpace();

        for(CodeFragment codeFragment : searchSpace.keySet()) {
            SourcePosition position = codeFragment.getCtCodeFragment().getPosition();
            writer.write(position.getCompilationUnit().getMainType().getQualifiedName() + ":" + position.getLine());
            writer.write(";" + searchSpace.get(codeFragment) + ";");
            writer.write(codeFragment.getCodeFragmentTypeSimpleName() + "\n");
        }
        writer.close();
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

    protected void writeResult(AbstractRunner runner) {
        String repo = inputConfiguration.getProperty("gitRepository");

        if(!runner.getTransformations().isEmpty()) {
            if (repo.equals("null")) {
                if(inputConfiguration.getProperty("result").matches("(.+)\\.json"))
                    runner.printResult(inputConfiguration.getProperty("result"), true);
                else
                    runner.printResult(inputConfiguration.getProperty("result"));

            } else {
                runner.printResultInGitRepo(inputConfiguration.getProperty("result"), repo);
            }
        }
    }

    protected void stackProduceTransformationFromJSON(String transDir, String output) throws Exception {
        ICoverageReport coverage = initCoverageReport(inputProgram.getProgramDir());
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
        Collection<Transformation> transformations = loader.load(transDir, false);

        File file = new File(output);
        if(!file.exists()) {
            file.mkdirs();
        }

        transformations = transformations.stream()
                .filter(trans -> trans.getPositions().stream()
                        .anyMatch(position -> coverage.positionCoverage(position) != 0))
                .collect(Collectors.toSet());

        Set<Transformation> sosies = transformations.stream()
                .filter(t -> t.isSosie())
                .collect(Collectors.toSet());

        Log.info("nb transformation: {}", transformations.size());
        Log.info("nb compile: {}", transformations.stream().filter(t -> t.getStatus() >= -1).count());
        Log.info("nb sosie: {}", sosies.size());

        File prgDir = new File(inputProgram.getProgramDir());
        File outputDir = new File(output, "soesie");
        fr.inria.diversify.util.FileUtils.copyDirectory(prgDir,outputDir);

        for(Transformation t : sosies) {
            t.apply(inputProgram.getAbsoluteSourceCodeDir());
        }


    }
}