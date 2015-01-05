package fr.inria.diversify.diversification;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.InlineConstantProcessor;
import fr.inria.diversify.codeFragmentProcessor.KnownTransfStatementProcessor;
import fr.inria.diversify.codeFragmentProcessor.ReturnProcessor;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.StringSimilarity;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;

import java.util.*;
import java.util.function.Function;
//import java.util.stream.Collectors;

/**
 * The InputProgram class encapsulates all the known information of the program being sosiefiecated
 * <p>
 * Created by marcel on 6/06/14.
 */
public class InputProgram {

    private HashMap<String, String> nearestMatchPositions;

    /**
     * List of all the code fragments extracted by Spoon of the input program
     */
    private CodeFragmentList codeFragments;

    /**
     * Coverage report for the input program
     */
    private ICoverageReport coverageReport;

    /**
     * Path to the root directory of the input program
     */
    private String programDir;

    /**
     * Path to the source code of the input program
     */
    private String sourceCodeDir;

    /**
     * Path to the test source code of the input program
     */
    private String testSourceCodeDir;

    /**
     * Path to the built classes
     */
    private String classesDir;

    /**
     * Path to the coverage information
     */
    private String coverageDir;

    /**
     * Path to previous transformations made in this input program
     */
    private String previousTransformationsPath;

    /**
     * Number of transformations that we are going to attempt in every run of the diversificator
     */
    private int transformationPerRun;

    /**
     * Minimum number of transformations that we are going to attempt in every run of the diversificator
     */
    private int minTransformationsPerRun;

    /**
     * Root spoon element for an input program, mostly upper level packages
     */
    private Set<CtElement> roots;

    /**
     * List Spoon return statements that can be found in this program
     */
    protected List<CtReturn> returns;


    protected Map<Class, List<CtElement>> typeToObject = new HashMap<Class, List<CtElement>>();

    /**
     * List of inline constants that can be found in this program
     */
    protected List<CtLocalVariable> inlineConstant;

    /**
     * Java assists methods for byte code manipulation
     */
    private List<CtMethod> javassistMethods;

    /**
     * Spoon factory to process all AST elements
     */
    private Factory factory;


    /**
     * Spoon factory to process all AST elements
     */
    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    /**
     * Coverage report for the input program
     */
    public ICoverageReport getCoverageReport() {
        return coverageReport;
    }

    /**
     * Coverage report for the input program
     */
    public void setCoverageReport(ICoverageReport coverageReport) {
        this.coverageReport = coverageReport;
    }

    /**
     * Path to the test source code of the input program
     */
    public String getTestSourceCodeDir() {
        return testSourceCodeDir;
    }

    public void setTestSourceCodeDir(String testSourceCodeDir) {
        this.testSourceCodeDir = testSourceCodeDir;
    }

    /**
     * Path to the source of the input program
     */
    public String getSourceCodeDir() {
        return sourceCodeDir;
    }

    public void setSourceCodeDir(String sourceCodeDir) {
        this.sourceCodeDir = sourceCodeDir;
    }


    /**
     * Path to the know sosie information stored in file
     */
    public String getPreviousTransformationsPath() {
        return previousTransformationsPath;
    }

    public void setPreviousTransformationsPath(String path) {
        this.previousTransformationsPath = path;
    }

    /**
     * Number of transformations that we are going to attempt in every run of the diversificator
     */
    public int getTransformationPerRun() {
        return transformationPerRun;
    }

    public void setTransformationPerRun(int transformationPerRun) {
        this.transformationPerRun = transformationPerRun;
    }

    /**
     * Path to the root directory of the input program
     */
    public String getProgramDir() {
        return programDir;
    }

    public void setProgramDir(String programDir) {
        this.programDir = programDir;
    }

    /**
     * Path to the built classes
     */
    public String getClassesDir() {
        return classesDir;
    }

    public void setClassesDir(String classesDir) {
        this.classesDir = classesDir;
    }


    /**
     * Path to the coverage information
     */
    public String getCoverageDir() {
        return coverageDir;
    }

    public void setCoverageDir(String coverageDir) {
        this.coverageDir = coverageDir;
    }

    /**
     * Minimum number of transformations that we are going to attempt in every run of the diversificator
     */
    public int getMinTransformationsPerRun() {
        return minTransformationsPerRun;
    }

    public void setMinTransformationsPerRun(int minTransformationsPerRun) {
        this.minTransformationsPerRun = minTransformationsPerRun;
    }

    /**
     * Process all code fragments. Used to early process them.
     */
    public void processCodeFragments() {
        if (codeFragments == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            StatementProcessor processor = new StatementProcessor();
            pm.addProcessor(processor);
            pm.process();
            codeFragments = processor.getCodeFragments();
        }
    }


    /**
     * Process only the code fragments needed to handle a known set of transformations.
     * <p>
     * This is faster than processing all. Useful for multi-sosies when we start from a known set of single-sosies
     * instead of searching out of the fragments.
     *
     * @param transformations An array of stored transformations.
     */
    public void processCodeFragments(JSONArray transformations) throws JSONException {
        if (codeFragments == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            KnownTransfStatementProcessor processor = null;
            processor = new KnownTransfStatementProcessor(transformations);
            pm.addProcessor(processor);
            pm.process();
            codeFragments = processor.getCodeFragments();
        }
    }

    /**
     * List of all the code fragments extracted by Spoon of the input program
     */
    public synchronized CodeFragmentList getCodeFragments() {
        processCodeFragments();
        return codeFragments;
    }

    /**
     * Search for a specific code fragment given its serialized JSON object.
     * <p>
     * Note: The JSON object is the serialized version OF THE CODE FRAGMENT by no means
     * THE TRANSFORMATION containing a particular code fragment.
     *
     * @param serialized Serialized object
     * @return The code fragment
     */
    public synchronized CodeFragment getCodeFragment(JSONObject serialized) {
        if (serialized.has("position")) {
            try {
                String position = serialized.getString("position");
                if (serialized.has("sourceCode")) {
                    return getCodeFragment(position, serialized.getString("sourceCode"));
                } else if (serialized.has("sourcecode")) {
                    // Super Hack!!!
                    return getCodeFragment(position, serialized.getString("sourcecode").replace("\n", "\r\n"));
                } else if (serialized.has("type")) {
                    return findCodeFragment(position, serialized.getString("type"),
                            cf -> cf.getCodeFragmentType().getSimpleName());
                } else {
                    return null;
                }
            } catch (JSONException e) {
                return null;
            }
        }
        return null;
    }

    /**
     * Search for a code fragment given a search predicate. The method will always search for code locations
     * in the proximity of the position that meet some features.
     *
     * @param position    position where the source code was "last seen".
     * @param searchValue Value to search for
     * @param accesor     Accesor function to the property we are looking for
     * @return
     */
    public CodeFragment findCodeFragment(String position, String searchValue,
                                         Function<CodeFragment, String> accesor) {

        CodeFragment result = null;

        String[] s = position.split(":");
        position = s[0];
        int lineNumber = Integer.parseInt(s[1]);
        int minDiff = Integer.MAX_VALUE;

        double sDiff = 0;

        int similiarFragmentCount = 0;
        int similarMinDist = Integer.MAX_VALUE;
        for (CodeFragment codeFragment : getCodeFragments()) {
            String[] cfPos = codeFragment.positionString().split(":");
            //Analyze only code fragments in the file of the one we are looking for
            if (cfPos[0].equals(position)) {
                int cfLine = Integer.parseInt(cfPos[1]);
                //String cfSourceCode = codeFragment.equalString();
                //source.equals(cfSourceCode)
                String ctValue = accesor.apply(codeFragment);
                if (ctValue.equals(searchValue) && cfLine == lineNumber) {
                    //If it is of the same code and the same line: we found it!!
                    //Log.info("Nailed! Search completed of snippet at pos " + position);
                    return codeFragment;
                } else {
                    //Similarity factor (provide flexibility...)
                    double x = StringSimilarity.CompareStrings(ctValue, searchValue);
                    if ( x > sDiff ) {
                        similiarFragmentCount = 0;//A better value is found, erase similar count
                        //find the most likely by search value
                        int k = Math.abs(cfLine - lineNumber);
                        //Log.info("x > sDif -> MD: " + minDiff + " k:" + k + " x:" + x + " sD:" + sDiff);
                        minDiff = k;//Store line distance
                        sDiff = x;
                        result = codeFragment;

                    } else if ( Math.abs(x - sDiff) < 0.0000001 ) {
                        similiarFragmentCount++; //equally good fragment found, augment the amount of fragments
                        int d = Math.abs(cfLine - lineNumber);
                        //Log.info("x==sDiff ->  sDif -> MD: " + minDiff + " d:" + d + " x:" + x + " sD:" + sDiff);
                        if (d < minDiff) {
                            similarMinDist = minDiff;
                            //else return the nearest one with same code
                            result = codeFragment;
                            minDiff = d;
                        }
                    }
                }

            }
        }



        //Log.info("Search completed of snippet at pos " + position);
        if (result == null) {
            Log.warn("Unable to find " + searchValue + "at " + position + ":" + lineNumber);
        } else if (!result.positionString().equals(position)) {
            Log.warn("Unable to find fragment at " + position + ":" + lineNumber);
            Log.info("Best match at " + result.positionString());
            if ( sDiff < 1.0 || similiarFragmentCount != 0 ) {
                Log.info("Dice: " + sDiff +  " Similars: " + similiarFragmentCount + " Similar MinDist: " + similarMinDist);
                Log.info("Search value: " + searchValue );
                if ( sDiff < 0 ) Log.info("Value found: " + accesor.apply(result));
            }
        }

        return result;
    }

    /**
     * Returns an specific code fragment given its position and source. The source is optional.
     * However, you should supply both, since is possible that a code fragment
     * is not found given only position since a difference of line numbers is usual.
     *
     * @param position Position of the code fragment
     * @param source   Source of the code Fragment
     * @return
     */
    public synchronized CodeFragment getCodeFragment(String position, String source) {
        return findCodeFragment(position, source, cf -> cf.equalString());
    }

    /**
     * Root spoon element for an input program, mostly upper level packages
     */
    public synchronized Set<CtElement> getRoots() {
        if (roots == null) {
            roots = new HashSet<>();
            ProcessingManager pm = new QueueProcessingManager(factory);
            AbstractProcessor<CtPackage> processor = new AbstractProcessor<CtPackage>() {
                @Override
                public void process(CtPackage element) {
                    CtElement root = element;
                    while (root.getParent() != null) {
                        root = root.getParent();
                    }
                    roots.add(root);
                }
            };
            pm.addProcessor(processor);
            pm.process();
        }
        return roots;
    }

    /**
     * Java assists methods for byte code manipulation
     */
    public synchronized List<CtMethod> getJavassistMethods() {

        if (javassistMethods == null) {
            javassistMethods = new ArrayList<>();
            ClassPool pool = ClassPool.getDefault();
            //pool.insertClassPath(DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes"));
            try {
                pool.insertClassPath(classesDir);
            } catch (NotFoundException e) {
                throw new RuntimeException("Cannot find classesDir " + classesDir, e);
            }
            for (CtSimpleType cl : getCodeFragments().getAllClasses()) {
                CtClass cc;
                try {
                    cc = pool.get(cl.getQualifiedName());
                } catch (NotFoundException e) {
                    throw new RuntimeException(e);
                }
                for (CtMethod method : cc.getDeclaredMethods())
                    if (!method.isEmpty()) {
                        javassistMethods.add(method);
                    }
            }
        }
        return javassistMethods;
    }

    /**
     * Get the inline constant statements on the program
     *
     * @return
     */
    public synchronized List<CtLocalVariable> getInlineConstant() {
        if (inlineConstant == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            InlineConstantProcessor processor = new InlineConstantProcessor();
            pm.addProcessor(processor);
            pm.process();

            inlineConstant = processor.getInlineConstant();
        }
        return inlineConstant;
    }

    public synchronized List<CtElement> getAllElement(Class cl) {


        if (!typeToObject.containsKey(cl)) {
            QueryVisitor query = new QueryVisitor(new TypeFilter(cl));
            List<CtElement> elements = new ArrayList<>();
            for (CtElement e : getRoots()) {
                e.accept(query);
                elements.addAll(query.getResult());
            }
            /*
            getRoots().stream()
                    .flatMap(root -> {
                        root.accept(query);
                        return query.getResult().stream();
                    })
                    .collect(Collectors.toList());
            */
            typeToObject.put(cl, elements);
        }
        return typeToObject.get(cl);
        // return null;
    }


    /**
     * Get return statements of the program
     *
     * @return
     */
    public synchronized List<CtReturn> getReturns() {
        if (returns == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            ReturnProcessor processor = new ReturnProcessor();
            pm.addProcessor(processor);
            pm.process();

            returns = processor.getReturns();
        }
        return returns;
    }

    /**
     * Copies properties from the configuration
     *
     * @param configuration
     */
    public void configure(InputConfiguration configuration) {
        setSourceCodeDir(configuration.getSourceCodeDir());
        setPreviousTransformationsPath(configuration.getPreviousTransformationPath());
        setClassesDir(configuration.getClassesDir());
        setCoverageDir(configuration.getCoverageDir());
    }

}
